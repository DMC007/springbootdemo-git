package com.boss.exception;

/**
 * @Author ZX
 * @Date 2020/9/27 21:15
 * @Version 1.0
 */
public class MyException01 extends RuntimeException {
    private int code;

    public MyException01(String message, int code) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
