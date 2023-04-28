package com.fitness.entity;

import java.sql.Date;

public class Customers {
    private int customer_id;
    private String name;
    private String email;
    private String phone;
    private Gender gender;
    private Date date_of_birth;
    private Date join_date;
    private MemberShip_Type memberShip_type;

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Date getJoin_date() {
        return join_date;
    }

    public void setJoin_date(Date join_date) {
        this.join_date = join_date;
    }

    public MemberShip_Type getMemberShip_type() {
        return memberShip_type;
    }

    public void setMemberShip_type(MemberShip_Type memberShip_type) {
        this.memberShip_type = memberShip_type;
    }
}
