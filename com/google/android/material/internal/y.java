package com.google.android.material.internal;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;

@RestrictTo({Scope.b})
final class y {
    static class a extends Exception {
        a(Throwable throwable0) {
            super("Error thrown initializing StaticLayout " + throwable0.getMessage(), throwable0);
        }
    }

    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int d;
    private int e;
    private Layout.Alignment f;
    private int g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    @Nullable
    private TextUtils.TruncateAt m;
    @Nullable
    private z n;
    static final int o = 0;
    static final float p = 0.0f;
    static final float q = 1.0f;
    private static final String r = "android.text.TextDirectionHeuristic";
    private static final String s = "android.text.TextDirectionHeuristics";
    private static final String t = "LTR";
    private static final String u = "RTL";
    private static boolean v;
    @Nullable
    private static Constructor w;
    @Nullable
    private static Object x;

    static {
        y.o = Build.VERSION.SDK_INT < 23 ? 0 : 1;
    }

    private y(CharSequence charSequence0, TextPaint textPaint0, int v) {
        this.a = charSequence0;
        this.b = textPaint0;
        this.c = v;
        this.d = 0;
        this.e = charSequence0.length();
        this.f = Layout.Alignment.ALIGN_NORMAL;
        this.g = 0x7FFFFFFF;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = y.o;
        this.k = true;
        this.m = null;
    }

    public StaticLayout a() throws a {
        if(this.a == null) {
            this.a = "";
        }
        int v = Math.max(0, this.c);
        CharSequence charSequence0 = this.g == 1 ? TextUtils.ellipsize(this.a, this.b, ((float)v), this.m) : this.a;
        int v1 = Math.min(charSequence0.length(), this.e);
        this.e = v1;
        if(Build.VERSION.SDK_INT >= 23) {
            if(this.l && this.g == 1) {
                this.f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder staticLayout$Builder0 = StaticLayout.Builder.obtain(charSequence0, this.d, v1, this.b, v);
            staticLayout$Builder0.setAlignment(this.f);
            staticLayout$Builder0.setIncludePad(this.k);
            staticLayout$Builder0.setTextDirection((this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR));
            TextUtils.TruncateAt textUtils$TruncateAt0 = this.m;
            if(textUtils$TruncateAt0 != null) {
                staticLayout$Builder0.setEllipsize(textUtils$TruncateAt0);
            }
            staticLayout$Builder0.setMaxLines(this.g);
            float f = this.h;
            if(f != 0.0f || this.i != 1.0f) {
                staticLayout$Builder0.setLineSpacing(f, this.i);
            }
            if(this.g > 1) {
                staticLayout$Builder0.setHyphenationFrequency(this.j);
            }
            z z0 = this.n;
            if(z0 != null) {
                z0.a(staticLayout$Builder0);
            }
            return staticLayout$Builder0.build();
        }
        this.b();
        try {
            Constructor constructor0 = (Constructor)Preconditions.l(y.w);
            Integer integer0 = this.d;
            Integer integer1 = this.e;
            Layout.Alignment layout$Alignment0 = this.f;
            Object object0 = Preconditions.l(y.x);
            return (StaticLayout)constructor0.newInstance(charSequence0, integer0, integer1, this.b, v, layout$Alignment0, object0, 1.0f, 0.0f, Boolean.valueOf(this.k), null, v, this.g);
        }
        catch(Exception exception0) {
            throw new a(exception0);
        }
    }

    private void b() throws a {
        if(y.v) {
            return;
        }
        try {
            y.x = !this.l || Build.VERSION.SDK_INT < 23 ? TextDirectionHeuristics.LTR : TextDirectionHeuristics.RTL;
            Constructor constructor0 = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            y.w = constructor0;
            constructor0.setAccessible(true);
            y.v = true;
            return;
        }
        catch(Exception exception0) {
        }
        throw new a(exception0);
    }

    @NonNull
    public static y c(@NonNull CharSequence charSequence0, @NonNull TextPaint textPaint0, @IntRange(from = 0L) int v) {
        return new y(charSequence0, textPaint0, v);
    }

    @O1.a
    @NonNull
    public y d(@NonNull Layout.Alignment layout$Alignment0) {
        this.f = layout$Alignment0;
        return this;
    }

    @O1.a
    @NonNull
    public y e(@Nullable TextUtils.TruncateAt textUtils$TruncateAt0) {
        this.m = textUtils$TruncateAt0;
        return this;
    }

    @O1.a
    @NonNull
    public y f(@IntRange(from = 0L) int v) {
        this.e = v;
        return this;
    }

    @O1.a
    @NonNull
    public y g(int v) {
        this.j = v;
        return this;
    }

    @O1.a
    @NonNull
    public y h(boolean z) {
        this.k = z;
        return this;
    }

    public y i(boolean z) {
        this.l = z;
        return this;
    }

    @O1.a
    @NonNull
    public y j(float f, float f1) {
        this.h = f;
        this.i = f1;
        return this;
    }

    @O1.a
    @NonNull
    public y k(@IntRange(from = 0L) int v) {
        this.g = v;
        return this;
    }

    @O1.a
    @NonNull
    public y l(@IntRange(from = 0L) int v) {
        this.d = v;
        return this;
    }

    @O1.a
    @NonNull
    public y m(@Nullable z z0) {
        this.n = z0;
        return this;
    }
}

