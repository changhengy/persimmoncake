package org.persimmon.cake.model;
/*
 * @time 2021/5/20 10:25
 * @author chy
 */

public class RespBean {
    private Integer status;
    private String msg;
    private Object object;

    public RespBean(Integer status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }

    public RespBean() {
    }

    public static RespBean ok(String msg) {
        // 200 代表服务器成功处理了请求
        return new RespBean(200, msg, null);
    }

    public static RespBean ok(String msg, Object obj) {
        // 200 代表服务器成功处理了请求
        return new RespBean(200, msg, obj);
    }

    public static RespBean error(String msg) {
        // 200 服务器遇到错误，无法完成请求
        return new RespBean(500, msg, null);
    }

    public static RespBean error(String msg, Object obj) {
        // 500 服务器遇到错误，无法完成请求
        return new RespBean(500, msg, obj);
    }

    @Override
    public String toString() {
        return "RespBean{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }

    public RespBean setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public RespBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public RespBean setObject(Object object) {
        this.object = object;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getObject() {
        return object;
    }
}
