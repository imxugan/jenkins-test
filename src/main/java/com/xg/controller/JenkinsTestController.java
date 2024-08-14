package com.xg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Author:xg
 * @Date:2024-08-14 22:15
 * @Desciption:com.xg.controller
 */
@RestController
public class JenkinsTestController {

    @GetMapping("/jenkins/test")
    public String testJenkins(){
        return "hello jenkins!";
    }

}
