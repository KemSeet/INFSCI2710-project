package com.fitness.entity;

public class User {
    private Integer id;
    private String name;
    private String phone;
    private String cardId;
    private String sex;
    private String userType;
    private String password;
    private String time;
    private String filePath;

    public User(Integer id, String name, String phone, String cardId,
                String sex, String userType, String password, String time, String filePath) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cardId = cardId;
        this.sex = sex;
        this.userType = userType;
        this.password = password;
        this.time = time;
        this.filePath = filePath;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
