package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.d;
import com.apm.insight.l.l;
import com.apm.insight.runtime.o;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public final class Header {
    private static final String[] a;
    private Context b;
    private JSONObject c;
    private static String d;
    private static int e;
    private static int f;

    static {
        Header.a = new String[]{"version_code", "manifest_version_code", "aid", "update_version_code"};
        Header.d = null;
        Header.e = -1;
        Header.f = -1;
    }

    public Header(Context context0) {
        this.c = new JSONObject();
        this.b = context0;
    }

    public static Header a(long v) {
        Header header0;
        o o0 = o.a();
        if(v == 0L) {
            v = System.currentTimeMillis();
        }
        JSONObject jSONObject0 = o0.a(v);
        if(jSONObject0 == null || jSONObject0.length() == 0) {
            header0 = Header.a(e.g());
            header0.c();
            try {
                header0.c.put("errHeader", 1);
            }
            catch(Throwable unused_ex) {
            }
        }
        else {
            header0 = new Header(e.g());
        }
        Header.b(header0);
        header0.a(jSONObject0);
        return header0;
    }

    public static Header a(Context context0) {
        Header header0 = new Header(context0);
        JSONObject jSONObject0 = header0.c;
        try {
            jSONObject0.put("sdk_version", 200000390);
            jSONObject0.put("sdk_version_name", "2.0.0.3");
        }
        catch(Exception unused_ex) {
        }
        return header0;
    }

    public static Header a(Header header0) {
        Header.addRuntimeHeader(header0.c);
        return header0;
    }

    public static boolean a() {
        if(Header.e == -1) {
            Header.e = true;
        }
        return Header.e == 1;
    }

    public final JSONObject a(@Nullable Map map0) {
        String s;
        int v;
        try {
            if(map0 == null) {
                return this.c;
            }
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(!this.c.has(((String)map$Entry0.getKey()))) {
                    this.c.put(((String)map$Entry0.getKey()), map$Entry0.getValue());
                }
            }
            String[] arr_s = Header.a;
            v = 0;
            while(true) {
            label_11:
                if(v >= 4) {
                    goto label_20;
                }
                s = arr_s[v];
                if(map0.containsKey(s)) {
                    break;
                }
                ++v;
            }
        }
        catch(Throwable unused_ex) {
            return this.c;
        }
        try {
            int v1 = Integer.parseInt(String.valueOf(map0.get(s)));
            this.c.put(s, v1);
            ++v;
            goto label_11;
        }
        catch(Throwable unused_ex) {
            try {
                this.c.put(s, map0.get(s));
                ++v;
                goto label_11;
            label_20:
                if(map0.containsKey("version_code") && !map0.containsKey("manifest_version_code")) {
                    goto label_21;
                }
                goto label_23;
            }
            catch(Throwable unused_ex) {
                return this.c;
            }
        }
        try {
        label_21:
            int v2 = Integer.parseInt(String.valueOf(map0.get("version_code")));
            this.c.put("manifest_version_code", v2);
        }
        catch(Throwable unused_ex) {
        }
        try {
        label_23:
            if(map0.containsKey("iid")) {
                this.c.put("udid", map0.get("iid"));
                this.c.remove("iid");
            }
            if(map0.containsKey("version_name")) {
                this.c.put("app_version", map0.get("version_name"));
                this.c.remove("version_name");
            }
        }
        catch(Throwable unused_ex) {
        }
        return this.c;
    }

    public final JSONObject a(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return this.c;
        }
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            try {
                this.c.put(s, jSONObject0.opt(s));
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
        }
        return this.c;
    }

    @Keep
    public static void addOtherHeader(JSONObject jSONObject0) {
        String s1;
        if(jSONObject0 == null) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            if(d.b()) {
                stringBuilder0.append("MIUI-");
            }
            else if(!d.c()) {
                String s = d.a();
                if(d.a(s)) {
                    stringBuilder0.append("EMUI-");
                }
                if(!TextUtils.isEmpty(s)) {
                    stringBuilder0.append(s);
                    stringBuilder0.append("-");
                }
            }
            else {
                stringBuilder0.append("FLYME-");
            }
            stringBuilder0.append(Build.VERSION.INCREMENTAL);
            if(stringBuilder0.length() > 0) {
                jSONObject0.put("rom", stringBuilder0.toString());
            }
            jSONObject0.put("rom_version", l.a());
        }
        catch(Throwable unused_ex) {
        }
        try {
            DisplayMetrics displayMetrics0 = e.g().getResources().getDisplayMetrics();
            int v = displayMetrics0.densityDpi;
            switch(v) {
                case 120: {
                    s1 = "ldpi";
                    break;
                }
                case 0xF0: {
                    s1 = "hdpi";
                    break;
                }
                case 320: {
                    s1 = "xhdpi";
                    break;
                }
                default: {
                    s1 = "mdpi";
                }
            }
            jSONObject0.put("density_dpi", v);
            jSONObject0.put("display_density", s1);
            jSONObject0.put("resolution", displayMetrics0.heightPixels + "x" + displayMetrics0.widthPixels);
        }
        catch(Exception unused_ex) {
        }
        try {
            String s2 = e.g().getResources().getConfiguration().locale.getLanguage();
            if(!TextUtils.isEmpty(s2)) {
                jSONObject0.put("language", s2);
            }
            int v1 = TimeZone.getDefault().getRawOffset() / 3600000;
            if(v1 < -12) {
                v1 = -12;
            }
            if(v1 > 12) {
                v1 = 12;
            }
            jSONObject0.put("timezone", v1);
        }
        catch(Exception unused_ex) {
        }
        try {
            jSONObject0.put("os", "Android");
            jSONObject0.put("device_id", e.c().a());
            jSONObject0.put("os_version", (Build.VERSION.RELEASE.contains(".") ? Build.VERSION.RELEASE : Build.VERSION.RELEASE + ".0"));
            jSONObject0.put("os_api", Build.VERSION.SDK_INT);
            String s3 = Build.MODEL;
            String s4 = Build.BRAND;
            if(s3 == null) {
                s3 = s4;
            }
            else if(s4 != null && !s3.contains(s4)) {
                s3 = s4 + ' ' + s3;
            }
            jSONObject0.put("device_model", s3);
            jSONObject0.put("device_brand", s4);
            jSONObject0.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject0.put("cpu_abi", "arm64-v8a");
            Context context0 = e.g();
            jSONObject0.put("package", "com.dcinside.app.android");
            PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
            ApplicationInfo applicationInfo0 = packageInfo0.applicationInfo;
            if(applicationInfo0 != null) {
                int v2 = applicationInfo0.labelRes;
                if(v2 > 0) {
                    jSONObject0.put("display_name", context0.getString(v2));
                }
                else {
                    jSONObject0.put("display_name", context0.getPackageManager().getApplicationLabel(packageInfo0.applicationInfo));
                }
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        com.apm.insight.entity.d.a(jSONObject0);
    }

    public static void addRuntimeHeader(JSONObject jSONObject0) {
        try {
            jSONObject0.put("access", "mobile");
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager0 = (TelephonyManager)e.g().getSystemService("phone");
            if(telephonyManager0 != null) {
                String s = telephonyManager0.getNetworkOperatorName();
                if(!TextUtils.isEmpty(s)) {
                    jSONObject0.put("carrier", s);
                }
                String s1 = telephonyManager0.getNetworkOperator();
                if(!TextUtils.isEmpty(s1)) {
                    jSONObject0.put("mcc_mnc", s1);
                }
            }
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    public static Header b(Context context0) {
        Header header0 = Header.a(context0);
        Header.a(header0);
        Header.b(header0);
        header0.c();
        header0.d();
        header0.e();
        return header0;
    }

    public static void b(Header header0) {
        if(header0 == null) {
            return;
        }
        Header.addOtherHeader(header0.c);
    }

    public static boolean b() {
        if(Header.f == -1) {
            Header.f = false;
        }
        return Header.f == 1;
    }

    public static boolean b(JSONObject jSONObject0) {
        return jSONObject0.optInt("unauthentic_version", 0) == 1;
    }

    public static boolean c(JSONObject jSONObject0) {
        return jSONObject0 == null || jSONObject0.length() == 0 || jSONObject0.opt("app_version") == null && jSONObject0.opt("version_name") == null || jSONObject0.opt("version_code") == null || jSONObject0.opt("update_version_code") == null;
    }

    public final JSONObject c() {
        return this.a(e.a().a());
    }

    public static boolean d(JSONObject jSONObject0) {
        if(jSONObject0 != null && jSONObject0.length() != 0) {
            String s = jSONObject0.optString("aid");
            if(TextUtils.isEmpty(s)) {
                return true;
            }
            try {
                return Integer.parseInt(s) <= 0;
            }
            catch(Throwable unused_ex) {
            }
        }
        return true;
    }

    public final JSONObject d() {
        try {
            this.c.put("device_id", e.c().a());
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return this.c;
    }

    public final JSONObject e() {
        try {
            long v = e.a().f();
            if(v > 0L) {
                this.c.put("user_id", v);
                return this.c;
            }
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return this.c;
    }

    public final JSONObject f() {
        return this.c;
    }

    private static String g() [...] // 潜在的解密器
}

