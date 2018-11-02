package com.maimai.myspringboot.controller;

import com.maimai.myspringboot.async.AsyncDemo;
import com.maimai.myspringboot.async.AsyncTask;
import com.maimai.myspringboot.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author baica
 */
@RestController
public class FirstController {

    @Autowired
    private FirstService firstService;

    @Autowired
    private AsyncDemo asyncDemo;

    @RequestMapping(value = "list")
    public List<HashMap<String, String>> getList() {
        return firstService.getList();
    }

    @RequestMapping(value = "info")
    public Map<String, String> info() {
        Map<String, String> map = new HashMap<>();
        map.put("maimai", "十月");
        return map;
    }

    @RequestMapping(value = "async")
    public String async() throws ExecutionException, InterruptedException {
        asyncDemo.asyncInvokeSimplest();
        asyncDemo.asyncInvokeWithParameter("test");
        Future<String> future = asyncDemo.asyncInvokeReturnFuture(100);
        System.out.println(future.get());
        return "async";
    }

    @Autowired
    private AsyncTask asyncTask;

        @RequestMapping("asyncTask")
    public String doTask() throws InterruptedException{
        long currentTimeMillis = System.currentTimeMillis();
        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        long currentTimeMillis1 = System.currentTimeMillis();
        return "task任务总耗时:"+(currentTimeMillis1-currentTimeMillis)+"ms";

    }
}
