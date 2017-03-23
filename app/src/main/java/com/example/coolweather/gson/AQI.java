package com.example.coolweather.gson;

/**
 * Created by HTDM on 2017/3/17.
 */

public class AQI {
    public  AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}

