package com.laizt.git.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestGit {
    @RequestMapping("hello")
    public String testGit() {
        return "hello git +github! 11111";
    }
}
