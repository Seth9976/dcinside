package com.bykv.vk.openvk.preload.falconx.statistic;

import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.b;

public class Common {
    @b(a = "app_version")
    public String appVersion;
    @b(a = "device_id")
    public String deviceId;
    @b(a = "device_model")
    public String deviceModel;
    @b(a = "os")
    public int os;
    @b(a = "region")
    public String region;
    @b(a = "sdk_version")
    public String sdkVersion;

    public Common() {
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.deviceModel = Build.MODEL;
        this.os = 0;
    }
}

