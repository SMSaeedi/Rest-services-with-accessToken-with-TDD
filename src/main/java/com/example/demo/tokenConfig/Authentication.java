package com.example.demo.tokenConfig;

public class Authentication {

    private Integer errorCode = 0;
    private String msg;
    private String user;
    private String token;
    private String password;
    private String errorMsg;
    private String expiredDate;

    public Authentication(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Authentication() {
    }

    public void setNullParams(){
        this.setUser("");
        this.setToken("");
        this.setPassword("");
        this.setMsg("");
        this.setExpiredDate("");
        this.setErrorMsg("Wrong userName or password");
    }

    public void setNullParams1(){
        this.setPassword("");
        this.setErrorMsg("");
        this.setExpiredDate("10 minutes");
        this.setMsg("Operation successfully done");
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
}