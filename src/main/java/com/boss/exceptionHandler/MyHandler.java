package com.boss.exceptionHandler;

import com.boss.exception.MyException01;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author ZX
 * @Date 2020/9/27 21:32
 * @Version 1.0
 */
@RestControllerAdvice
public class MyHandler {
    @ExceptionHandler(MyException01.class)
    public String do01(Exception e) {
        //return "出现了自定义异常";
        return e.getMessage();
    }
}
