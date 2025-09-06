package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.g;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class i {
    static enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;

        private static final Map k;

        static {
            HashMap hashMap0 = new HashMap(4);
            a.k = hashMap0;
            hashMap0.put("armeabi-v7a", a.g);
            hashMap0.put("armeabi", a.f);
            hashMap0.put("arm64-v8a", a.j);
            hashMap0.put("x86", a.a);
        }

        private static a[] a() [...] // Inlined contents

        // 去混淆评级： 低(20)
        static a b() {
            if(TextUtils.isEmpty("arm64-v8a")) {
                g.f().k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return a.h;
            }
            a i$a0 = (a)a.k.get("arm64-v8a");
            return i$a0 == null ? a.h : i$a0;
        }
    }

    private static final String a = "SHA-1";
    private static final String b = "goldfish";
    private static final String c = "ranchu";
    private static final String d = "sdk";
    public static final String e = "com.google.firebase.crashlytics";
    public static final String f = "com.crashlytics.prefs";
    private static final char[] g = null;
    static final String h = "com.google.firebase.crashlytics.mapping_file_id";
    static final String i = "com.crashlytics.android.build_id";
    static final String j = "com.google.firebase.crashlytics.build_ids_lib";
    static final String k = "com.google.firebase.crashlytics.build_ids_arch";
    static final String l = "com.google.firebase.crashlytics.build_ids_build_id";
    public static final int m = 1;
    public static final int n = 2;
    public static final int o = 4;
    public static final int p = 8;
    public static final int q = 16;
    public static final int r = 0x20;

    static {
        i.g = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static boolean A(@Nullable String s, @Nullable String s1) {
        return s == null ? s1 == null : s.equals(s1);
    }

    public static String B(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("value must be zero or greater");
        }
        return String.format(Locale.US, "%1$10s", v).replace(' ', '0');
    }

    public static String C(String s) {
        return i.s(s, "SHA-1");
    }

    public static String D(InputStream inputStream0) {
        Scanner scanner0 = new Scanner(inputStream0).useDelimiter("\\A");
        return scanner0.hasNext() ? scanner0.next() : "";
    }

    public static long a(Context context0) {
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
        ((ActivityManager)context0.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo0);
        return activityManager$MemoryInfo0.availMem;
    }

    public static long b(Context context0) {
        synchronized(i.class) {
            ActivityManager.MemoryInfo activityManager$MemoryInfo0 = new ActivityManager.MemoryInfo();
            ((ActivityManager)context0.getSystemService("activity")).getMemoryInfo(activityManager$MemoryInfo0);
            return activityManager$MemoryInfo0.totalMem;
        }
    }

    public static long c(String s) {
        StatFs statFs0 = new StatFs(s);
        long v = (long)statFs0.getBlockSize();
        return ((long)statFs0.getBlockCount()) * v - v * ((long)statFs0.getAvailableBlocks());
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(Context context0) {
        if(i.e(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            return networkInfo0 != null && networkInfo0.isConnectedOrConnecting();
        }
        return true;
    }

    public static boolean e(Context context0, String s) {
        return context0.checkCallingOrSelfPermission(s) == 0;
    }

    public static void f(Closeable closeable0, String s) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(IOException iOException0) {
                g.f().e(s, iOException0);
            }
        }
    }

    public static void g(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
                return;
            }
            catch(RuntimeException runtimeException0) {
            }
            catch(Exception unused_ex) {
                return;
            }
            throw runtimeException0;
        }
    }

    public static String h(String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < arr_s.length; ++v) {
                String s = arr_s[v];
                if(s != null) {
                    arrayList0.add(s.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList0);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: arrayList0) {
                stringBuilder0.append(((String)object0));
            }
            String s1 = stringBuilder0.toString();
            return s1.length() <= 0 ? null : i.C(s1);
        }
        return null;
    }

    public static boolean i(Context context0, String s, boolean z) {
        if(context0 != null) {
            Resources resources0 = context0.getResources();
            if(resources0 != null) {
                int v = i.q(context0, s, "bool");
                if(v > 0) {
                    return resources0.getBoolean(v);
                }
                int v1 = i.q(context0, s, "string");
                return v1 <= 0 ? z : Boolean.parseBoolean(context0.getString(v1));
            }
        }
        return z;
    }

    public static List j(Context context0) {
        List list0 = new ArrayList();
        int v1 = i.q(context0, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int v2 = i.q(context0, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int v3 = i.q(context0, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if(v1 != 0 && v2 != 0 && v3 != 0) {
            String[] arr_s = context0.getResources().getStringArray(v1);
            String[] arr_s1 = context0.getResources().getStringArray(v2);
            String[] arr_s2 = context0.getResources().getStringArray(v3);
            if(arr_s.length == arr_s2.length && arr_s1.length == arr_s2.length) {
                for(int v = 0; v < arr_s2.length; ++v) {
                    list0.add(new f(arr_s[v], arr_s1[v], arr_s2[v]));
                }
                return list0;
            }
            g.f().b(String.format("Lengths did not match: %d %d %d", ((int)arr_s.length), ((int)arr_s1.length), ((int)arr_s2.length)));
            return list0;
        }
        g.f().b(String.format("Could not find resources: %d %d %d", v1, v2, v3));
        return list0;
    }

    public static int k() {
        return a.b().ordinal();
    }

    public static int l() {
        int v = i.x();
        if(i.z()) {
            v |= 2;
        }
        return i.w() ? v | 4 : v;
    }

    public static SharedPreferences m(Context context0) {
        return context0.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String n(Context context0) {
        int v = i.q(context0, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if(v == 0) {
            v = i.q(context0, "com.crashlytics.android.build_id", "string");
        }
        return v == 0 ? null : context0.getResources().getString(v);
    }

    // 去混淆评级： 低(20)
    public static boolean o(Context context0) {
        return i.x() ? false : ((SensorManager)context0.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String p(Context context0) {
        int v = context0.getApplicationContext().getApplicationInfo().icon;
        if(v > 0) {
            try {
                String s = context0.getResources().getResourcePackageName(v);
                return "android".equals(s) ? "com.dcinside.app.android" : s;
            }
            catch(Resources.NotFoundException unused_ex) {
                return "com.dcinside.app.android";
            }
        }
        return "com.dcinside.app.android";
    }

    public static int q(Context context0, String s, String s1) {
        return context0.getResources().getIdentifier(s, s1, i.p(context0));
    }

    public static SharedPreferences r(Context context0) {
        return context0.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static String s(String s, String s1) {
        return i.t(s.getBytes(), s1);
    }

    private static String t(byte[] arr_b, String s) {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance(s);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            g.f().e("Could not create hashing algorithm: " + s + ", returning empty string.", noSuchAlgorithmException0);
            return "";
        }
        messageDigest0.update(arr_b);
        return i.u(messageDigest0.digest());
    }

    public static String u(byte[] arr_b) {
        char[] arr_c = new char[arr_b.length * 2];
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            arr_c[v * 2] = i.g[(v1 & 0xFF) >>> 4];
            arr_c[v * 2 + 1] = i.g[v1 & 15];
        }
        return new String(arr_c);
    }

    public static boolean v(Context context0) {
        return (context0.getApplicationInfo().flags & 2) != 0;
    }

    // 去混淆评级： 低(20)
    public static boolean w() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    // 去混淆评级： 低(30)
    public static boolean x() {
        return Build.PRODUCT.contains("sdk") || (Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu"));
    }

    @Deprecated
    public static boolean y(Context context0) {
        return false;
    }

    public static boolean z() {
        boolean z = i.x();
        if(!z && Build.TAGS != null && Build.TAGS.contains("test-keys")) {
            return true;
        }
        return new File("/system/app/Superuser.apk").exists() ? true : !z && new File("/system/xbin/su").exists();
    }
}

