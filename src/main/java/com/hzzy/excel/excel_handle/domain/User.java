package com.hzzy.excel.excel_handle.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.util.Date;

public class User {

    @Excel(name = "姓名", orderNum = "0")
    private String name;

    @Excel(name = "性别", replace = {"男_1", "女_2"}, orderNum = "1")
    private String sex;

    @Excel(name = "年龄", orderNum = "2", isStatistics=true)
    private Integer age;

    @Excel(name = "生日", format = "yyyy-MM-dd", orderNum = "3")
    private Date brithday;

    public User() {
    }

    public User(String name, String sex, Integer age, Date brithday) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.brithday = brithday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}
