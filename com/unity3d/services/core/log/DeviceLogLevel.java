package com.unity3d.services.core.log;

public class DeviceLogLevel {
    private static final String LOG_TAG = "UnityAds";
    private String _receivingMethodName;

    public DeviceLogLevel(String s) {
        this._receivingMethodName = s;
    }

    public String getLogTag() [...] // Inlined contents

    public String getReceivingMethodName() {
        return this._receivingMethodName;
    }
}

