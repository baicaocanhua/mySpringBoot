package com.maimai.myspringboot.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.maimai.myspringboot.entity.Node;
import com.maimai.myspringboot.entity.TreeBuilder;
import com.maimai.myspringboot.service.TreeService;

/** 
* @author YJJ
* @version 2018年11月2日 下午4:42:02
*/

@RestController
public class TreeController {


    @Autowired
    private TreeService treeService;

    @RequestMapping(value = "/bulidJsonTree", method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public String buildJsonTree(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //response.setContentType("application/json;charset=UTF-8");
        // 获取全部目录节点
        List<Node> nodes = treeService.getList();
        // 拼装树形json字符串
        String json = new TreeBuilder().buildTree(nodes);
        //writeJson(response, json);
        return json;
    }

    public void writeJson(HttpServletResponse resp, String json) {

        PrintWriter out = null;
        try {
            //设定类容为json的格式
            resp.setContentType("application/json;charset=UTF-8");
            out = resp.getWriter();
            //写到客户端
            out.write(json);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }



    @RequestMapping(value = "/myjson", method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8")
    public List<HashMap<String, Object>> myJson(String pid) throws Exception {

        List<HashMap<String, Object>> nodes = treeService.getListByParentId(pid);

        return nodes;
    }

}
