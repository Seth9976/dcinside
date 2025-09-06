package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.os.BuildCompat;
import com.google.android.material.R.attr;
import com.google.android.material.color.utilities.G2;
import com.google.android.material.color.utilities.l;
import j..util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class p {
    class a implements c {
        a() {
            super();
        }

        @Override  // com.google.android.material.color.p$c
        public boolean isSupported() {
            return true;
        }
    }

    class b implements c {
        private Long a;

        b() {
            super();
        }

        @Override  // com.google.android.material.color.p$c
        public boolean isSupported() {
            if(this.a == null) {
                try {
                    Method method0 = Build.class.getDeclaredMethod("getLong", String.class);
                    method0.setAccessible(true);
                    Long long0 = (Long)method0.invoke(null, "ro.build.version.oneui");
                    long0.longValue();
                    this.a = long0;
                    return ((long)this.a) >= 40100L;
                }
                catch(Exception unused_ex) {
                    this.a = -1L;
                }
            }
            return ((long)this.a) >= 40100L;
        }
    }

    interface c {
        boolean isSupported();
    }

    static class d implements Application.ActivityLifecycleCallbacks {
        private final q a;

        d(@NonNull q q0) {
            this.a = q0;
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity0, @Nullable Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity0, @Nullable Bundle bundle0) {
            p.j(activity0, this.a);
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity0, @NonNull Bundle bundle0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity0) {
        }

        @Override  // android.app.Application$ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity0) {
        }
    }

    public interface e {
        void a(@NonNull Activity arg1);
    }

    public interface f {
        boolean a(@NonNull Activity arg1, @StyleRes int arg2);
    }

    private static final int[] a;
    private static final c b;
    @SuppressLint({"PrivateApi"})
    private static final c c;
    private static final Map d;
    private static final Map e;
    private static final int f;
    private static final String g;

    static {
        p.a = new int[]{attr.dynamicColorThemeOverlay};
        a p$a0 = new a();
        p.b = p$a0;
        b p$b0 = new b();
        p.c = p$b0;
        HashMap hashMap0 = new HashMap();
        hashMap0.put("fcnt", p$a0);
        hashMap0.put("google", p$a0);
        hashMap0.put("hmd global", p$a0);
        hashMap0.put("infinix", p$a0);
        hashMap0.put("infinix mobility limited", p$a0);
        hashMap0.put("itel", p$a0);
        hashMap0.put("kyocera", p$a0);
        hashMap0.put("lenovo", p$a0);
        hashMap0.put("lge", p$a0);
        hashMap0.put("meizu", p$a0);
        hashMap0.put("motorola", p$a0);
        hashMap0.put("nothing", p$a0);
        hashMap0.put("oneplus", p$a0);
        hashMap0.put("oppo", p$a0);
        hashMap0.put("realme", p$a0);
        hashMap0.put("robolectric", p$a0);
        hashMap0.put("samsung", p$b0);
        hashMap0.put("sharp", p$a0);
        hashMap0.put("shift", p$a0);
        hashMap0.put("sony", p$a0);
        hashMap0.put("tcl", p$a0);
        hashMap0.put("tecno", p$a0);
        hashMap0.put("tecno mobile limited", p$a0);
        hashMap0.put("vivo", p$a0);
        hashMap0.put("wingtech", p$a0);
        hashMap0.put("xiaomi", p$a0);
        p.d = DesugarCollections.unmodifiableMap(hashMap0);
        HashMap hashMap1 = new HashMap();
        hashMap1.put("asus", p$a0);
        hashMap1.put("jio", p$a0);
        p.e = DesugarCollections.unmodifiableMap(hashMap1);
        p.g = "p";
    }

    @Deprecated
    public static void a(@NonNull Activity activity0) {
        p.i(activity0);
    }

    @Deprecated
    public static void b(@NonNull Activity activity0, @StyleRes int v) {
        p.j(activity0, new com.google.android.material.color.q.c().k(v).f());
    }

    @Deprecated
    public static void c(@NonNull Activity activity0, @NonNull f p$f0) {
        p.j(activity0, new com.google.android.material.color.q.c().j(p$f0).f());
    }

    public static void d(@NonNull Application application0) {
        p.h(application0, new com.google.android.material.color.q.c().f());
    }

    @Deprecated
    public static void e(@NonNull Application application0, @StyleRes int v) {
        p.h(application0, new com.google.android.material.color.q.c().k(v).f());
    }

    @Deprecated
    public static void f(@NonNull Application application0, @StyleRes int v, @NonNull f p$f0) {
        p.h(application0, new com.google.android.material.color.q.c().k(v).j(p$f0).f());
    }

    @Deprecated
    public static void g(@NonNull Application application0, @NonNull f p$f0) {
        p.h(application0, new com.google.android.material.color.q.c().j(p$f0).f());
    }

    public static void h(@NonNull Application application0, @NonNull q q0) {
        application0.registerActivityLifecycleCallbacks(new d(q0));
    }

    public static void i(@NonNull Activity activity0) {
        p.j(activity0, new com.google.android.material.color.q.c().f());
    }

    public static void j(@NonNull Activity activity0, @NonNull q q0) {
        int v;
        if(!p.m()) {
            return;
        }
        if(q0.d() != null) {
            v = 0;
        }
        else if(q0.g() == 0) {
            v = p.k(activity0, p.a);
        }
        else {
            v = q0.g();
        }
        if(q0.f().a(activity0, v)) {
            if(q0.d() == null) {
                z.a(activity0, v);
            }
            else {
                G2 g20 = new G2(l.b(((int)q0.d())), !v.r(activity0), ((double)p.l(activity0)));
                m m0 = com.google.android.material.color.l.a();
                if(m0 == null) {
                    return;
                }
                if(!m0.b(activity0, u.a(g20))) {
                    return;
                }
            }
            q0.e().a(activity0);
        }
    }

    private static int k(@NonNull Context context0, int[] arr_v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(arr_v);
        int v = typedArray0.getResourceId(0, 0);
        typedArray0.recycle();
        return v;
    }

    private static float l(Context context0) {
        UiModeManager uiModeManager0 = (UiModeManager)context0.getSystemService("uimode");
        return uiModeManager0 == null || Build.VERSION.SDK_INT < 34 ? 0.0f : uiModeManager0.getContrast();
    }

    @SuppressLint({"DefaultLocale"})
    @ChecksSdkIntAtLeast(api = 0x1F)
    public static boolean m() {
        if(Build.VERSION.SDK_INT < 0x1F) {
            return false;
        }
        if(BuildCompat.m()) {
            return true;
        }
        Locale locale0 = Locale.ROOT;
        c p$c0 = (c)p.d.get(Build.MANUFACTURER.toLowerCase(locale0));
        if(p$c0 == null) {
            p$c0 = (c)p.e.get(Build.BRAND.toLowerCase(locale0));
        }
        return p$c0 != null && p$c0.isSupported();
    }

    @NonNull
    public static Context n(@NonNull Context context0) {
        return p.o(context0, 0);
    }

    @NonNull
    public static Context o(@NonNull Context context0, @StyleRes int v) {
        return p.p(context0, new com.google.android.material.color.q.c().k(v).f());
    }

    @NonNull
    public static Context p(@NonNull Context context0, @NonNull q q0) {
        if(!p.m()) {
            return context0;
        }
        int v = q0.g();
        if(v == 0) {
            v = p.k(context0, p.a);
        }
        if(v == 0) {
            return context0;
        }
        if(q0.d() != null) {
            G2 g20 = new G2(l.b(((int)q0.d())), !v.r(context0), ((double)p.l(context0)));
            m m0 = com.google.android.material.color.l.a();
            if(m0 != null) {
                return m0.a(context0, u.a(g20));
            }
        }
        return new ContextThemeWrapper(context0, v);
    }
}

