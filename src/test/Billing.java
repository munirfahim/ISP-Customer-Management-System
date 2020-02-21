/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author munir
 */
public class Billing {
    int bid;
    int cid;
    int amount;
    String billingmonth;
    String bstatus;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBillingmonth() {
        return billingmonth;
    }

    public void setBillingmonth(String billingmonth) {
        this.billingmonth = billingmonth;
    }

    public String getBstatus() {
        return bstatus;
    }

    public void setBstatus(String bstatus) {
        this.bstatus = bstatus;
    }

    public Billing(int bid, int cid, int amount, String billingmonth, String bstatus) {
        this.bid = bid;
        this.cid = cid;
        this.amount = amount;
        this.billingmonth = billingmonth;
        this.bstatus = bstatus;
    }

    public Billing() {
    }
}
