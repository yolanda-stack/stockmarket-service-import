package com.smc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock_price_detail")
public class StockPriceDetail implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "company_code")
    private String companycode;

    @Column(name = "stock_exchange")
    private String stockexchange;

    @Column(name = "current_price")
    private BigDecimal currentprice;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

    @Column(name = "update_ts")
    private Timestamp updatets;

    public Integer getId() {
        return id;
    }

    public StockPriceDetail() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    public String getStockexchange() {
        return stockexchange;
    }

    public void setStockexchange(String stockexchange) {
        this.stockexchange = stockexchange;
    }

    public BigDecimal getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(BigDecimal currentprice) {
        this.currentprice = currentprice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Timestamp getUpdatets() {
        return updatets;
    }

    public void setUpdatets(Timestamp updatets) {
        this.updatets = updatets;
    }

}
