package com.bytedance.sdk.component.adexpress.dynamic.Zh;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.cr.XX;

public class PjT {
    public static int PjT(XX xX0) {
        if(xX0 == null) {
            return 0;
        }
        String s = xX0.Zd();
        String s1 = xX0.Lrd();
        if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s) || !s1.equals("creative")) {
            return 0;
        }
        if(s.equals("shake")) {
            return 2;
        }
        if(s.equals("twist")) {
            return 3;
        }
        return s.equals("slide") ? 1 : 0;
    }
}

