package com.apm.insight.l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.insight.k.e.b;

public final class k {
    public static String a(Context context0) [...] // 潜在的解密器

    private static String a(b e$b0) {
        try {
            switch(com.apm.insight.l.k.1.a[e$b0.ordinal()]) {
                case 1: {
                    return "wifi";
                }
                case 2: {
                    return "2g";
                }
                case 3: {
                    return "3g";
                }
                case 4: {
                    return "4g";
                }
                case 5: {
                    return "mobile";
                }
                case 6: {
                    return "5g";
                }
                default: {
                    return "";
                }
            }
        }
        catch(Exception unused_ex) {
            return "";
        }
    }

    public static boolean b(Context context0) {
        try {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            if(connectivityManager0 == null) {
                return false;
            }
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isAvailable()) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    private static b c(Context context0) {
        try {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)context0.getSystemService("connectivity");
            if(connectivityManager0 == null) {
                return b.a;
            }
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isAvailable()) {
                return b.a;
            }
            int v = networkInfo0.getType();
            if(1 == v) {
                return b.e;
            }
            if(v != 0) {
                return b.b;
            }
            int v1 = ((TelephonyManager)context0.getSystemService("phone")).getNetworkType();
            switch(v1) {
                case 3: 
                case 5: 
                case 6: {
                    break;
                }
                case 20: {
                    return b.g;
                label_15:
                    if(v1 != 8 && v1 != 9 && v1 != 10) {
                        switch(v1) {
                            case 13: {
                                return b.f;
                            }
                            case 12: 
                            case 14: 
                            case 15: {
                                break;
                            }
                            default: {
                                return b.b;
                            }
                        }
                    }
                    break;
                }
                default: {
                    goto label_15;
                }
            }
            return b.d;
        }
        catch(Throwable unused_ex) {
            return b.b;
        }
    }

    final class com.apm.insight.l.k.1 {
        static final int[] a;

        static {
            int[] arr_v = new int[b.a().length];
            com.apm.insight.l.k.1.a = arr_v;
            try {
                arr_v[b.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.apm.insight.l.k.1.a[b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.apm.insight.l.k.1.a[b.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.apm.insight.l.k.1.a[b.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.apm.insight.l.k.1.a[b.b.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.apm.insight.l.k.1.a[b.g.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

