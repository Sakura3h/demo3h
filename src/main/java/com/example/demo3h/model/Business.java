package com.example.demo3h.model;

import java.util.List;

public class Business {
    private Integer bid;

    private String photo;

    private Integer uid;

    private String phone;

    private String name;

    private String address;

    private List<BusinessInfo> businessInfo;

    public List<BusinessInfo> getBusinessInfo() {
        return businessInfo;
    }

    public void setBusinessInfo(List<BusinessInfo> businessInfo) {
        this.businessInfo = businessInfo;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}