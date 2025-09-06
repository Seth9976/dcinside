package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public class x {
    private static Context a;

    public static long a(Context context0) {
        try {
            return (long)(((Long)a.meta(0x9A, context0, null)));
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }

    @DungeonFlag
    private static String a(Throwable throwable0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("status", 3);
            jSONObject0.put("exception", throwable0.toString());
            jSONObject0.put("stacktrace", Arrays.toString(throwable0.getStackTrace()));
            jSONObject0.put("cause", String.valueOf(throwable0.getCause()));
            return Base64.encodeToString(jSONObject0.toString().getBytes("UTF-8"), 0);
        }
        catch(Throwable unused_ex) {
            return "eyJzdGF0dXMiOjN9";
        }
    }

    @DungeonFlag
    public static void a() {
        static final class com.pgl.ssdk.x.a implements Runnable {
            @Override
            public void run() {
                y.c(x.b());
                a.meta(0xE2, x.b(), null);
            }
        }

        p0.b(new com.pgl.ssdk.x.a());
    }

    public static Context b() {
        return x.a;
    }

    @DungeonFlag
    public static String b(Context context0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("status", 0);
            jSONObject0.put("envcode", ((long)(((Long)a.meta(0x9A, context0, null)))));
            jSONObject0.put("bootcount", u.a(context0));
            jSONObject0.put("usb_debug", u.d(context0));
            JSONArray[] arr_jSONArray = u.c(context0);
            if(arr_jSONArray != null) {
                jSONObject0.put("sdata", arr_jSONArray[0]);
                jSONObject0.put("sdmta", arr_jSONArray[1]);
                jSONObject0.put("curtime", System.currentTimeMillis() / 1000L);
            }
            jSONObject0.put("camera_count", v.a());
            jSONObject0.put("sim", v.c(context0));
            jSONObject0.put("virtual_display", y.b(context0));
            jSONObject0.put("acbs", s.b(context0));
            jSONObject0.put("bl_unlock", u.b(context0));
            w.a(jSONObject0);
            String s = t.e();
            jSONObject0.put("romtype", u.c());
            jSONObject0.put("root", u.e());
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("sign", s);
            }
            return (String)a.meta(0xE3, context0, jSONObject0.toString());
        }
        catch(Throwable throwable0) {
            return x.a(throwable0);
        }
    }

    public static String c() {
        String s = x.b(x.b());
        x.a();
        return s;
    }

    public static void c(Context context0) {
        x.a = context0;
    }
}

