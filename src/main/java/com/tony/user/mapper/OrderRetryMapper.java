package com.tony.user.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderRetryMapper {

    List<Map<String, String>> getOrderRetry();
}
