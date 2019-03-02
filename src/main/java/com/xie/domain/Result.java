package com.xie.domain;

import java.io.Serializable;
import java.util.Objects;

public class Result implements Serializable {

    //响应状态码
    private Integer status;
    //响应信息
    private String msg;
    //响应中的数据
    private Object data;

    //异常编码
    public static final Integer ERRO_CODE = -1;
    //成功
    public static final Integer SUCCESS_CODE = 200;
    //重定向
    public static final Integer REDIRECT_CODE = 300;

    public Result() {
    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Result(Object data) {
        this.status = Result.SUCCESS_CODE;
        this.msg = "ok";
        this.data = data;
    }


    /**
     * 静态工具方法. 用于构建Result类型的对象
     */
    public static Result build(Integer status, String msg, Object data) {
        return new Result(status, msg, data);
    }

    public static Result ok(Object data) {
        return new Result(data);
    }

    public static Result ok() {
        return new Result(null);
    }

    public static Result build(Integer status, String msg) {
        return new Result(status, msg, null);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result Result = (Result) o;
        return Objects.equals(status, Result.status) &&
                Objects.equals(msg, Result.msg) &&
                Objects.equals(data, Result.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, msg, data);
    }
}
