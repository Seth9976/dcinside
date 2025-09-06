package com.pgl.ssdk;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.text.TextUtils;
import com.pgl.ssdk.ces.a;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;

public class u {
    private static String a;
    private static long[][] b;
    private static String c;

    static {
    }

    static String a() [...] // 潜在的解密器

    public static String a(Context context0) {
        String s = u.a;
        if(s != null) {
            return s;
        }
        if(Build.VERSION.SDK_INT >= 24) {
            u.a = Settings.Global.getString(context0.getContentResolver(), "boot_count");
            return u.a;
        }
        u.a = "lowapi";
        return "lowapi";
    }

    static String a(String s) {
        u.c = s;
        return s;
    }

    // 去混淆评级： 低(20)
    static String b() [...] // 潜在的解密器

    public static boolean b(Context context0) {
        Object object0 = a.meta(0x9C, context0, null);
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : false;
    }

    private static boolean b(String s) {
        try {
            Class.forName(s);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static String c() {
        static final class com.pgl.ssdk.u.a implements Runnable {
            // 去混淆评级： 低(22)
            @Override
            public void run() {
                if(TextUtils.isEmpty("other")) {
                    new String("other");
                    v0.b(x.b(), "romtype", "other");
                }
            }
        }

        if(!TextUtils.isEmpty(u.c)) {
            return u.c;
        }
        String s = v0.a(x.b(), "romtype", null);
        u.c = s;
        if(!TextUtils.isEmpty(s)) {
            return u.c;
        }
        p0.b(new com.pgl.ssdk.u.a());
        return "";
    }

    private static boolean c(String s) {
        try {
            return new File(s).exists();
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static JSONArray[] c(Context context0) {
        if(u.b == null) {
            u.b = (long[][])a.meta(0x9D, context0, null);
        }
        if(u.b != null && u.b.length == 2) {
            long v = System.currentTimeMillis();
            long[][] arr2_v = u.b;
            long[] arr_v = arr2_v[0];
            long[] arr_v1 = arr2_v[1];
            JSONArray jSONArray0 = new JSONArray();
            JSONArray jSONArray1 = new JSONArray();
            try {
                for(int v1 = 0; v1 < arr_v.length; ++v1) {
                    jSONArray0.put(v1, v / 1000L - arr_v[v1]);
                    jSONArray1.put(v1, v / 1000L - arr_v1[v1]);
                }
                return new JSONArray[]{jSONArray0, jSONArray1};
            }
            catch(JSONException unused_ex) {
                return new JSONArray[]{jSONArray0, jSONArray1};
            }
        }
        u.b = null;
        return null;
    }

    // 去混淆评级： 高(410)
    private static String d() [...] // 潜在的解密器

    public static boolean d(Context context0) {
        Object object0 = a.meta(0x9B, context0, null);
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : false;
    }

    public static int e() {
        return (int)(((Integer)a.meta(0xA2, null, null)));
    }
}

