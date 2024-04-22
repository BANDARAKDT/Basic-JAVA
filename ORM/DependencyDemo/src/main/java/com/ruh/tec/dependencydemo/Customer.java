package com.ruh.tec.dependencydemo;
@Componenct

public class Customer{
    private int cutID;

    private String custName;

    private Srting courseName;

    public int getCutID() {
        return cutID;
    }

    public void setCutID(int cutID) {
        this.cutID = cutID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Srting getCourseName() {
        return courseName;
    }

    public void setCourseName(Srting courseName) {
        this.courseName = courseName;
    }

    public void display(){
        System.out.println("customer object returned successfully");
    }
}