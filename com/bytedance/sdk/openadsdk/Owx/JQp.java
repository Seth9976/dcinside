package com.bytedance.sdk.openadsdk.Owx;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build.VERSION;
import android.util.Base64;

public class JQp {
    public static int Au = 2;
    public static int DWo = 8;
    protected static long JQp = 0x3C00L;
    protected static String PjT = "images";
    protected static int ReZ = 1;
    public static int SM = 4;
    public static int XX = 1;
    protected static String Zh = null;
    protected static int cr = 30;
    public static int cz = 0;
    public static int qj = 16;
    public static int xf = 0x20;

    static {
    }

    protected static Bitmap PjT(String s) {
        byte[] arr_b = Base64.decode(s, 2);
        return BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
    }

    public static boolean PjT(Context context0) {
        if(Build.VERSION.SDK_INT >= 33) {
            return context0.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        }
        int v = context0.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 ? 1 : 0;
        return context0.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0 ? v != 0 : false;
    }

    public static boolean PjT(Context context0, int v) {
        if(JQp.cz == 0) {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                JQp.cz |= JQp.SM;
            }
            if(packageManager0.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                JQp.cz |= JQp.DWo;
            }
            if(packageManager0.hasSystemFeature("android.hardware.sensor.compass")) {
                JQp.cz |= JQp.qj;
            }
        }
        return (JQp.cz & v) != 0;
    }

    protected static boolean PjT(Context context0, String s) [...] // Inlined contents

    public static float Zh(Context context0) {
        return context0 == null ? 0.0f : context0.getResources().getDisplayMetrics().density;
    }

    public static boolean Zh(Context context0, String s) {
        return context0.checkSelfPermission(s) == 0;
    }
}

