package com.my.docker.mydocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author SUNLLM
 * @Description 境由心生, 事在人为
 * @Date 2021/4/24
 * @return
 **/
@RestController
public class ControllerClass {

    @RequestMapping("my/docker")
    public String getString(){
        return "this is a test for docker !!!";
    }
}
