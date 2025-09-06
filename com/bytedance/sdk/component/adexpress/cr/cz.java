package com.bytedance.sdk.component.adexpress.cr;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.cr;

public class cz {
    // 去混淆评级： 低(20)
    public static boolean PjT(String s) {
        return TextUtils.equals(s, "fullscreen_interstitial_ad") || TextUtils.equals(s, "rewarded_video");
    }

    // 去混淆评级： 低(20)
    public static boolean Zh(String s) {
        return cr.Zh() && cz.PjT(s);
    }
}

