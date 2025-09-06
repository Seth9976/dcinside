package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

public class SDKTypeConfig {
    private static ISDKTypeFactory PjT;

    static {
    }

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return SDKTypeConfig.PjT;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory0) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        SDKTypeConfig.PjT = iSDKTypeFactory0;
    }
}

