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
public class Customer {
    int cid;
    String cname;
    String cemail;
    String password;
    String Caddress;
    String Cphone;
    int BillingDate;
    int pkg;
    String ip;
    String subnet;
    String dg;
    String dns;
    String adns;
    String accountstatus;
    int Balance;

    public Customer(int cid, String cname, String cemail, String password, String Caddress, String Cphone, int BillingDate, int pkg, String ip, String subnet, String dg, String dns, String adns, String accountstatus, int Balance) {
        this.cid = cid;
        this.cname = cname;
        this.cemail = cemail;
        this.password = password;
        this.Caddress = Caddress;
        this.Cphone = Cphone;
        this.BillingDate = BillingDate;
        this.pkg = pkg;
        this.ip = ip;
        this.subnet = subnet;
        this.dg = dg;
        this.dns = dns;
        this.adns = adns;
        this.accountstatus = accountstatus;
        this.Balance = Balance;
    }
    
    public Customer(){};
    public Customer(int cid, String cname,String cemail, String Caddress, String Cphone, int BillingDate, int pkg, String accountstatus, int Balance) {
        this.cid = cid;
        this.cname = cname;
        this.cemail = cemail;
        this.Caddress = Caddress;
        this.Cphone = Cphone;
        this.BillingDate = BillingDate;
        this.pkg = pkg;
        this.accountstatus = accountstatus;
        this.Balance = Balance;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCemail() {
        return cemail;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaddress() {
        return Caddress;
    }

    public void setCaddress(String Caddress) {
        this.Caddress = Caddress;
    }

    public String getCphone() {
        return Cphone;
    }

    public void setCphone(String Cphone) {
        this.Cphone = Cphone;
    }

    public int getBillingDate() {
        return BillingDate;
    }

    public void setBillingDate(int BillingDate) {
        this.BillingDate = BillingDate;
    }

    public int getPkg() {
        return this.pkg;
    }

    public void setPkg(int pkg) {
        this.pkg = pkg;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public String getDg() {
        return dg;
    }

    public void setDg(String dg) {
        this.dg = dg;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getAdns() {
        return adns;
    }

    public void setAdns(String adns) {
        this.adns = adns;
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
    
    
}
