package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build.VERSION;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class w {
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static boolean g = false;
    private static InputManager h;

    static {
    }

    public static void a(MotionEvent motionEvent0, Context context0) {
        static final class a implements Runnable {
            final Context a;
            final int b;

            a(Context context0, int v) {
                this.a = context0;
                this.b = v;
                super();
            }

            @Override
            public void run() {
                InputManager inputManager0 = w.b(this.a);
                if(inputManager0 == null) {
                    return;
                }
                InputDevice inputDevice0 = inputManager0.getInputDevice(this.b);
                w.h();
                if(inputDevice0 == null) {
                    w.b();
                    w.c();
                    w.c("nihc");
                    return;
                }
                if(inputDevice0.isVirtual()) {
                    w.d();
                    w.e();
                    w.c("vihc");
                    return;
                }
                if(Build.VERSION.SDK_INT >= 29 && inputDevice0.isExternal()) {
                    w.f();
                    w.g();
                    w.c("eihc");
                }
            }
        }

        if(motionEvent0 == null || context0 == null || motionEvent0.getRawX() <= 0.0f && motionEvent0.getRawY() <= 0.0f) {
            return;
        }
        p0.b(new a(context0, motionEvent0.getDeviceId()));
    }

    public static void a(JSONObject jSONObject0) {
        w.h();
        try {
            jSONObject0.put("vihc", w.d);
            jSONObject0.put("eihc", w.e);
            jSONObject0.put("nihc", w.f);
            jSONObject0.put("vic", w.a);
            jSONObject0.put("nic", w.c);
            jSONObject0.put("eic", w.b);
        }
        catch(JSONException unused_ex) {
        }
    }

    static int b() {
        int v = w.c;
        w.c = v + 1;
        return v;
    }

    public static int b(String s) {
        w.h();
        s.hashCode();
        switch(s) {
            case "eic": {
                return w.b;
            }
            case "eihc": {
                return w.e;
            }
            case "nic": {
                return w.c;
            }
            case "nihc": {
                return w.f;
            }
            case "vic": {
                return w.a;
            }
            case "vihc": {
                return w.d;
            }
            default: {
                return -1;
            }
        }
    }

    private static InputManager b(Context context0) {
        if(w.h == null) {
            w.h = (InputManager)context0.getSystemService("input");
        }
        return w.h;
    }

    static int c() {
        int v = w.f;
        w.f = v + 1;
        return v;
    }

    private static void c(String s) {
        try {
            SharedPreferences sharedPreferences0 = v0.a(x.b());
            if(sharedPreferences0 != null) {
                int v = sharedPreferences0.getInt(s, 0);
                sharedPreferences0.edit().putInt(s, v + 1).apply();
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    static int d() {
        int v = w.a;
        w.a = v + 1;
        return v;
    }

    static int e() {
        int v = w.d;
        w.d = v + 1;
        return v;
    }

    static int f() {
        int v = w.b;
        w.b = v + 1;
        return v;
    }

    static int g() {
        int v = w.e;
        w.e = v + 1;
        return v;
    }

    private static void h() {
        if(w.g) {
            return;
        }
        try {
            SharedPreferences sharedPreferences0 = v0.a(x.b());
            if(sharedPreferences0 != null) {
                w.f = sharedPreferences0.getInt("nihc", 0);
                w.e = sharedPreferences0.getInt("eihc", 0);
                w.d = sharedPreferences0.getInt("vihc", 0);
                w.g = true;
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

