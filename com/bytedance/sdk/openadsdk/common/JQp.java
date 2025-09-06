package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

public class JQp {
    private static boolean PjT = false;

    static {
    }

    public static ISDKTypeFactory PjT(PAGLoadListener pAGLoadListener0) {
        ISDKTypeFactory iSDKTypeFactory0 = SDKTypeConfig.getSdkTypeFactory();
        if(iSDKTypeFactory0 == null) {
            if(pAGLoadListener0 != null) {
                pAGLoadListener0.onError(5000, "SDK load ad factory should not be null");
            }
            return null;
        }
        return iSDKTypeFactory0;
    }

    public static void PjT(boolean z) {
        JQp.PjT = z;
    }

    public static boolean PjT() [...] // 潜在的解密器
}

