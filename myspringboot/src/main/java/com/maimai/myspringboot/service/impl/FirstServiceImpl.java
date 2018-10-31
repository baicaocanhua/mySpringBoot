package com.maimai.myspringboot.service.impl;

import com.maimai.myspringboot.dao.FirstMapper;
import com.maimai.myspringboot.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @author baica
 */
@Service
//@Transactional
public class FirstServiceImpl implements FirstService {

    @Autowired
    private FirstMapper firstMapper;

    @Override
    public List<HashMap<String, String>> getList() {
        return firstMapper.getList();
    }
}
