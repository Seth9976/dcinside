package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass.DynamicDeviceInfo;
import java.util.List;
import kotlinx.coroutines.flow.i;
import y4.l;

public interface DynamicDeviceInfoDataSource {
    @l
    DynamicDeviceInfo fetch();

    @l
    String getConnectionTypeStr();

    int getCurrentUiTheme();

    @l
    List getLocaleList();

    @l
    String getOrientation();

    int getRingerMode();

    @l
    i getVolumeSettingsChange();

    boolean hasInternet();
}

