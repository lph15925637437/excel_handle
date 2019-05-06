package com.hzzy.excel.excel_handle.exception;

public class NormalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;

    private String message;


    public NormalException() {
        super();
    }

    public NormalException(String message) {
        super(message);
    }

    public NormalException(String errorCode, String message) {
        super(message);
        this.code = errorCode;
    }

    public NormalException(NormalErrorEnum errorEnum) {
        super(errorEnum.getMessage());
        this.code = errorEnum.getErrorCode();
        this.message = errorEnum.getMsg();

    }

    public NormalException(NormalErrorEnum errorEnum, String message) {
        super(errorEnum.getMessage() + message);
        this.code = errorEnum.getErrorCode();
        this.message = message + errorEnum.getMessage();
    }

    public NormalException(NormalErrorEnum errorEnum, Throwable e) {
        super(e);
        this.code = errorEnum.getErrorCode();
        this.message = errorEnum.getMsg();
    }

    public NormalException(Throwable e) {
        super(e);
    }
}
