package com.kakao.adfit.m;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public abstract class z {
    private static volatile boolean a = false;
    private static volatile long b;

    static {
    }

    private static boolean a() {
        Process process0;
        boolean z = false;
        try {
            process0 = null;
            process0 = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if(new BufferedReader(new InputStreamReader(process0.getInputStream())).readLine() != null) {
                z = true;
            }
        }
        catch(Throwable unused_ex) {
            if(process0 != null) {
                process0.destroy();
            }
            return false;
        }
        process0.destroy();
        return z;
    }

    // 去混淆评级： 低(40)
    private static boolean a(Context context0) {
        return z.c() || z.b() || z.a() || z.b(context0);
    }

    private static boolean b() {
        for(int v = 0; v < 12; ++v) {
            if(new File(new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"}[v]).exists()) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        int v = 0;
        while(true) {
            String s = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"}[v];
            try {
                packageManager0.getPackageInfo(s, 0);
                return true;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                ++v;
            }
        }
    }

    private static boolean c() {
        return Build.TAGS != null && Build.TAGS.contains("test-keys");
    }

    public static boolean c(Context context0) {
        if(SystemClock.elapsedRealtime() > z.b) {
            z.a = z.a(context0);
            z.b = SystemClock.elapsedRealtime() + 86400000L;
        }
        return z.a;
    }
}

