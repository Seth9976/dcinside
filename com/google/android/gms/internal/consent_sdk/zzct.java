package com.google.android.gms.internal.consent_sdk;

import android.os.Build.VERSION;
import android.os.Build;

public final class zzct {
    // 去混淆评级： 中等(90)
    public static boolean zza(boolean z) {
        return Build.VERSION.SDK_INT < 0x1F ? Build.DEVICE.startsWith("generic") : Build.HARDWARE.contains("ranchu");
    }
}

