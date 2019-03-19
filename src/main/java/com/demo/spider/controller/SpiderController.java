package com.demo.spider.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author guowei
 * @ProjectName ams-svc-mall
 * @Description: 爬虫测试
 * @date 2019/3/14 14:20
 */
@RestController
@RequestMapping("/spider")
public class SpiderController {

    @PostMapping("/test")
    public String test(@RequestBody Map<String,String> map) {
        String paramA = map.get("a");
        String paramB = map.get("b");

        return "success";

    }
}
