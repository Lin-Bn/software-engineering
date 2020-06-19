/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author mints
 */
public class customer {

    private int customerNo;
    private String customerName;
    private String customerID;
    private String gender;
    private String telephoneNo;
    private String roomType;
    private String startDate;
    private int tenancy;
    private int roomNo;
    private float discount;
    private int deposit;

    public customer() {

    }

    public int getCustomerNo() {
        return customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getGender() {
        return gender;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getTenancy() {
        return tenancy;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public float getDiscount() {
        return discount;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setTenancy(int tenancy) {
        this.tenancy = tenancy;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "customer{" + "customerNo=" + customerNo + ", customerName=" + customerName + ", customerID=" + customerID + ", gender=" + gender + ", telephoneNo=" + telephoneNo + ", roomType=" + roomType + ", startDate=" + startDate + ", tenancy=" + tenancy + ", roomNo=" + roomNo + ", discount=" + discount + ", deposit=" + deposit + '}';
    }
}
