package com.pgl.ssdk;

import android.text.TextUtils;
import java.util.ArrayList;

public class g0 {
    public static String a(String s) {
        String[] arr_s = g0.b(s);
        ArrayList arrayList0 = new ArrayList();
        if(arr_s != null && arr_s.length > 0) {
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                try {
                    Class.forName(s1);
                    arrayList0.add(s1);
                }
                catch(ClassNotFoundException unused_ex) {
                }
            }
        }
        return arrayList0.isEmpty() ? null : arrayList0.toString();
    }

    public static String[] b(String s) {
        return TextUtils.isEmpty(s) ? null : s.split("//");
    }
}

