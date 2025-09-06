package com.kakao.adfit.m;

import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings.Global;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.r;
import kotlin.text.v;

public final class k {
    public static final k a;
    private static volatile String b;
    private static volatile String c;

    static {
        k.a = new k();
    }

    public static final float a(Intent intent0) {
        int v1;
        int v;
        L.p(intent0, "batteryIntent");
        try {
            v = intent0.getIntExtra("level", -1);
            v1 = intent0.getIntExtra("scale", -1);
            if(v >= 0 && v1 > 0) {
                return ((float)v) * 100.0f / ((float)v1);
            }
        }
        catch(Exception unused_ex) {
        }
        return -1.0f;
    }

    public static final long a() {
        return D.a.a().a() - D.a.b().a();
    }

    public static final long a(ActivityManager.MemoryInfo activityManager$MemoryInfo0) {
        L.p(activityManager$MemoryInfo0, "memoryInfo");
        return activityManager$MemoryInfo0.availMem;
    }

    public static final long a(StatFs statFs0) {
        L.p(statFs0, "stat");
        return statFs0.getBlockSizeLong() * statFs0.getAvailableBlocksLong();
    }

    public static final String a(Context context0) {
        L.p(context0, "context");
        return B.a.c(context0);
    }

    private static final String a(Context context0, WebView webView0) {
        String s4;
        WebView webView1;
        String s = null;
        String s1 = k.c;
        if(s1 != null) {
            return s1;
        }
        if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
            try {
                s = WebSettings.getDefaultUserAgent(context0);
            }
            catch(Throwable unused_ex) {
            }
            if(s != null && s.length() > 0) {
                String s2 = k.a(s);
                k.c = s2;
                return s2;
            }
            if(webView0 == null) {
                try {
                    webView1 = null;
                    webView1 = new WebView(context0);
                    s = webView1.getSettings().getUserAgentString();
                    goto label_20;
                }
                catch(Throwable unused_ex) {
                }
                goto label_17;
            }
            else {
                webView1 = webView0;
                s = webView1.getSettings().getUserAgentString();
                goto label_20;
            }
            s = webView1.getSettings().getUserAgentString();
            goto label_20;
        label_17:
            if(webView0 == null && webView1 != null) {
                webView1.destroy();
                goto label_22;
            label_20:
                if(webView0 == null) {
                    webView1.destroy();
                }
            }
        label_22:
            if(s != null && s.length() > 0) {
                String s3 = k.a(s);
                k.c = s3;
                return s3;
            }
            return "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003) AdFitSDK/3.17.2";
        }
        if(Build.VERSION.SDK_INT < 28) {
            try {
                s4 = null;
                s4 = WebSettings.getDefaultUserAgent(context0);
            }
            catch(Throwable unused_ex) {
            }
            if(s4 != null && s4.length() > 0) {
                String s5 = k.a(s4);
                k.c = s5;
                return s5;
            }
        }
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        AtomicReference atomicReference0 = new AtomicReference(null);
        new Handler(Looper.getMainLooper()).post(() -> {
            L.p(atomicReference0, "$value");
            L.p(context0, "$context");
            L.p(countDownLatch0, "$syncLatch");
            atomicReference0.set(k.a(context0, webView0));
            countDownLatch0.countDown();
        });
        try {
            countDownLatch0.await(1000L, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
        }
        String s6 = (String)atomicReference0.get();
        return s6 == null || s6.length() <= 0 ? "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003) AdFitSDK/3.17.2" : s6;
    }

    public static final String a(WebView webView0) {
        L.p(webView0, "v");
        Context context0 = webView0.getContext();
        L.o(context0, "v.context");
        return k.a(context0, webView0);
    }

    // 去混淆评级： 低(20)
    private static final String a(String s) [...] // 潜在的解密器

    // 检测为 Lambda 实现
    private static final void a(AtomicReference atomicReference0, Context context0, WebView webView0, CountDownLatch countDownLatch0) [...]

    public static final int b(Intent intent0) {
        L.p(intent0, "batteryIntent");
        try {
            return intent0.getIntExtra("status", 1);
        }
        catch(Exception unused_ex) {
            return 1;
        }
    }

    public static final long b(ActivityManager.MemoryInfo activityManager$MemoryInfo0) {
        L.p(activityManager$MemoryInfo0, "memoryInfo");
        return activityManager$MemoryInfo0.totalMem;
    }

    public static final long b(StatFs statFs0) {
        L.p(statFs0, "stat");
        return statFs0.getBlockSizeLong() * statFs0.getBlockCountLong();
    }

