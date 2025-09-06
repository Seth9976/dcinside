package com.hjq.toast;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y2.d;

public class r implements d {
    static class a {
    }

    class b implements Runnable {
        final r a;

        private b() {
        }

        b(a r$a0) {
        }

        @Override
        public void run() {
            y2.b b0 = r.this.b == null ? null : ((y2.b)r.this.b.get());
            if(b0 == null) {
                return;
            }
            b0.cancel();
        }
    }

    class c implements Runnable {
        private final o a;
        final r b;

        private c(o o0) {
            this.a = o0;
        }

        c(o o0, a r$a0) {
            this(o0);
        }

        @Override
        public void run() {
            y2.b b0 = r.this.b == null ? null : ((y2.b)r.this.b.get());
            if(b0 != null) {
                b0.cancel();
            }
            y2.b b1 = r.this.c(this.a);
            WeakReference weakReference0 = new WeakReference(b1);
            r.this.b = weakReference0;
            b1.setDuration(this.a.b);
            b1.setText(this.a.a);
            b1.show();
        }
    }

    private Application a;
    private WeakReference b;
    private final int c;
    private final Object d;
    private final Object e;
    private volatile long f;
    public static final int g = 0;
    public static final int h = 1;
    private static final Handler i = null;
    private static final int j = 200;

    static {
        r.i = new Handler(Looper.getMainLooper());
    }

    public r() {
        this(0);
    }

    public r(int v) {
        this.d = new Object();
        this.e = new Object();
        this.c = v;
        if(v != 0 && v != 1) {
            throw new IllegalArgumentException("Please don\'t pass non-existent toast show strategy");
        }
    }

    @Override  // y2.d
    public void a(o o0) {
        int v = 200;
        switch(this.c) {
            case 0: {
                Handler handler0 = r.i;
                handler0.removeCallbacksAndMessages(this.d);
                long v1 = SystemClock.uptimeMillis() + o0.c;
                if(o0.d) {
                    v = 0;
                }
                handler0.postAtTime(new c(this, o0, null), this.d, v1 + ((long)v));
                return;
            }
            case 1: {
                long v2 = SystemClock.uptimeMillis() + o0.c;
                if(o0.d) {
                    v = 0;
                }
                long v3 = v2 + ((long)v);
                long v4 = (long)this.i(o0);
                if(v3 < this.f + v4) {
                    v3 = this.f + v4;
                }
                c r$c0 = new c(this, o0, null);
                r.i.postAtTime(r$c0, this.d, v3);
                this.f = v3;
            }
        }
    }

    @Override  // y2.d
    public void b(Application application0) {
        this.a = application0;
    }

    @Override  // y2.d
    public y2.b c(o o0) {
        y2.b b0;
        Activity activity0 = this.j();
        int v = Build.VERSION.SDK_INT;
        if(v >= 23 && Settings.canDrawOverlays(this.a)) {
            b0 = new com.hjq.toast.d(this.a);
        }
        else if(!o0.d && this.k(activity0)) {
            b0 = new com.hjq.toast.b(activity0);
        }
        else if(v == 25) {
            b0 = new i(this.a);
        }
        else if(v >= 29 || this.g(this.a)) {
            b0 = new j(this.a);
        }
        else {
            b0 = new f(this.a);
        }
        if(this.m(b0) || !this.n()) {
            this.h(b0, o0.e);
        }
        return b0;
    }

    @Override  // y2.d
    public void d() {
        r.i.removeCallbacksAndMessages(this.e);
        long v = SystemClock.uptimeMillis();
        b r$b0 = new b(this, null);
        r.i.postAtTime(r$b0, this.e, v);
    }

    @SuppressLint({"PrivateApi"})
    protected boolean g(Context context0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager)context0.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        AppOpsManager appOpsManager0 = (AppOpsManager)context0.getSystemService("appops");
        try {
            Method method0 = appOpsManager0.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            Integer integer0 = (Integer)appOpsManager0.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            integer0.intValue();
            return ((int)(((Integer)method0.invoke(appOpsManager0, integer0, context0.getApplicationInfo().uid, "com.dcinside.app.android")))) == 0;
        }
        catch(NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException noSuchMethodException0) {
            noSuchMethodException0.printStackTrace();
            return true;
        }
    }

    protected void h(y2.b b0, y2.f f0) {
        b0.setView(f0.a(this.a));
        b0.setGravity(f0.getGravity(), f0.getXOffset(), f0.getYOffset());
        b0.setMargin(f0.getHorizontalMargin(), f0.getVerticalMargin());
    }

    protected int i(o o0) {
        int v = o0.b;
        if(v == 0) {
            return 1000;
        }
        return v == 1 ? 1500 : 0;
    }

    protected Activity j() {
        return com.hjq.toast.a.b().a();
    }

    protected boolean k(Activity activity0) {
        if(activity0 == null) {
            return false;
        }
        return activity0.isFinishing() ? false : !activity0.isDestroyed();
    }

    @SuppressLint({"PrivateApi"})
    protected boolean l(long v) {
        if(Build.VERSION.SDK_INT < 30) {
            return true;
        }
        try {
            Method method0 = Class.forName("android.app.compat.CompatChanges").getMethod("isChangeEnabled", Long.TYPE);
            method0.setAccessible(true);
            return Boolean.parseBoolean(String.valueOf(method0.invoke(null, v)));
        }
        catch(ClassNotFoundException | InvocationTargetException | NoSuchMethodException | IllegalAccessException classNotFoundException0) {
            classNotFoundException0.printStackTrace();
            return false;
        }
    }

    protected boolean m(y2.b b0) {
        return b0 instanceof com.hjq.toast.c || Build.VERSION.SDK_INT < 30;
    }

    protected boolean n() {
        return this.l(0x8CF3B87L);
    }
}

