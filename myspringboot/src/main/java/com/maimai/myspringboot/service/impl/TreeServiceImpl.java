package com.maimai.myspringboot.service.impl;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.maimai.myspringboot.dao.TreeMapper;
import com.maimai.myspringboot.entity.Node;
import com.maimai.myspringboot.service.TreeService;

/** 
* @author YJJ
* @version 2018年11月2日 下午4:43:44
*/
@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeMapper treeMapper;

    public List<Node> getList() {

        return treeMapper.getList();
    }

    @Override
    public List<HashMap<String, Object>> getListByParentId(String pid) {

        return treeMapper.getListByParentId(pid);
    }

}
