package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HTDM on 2017/3/16.
 */

public class Province extends DataSupport {

    private int id;             //id是每个实体类中都应该有的字段，provinceName 记录省的名字，provinceCode记录省的代号

    private String provinceName;

    private int provinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProvinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}
