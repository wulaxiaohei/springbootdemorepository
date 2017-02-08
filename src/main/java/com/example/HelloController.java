package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangchunlin on 2017/2/7.
 */
@RestController
public class HelloController {

    /**
     * spring boot会自动读取application.properties,
     * 并且将其作为系统参数进行注入,用户也可以在启动应用的时候
     * 通过-Dname=xxx来手动注入，手动注入会覆盖配置文件中的参数
     * 如果没有指定值，那么name的默认值就是World。
     */
    @Value("${name:World}")
    private String name;

    /**
     * 由于使用了@RestControlelr,因此无需在使用@ResponseBody来标注返回的结果
     */
    @RequestMapping("/hello")
    public String sayHello(){
        return String.format("hello:%s", name);
    }
}
