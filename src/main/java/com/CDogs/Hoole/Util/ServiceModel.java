package com.CDogs.Hoole.Util;

/**
 * Created by CDogs on 2016/7/3.
 */
//业务逻辑模型对象
public class ServiceModel {

    private String msg;
    private int code;//表示状态码
    private Object data;//表示需要传递对象信息
    private boolean isSuccess;//执行是否成功

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public ServiceModel() {
        // TODO Auto-generated constructor stub
    }

    public ServiceModel(int code) {
        super();
        this.code = code;
    }
    public ServiceModel(String msg) {
        super();
        this.msg = msg;
        this.code = -1;
        this.isSuccess = false;
    }

    public ServiceModel(String msg, int code, boolean isSuccess) {
        super();
        this.msg = msg;
        this.code = code;
        this.isSuccess = isSuccess;
    }

    public ServiceModel(String msg, boolean isSuccess) {
        super();
        this.msg = msg;
        this.isSuccess = isSuccess;
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
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServiceModel [msg=" + msg + ", code=" + code + ", data=" + data
                + ", isSuccess=" + isSuccess + "]";
    }

}
