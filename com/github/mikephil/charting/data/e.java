package com.github.mikephil.charting.data;

import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Typeface;
import com.github.mikephil.charting.components.e.c;
import com.github.mikephil.charting.formatter.l;
import com.github.mikephil.charting.utils.g;
import com.github.mikephil.charting.utils.k;
import java.util.ArrayList;
import java.util.List;
import v1.a;

public abstract class e implements t1.e {
    protected List a;
    protected a b;
    protected List c;
    protected List d;
    private String e;
    protected com.github.mikephil.charting.components.k.a f;
    protected boolean g;
    protected transient l h;
    protected Typeface i;
    private c j;
    private float k;
    private float l;
    private DashPathEffect m;
    protected boolean n;
    protected boolean o;
    protected g p;
    protected float q;
    protected boolean r;

    public e() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = "DataSet";
        this.f = com.github.mikephil.charting.components.k.a.a;
        this.g = true;
        this.j = c.c;
        this.k = NaNf;
        this.l = NaNf;
        this.m = null;
        this.n = true;
        this.o = true;
        this.p = new g();
        this.q = 17.0f;
        this.r = true;
        this.a = new ArrayList();
        this.d = new ArrayList();
        this.a.add(Color.rgb(140, 0xEA, 0xFF));
        this.d.add(0xFF000000);
    }

    public e(String s) {
        this.e = s;
    }

    @Override  // t1.e
    public void A(boolean z) {
        this.n = z;
    }

    public void A1(int[] arr_v, int v) {
        this.v1();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            this.r1(Color.argb(v, Color.red(v2), Color.green(v2), Color.blue(v2)));
        }
    }

    public void B1(int[] arr_v, Context context0) {
        if(this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            this.a.add(context0.getResources().getColor(v1));
        }
    }

    public void C1(c e$c0) {
        this.j = e$c0;
    }

    @Override  // t1.e
    public boolean D0() {
        return this.n;
    }

    public void D1(DashPathEffect dashPathEffect0) {
        this.m = dashPathEffect0;
    }

    @Override  // t1.e
    public com.github.mikephil.charting.components.k.a E0() {
        return this.f;
    }

    public void E1(float f) {
        this.l = f;
    }

    public void F1(float f) {
        this.k = f;
    }

    public void G1(int v, int v1) {
        this.b = new a(v, v1);
    }

    public void H1(List list0) {
        this.c = list0;
    }

    @Override  // t1.e
    public DashPathEffect J() {
        return this.m;
    }

    @Override  // t1.e
    public boolean K() {
        return this.o;
    }

    @Override  // t1.e
    public boolean K0(float f) {
        return this.T(this.M0(f, NaNf));
    }

    @Override  // t1.e
    public void L(Typeface typeface0) {
        this.i = typeface0;
    }

    @Override  // t1.e
    public int O0() {
        return (int)(((Integer)this.d.get(0)));
    }

    @Override  // t1.e
    public void P(int v) {
        this.d.clear();
        this.d.add(v);
    }

    @Override  // t1.e
    public float Q() {
        return this.l;
    }

    @Override  // t1.e
    public a Q0() {
        return this.b;
    }

    @Override  // t1.e
    public float S0() {
        return this.q;
    }

    @Override  // t1.e
    public void V(l l0) {
        if(l0 == null) {
            return;
        }
        this.h = l0;
    }

    @Override  // t1.e
    public void X(List list0) {
        this.d = list0;
    }

    @Override  // t1.e
    public int Y0(int v) {
        return (int)(((Integer)this.a.get(v % this.a.size())));
    }

    @Override  // t1.e
    public void b(boolean z) {
        this.g = z;
    }

    @Override  // t1.e
    public boolean b1() {
        return this.h == null;
    }

    @Override  // t1.e
    public void d(com.github.mikephil.charting.components.k.a k$a0) {
        this.f = k$a0;
    }

    @Override  // t1.e
    public boolean f0() {
        return this.g;
    }

    @Override  // t1.e
    public int getColor() {
        return (int)(((Integer)this.a.get(0)));
    }

    @Override  // t1.e
    public String getLabel() [...] // 潜在的解密器

    @Override  // t1.e
    public c h() {
        return this.j;
    }

    @Override  // t1.e
    public void h1(g g0) {
        this.p.c = g0.c;
        this.p.d = g0.d;
    }

    @Override  // t1.e
    public void i0(String s) {
        this.e = s;
    }

    @Override  // t1.e
    public boolean isVisible() {
        return this.r;
    }

    @Override  // t1.e
    public float m() {
        return this.k;
    }

    @Override  // t1.e
    public g m1() {
        return this.p;
    }

    @Override  // t1.e
    public void n(boolean z) {
        this.o = z;
    }

    @Override  // t1.e
    public a n1(int v) {
        return (a)this.c.get(v % this.c.size());
    }

    @Override  // t1.e
    public Typeface o() {
        return this.i;
    }

    @Override  // t1.e
    public int q(int v) {
        return (int)(((Integer)this.d.get(v % this.d.size())));
    }

    @Override  // t1.e
    public void r(float f) {
        this.q = k.e(f);
    }

    public void r1(int v) {
        if(this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(v);
    }

    @Override  // t1.e
    public boolean removeFirst() {
        return this.N() <= 0 ? false : this.T(this.l(0));
    }

    @Override  // t1.e
    public boolean removeLast() {
        return this.N() <= 0 ? false : this.T(this.l(this.N() - 1));
    }

    @Override  // t1.e
    public int s0(int v) {
        for(int v1 = 0; v1 < this.N(); ++v1) {
            if(((float)v) == this.l(v1).l()) {
                return v1;
            }
        }
        return -1;
    }

    protected void s1(e e0) {
        e0.f = this.f;
        e0.a = this.a;
        e0.o = this.o;
        e0.n = this.n;
        e0.j = this.j;
        e0.m = this.m;
        e0.l = this.l;
        e0.k = this.k;
        e0.b = this.b;
        e0.c = this.c;
        e0.g = this.g;
        e0.p = this.p;
        e0.h = this.h;
        e0.d = this.d;
        e0.q = this.q;
        e0.r = this.r;
    }

    @Override  // t1.e
    public void setVisible(boolean z) {
        this.r = z;
    }

    // 去混淆评级： 低(20)
    @Override  // t1.e
    public l t0() {
        return this.b1() ? k.s() : this.h;
    }

    public List t1() {
        return this.d;
    }

    public void u1() {
        this.B0();
    }

    public void v1() {
        if(this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
    }

    @Override  // t1.e
    public List w() {
        return this.c;
    }

    public void w1(int v) {
        this.v1();
        this.a.add(v);
    }

    @Override  // t1.e
    public boolean x0(Entry entry0) {
        for(int v = 0; v < this.N(); ++v) {
            if(this.l(v).equals(entry0)) {
                return true;
            }
        }
        return false;
    }

    public void x1(int v, int v1) {
        this.w1(Color.argb(v1, Color.red(v), Color.green(v), Color.blue(v)));
    }

    public void y1(List list0) {
        this.a = list0;
    }

    @Override  // t1.e
    public boolean z(int v) {
        return this.T(this.l(v));
    }

    @Override  // t1.e
    public List z0() {
        return this.a;
    }

    public void z1(int[] arr_v) {
        this.a = com.github.mikephil.charting.utils.a.c(arr_v);
    }
}

