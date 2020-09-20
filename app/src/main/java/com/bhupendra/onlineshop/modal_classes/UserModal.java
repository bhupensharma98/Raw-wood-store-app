package com.bhupendra.onlineshop.modal_classes;

public class UserModal {

    private String fullname;
    private String email;
    private String address;
    private String phone;
    private String password;

    public UserModal(String fullname, String email, String address, String phone, String password) {
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}