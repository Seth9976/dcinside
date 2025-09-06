package com.tiktok.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.annotation.RequiresApi;
import com.tiktok.b;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import org.json.JSONObject;

public class c {
    static PackageManager a;
    static PackageInfo b;
    static Application c;
    private static String d;

    static {
        try {
            Application application0 = b.l();
            c.c = application0;
            PackageManager packageManager0 = application0.getPackageManager();
            c.a = packageManager0;
            c.b = packageManager0.getPackageInfo("com.dcinside.app.android", 0);
        }
        catch(Exception unused_ex) {
        }
        c.d = null;
    }

    public static String a() [...] // 潜在的解密器

    public static String b() {
        return c.c.getApplicationInfo().loadLabel(c.a).toString();
    }

    public static int c() {
        if(c.b == null) {
            return 0;
        }
        return Build.VERSION.SDK_INT < 28 ? c.b.versionCode : ((int)c.b.getLongVersionCode());
    }

    public static String d() [...] // 潜在的解密器

    public static String e() {
        try {
            Enumeration enumeration0 = NetworkInterface.getNetworkInterfaces();
            while(enumeration0.hasMoreElements()) {
                Enumeration enumeration1 = ((NetworkInterface)enumeration0.nextElement()).getInetAddresses();
                while(enumeration1.hasMoreElements()) {
                    InetAddress inetAddress0 = (InetAddress)enumeration1.nextElement();
                    if(!inetAddress0.isLoopbackAddress() && inetAddress0 instanceof Inet4Address) {
                        return inetAddress0.getHostAddress();
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return "";
    }

    public static String f() {
        return Locale.getDefault().getLanguage();
    }

    public static String g(Context context0) [...] // 潜在的解密器

    public static String h() {
        return c.b.packageName;
    }

    public static String i() [...] // Inlined contents

    public static String j() {
        if(c.d == null) {
            c.k();
        }
        return c.d;
    }

    @RequiresApi(api = 17)
    public static void k() {
        long v;
        try {
            if(c.d != null) {
                return;
            }
            v = System.currentTimeMillis();
            b.j().I("ua_init", g.c(v), null);
            e e0 = new e(b.l());
            String s = e0.a("com.tiktok.user.agent");
            c.d = s;
            if(TextUtils.isEmpty(s)) {
                String s1 = WebSettings.getDefaultUserAgent(b.l());
                c.d = s1;
                e0.b("com.tiktok.user.agent", s1);
            }
            exception0 = null;
        }
        catch(Exception exception0) {
            c.d = "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
        }
        if(c.d == null) {
            c.d = "";
        }
        try {
            long v1 = System.currentTimeMillis();
            JSONObject jSONObject0 = g.b(exception0, v1, 2).put("latency", v1 - v);
            b.j().I("ua_end", jSONObject0, null);
        }
        catch(Exception unused_ex) {
        }
    }
}

