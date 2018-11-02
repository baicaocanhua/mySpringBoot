package com.maimai.myspringboot.dao;

import java.util.HashMap;
import java.util.List;
import com.maimai.myspringboot.entity.Node;

/** 
* @author YJJ
* @version 2018年11月2日 下午4:44:53
*/

public interface TreeMapper {

    List<Node> getList();

    List<HashMap<String, Object>> getListByParentId(String pid);
}

