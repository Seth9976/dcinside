package com.bumptech.glide.load.engine.cache;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.m;

public final class l {
    public static final class a {
        final Context a;
        ActivityManager b;
        c c;
        float d;
        float e;
        float f;
        float g;
        int h;
        @VisibleForTesting
        static final int i = 2;
        static final int j = 0;
        static final float k = 0.4f;
        static final float l = 0.33f;
        static final int m = 0x400000;

        static {
            a.j = Build.VERSION.SDK_INT >= 26 ? 1 : 4;
        }

        public a(Context context0) {
            this.d = 2.0f;
            this.e = (float)a.j;
            this.f = 0.4f;
            this.g = 0.33f;
            this.h = 0x400000;
            this.a = context0;
            this.b = (ActivityManager)context0.getSystemService("activity");
            this.c = new b(context0.getResources().getDisplayMetrics());
            if(Build.VERSION.SDK_INT >= 26 && l.e(this.b)) {
                this.e = 0.0f;
            }
        }

        public l a() {
            return new l(this);
        }

        @VisibleForTesting
        a b(ActivityManager activityManager0) {
            this.b = activityManager0;
            return this;
        }

        public a c(int v) {
            this.h = v;
            return this;
        }

        public a d(float f) {
            m.b(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.e = f;
            return this;
        }

        public a e(float f) {
            m.b(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.g = f;
            return this;
        }

        public a f(float f) {
            m.b(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f = f;
            return this;
        }

        public a g(float f) {
            m.b(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.d = f;
            return this;
        }

        @VisibleForTesting
        a h(c l$c0) {
            this.c = l$c0;
            return this;
        }
    }

    static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics0) {
            this.a = displayMetrics0;
        }

        @Override  // com.bumptech.glide.load.engine.cache.l$c
        public int a() {
            return this.a.heightPixels;
        }

        @Override  // com.bumptech.glide.load.engine.cache.l$c
        public int b() {
            return this.a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    private final int a;
    private final int b;
    private final Context c;
    private final int d;
    private static final String e = "MemorySizeCalculator";
    @VisibleForTesting
    static final int f = 4;
    private static final int g = 2;

    l(a l$a0) {
        this.c = l$a0.a;
        int v = l.e(l$a0.b) ? l$a0.h / 2 : l$a0.h;
        this.d = v;
        int v1 = l.c(l$a0.b, l$a0.f, l$a0.g);
        float f = (float)(l$a0.c.b() * l$a0.c.a() * 4);
        int v2 = Math.round(l$a0.e * f);
        int v3 = Math.round(f * l$a0.d);
        int v4 = v1 - v;
        int v5 = v3 + v2;
        if(v5 <= v4) {
            this.b = v3;
            this.a = v2;
        }
        else {
            float f1 = l$a0.d;
            float f2 = ((float)v4) / (l$a0.e + f1);
            this.b = Math.round(f1 * f2);
            this.a = Math.round(f2 * l$a0.e);
        }
        if(Log.isLoggable("MemorySizeCalculator", 3)) {
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + this.f(this.b) + ", pool size: " + this.f(this.a) + ", byte array size: " + this.f(v) + ", memory class limited? " + (v5 > v1) + ", max size: " + this.f(v1) + ", memoryClass: " + l$a0.b.getMemoryClass() + ", isLowMemoryDevice: " + l.e(l$a0.b));
        }
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    private static int c(ActivityManager activityManager0, float f, float f1) {
        int v = activityManager0.getMemoryClass();
        if(l.e(activityManager0)) {
            f = f1;
        }
        return Math.round(((float)(v * 0x100000)) * f);
    }

    public int d() {
        return this.b;
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager0) {
        return activityManager0.isLowRamDevice();
    }

    private String f(int v) {
        return Formatter.formatFileSize(this.c, ((long)v));
    }
}

