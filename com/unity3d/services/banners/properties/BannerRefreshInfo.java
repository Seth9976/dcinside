package com.unity3d.services.banners.properties;

import java.util.HashMap;

public class BannerRefreshInfo {
    private HashMap _refreshRateMap;
    private static BannerRefreshInfo instance;

    public BannerRefreshInfo() {
        this._refreshRateMap = new HashMap();
    }

    public static BannerRefreshInfo getInstance() {
        if(BannerRefreshInfo.instance == null) {
            BannerRefreshInfo.instance = new BannerRefreshInfo();
        }
        return BannerRefreshInfo.instance;
    }

    public Integer getRefreshRate(String s) {
        synchronized(this) {
            return (Integer)this._refreshRateMap.get(s);
        }
    }

    public void setRefreshRate(String s, Integer integer0) {
        synchronized(this) {
            this._refreshRateMap.put(s, integer0);
        }
    }
}

