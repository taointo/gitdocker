package com.github.taointo.gitdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public Map<String,Object> demo(){
        Map<String, Object> respMap = new HashMap<>();
        respMap.put("code","0");
        respMap.put("msg","success");
        return respMap;
    }
}
