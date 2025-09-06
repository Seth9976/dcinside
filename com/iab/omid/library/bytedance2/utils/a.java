package com.iab.omid.library.bytedance2.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.bytedance2.adsession.DeviceCategory;

public final class a {
    private static UiModeManager a;

    static {
    }

    public static DeviceCategory a() {
        UiModeManager uiModeManager0 = a.a;
        if(uiModeManager0 != null) {
            switch(uiModeManager0.getCurrentModeType()) {
                case 1: {
                    return DeviceCategory.MOBILE;
                }
                case 4: {
                    return DeviceCategory.CTV;
                }
                default: {
                    return DeviceCategory.OTHER;
                }
            }
        }
        return DeviceCategory.OTHER;
    }

    public static void a(Context context0) {
        if(context0 != null) {
            a.a = (UiModeManager)context0.getSystemService("uimode");
        }
    }
}

