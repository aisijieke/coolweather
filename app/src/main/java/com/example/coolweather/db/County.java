package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HTDM on 2017/3/16.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;  //countName记录县的名字

    private String weatherId;   //weatherId记录县所对应的天气id

    private int cityId;         //cityId记录当前县所属市的id值

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return  weatherId;
    }

    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }

    public int getCityId(){
        return  cityId;
    }

    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
