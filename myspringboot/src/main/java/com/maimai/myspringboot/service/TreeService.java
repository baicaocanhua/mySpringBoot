package com.maimai.myspringboot.service;

import java.util.HashMap;
import java.util.List;
import com.maimai.myspringboot.entity.Node;

/** 
* @author YJJ
* @version 2018年11月2日 下午4:42:39
*/

public interface TreeService {


    public List<Node> getList();

    public List<HashMap<String, Object>> getListByParentId(String pid);
}
