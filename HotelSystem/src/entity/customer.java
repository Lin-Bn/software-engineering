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

    private final String customerName;
    private final String customerID;
    private final String gender;
    private final String roomType;
    private final String startDate;
    private final int tenancy;
    private final String roomNo;

    public customer(String customerName, String customerID, String gender, String roomType, String startDate, int tenancy, String roomNo) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.gender = gender;
        this.roomType = roomType;
        this.startDate = startDate;
        this.tenancy = tenancy;
        this.roomNo = roomNo;
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

    public String getRoomType() {
        return roomType;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getTenancy() {
        return tenancy;
    }

    public String getRoomNo() {
        return roomNo;
    }

    @Override
    public String toString() {
        return "customer{" + "customerName=" + customerName + ", customerID=" + customerID + ", gender=" + gender + ", roomType=" + roomType + ", startDate=" + startDate + ", tenancy=" + tenancy + ", roomNo=" + roomNo + '}';
    }

}
