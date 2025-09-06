package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.k;
import com.github.mikephil.charting.utils.l;
import java.util.ArrayList;
import java.util.List;

public class e extends b {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.github.mikephil.charting.components.e.e.values().length];
            a.a = arr_v;
            try {
                arr_v[com.github.mikephil.charting.components.e.e.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.github.mikephil.charting.components.e.e.a.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum com.github.mikephil.charting.components.e.b {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT;

    }

    public static enum c {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE;

    }

    public static enum d {
        LEFT,
        CENTER,
        RIGHT;

    }

    public static enum com.github.mikephil.charting.components.e.e {
        HORIZONTAL,
        VERTICAL;

    }

    public static enum f {
        TOP,
        CENTER,
        BOTTOM;

    }

    public float A;
    private boolean B;
    private List C;
    private List D;
    private List E;
    private com.github.mikephil.charting.components.f[] g;
    private com.github.mikephil.charting.components.f[] h;
    private boolean i;
    private d j;
    private f k;
    private com.github.mikephil.charting.components.e.e l;
    private boolean m;
    private com.github.mikephil.charting.components.e.b n;
    private c o;
    private float p;
    private float q;
    private DashPathEffect r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    public float x;
    public float y;
    public float z;

    public e() {
        this.g = new com.github.mikephil.charting.components.f[0];
        this.i = false;
        this.j = d.a;
        this.k = f.c;
        this.l = com.github.mikephil.charting.components.e.e.a;
        this.m = false;
        this.n = com.github.mikephil.charting.components.e.b.a;
        this.o = c.d;
        this.p = 8.0f;
        this.q = 3.0f;
        this.r = null;
        this.s = 6.0f;
        this.t = 0.0f;
        this.u = 5.0f;
        this.v = 3.0f;
        this.w = 0.95f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = false;
        this.C = new ArrayList(16);
        this.D = new ArrayList(16);
        this.E = new ArrayList(16);
        this.e = k.e(10.0f);
        this.b = k.e(5.0f);
        this.c = k.e(3.0f);
    }

    public e(com.github.mikephil.charting.components.f[] arr_f) {
        if(arr_f == null) {
            throw new IllegalArgumentException("entries array is NULL");
        }
        this.g = arr_f;
    }

    public float A(Paint paint0) {
        com.github.mikephil.charting.components.f[] arr_f = this.g;
        float f = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            String s = arr_f[v].a;
            if(s != null) {
                float f1 = (float)k.a(paint0, s);
                if(f1 > f) {
                    f = f1;
                }
            }
        }
        return f;
    }

    public float B(Paint paint0) {
        float f = k.e(this.u);
        com.github.mikephil.charting.components.f[] arr_f = this.g;
        float f1 = 0.0f;
        float f2 = 0.0f;
        for(int v = 0; v < arr_f.length; ++v) {
            com.github.mikephil.charting.components.f f3 = arr_f[v];
            float f4 = k.e((Float.isNaN(f3.c) ? this.p : f3.c));
            if(f4 > f2) {
                f2 = f4;
            }
            String s = f3.a;
            if(s != null) {
                float f5 = (float)k.d(paint0, s);
                if(f5 > f1) {
                    f1 = f5;
                }
            }
        }
        return f1 + f2 + f;
    }

    public com.github.mikephil.charting.components.e.e C() {
        return this.l;
    }

    public float D() {
        return this.v;
    }

    public f E() {
        return this.k;
    }

    public float F() {
        return this.s;
    }

    public float G() {
        return this.t;
    }

    public boolean H() {
        return this.m;
    }

    public boolean I() {
        return this.i;
    }

    public boolean J() {
        return this.B;
    }

    public void K() {
        this.i = false;
    }

    public void L(List list0) {
        this.g = (com.github.mikephil.charting.components.f[])list0.toArray(new com.github.mikephil.charting.components.f[list0.size()]);
        this.i = true;
    }

    public void M(com.github.mikephil.charting.components.f[] arr_f) {
        this.g = arr_f;
        this.i = true;
    }

    public void N(com.github.mikephil.charting.components.e.b e$b0) {
        this.n = e$b0;
    }

    public void O(boolean z) {
        this.m = z;
    }

    public void P(List list0) {
        this.g = (com.github.mikephil.charting.components.f[])list0.toArray(new com.github.mikephil.charting.components.f[list0.size()]);
    }

    public void Q(List list0) {
        this.h = (com.github.mikephil.charting.components.f[])list0.toArray(new com.github.mikephil.charting.components.f[list0.size()]);
    }

    public void R(int[] arr_v, String[] arr_s) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < Math.min(arr_v.length, arr_s.length); ++v) {
            com.github.mikephil.charting.components.f f0 = new com.github.mikephil.charting.components.f();
            int v1 = arr_v[v];
            f0.f = v1;
            f0.a = arr_s[v];
            if(v1 == 0 || v1 == 0x112234) {
                f0.b = c.a;
            }
            else if(v1 == 0x112233) {
                f0.b = c.b;
            }
            arrayList0.add(f0);
        }
        this.h = (com.github.mikephil.charting.components.f[])arrayList0.toArray(new com.github.mikephil.charting.components.f[arrayList0.size()]);
    }

    public void S(com.github.mikephil.charting.components.f[] arr_f) {
        if(arr_f == null) {
            arr_f = new com.github.mikephil.charting.components.f[0];
        }
        this.h = arr_f;
    }

    public void T(c e$c0) {
        this.o = e$c0;
    }

    public void U(DashPathEffect dashPathEffect0) {
        this.r = dashPathEffect0;
    }

    public void V(float f) {
        this.q = f;
    }

    public void W(float f) {
        this.p = f;
    }

    public void X(float f) {
        this.u = f;
    }

    public void Y(d e$d0) {
        this.j = e$d0;
    }

    public void Z(float f) {
        this.w = f;
    }

    public void a0(com.github.mikephil.charting.components.e.e e$e0) {
        this.l = e$e0;
    }

    public void b0(float f) {
        this.v = f;
    }

    public void c0(f e$f0) {
        this.k = e$f0;
    }

    public void d0(boolean z) {
        this.B = z;
    }

    public void e0(float f) {
        this.s = f;
    }

    public void f0(float f) {
        this.t = f;
    }

    public void m(Paint paint0, l l0) {
        float f22;
        float f20;
        float f = k.e(this.p);
        float f1 = k.e(this.v);
        float f2 = k.e(this.u);
        float f3 = k.e(this.s);
        float f4 = k.e(this.t);
        boolean z = this.B;
        com.github.mikephil.charting.components.f[] arr_f = this.g;
        this.A = this.B(paint0);
        this.z = this.A(paint0);
        switch(this.l) {
            case 1: {
                float f5 = k.t(paint0);
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                boolean z1 = false;
                for(int v = 0; v < arr_f.length; ++v) {
                    com.github.mikephil.charting.components.f f9 = arr_f[v];
                    boolean z2 = f9.b != c.a;
                    float f10 = Float.isNaN(f9.c) ? f : k.e(f9.c);
                    String s = f9.a;
                    if(!z1) {
                        f8 = 0.0f;
                    }
                    if(z2) {
                        if(z1) {
                            f8 += f1;
                        }
                        f8 += f10;
                    }
                    if(s == null) {
                        f8 += f10;
                        f8 = v >= arr_f.length - 1 ? f8 + f10 : f8 + f1;
                        z1 = true;
                    }
                    else {
                        if(z2 && !z1) {
                            f8 += f2;
                        }
                        else if(z1) {
                            f6 = Math.max(f6, f8);
                            f7 += f5 + f4;
                            f8 = 0.0f;
                            z1 = false;
                        }
                        f8 += (float)k.d(paint0, s);
                        if(v < arr_f.length - 1) {
                            f7 += f5 + f4;
                        }
                    }
                    f6 = Math.max(f6, f8);
                }
                this.x = f6;
                this.y = f7;
                break;
            }
            case 2: {
                float f11 = k.t(paint0);
                float f12 = k.v(paint0) + f4;
                float f13 = l0.k() * this.w;
                this.D.clear();
                this.C.clear();
                this.E.clear();
                int v1 = 0;
                float f14 = 0.0f;
                int v2 = -1;
                float f16 = 0.0f;
                for(float f15 = 0.0f; v1 < arr_f.length; f15 = f20) {
                    com.github.mikephil.charting.components.f f17 = arr_f[v1];
                    boolean z3 = f17.b != c.a;
                    float f18 = Float.isNaN(f17.c) ? f : k.e(f17.c);
                    String s1 = f17.a;
                    this.D.add(Boolean.FALSE);
                    float f19 = v2 == -1 ? 0.0f : f15 + f1;
                    if(s1 == null) {
                        this.C.add(com.github.mikephil.charting.utils.c.b(0.0f, 0.0f));
                        f20 = f19 + (z3 ? f18 : 0.0f);
                        if(v2 == -1) {
                            v2 = v1;
                        }
                    }
                    else {
                        this.C.add(k.b(paint0, s1));
                        f20 = f19 + (z3 ? f2 + f18 : 0.0f) + ((com.github.mikephil.charting.utils.c)this.C.get(v1)).c;
                    }
                    if(s1 != null || v1 == arr_f.length - 1) {
                        int v3 = Float.compare(f16, 0.0f);
                        float f21 = v3 == 0 ? 0.0f : f3;
                        if(!z || v3 == 0 || f13 - f16 >= f21 + f20) {
                            f22 = f16 + (f21 + f20);
                        }
                        else {
                            this.E.add(com.github.mikephil.charting.utils.c.b(f16, f11));
                            f14 = Math.max(f14, f16);
                            this.D.set((v2 <= -1 ? v1 : v2), Boolean.TRUE);
                            f22 = f20;
                        }
                        if(v1 == arr_f.length - 1) {
                            this.E.add(com.github.mikephil.charting.utils.c.b(f22, f11));
                            f14 = Math.max(f14, f22);
                        }
                        f16 = f22;
                    }
                    if(s1 != null) {
                        v2 = -1;
                    }
                    ++v1;
                }
                this.x = f14;
                this.y = f11 * ((float)this.E.size()) + f12 * ((float)(this.E.size() == 0 ? 0 : this.E.size() - 1));
            }
        }
        this.y += this.c;
        this.x += this.b;
    }

    public List n() {
        return this.D;
    }

    public List o() {
        return this.C;
    }

    public List p() {
        return this.E;
    }

    public com.github.mikephil.charting.components.e.b q() {
        return this.n;
    }

    public com.github.mikephil.charting.components.f[] r() {
        return this.g;
    }

    public com.github.mikephil.charting.components.f[] s() {
        return this.h;
    }

    public c t() {
        return this.o;
    }

    public DashPathEffect u() {
        return this.r;
    }

    public float v() {
        return this.q;
    }

    public float w() {
        return this.p;
    }

    public float x() {
        return this.u;
    }

    public d y() {
        return this.j;
    }

    public float z() {
        return this.w;
    }
}

