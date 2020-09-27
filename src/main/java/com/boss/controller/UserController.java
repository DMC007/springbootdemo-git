package com.boss.controller;

import com.boss.domain.User;
import com.boss.exception.MyException01;
import com.boss.myenum.MyInfo01;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZX
 * @Date 2020/9/27 21:05
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @GetMapping("/findAll")
    public String findAll() {
        System.out.println("员工岳不群觉得不靠谱");

        System.out.println("boss最厉害");

        System.out.println("boss觉得岳不群非常的厉害，提的建议很有针对性");

        System.out.println("我岳不群表示支持boss当武林盟主");

        User u1 = new User().setId("1").setName("tom");
        User u2 = new User().setId("2").setName("jack");
        User u3 = new User().setId("3").setName("rose");
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("你们都是社会人");
        try {
            int i = 1 / 0;
            log.info("真是社会人：{}", list);
            String s = objectMapper.writeValueAsString(list);
            return s;
        } catch (Exception e) {
            throw new MyException01(MyInfo01.RED.getMsg(), MyInfo01.RED.getCode());
        }
    }
}