    public static final Intent b(Context context0) {
        L.p(context0, "context");
        try {
            return context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static final String b() {
        String s = Build.BRAND;
        L.o(s, "BRAND");
        return s;
    }

    public static final float c(Intent intent0) {
        L.p(intent0, "batteryIntent");
        try {
            int v = intent0.getIntExtra("temperature", -1);
            if(v > 0) {
                return ((float)v) / 10.0f;
            }
        }
        catch(Exception unused_ex) {
        }
        return -1.0f;
    }

    public static final int c() [...] // 潜在的解密器

    public static final ActivityManager.MemoryInfo c(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("activity");
            L.n(object0, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
            ((ActivityManager)object0).getMemoryInfo(activityManager$MemoryInfo0);
            return activityManager$MemoryInfo0;
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    public static final boolean c(ActivityManager.MemoryInfo activityManager$MemoryInfo0) {
        L.p(activityManager$MemoryInfo0, "memoryInfo");
        return activityManager$MemoryInfo0.lowMemory;
    }

    public static final String d() {
        try {
            String s = Build.MODEL;
            L.o(s, "MODEL");
            String s1 = (String)u.G2(new r(" ").p(s, 0));
            if(s1 != null) {
                return s1;
            }
        }
        catch(Exception unused_ex) {
        }
        return "unknown";
    }

    public static final String d(Context context0) {
        L.p(context0, "context");
        try {
            String s = Settings.Global.getString(context0.getContentResolver(), "device_name");
            L.o(s, "getString(context.contentResolver, \"device_name\")");
            return s;
        }
        catch(Exception unused_ex) {
            return "unknown";
        }
    }

    public static final boolean d(Intent intent0) {
        L.p(intent0, "batteryIntent");
        try {
            int v = intent0.getIntExtra("plugged", -1);
            if(v == 1 || v == 2) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static final StatFs e(Context context0) {
        L.p(context0, "context");
        try {
            File file0 = context0.getExternalFilesDir(null);
            return file0 == null ? null : new StatFs(file0.getPath());
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public static final String e() {
        String s = Locale.getDefault().toString();
        L.o(s, "getDefault().toString()");
        return s;
    }

    public static final String f() {
        String s = Locale.getDefault().getLanguage();
        L.o(s, "getDefault().language");
        return s;
    }

    public static final String f(Context context0) {
        L.p(context0, "context");
        return k.a(context0, null);
    }

    public static final String g() {
        String s = Build.MANUFACTURER;
        L.o(s, "MANUFACTURER");
        return s;
    }

    public static final boolean g(Context context0) {
        L.p(context0, "context");
        try {
            if(Settings.Global.getInt(context0.getContentResolver(), "adb_enabled", 0) != 0) {
                return true;
            }
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    public static final String h() {
        String s = Build.ID;
        L.o(s, "ID");
        return s;
    }

    public static final boolean h(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("keyguard");
            L.n(object0, "null cannot be cast to non-null type android.app.KeyguardManager");
            return ((KeyguardManager)object0).inKeyguardRestrictedInputMode();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static final String i() {
        String s = Build.MODEL;
        L.o(s, "MODEL");
        return s;
    }

    public static final boolean i(Context context0) {
        L.p(context0, "context");
        try {
            Object object0 = context0.getSystemService("power");
            L.n(object0, "null cannot be cast to non-null type android.os.PowerManager");
            return ((PowerManager)object0).isInteractive();
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    public static final List j() {
        try {
            String[] arr_s = Build.SUPPORTED_ABIS;
            L.o(arr_s, "SUPPORTED_ABIS");
            return l.Ky(arr_s);
        }
        catch(Exception unused_ex) {
            return u.H();
        }
    }

    public static final boolean j(Context context0) {
        L.p(context0, "context");
        try {
            Bundle bundle0 = null;
            Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
            if(intent0 != null) {
                bundle0 = intent0.getExtras();
            }
            return bundle0 == null ? false : bundle0.getBoolean("connected");
        }
        catch(Exception unused_ex) {
        }
        return false;
    }

    // 去混淆评级： 中等(100)
    public static final String k() [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    public static final String l() [...] // 潜在的解密器

    public static final long m() {
        return D.a.b().a();
    }

    public static final boolean n() {
        String s = Build.BRAND;
        L.o(s, "BRAND");
        if(v.v2(s, "generic", false, 2, null)) {
            String s1 = Build.DEVICE;
            L.o(s1, "DEVICE");
            if(!v.v2(s1, "generic", false, 2, null)) {
                goto label_6;
            }
        }
        else {
        label_6:
            L.o("google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", "FINGERPRINT");
            if(!v.v2("google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", "generic", false, 2, null)) {
                L.o("google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", "FINGERPRINT");
                if(!v.v2("google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys", "unknown", false, 2, null)) {
                    String s2 = Build.HARDWARE;
                    L.o(s2, "HARDWARE");
                    if(!v.W2(s2, "goldfish", false, 2, null)) {
                        L.o(s2, "HARDWARE");
                        if(!v.W2(s2, "ranchu", false, 2, null)) {
                            String s3 = Build.MODEL;
                            L.o(s3, "MODEL");
                            if(!v.W2(s3, "google_sdk", false, 2, null)) {
                                L.o(s3, "MODEL");
                                if(!v.W2(s3, "Emulator", false, 2, null)) {
                                    L.o(s3, "MODEL");
                                    if(!v.W2(s3, "Android SDK built for x86", false, 2, null)) {
                                        String s4 = Build.MANUFACTURER;
                                        L.o(s4, "MANUFACTURER");
                                        if(!v.W2(s4, "Genymotion", false, 2, null)) {
                                            String s5 = Build.PRODUCT;
                                            L.o(s5, "PRODUCT");
                                            if(!v.W2(s5, "sdk_google", false, 2, null)) {
                                                L.o(s5, "PRODUCT");
                                                if(!v.W2(s5, "google_sdk", false, 2, null)) {
                                                    L.o(s5, "PRODUCT");
                                                    if(!v.W2(s5, "sdk", false, 2, null)) {
                                                        L.o(s5, "PRODUCT");
                                                        if(!v.W2(s5, "sdk_x86", false, 2, null)) {
                                                            L.o(s5, "PRODUCT");
                                                            if(!v.W2(s5, "vbox86p", false, 2, null)) {
                                                                L.o(s5, "PRODUCT");
                                                                if(!v.W2(s5, "emulator", false, 2, null)) {
                                                                    L.o(s5, "PRODUCT");
                                                                    return v.W2(s5, "simulator", false, 2, null);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}

