package org.example.models;

import javax.xml.crypto.Data;

public class Payment extends BaseModel{
    private int amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private int referenceNo;
    private Data time;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(int refernceNo) {
        this.referenceNo = refernceNo;
    }

    public Data getTime() {
        return time;
    }

    public void setTime(Data time) {
        this.time = time;
    }
}
