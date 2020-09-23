package com.consum.test.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author sunlonglong
 * 21:26
 * 境由心生,事在人为
 */
@FeignClient(name="my-provider-1")
public interface IService {

    @PostMapping("info/of/book")
    public List<UserInfo> getUserInfo();
}
