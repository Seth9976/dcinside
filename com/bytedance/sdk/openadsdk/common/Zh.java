package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.utils.wN;

public class Zh {
    private static String PjT;

    // 去混淆评级： 低(20)
    public static String JQp() [...] // 潜在的解密器

    public static String PjT() [...] // Inlined contents

    public static String PjT(Context context0) {
        return xf.PjT(context0);
    }

    private static boolean PjT(String s) {
        if(!TextUtils.isEmpty(s)) {
            String[] arr_s = s.split(":");
            if(arr_s != null && arr_s.length >= 20) {
                for(int v = 0; v < arr_s.length; ++v) {
                    if(!"00".equals(arr_s[v])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String ReZ() [...] // Inlined contents

    // 去混淆评级： 低(22)
    public static String XX() [...] // 潜在的解密器

    public static String Zh() [...] // Inlined contents

    public static String cr() {
        return wN.XX();
    }

    public static String cz() {
        return ltE.XX(ub.PjT());
    }
}

