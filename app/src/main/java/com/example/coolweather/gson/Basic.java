package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HTDM on 2017/3/17.
 */

public class Basic {
    @SerializedName("city")   //由于JSON中的一些字段可能不太适合直接作为Java字段来命名，因此这里使用了@SerializedName注解方法来让JSON字段之间建立映射关系。
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
