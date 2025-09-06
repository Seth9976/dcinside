package com.bytedance.sdk.component.utils;

import android.util.Log;

public class RD {
    private static boolean PjT = false;
    private static String Zh = "";

    static {
    }

    private static String PjT(Object[] arr_object) {
        if(arr_object != null && arr_object.length != 0) {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_object.length; ++v) {
                Object object0 = arr_object[v];
                if(object0 == null) {
                    stringBuilder0.append(" null ");
                }
                else {
                    stringBuilder0.append(object0.toString());
                }
                stringBuilder0.append(" ");
            }
            return stringBuilder0.toString();
        }
        return "";
    }

    public static void PjT() {
        RD.PjT = true;
    }

    public static void PjT(String s) {
        RD.Zh = s;
    }

    public static void PjT(String s, String s1) {
        if(!RD.PjT) {
            return;
        }
        if(s1 == null) {
            return;
        }
        Log.d(RD.Zh(s), s1);
    }

    public static void PjT(String s, String s1, Throwable throwable0) {
        if(!RD.PjT) {
            return;
        }
        if(s1 == null && throwable0 == null) {
            return;
        }
        Log.e(RD.Zh(s), s1, throwable0);
    }

    public static void PjT(String s, Object[] arr_object) {
        if(!RD.PjT) {
            return;
        }
        if(arr_object == null) {
            return;
        }
        Log.d(RD.Zh(s), RD.PjT(arr_object));
    }

    // 去混淆评级： 中等(100)
    private static String Zh(String s) {
        return s;
    }

    public static void Zh() {
        RD.PjT = false;
    }

    public static void Zh(String s, String s1) {
        if(!RD.PjT) {
            return;
        }
        if(s1 == null) {
            return;
        }
        Log.e(RD.Zh(s), s1);
    }

    public static void Zh(String s, Object[] arr_object) {
        if(!RD.PjT) {
            return;
        }
        if(arr_object == null) {
            return;
        }
        Log.e(RD.Zh(s), RD.PjT(arr_object));
    }
}

