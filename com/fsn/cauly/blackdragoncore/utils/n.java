package com.fsn.cauly.blackdragoncore.utils;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import java.io.File;

public class n {
    private static int a = -1;

    static {
    }

    // 去混淆评级： 低(41)
    public static boolean a(Context context0) {
        int v1;
        int v = Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("Andy") || Build.PRODUCT.contains("ttVM_Hdragon") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.toLowerCase().contains("droid4x") || Build.PRODUCT.toLowerCase().contains("nox") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("greatlteks") || Build.PRODUCT.contains("windroye") ? 1 : 0;
        if(Build.MANUFACTURER.equals("unknown") || Build.MANUFACTURER.equals("Genymotion") || Build.MANUFACTURER.contains("Andy") || Build.MANUFACTURER.contains("MIT") || Build.MANUFACTURER.contains("nox") || Build.MANUFACTURER.contains("TiantianVM") || Build.MANUFACTURER.toLowerCase().contains("windroy")) {
            ++v;
        }
        if(Build.BRAND.equals("generic") || Build.BRAND.equals("generic_x86") || Build.BRAND.equals("TTVM") || Build.BRAND.contains("Andy") || Build.BRAND.toLowerCase().contains("windroy")) {
            ++v;
        }
        if(Build.DEVICE.contains("generic") || Build.DEVICE.contains("generic_x86") || Build.DEVICE.contains("Andy") || Build.DEVICE.contains("ttVM_Hdragon") || Build.DEVICE.toLowerCase().contains("droid4x") || Build.DEVICE.contains("nox") || Build.DEVICE.contains("generic_x86_64") || Build.DEVICE.contains("vbox86p") || Build.DEVICE.contains("greatlteks") || Build.DEVICE.toLowerCase().contains("windroye")) {
            ++v;
        }
        if(Build.MODEL.equals("sdk") || Build.MODEL.equals("google_sdk") || Build.MODEL.toLowerCase().contains("droid4x") || Build.MODEL.contains("TiantianVM") || Build.MODEL.contains("Andy") || Build.MODEL.equals("Android SDK built for x86_64") || Build.MODEL.equals("Android SDK built for x86") || Build.MODEL.contains("Emulator") || Build.MODEL.toLowerCase().contains("windroye")) {
            ++v;
        }
        if(Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("vbox86") || Build.HARDWARE.toLowerCase().contains("nox") || Build.HARDWARE.contains("ttVM_x86")) {
            ++v;
        }
        String s = context0.getApplicationInfo().packageName;
        if(s.startsWith("Bluestacks.") || s.startsWith("com.bignox.")) {
            v += 10;
        }
        try {
            v1 = v;
            int v2 = File.separatorChar;
            if(new File(Environment.getExternalStorageDirectory().toString() + ((char)v2) + "windows" + ((char)v2) + "BstSharedFolder").exists()) {
                v1 += 10;
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        n.a = v1;
        return v1 > 2;
    }
}

