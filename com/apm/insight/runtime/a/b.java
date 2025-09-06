package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.apm.insight.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    static final class a {
        String a;
        String b;
        long c;

        a(String s, String s1, long v) {
            this.b = s1;
            this.c = v;
            this.a = s;
        }

        @Override
        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.c)) + " : " + this.a + ' ' + this.b;
        }
    }

    private int A;
    private int B;
    private static boolean a = true;
    private static boolean b = false;
    private static boolean c = false;
    private static int d = 1;
    private static boolean e = false;
    private static long f = -1L;
    private Application g;
    private Context h;
    private List i;
    private List j;
    private List k;
    private List l;
    private LinkedList m;
    private String n;
    private long o;
    private String p;
    private long q;
    private String r;
    private long s;
    private String t;
    private long u;
    private String v;
    private long w;
    private boolean x;
    private long y;
    private static volatile b z;

    static {
    }

    private b(@NonNull Application application0) {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new LinkedList();
        this.x = false;
        this.y = -1L;
        this.A = 50;
        this.h = application0;
        this.g = application0;
        if(application0 != null) {
            try {
                com.apm.insight.runtime.a.b.1 b$10 = new Application.ActivityLifecycleCallbacks() {
                    private b a;

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
                        b.this.n = activity0.getClass().getName();
                        b.this.o = System.currentTimeMillis();
                        b.b = bundle0 != null;
                        b.c = true;
                        b.this.i.add(b.this.n);
                        b.this.j.add(b.this.o);
                        b.a(b.this, b.this.n, b.this.o, "onCreate");
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity0) {
                        String s = activity0.getClass().getName();
                        int v = b.this.i.indexOf(s);
                        if(v >= 0 && v < b.this.i.size()) {
                            b.this.i.remove(v);
                            b.this.j.remove(v);
                        }
                        b.this.k.add(s);
                        long v1 = System.currentTimeMillis();
                        b.this.l.add(v1);
                        b.a(b.this, s, v1, "onDestroy");
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity0) {
                        b.this.t = activity0.getClass().getName();
                        b.this.u = System.currentTimeMillis();
                        b.l(b.this);
                        if(b.this.B == 0) {
                            b.this.x = false;
                            b.c = false;
                            b.this.y = SystemClock.uptimeMillis();
                        }
                        else if(b.this.B < 0) {
                            b.n(b.this);
                            b.this.x = false;
                            b.c = false;
                            b.this.y = SystemClock.uptimeMillis();
                        }
                        b.a(b.this, b.this.t, b.this.u, "onPause");
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity0) {
                        b.this.r = activity0.getClass().getName();
                        b.this.s = System.currentTimeMillis();
                        b.g(b.this);
                        if(!b.this.x) {
                            b.k();
                            b.d = 1;
                            b.f = b.this.s;
                            if(!b.this.r.equals(b.this.t)) {
                                return;
                            }
                            b.d = 3;
                            b.f = b.this.s;
                            return;
                        }
                        b.this.x = true;
                        b.a(b.this, b.this.r, b.this.s, "onResume");
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity0) {
                        b.this.p = activity0.getClass().getName();
                        b.this.q = System.currentTimeMillis();
                        b.a(b.this, b.this.p, b.this.q, "onStart");
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity0) {
                        b.this.v = activity0.getClass().getName();
                        b.this.w = System.currentTimeMillis();
                        b.a(b.this, b.this.v, b.this.w, "onStop");
                    }
                };
                this.g.registerActivityLifecycleCallbacks(b$10);
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static JSONObject a(String s, long v) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("name", s);
            jSONObject0.put("time", v);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    public static void a() {
        b.e = true;
    }

    static void a(b b0, String s, long v, String s1) {
        a b$a0;
        try {
            if(b0.m.size() >= b0.A) {
                b$a0 = (a)b0.m.poll();
                if(b$a0 != null) {
                    b0.m.add(b$a0);
                }
            }
            else {
                b$a0 = null;
            }
            if(b$a0 == null) {
                b$a0 = new a(s, s1, v);
                b0.m.add(b$a0);
            }
            b$a0.b = s1;
            b$a0.a = s;
            b$a0.c = v;
        }
        catch(Throwable unused_ex) {
        }
    }

    public static int b() [...] // 潜在的解密器

    public static long c() [...] // 潜在的解密器

    public static b d() {
        if(b.z == null) {
            Class class0 = b.class;
            synchronized(class0) {
                if(b.z == null) {
                    b.z = new b(e.h());
                }
            }
        }
        return b.z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.y;
    }

    public final boolean f() {
        return this.x;
    }

    static int g(b b0) {
        int v = b0.B;
        b0.B = v + 1;
        return v;
    }

    public final JSONObject g() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("last_create_activity", b.a(this.n, this.o));
            jSONObject0.put("last_start_activity", b.a(this.p, this.q));
            jSONObject0.put("last_resume_activity", b.a(this.r, this.s));
            jSONObject0.put("last_pause_activity", b.a(this.t, this.u));
            jSONObject0.put("last_stop_activity", b.a(this.v, this.w));
            jSONObject0.put("alive_activities", this.n());
            jSONObject0.put("finish_activities", this.o());
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.r);
    }

    public final JSONArray i() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: new ArrayList(this.m)) {
            jSONArray0.put(((a)object0).toString());
        }
        return jSONArray0;
    }

    static boolean j() [...] // 潜在的解密器

    static boolean k() {
        b.a = false;
        return false;
    }

    static int l(b b0) {
        int v = b0.B;
        b0.B = v - 1;
        return v;
    }

    static boolean l() [...] // 潜在的解密器

    static boolean m() [...] // 潜在的解密器

    static int n(b b0) {
        b0.B = 0;
        return 0;
    }

    private JSONArray n() {
        JSONArray jSONArray0 = new JSONArray();
        if(this.i != null && !this.i.isEmpty()) {
            int v = 0;
            while(v < this.i.size()) {
                try {
                    jSONArray0.put(b.a(((String)this.i.get(v)), ((long)(((Long)this.j.get(v))))));
                    ++v;
                    continue;
                }
                catch(Throwable unused_ex) {
                }
                break;
            }
        }
        return jSONArray0;
    }

    private JSONArray o() {
        JSONArray jSONArray0 = new JSONArray();
        if(this.k != null && !this.k.isEmpty()) {
            int v = 0;
            while(v < this.k.size()) {
                try {
                    jSONArray0.put(b.a(((String)this.k.get(v)), ((long)(((Long)this.l.get(v))))));
                    ++v;
                    continue;
                }
                catch(Throwable unused_ex) {
                }
                break;
            }
        }
        return jSONArray0;
    }
}

