package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build.VERSION;
import android.os.Build;
import com.bykv.vk.openvk.preload.a.a.b;

public class Common {
    @b(a = "ac")
    public String ac;
    @b(a = "aid")
    public long aid;
    @b(a = "app_name")
    public String appName;
    @b(a = "app_version")
    public String appVersion;
    @b(a = "device_id")
    public String deviceId;
    @b(a = "device_model")
    public String deviceModel;
    @b(a = "device_platform")
    public String devicePlatform;
    @b(a = "os")
    public int os;
    @b(a = "os_version")
    public String osVersion;
    @b(a = "region")
    public String region;
    @b(a = "sdk_version")
    public String sdkVersion;
    @b(a = "uid")
    public String uid;

    public Common(long v, String s, String s1, String s2, String s3) {
        this.os = 0;
        new StringBuilder().append(Build.VERSION.SDK_INT);
        this.osVersion = "33";
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = v;
        this.appVersion = s;
        this.deviceId = s1;
        this.appName = s2;
        this.ac = s3;
    }

    public Common(long v, String s, String s1, String s2, String s3, String s4, String s5) {
        this.os = 0;
        new StringBuilder().append(Build.VERSION.SDK_INT);
        this.osVersion = "33";
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = v;
        this.appVersion = s;
        this.deviceId = s1;
        this.appName = s2;
        this.ac = s3;
        this.uid = s4;
        this.region = s5;
    }
}

