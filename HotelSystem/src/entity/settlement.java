/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author 28092
 */
public class settlement {
    private int settleNo;
    private int customerNo;
    private String roomNo;
    private Float payable;
    private Float payment;
    private String startDate;
    private int tenancy;

    public int getSettleNo() {
        return settleNo;
    }

    public void setSettleNo(int settleNo) {
        this.settleNo = settleNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public Float getPayable() {
        return payable;
    }

    public void setPayable(Float payable) {
        this.payable = payable;
    }

    public Float getPayment() {
        return payment;
    }

    public void setPayment(Float payment) {
        this.payment = payment;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getTenancy() {
        return tenancy;
    }

    public void setTenancy(int tenancy) {
        this.tenancy = tenancy;
    }

    @Override
    public String toString() {
        return "settlement{" + "settleNo=" + settleNo + ", customerNo=" + customerNo + ", roomNo=" + roomNo + ", payable=" + payable + ", payment=" + payment + ", startDate=" + startDate + ", tenancy=" + tenancy + '}';
    }
    
    
}
