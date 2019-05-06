package com.hzzy.excel.excel_handle.exception;


/**
 * 自定义异常类
 * @author: lph
 * @date:  2019/5/6 9:24
 * @version V1.0
 */
public enum NormalErrorEnum {
    CONTACT_EMAIL_IsNull("100001","联系人邮箱格式有问题!"),
    ;
    private String errorCode;

    private String message;

    NormalErrorEnum(String code,String message){
        this.errorCode=code;
        this.message=message;
    }

    public String getMessage(){
        return"[code="+errorCode+",message="+message+"]";
    }
    public String getErrorCode() {

        return errorCode;
    }

    public String getMsg(){
        return message;
    }
}

