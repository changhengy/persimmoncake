package org.persimmon.cake.model;
/*
 * @time 2021/5/20 11:26
 * @author chy
 */

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String ads;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    public User(Integer id, String name, Integer age, String ads) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ads = ads;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ads='" + ads + '\'' +
                '}';
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }
}
