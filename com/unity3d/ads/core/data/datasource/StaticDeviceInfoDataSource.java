package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import java.util.List;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface StaticDeviceInfoDataSource {
    @m
    Object fetch(@l List arg1, @l d arg2);

    @l
    StaticDeviceInfo fetchCached();

    @m
    String getAnalyticsUserId();

    @l
    String getAppName();

    @m
    Object getAuid(@l d arg1);

    @m
    Object getIdfi(@l d arg1);

    @l
    String getManufacturer();

    @l
    String getModel();

    @l
    String getOsVersion();

    long getSystemBootTime();
}

