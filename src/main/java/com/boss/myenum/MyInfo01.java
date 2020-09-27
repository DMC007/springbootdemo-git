package com.boss.myenum;

/**
 * @Author ZX
 * @Date 2020/9/27 21:40
 * @Version 1.0
 */
public enum MyInfo01 {
    /**
     * 表示jackson转换出错需要的信息
     */
    RED("jackson转换出错", 333);

    private String msg;
    private int code;

    MyInfo01(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
