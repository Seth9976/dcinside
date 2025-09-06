package com.apm.insight.entity;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    private JSONObject a;
    private Header b;

    public a() {
        JSONObject jSONObject0 = new JSONObject();
        this.a = jSONObject0;
        try {
            jSONObject0.put("apm_id", "20000001");
        }
        catch(JSONException unused_ex) {
        }
    }

    public a(JSONObject jSONObject0) {
        this.a = jSONObject0;
    }

    public static a a(long v, Context context0, @NonNull Throwable throwable0) {
        if(v == 0L) {
            v = System.currentTimeMillis();
        }
        a a0 = new a();
        a0.a("isJava", 1);
        a0.a("data", m.a(throwable0));
        a0.a("crash_time", v);
        a0.a("process_name", com.apm.insight.l.a.d(context0));
        if(!com.apm.insight.l.a.c(context0)) {
            a0.a("remote_process", 1);
        }
        return a0;
    }

    private a a(String s, JSONArray jSONArray0) {
        JSONObject jSONObject0 = this.a.optJSONObject("custom_long");
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
            this.a("custom_long", jSONObject0);
        }
        try {
            jSONObject0.put(s, jSONArray0);
        }
        catch(JSONException unused_ex) {
        }
        return this;
    }

    public static void a(JSONObject jSONObject0, String s, String s1, String s2) {
        if(jSONObject0 == null) {
            return;
        }
        JSONObject jSONObject1 = jSONObject0.optJSONObject(s);
        try {
            if(jSONObject1 == null) {
                jSONObject1 = new JSONObject();
                jSONObject0.put(s, jSONObject1);
            }
            jSONObject1.put(s1, s2);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void a(JSONObject jSONObject0, Throwable throwable0) {
        if(jSONObject0.opt("npth_err_info") == null) {
            try {
                jSONObject0.put("npth_err_info", m.a(throwable0));
            }
            catch(Throwable unused_ex) {
            }
            return;
        }
        for(int v = 0; v < 5; ++v) {
            if(jSONObject0.opt("npth_err_info" + v) == null) {
                try {
                    jSONObject0.put("npth_err_info" + v, m.a(throwable0));
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
        }
    }

    public static void a(JSONObject jSONObject0, Map map0) {
        if(map0 != null) {
            try {
                for(Object object0: map0.entrySet()) {
                    jSONObject0.put(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void a(JSONObject jSONObject0, JSONObject jSONObject1) {
        String s2;
        String s1;
        try {
            jSONObject0.put("storage", jSONObject1);
        }
        catch(Throwable unused_ex) {
        }
        long v = jSONObject1.optLong("inner_free");
        long v1 = jSONObject1.optLong("sdcard_free");
        long v2 = jSONObject1.optLong("inner_free_real");
        String s = "64M - ";
        if(v <= 0x400L) {
            s1 = "0 - 1K";
        }
        else if(v <= 0x10000L) {
            s1 = "1K - 64K";
        }
        else if(v <= 0x80000L) {
            s1 = "64K - 512K";
        }
        else if(v <= 0x100000L) {
            s1 = "512K - 1M";
        }
        else {
            s1 = v > 0x4000000L ? "64M - " : "1M - 64M";
        }
        if(v2 <= 0x400L) {
            s2 = "0 - 1K";
        }
        else if(v2 <= 0x10000L) {
            s2 = "1K - 64K";
        }
        else if(v2 <= 0x80000L) {
            s2 = "64K - 512K";
        }
        else if(v2 <= 0x100000L) {
            s2 = "512K - 1M";
        }
        else {
            s2 = v2 > 0x4000000L ? "64M - " : "1M - 64M";
        }
        if(v1 <= 0x400L) {
            s = "0 - 1K";
        }
        else if(v1 <= 0x10000L) {
            s = "1K - 64K";
        }
        else if(v1 <= 0x80000L) {
            s = "64K - 512K";
        }
        else if(v1 <= 0x100000L) {
            s = "512K - 1M";
        }
        else if(v1 <= 0x4000000L) {
            s = "1M - 64M";
        }
        a.a(jSONObject0, "filters", "inner_free", s1);
        a.a(jSONObject0, "filters", "inner_free_real", s2);
        a.a(jSONObject0, "filters", "sdcard_free", s);
    }

    public static boolean a(String s) {
        return ((long)b.c(s)) > com.apm.insight.nativecrash.a.g();
    }

    public final a a(int v, String s) {
        try {
            this.a.put("miniapp_id", v);
            this.a.put("miniapp_version", s);
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
        }
        return this;
    }

    public final a a(long v) {
        try {
            this.a("app_start_time", v);
            this.a("app_start_time_readable", new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(v)));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return this;
    }

    public final a a(Header header0) {
        this.a("header", header0.f());
        this.b = header0;
        return this;
    }

    public final a a(com.apm.insight.runtime.a.b b0) {
        this.a("activity_trace", b0.g());
        this.a("activity_track", b0.i());
        return this;
    }

    public final a a(String s, String s1) {
        Object object0 = this.a.opt("data");
        if(object0 instanceof JSONArray) {
            a.a(((JSONArray)object0).optJSONObject(0), "filters", s, s1);
            return this;
        }
        a.a(this.a, "filters", s, s1);
        return this;
    }

    public final a a(List list0) {
        JSONArray jSONArray0 = new JSONArray();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                jSONArray0.put(((String)object0));
            }
            this.a("patch_info", jSONArray0);
            return this;
        }
        this.a("patch_info", jSONArray0);
        return this;
    }

    public final a a(Map map0) {
        JSONArray jSONArray0 = new JSONArray();
        try {
            if(map0 == null) {
                this.a.put("plugin_info", jSONArray0);
                return this;
            }
            for(Object object0: map0.keySet()) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("package_name", ((String)object0));
                jSONObject0.put("version_code", map0.get(((String)object0)));
                jSONArray0.put(jSONObject0);
            }
            this.a.put("plugin_info", jSONArray0);
        }
        catch(Exception unused_ex) {
        }
        return this;
    }

    public final a a(JSONObject jSONObject0) {
        this.a("header", jSONObject0);
        return this;
    }

    public final void a(@NonNull String s, @Nullable Object object0) {
        try {
            this.a.put(s, object0);
        }
        catch(Exception exception0) {
            com.apm.insight.a.b(exception0);
        }
    }

    // 去混淆评级： 低(20)
    public final boolean a() {
        Object object0 = this.a.opt("data");
        return object0 instanceof JSONArray ? !com.apm.insight.a.a(((JSONArray)object0).optJSONObject(0), "logcat") : !com.apm.insight.a.a(this.a, "logcat");
    }

    public static void b(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 != null && jSONObject1 != null && jSONObject1.length() > 0) {
            try {
                Iterator iterator0 = jSONObject1.keys();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return;
                    }
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    Object object1 = jSONObject0.opt(s);
                    if(object1 == null) {
                        jSONObject0.put(s, jSONObject1.opt(s));
                    }
                    else if(object1 instanceof JSONObject) {
                        a.b(jSONObject0.getJSONObject(s), jSONObject1.getJSONObject(s));
                    }
                    else if(object1 instanceof JSONArray) {
                        JSONArray jSONArray0 = jSONObject1.optJSONArray(s);
                        if(jSONArray0 != null) {
                            JSONArray jSONArray1 = (JSONArray)object1;
                            if(jSONArray1.length() == 1 && jSONArray1.opt(0) instanceof JSONObject && jSONArray0.opt(0) instanceof JSONObject) {
                                a.b(jSONArray1.getJSONObject(0), jSONArray0.getJSONObject(0));
                            }
                            else {
                                for(int v = 0; v < jSONArray0.length(); ++v) {
                                    jSONArray1.put(jSONArray0.get(v));
                                }
                            }
                        }
                    }
                    else {
                        jSONObject0.put(s, jSONObject1.opt(s));
                    }
                }
            }
            catch(JSONException jSONException0) {
            }
            jSONException0.printStackTrace();
        }
    }

    public static boolean b(String s) {
        return b.a(s) > 960;
    }

    public final a b(String s, String s1) {
        Object object0 = this.a.opt("data");
        if(object0 instanceof JSONArray) {
            a.a(((JSONArray)object0).optJSONObject(0), "custom", s, s1);
            return this;
        }
        a.a(this.a, "custom", s, s1);
        return this;
    }

    public final a b(Map map0) {
        if(map0 != null && map0.size() > 0) {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: map0.keySet()) {
                Integer integer0 = (Integer)object0;
                try {
                    jSONObject0.put(String.valueOf(integer0), map0.get(integer0));
                }
                catch(JSONException jSONException0) {
                    com.apm.insight.a.b(jSONException0);
                }
            }
            try {
                this.a.put("sdk_info", jSONObject0);
                return this;
            }
            catch(JSONException jSONException1) {
                jSONException1.printStackTrace();
            }
        }
        return this;
    }

    public final a b(JSONObject jSONObject0) {
        a.a(this.a, jSONObject0);
        return this;
    }

    public final void b() {
        this.a("has_logcat", String.valueOf(this.a()));
    }

    public static boolean c(String s) {
        return b.b(s) > 350;
    }

    public final a c(Map map0) {
        JSONObject jSONObject1;
        if(map0 != null) {
            Object object0 = this.a.opt("data");
            JSONObject jSONObject0 = object0 instanceof JSONArray ? ((JSONArray)object0).optJSONObject(0) : this.a;
            if(jSONObject0 == null) {
                jSONObject1 = new JSONObject();
            }
            else {
                jSONObject1 = jSONObject0.optJSONObject("filters");
                if(jSONObject1 == null) {
                    jSONObject1 = new JSONObject();
                    this.a("filters", jSONObject1);
                }
            }
            for(Object object1: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                try {
                    jSONObject1.put(((String)map$Entry0.getKey()), map$Entry0.getValue());
                }
                catch(JSONException unused_ex) {
                }
            }
            this.a("filters", jSONObject1);
        }
        return this;
    }

    public final JSONObject c() {
        return this.a;
    }

    public final void c(@NonNull JSONObject jSONObject0) {
        a.b(this.a, jSONObject0);
    }

    public final Header d() {
        if(this.b == null) {
            Header header0 = new Header(e.g());
            this.b = header0;
            this.a(header0);
        }
        return this.b;
    }
}

