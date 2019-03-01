package com.tony.user.controller;

import com.tony.user.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestContorller {


    @Autowired
    private TestService testService;

    public Logger LOG = LoggerFactory.getLogger(TestContorller.class);

    @RequestMapping(value = "/user/test")
    public String testInterface() {

        return "Hello Spring boot";
    }

    @RequestMapping(value = "/user/testRedis")
    public String testRedis() {

        LOG.info("testReids开始：");
        String res;
        try {
            res = testService.testRedis();
        } catch (Exception e) {
            res = "error";
        }
        LOG.info("testReids结束：");
        return res;
    }
}
