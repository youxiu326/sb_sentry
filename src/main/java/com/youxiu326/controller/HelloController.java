package com.youxiu326.controller;

import io.sentry.Sentry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: lihui
 * @Date: 2020-11-18 14:58
 * @Description:
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/")
    public void test() {
        throw new IllegalArgumentException("hello world");
    }

    @RequestMapping("/aaa")
    public String aaa(){
        try {
            throw new Exception("This is a test.");
        } catch (Exception e) {
            Sentry.captureException(e);
        }
        return "xx";
    }

    @RequestMapping("/log/error")
    public String error(){
        log.info("Logback info!");
        log.warn("Logback warn!");
        log.error("Logback error!");
        return "error";
    }

    @RequestMapping("/log/warn")
    public String warn(){
        log.info("Logback info!");
        log.warn("Logback warn!");
        return "warn";
    }

    @RequestMapping("/log/info")
    public String info(){
        log.info("Logback info!");
        return "info";
    }

}