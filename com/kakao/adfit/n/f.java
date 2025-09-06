package com.kakao.adfit.n;

import android.text.TextUtils;

public abstract class f {
    public static long a(String s) {
        long v = 0L;
        if(TextUtils.isEmpty(s)) {
            return 0L;
        }
        try {
            int v1 = s.indexOf(46);
            if(v1 > 0) {
                v = (long)Integer.parseInt(s.substring(v1 + 1));
                s = s.substring(0, v1);
            }
            String[] arr_s = s.split(":");
            switch(arr_s.length) {
                case 1: {
                    return v + ((long)Integer.parseInt(arr_s[0])) * 1000L;
                }
                case 2: {
                    v += ((long)Integer.parseInt(arr_s[0])) * 60000L;
                    return v + ((long)Integer.parseInt(arr_s[1])) * 1000L;
                }
                case 3: {
                    v += ((long)Integer.parseInt(arr_s[0])) * 3600000L;
                    v += ((long)Integer.parseInt(arr_s[1])) * 60000L;
                    return v + ((long)Integer.parseInt(arr_s[2])) * 1000L;
                }
                default: {
                    return v;
                }
            }
        }
        catch(Exception unused_ex) {
            com.kakao.adfit.m.f.b("Invalid Duration");
            return v;
        }
    }
}

