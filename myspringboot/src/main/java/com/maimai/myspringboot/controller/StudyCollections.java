package com.maimai.myspringboot.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;

/** 
* @author YJJ
* @version 2018年11月8日 下午3:37:08
*/
@RestController
public class StudyCollections {

    /**
     * Method: disjoint 
     * Description: 如果两个指定collection中没有相同的元素：为'true'
     * param:  @return 参数说明 
     * Return: JSONObject 返回类型
     */
    @RequestMapping("disjoint")
    public JSONObject disjoint() {

        List<String> srclst = new ArrayList<String>(5);
        List<String> destlst = new ArrayList<String>(10);
        srclst.add("Java");
        srclst.add("is");
        srclst.add("best");

        destlst.add("C++");
        destlst.add("is not");
        destlst.add("older");

        // check elements in both collections
        boolean iscommon = Collections.disjoint(srclst, destlst);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", iscommon);
        return jsonObject;
    }
}
