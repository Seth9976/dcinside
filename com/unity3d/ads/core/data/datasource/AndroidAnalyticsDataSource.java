package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import y4.m;

public final class AndroidAnalyticsDataSource implements AnalyticsDataSource {
    // 去混淆评级： 低(40)
    @Override  // com.unity3d.ads.core.data.datasource.AnalyticsDataSource
    @m
    public String getUserId() {
        return AndroidPreferences.getString(".v2.playerprefs", "unity.cloud_userid");
    }
}

