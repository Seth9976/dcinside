package com.iab.omid.library.bytedance2.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus;
import com.iab.omid.library.bytedance2.internal.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[OutputDeviceStatus.values().length];
            a.a = arr_v;
            try {
                arr_v[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class b {
        final float a;
        final float b;

        b(float f, float f1) {
            this.a = f;
            this.b = f1;
        }
    }

    private static WindowManager a;
    private static String[] b;
    static float c;

    static {
        c.b = new String[]{"x", "y", "width", "height"};
        c.c = Resources.getSystem().getDisplayMetrics().density;
    }

    static float a(int v) {
        return ((float)v) / c.c;
    }

    private static b a(JSONObject jSONObject0) {
        if(c.a != null) {
            Point point0 = new Point(0, 0);
            c.a.getDefaultDisplay().getRealSize(point0);
            return new b(c.a(point0.x), c.a(point0.y));
        }
        return new b(0.0f, 0.0f);
    }

    public static JSONObject a(int v, int v1, int v2, int v3) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("x", ((double)c.a(v)));
            jSONObject0.put("y", ((double)c.a(v1)));
            jSONObject0.put("width", ((double)c.a(v2)));
            jSONObject0.put("height", ((double)c.a(v3)));
        }
        catch(JSONException jSONException0) {
            d.a("Error with creating viewStateObject", jSONException0);
        }
        return jSONObject0;
    }

    public static void a(Context context0) {
        if(context0 != null) {
            c.c = context0.getResources().getDisplayMetrics().density;
            c.a = (WindowManager)context0.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject0, OutputDeviceStatus outputDeviceStatus0) {
        boolean z = c.a(outputDeviceStatus0);
        try {
            jSONObject0.put("noOutputDevice", z);
        }
        catch(JSONException jSONException0) {
            d.a("Error with setting output device status", jSONException0);
        }
    }

    public static void a(JSONObject jSONObject0, com.iab.omid.library.bytedance2.walking.a.a a$a0) {
        e e0 = a$a0.a();
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: a$a0.b()) {
            jSONArray0.put(((String)object0));
        }
        try {
            jSONObject0.put("isFriendlyObstructionFor", jSONArray0);
            jSONObject0.put("friendlyObstructionClass", e0.d());
            jSONObject0.put("friendlyObstructionPurpose", e0.b());
            jSONObject0.put("friendlyObstructionReason", e0.a());
        }
        catch(JSONException jSONException0) {
            d.a("Error with setting friendly obstruction", jSONException0);
        }
    }

    public static void a(JSONObject jSONObject0, Boolean boolean0) {
        try {
            jSONObject0.put("hasWindowFocus", boolean0);
        }
        catch(JSONException jSONException0) {
            d.a("Error with setting has window focus", jSONException0);
        }
    }

    public static void a(JSONObject jSONObject0, String s) {
        try {
            jSONObject0.put("adSessionId", s);
        }
        catch(JSONException jSONException0) {
            d.a("Error with setting ad session id", jSONException0);
        }
    }

    public static void a(JSONObject jSONObject0, String s, Object object0) {
        try {
            jSONObject0.put(s, object0);
        }
        catch(NullPointerException | JSONException nullPointerException0) {
            d.a(("JSONException during JSONObject.put for name [" + s + "]"), nullPointerException0);
        }
    }

    public static void a(JSONObject jSONObject0, JSONObject jSONObject1) {
        try {
            JSONArray jSONArray0 = jSONObject0.optJSONArray("childViews");
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
                jSONObject0.put("childViews", jSONArray0);
            }
            jSONArray0.put(jSONObject1);
        }
        catch(JSONException unused_ex) {
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus0) {
        return a.a[outputDeviceStatus0.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray0, JSONArray jSONArray1) {
        return jSONArray0 != null || jSONArray1 != null ? jSONArray0 != null && jSONArray1 != null && jSONArray0.length() == jSONArray1.length() : true;
    }

    public static void b(JSONObject jSONObject0) {
        b c$b0 = c.a(jSONObject0);
        try {
            jSONObject0.put("width", ((double)c$b0.a));
            jSONObject0.put("height", ((double)c$b0.b));
        }
        catch(JSONException unused_ex) {
        }
    }

    public static void b(JSONObject jSONObject0, String s) {
        try {
            jSONObject0.put("notVisibleReason", s);
        }
        catch(JSONException jSONException0) {
            d.a("Error with setting not visible reason", jSONException0);
        }
    }

    private static boolean b(JSONObject jSONObject0, JSONObject jSONObject1) {
        JSONArray jSONArray0 = jSONObject0.optJSONArray("childViews");
        JSONArray jSONArray1 = jSONObject1.optJSONArray("childViews");
        if(jSONArray0 == null && jSONArray1 == null) {
            return true;
        }
        if(!c.a(jSONArray0, jSONArray1)) {
            return false;
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            if(!c.h(jSONArray0.optJSONObject(v), jSONArray1.optJSONObject(v))) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(JSONObject jSONObject0, JSONObject jSONObject1) {
        JSONArray jSONArray0 = jSONObject0.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArray1 = jSONObject1.optJSONArray("isFriendlyObstructionFor");
        if(jSONArray0 == null && jSONArray1 == null) {
            return true;
        }
        if(!c.a(jSONArray0, jSONArray1)) {
            return false;
        }
        for(int v = 0; v < jSONArray0.length(); ++v) {
            if(!jSONArray0.optString(v, "").equals(jSONArray1.optString(v, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject0, JSONObject jSONObject1) {
        return Boolean.valueOf(jSONObject0.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject1.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject0, JSONObject jSONObject1) {
        return Boolean.valueOf(jSONObject0.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject1.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject0, JSONObject jSONObject1) {
        String[] arr_s = c.b;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(jSONObject0.optDouble(s) != jSONObject1.optDouble(s)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject0, JSONObject jSONObject1) {
        return jSONObject0.optString("adSessionId", "").equals(jSONObject1.optString("adSessionId", ""));
    }

    // 去混淆评级： 中等(60)
    public static boolean h(@NonNull JSONObject jSONObject0, @Nullable JSONObject jSONObject1) {
        return jSONObject0 != null || jSONObject1 != null ? jSONObject0 != null && jSONObject1 != null && c.f(jSONObject0, jSONObject1) && c.g(jSONObject0, jSONObject1) && c.e(jSONObject0, jSONObject1) && c.d(jSONObject0, jSONObject1) && c.c(jSONObject0, jSONObject1) && c.b(jSONObject0, jSONObject1) : true;
    }
}

