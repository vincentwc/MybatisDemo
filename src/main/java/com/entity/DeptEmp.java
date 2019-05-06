package com.entity;

//实体类
public class DeptEmp {

    private String dname;

    private Integer total;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DeptEmp{" +
                "dname='" + dname + '\'' +
                ", total=" + total +
                '}';
    }
}
