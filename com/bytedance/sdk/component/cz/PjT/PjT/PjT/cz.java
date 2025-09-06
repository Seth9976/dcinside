package com.bytedance.sdk.component.cz.PjT.PjT.PjT;

import android.text.TextUtils;
import android.util.Base64;

public class cz {
    // 去混淆评级： 低(20)
    public static String PjT(String s) {
        return TextUtils.isEmpty(s) ? "" : Base64.encodeToString(s.getBytes(), 10);
    }

    // 去混淆评级： 低(20)
    public static String Zh(String s) {
        return TextUtils.isEmpty(s) ? "" : new String(Base64.decode(s, 10));
    }
}

