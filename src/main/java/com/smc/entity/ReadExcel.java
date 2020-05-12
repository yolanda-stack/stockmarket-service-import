package com.smc.entity;

/**
 * des:用于存放excel的相关信息
 */

public class ReadExcel {
    //总行数
    private int totalRows = 0;
    //总条数
    private int totalCells = 0;
    //错误信息收集
    private String errorMsg;
    
    public Integer getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(Integer totalRows) {
        this.totalRows = totalRows;
    }
    
    public Integer getTotalCells() {
        return totalCells;
    }

    public void setTotalCells(Integer totalCells) {
        this.totalCells = totalCells;
    }
    
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
