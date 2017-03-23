package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HTDM on 2017/3/17.
 */

public class Weather {
    public String status;  //返回的天气数据中还会包含一项status数据，成功返回ok,失败则会返回具体的原因，那么这里也需要添加一个对应的status字段

    public Basic basic;

    public AQI api;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
