package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

public class g extends a {
    static final class com.github.mikephil.charting.utils.g.a implements Parcelable.Creator {
        public g a(Parcel parcel0) {
            g g0 = new g(0.0f, 0.0f);
            g0.g(parcel0);
            return g0;
        }

        public g[] b(int v) {
            return new g[v];
        }

        @Override  // android.os.Parcelable$Creator
        public Object createFromParcel(Parcel parcel0) {
            return this.a(parcel0);
        }

        @Override  // android.os.Parcelable$Creator
        public Object[] newArray(int v) {
            return this.b(v);
        }
    }

    public float c;
    public float d;
    private static h e;
    public static final Parcelable.Creator f;

    static {
        h h0 = h.a(0x20, new g(0.0f, 0.0f));
        g.e = h0;
        h0.l(0.5f);
        g.f = new com.github.mikephil.charting.utils.g.a();
    }

    public g() {
    }

    public g(float f, float f1) {
        this.c = f;
        this.d = f1;
    }

    @Override  // com.github.mikephil.charting.utils.h$a
    protected a a() {
        return new g(0.0f, 0.0f);
    }

    public static g b() {
        return (g)g.e.b();
    }

    public static g c(float f, float f1) {
        g g0 = (g)g.e.b();
        g0.c = f;
        g0.d = f1;
        return g0;
    }

    public static g d(g g0) {
        g g1 = (g)g.e.b();
        g1.c = g0.c;
        g1.d = g0.d;
        return g1;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.d;
    }

    public void g(Parcel parcel0) {
        this.c = parcel0.readFloat();
        this.d = parcel0.readFloat();
    }

    public static void h(g g0) {
        g.e.g(g0);
    }

    public static void i(List list0) {
        g.e.h(list0);
    }
}

