package com.wqf.dao.domain;

import java.util.Date;

/**
 * @author 小白学java
 * @version 1.0
 */
public class Actor {

    private Integer id;
    private String name;
    private String sex;
    private Date bornDate;
    private String phone;

    public Actor() {
    }//一定要给一个无参构造器,[反射需要]

    public Actor(Integer id, String name, String sex, Date bornDate, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.bornDate = bornDate;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", bornDate=" + bornDate +
                ", phone='" + phone + '\'' +
                '}';
    }
}
