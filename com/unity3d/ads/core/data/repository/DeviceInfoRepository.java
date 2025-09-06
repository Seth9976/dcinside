package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo;
import gatewayprotocol.v1.PiiOuterClass.Pii;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo;
import java.util.List;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public interface DeviceInfoRepository {
    @l
    StaticDeviceInfo cachedStaticDeviceInfo();

    @l
    E getAllowedPii();

    @m
    String getAnalyticsUserId();

    @l
    String getAppName();

    @m
    Object getAuidByteString(@l d arg1);

    @m
    Object getAuidString(@l d arg1);

    @l
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @l
    DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    @m
    Object getIdfi(@l d arg1);

    @l
    List getLocaleList();

    @l
    String getManufacturer();

    @l
    String getModel();

    @l
    String getOrientation();

    @l
    String getOsVersion();

    @l
    Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    @l
    i getVolumeSettingsChange();

    @m
    Object staticDeviceInfo(@l d arg1);
}

