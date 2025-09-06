package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;
import android.telephony.TelephonyManager;

public class v {
    public static int a = -1;
    public static int b = -1;

    static {
    }

    public static int a() {
        static final class a implements Runnable {
            @Override
            public void run() {
                v.b = v.b(x.b());
                SharedPreferences sharedPreferences0 = v0.a(x.b());
                if(sharedPreferences0 != null) {
                    sharedPreferences0.edit().putInt("camera_count", v.b).apply();
                }
            }
        }

        int v = v.b;
        if(v != -1) {
            return v;
        }
        SharedPreferences sharedPreferences0 = v0.a(x.b());
        if(sharedPreferences0 != null) {
            int v1 = sharedPreferences0.getInt("camera_count", -1);
            if(v1 != -1) {
                v.b = v1;
                return v1;
            }
        }
        p0.b(new a());
        return -1;
    }

    private static int b(Context context0) {
        int v = v.b;
        if(v != -1) {
            return v;
        }
        CameraManager cameraManager0 = (CameraManager)context0.getSystemService("camera");
        if(cameraManager0 != null) {
            try {
                v.b = cameraManager0.getCameraIdList().length;
                return v.b;
            }
            catch(Throwable unused_ex) {
                v.b = -1;
                return -1;
            }
        }
        v.b = -2;
        return -2;
    }

    public static int c(Context context0) {
        if(v.a == -1) {
            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
            if(telephonyManager0 != null) {
                v.a = telephonyManager0.getSimState();
            }
        }
        return v.a;
    }
}

