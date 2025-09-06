package com.tiktok.util;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.tiktok.appevents.u;
import com.tiktok.b;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class g {
    private static final String a = "com.tiktok.util.g";
    private static final f b;

    static {
        g.b = new f(g.class.getName(), b.o());
    }

    public static void a(String s) {
        if(Looper.getMainLooper() == Looper.myLooper()) {
            u.b(s, new IllegalStateException("Current method should be called in a non-main thread"), 2);
        }
    }

    public static JSONObject b(@Nullable Throwable throwable0, @Nullable Long long0, int v) {
        JSONObject jSONObject0 = g.c(long0);
        try {
            if(throwable0 != null) {
                while(throwable0.getCause() != null && throwable0.getCause() != throwable0) {
                    throwable0 = throwable0.getCause();
                }
                jSONObject0.put("ex_class", throwable0.getStackTrace()[0].getClassName());
                jSONObject0.put("ex_method", throwable0.getStackTrace()[0].getMethodName());
                jSONObject0.put("ex_args", throwable0.getStackTrace()[0].getFileName() + " " + throwable0.getStackTrace()[0].getLineNumber());
                jSONObject0.put("ex_msg", throwable0.getMessage());
                jSONObject0.put("ex_type", v);
                String[] arr_s = new String[15];
                for(int v1 = 0; v1 < 15; ++v1) {
                    if(throwable0.getStackTrace()[v1] != null) {
                        arr_s[v1] = throwable0.getStackTrace()[v1].toString();
                    }
                }
                jSONObject0.put("ex_stack", Arrays.toString(arr_s));
                jSONObject0.put("success", false);
                return jSONObject0;
            }
            jSONObject0.put("success", true);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static JSONObject c(@Nullable Long long0) {
        if(long0 == null) {
            long0 = System.currentTimeMillis();
        }
        try {
            return new JSONObject().put("ts", long0);
        }
        catch(Exception unused_ex) {
            return new JSONObject();
        }
    }

    public static JSONObject d(@Nullable Throwable throwable0, @Nullable Long long0, int v) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", "exception");
            jSONObject0.put("name", "exception");
            jSONObject0.put("meta", g.b(throwable0, long0, v));
            jSONObject0.put("extra", null);
        }
        catch(Exception unused_ex) {
        }
        return jSONObject0;
    }

    public static String e(Context context0, boolean z) {
        e e0 = new e(context0);
        String s = e0.a("com.tiktok.sdk.anonymousId");
        if(s == null || z) {
            s = "4666efbe-05d5-44f2-a15a-8e09885add6e";
            e0.b("com.tiktok.sdk.anonymousId", "4666efbe-05d5-44f2-a15a-8e09885add6e");
            g.b.c("AnonymousId reset to 4666efbe-05d5-44f2-a15a-8e09885add6e", new Object[0]);
        }
        return s;
    }

    public static String f(String s, Map map0) {
        if(map0.isEmpty()) {
            return s;
        }
        Uri.Builder uri$Builder0 = Uri.parse(s).buildUpon();
        for(Object object0: map0.entrySet()) {
            uri$Builder0.appendQueryParameter(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue().toString());
        }
        return uri$Builder0.toString();
    }

    public static String g(String s) {
        try {
            return g.h(new JSONObject(s));
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }

    public static String h(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return "null";
        }
        try {
            return jSONObject0.toString(4);
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }
}

