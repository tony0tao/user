package com.tony.user.service.impl;

import com.tony.user.mapper.OrderRetryMapper;
import com.tony.user.service.TestService;
import com.tony.user.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private OrderRetryMapper orderRetryMapper;

    @Override
    public String testRedis() {
        List<Map<String, String>> list = orderRetryMapper.getOrderRetry();
        String key;
        for (Map<String, String> orderMap : list) {
            key = "ORDER_CANCEL_HANDLING_KEY:" + orderMap.get("yuyueId");
            System.out.println(key);
            redisUtils.set(key, "1", 1000);
        }
        return "success";
    }
}
