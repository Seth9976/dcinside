package com.google.firebase.crashlytics.internal.settings;

public class d {
    public static class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z1, boolean z2) {
            this.a = z;
            this.b = z1;
            this.c = z2;
        }
    }

    public static class b {
        public final int a;
        public final int b;

        public b(int v, int v1) {
            this.a = v;
            this.b = v1;
        }
    }

    public final b a;
    public final a b;
    public final long c;
    public final int d;
    public final int e;
    public final double f;
    public final double g;
    public final int h;

    public d(long v, b d$b0, a d$a0, int v1, int v2, double f, double f1, int v3) {
        this.c = v;
        this.a = d$b0;
        this.b = d$a0;
        this.d = v1;
        this.e = v2;
        this.f = f;
        this.g = f1;
        this.h = v3;
    }

    public boolean a(long v) {
        return this.c < v;
    }
}

