package com.dcinside.app.util;

import android.graphics.Color;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.w;
import y4.l;

public final class yk {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @l
        public final yk a(int v) {
            return new yk(Color.red(v), Color.green(v), Color.blue(v), Color.alpha(v));
        }
    }

    private int a;
    private int b;
    private int c;
    private int d;
    @l
    public static final a e;

    static {
        yk.e = new a(null);
    }

    public yk(@IntRange(from = 0L, to = 0xFFL) int v, @IntRange(from = 0L, to = 0xFFL) int v1, @IntRange(from = 0L, to = 0xFFL) int v2, @IntRange(from = 0L, to = 0xFFL) int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @l
    public final yk a(@FloatRange(from = 0.0, to = 1.0) float f) {
        return this.b(((int)(255.0f * f)));
    }

    @l
    public final yk b(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.d = Math.max(0, Math.min(0xFF, v));
        return this;
    }

    @l
    public final yk c(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.c = Math.max(0, Math.min(0xFF, v));
        return this;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return Color.argb(this.d, this.a, this.b, this.c);
    }

    public final int g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }

    @l
    public final yk i(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.b = Math.max(0, Math.min(0xFF, v));
        return this;
    }

    @l
    public final yk j(@IntRange(from = 0L, to = 0xFFL) int v) {
        this.a = Math.max(0, Math.min(0xFF, v));
        return this;
    }

    public final void k(int v) {
        this.d = v;
    }

    public final void l(int v) {
        this.c = v;
    }

    public final void m(int v) {
        this.b = v;
    }

    public final void n(int v) {
        this.a = v;
    }
}

