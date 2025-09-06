package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.S;
import com.bumptech.glide.load.resource.bitmap.e;
import com.bumptech.glide.load.resource.bitmap.p;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.load.resource.gif.f;
import com.bumptech.glide.signature.c;
import com.bumptech.glide.util.b;
import com.bumptech.glide.util.m;
import com.bumptech.glide.util.o;
import java.util.Map;

public abstract class a implements Cloneable {
    private static final int A = -1;
    private static final int B = 2;
    private static final int C = 4;
    private static final int D = 8;
    private static final int E = 16;
    private static final int F = 0x20;
    private static final int G = 0x40;
    private static final int H = 0x80;
    private static final int I = 0x100;
    private static final int J = 0x200;
    private static final int K = 0x400;
    private static final int L = 0x800;
    private static final int M = 0x1000;
    private static final int M8 = 0x100000;
    private static final int N = 0x2000;
    private static final int O = 0x4000;
    private static final int P = 0x8000;
    private static final int Q = 0x10000;
    private static final int X = 0x20000;
    private static final int Y = 0x40000;
    private static final int Z = 0x80000;
    private int a;
    private float b;
    @NonNull
    private j c;
    @NonNull
    private com.bumptech.glide.j d;
    @Nullable
    private Drawable e;
    private int f;
    @Nullable
    private Drawable g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    @NonNull
    private g l;
    private boolean m;
    private boolean n;
    @Nullable
    private Drawable o;
    private int p;
    @NonNull
    private com.bumptech.glide.load.j q;
    @NonNull
    private Map r;
    @NonNull
    private Class s;
    private boolean t;
    @Nullable
    private Resources.Theme u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public a() {
        this.b = 1.0f;
        this.c = j.e;
        this.d = com.bumptech.glide.j.c;
        this.i = true;
        this.j = -1;
        this.k = -1;
        this.l = c.c();
        this.n = true;
        this.q = new com.bumptech.glide.load.j();
        this.r = new b();
        this.s = Object.class;
        this.y = true;
    }

    @CheckResult
    @NonNull
    public a A(@Nullable Drawable drawable0) {
        if(this.v) {
            return this.o().A(drawable0);
        }
        this.o = drawable0;
        this.p = 0;
        this.a = (this.a | 0x2000) & 0xFFFFBFFF;
        return this.E0();
    }

    a A0(@NonNull i i0) {
        if(this.v) {
            return this.o().A0(i0);
        }
        this.q.e(i0);
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a B() {
        B b0 = new B();
        return this.B0(r.c, b0);
    }

    @NonNull
    private a B0(@NonNull r r0, @NonNull n n0) {
        return this.C0(r0, n0, true);
    }

    @CheckResult
    @NonNull
    public a C(@NonNull com.bumptech.glide.load.b b0) {
        m.e(b0);
        return this.F0(x.g, b0).F0(com.bumptech.glide.load.resource.gif.i.a, b0);
    }

    @NonNull
    private a C0(@NonNull r r0, @NonNull n n0, boolean z) {
        a a0 = z ? this.N0(r0, n0) : this.t0(r0, n0);
        a0.y = true;
        return a0;
    }

    @CheckResult
    @NonNull
    public a D(@IntRange(from = 0L) long v) {
        return this.F0(S.g, v);
    }

    private a D0() [...] // Inlined contents

    @NonNull
    public final j E() {
        return this.c;
    }

    @NonNull
    protected final a E0() {
        if(this.t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public final int F() {
        return this.f;
    }

    @CheckResult
    @NonNull
    public a F0(@NonNull i i0, @NonNull Object object0) {
        if(this.v) {
            return this.o().F0(i0, object0);
        }
        m.e(i0);
        m.e(object0);
        this.q.f(i0, object0);
        return this.E0();
    }

    @Nullable
    public final Drawable G() {
        return this.e;
    }

    @CheckResult
    @NonNull
    public a G0(@NonNull g g0) {
        if(this.v) {
            return this.o().G0(g0);
        }
        this.l = (g)m.e(g0);
        this.a |= 0x400;
        return this.E0();
    }

    @Nullable
    public final Drawable H() {
        return this.o;
    }

    @CheckResult
    @NonNull
    public a H0(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(this.v) {
            return this.o().H0(f);
        }
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.b = f;
        this.a |= 2;
        return this.E0();
    }

    public final int I() {
        return this.p;
    }

    @CheckResult
    @NonNull
    public a I0(boolean z) {
        if(this.v) {
            return this.o().I0(true);
        }
        this.i = !z;
        this.a |= 0x100;
        return this.E0();
    }

    public final boolean J() {
        return this.x;
    }

    @CheckResult
    @NonNull
    public a J0(@Nullable Resources.Theme resources$Theme0) {
        if(this.v) {
            return this.o().J0(resources$Theme0);
        }
        this.u = resources$Theme0;
        if(resources$Theme0 != null) {
            this.a |= 0x8000;
            return this.F0(com.bumptech.glide.load.resource.drawable.m.b, resources$Theme0);
        }
        this.a &= 0xFFFF7FFF;
        return this.A0(com.bumptech.glide.load.resource.drawable.m.b);
    }

    @NonNull
    public final com.bumptech.glide.load.j K() {
        return this.q;
    }

    @CheckResult
    @NonNull
    public a K0(@IntRange(from = 0L) int v) {
        return this.F0(com.bumptech.glide.load.model.stream.b.b, v);
    }

    public final int L() {
        return this.j;
    }

    @CheckResult
    @NonNull
    public a L0(@NonNull n n0) {
        return this.M0(n0, true);
    }

    public final int M() {
        return this.k;
    }

    @NonNull
    a M0(@NonNull n n0, boolean z) {
        if(this.v) {
            return this.o().M0(n0, z);
        }
        z z1 = new z(n0, z);
        this.P0(Bitmap.class, n0, z);
        this.P0(Drawable.class, z1, z);
        this.P0(BitmapDrawable.class, z1, z);
        f f0 = new f(n0);
        this.P0(com.bumptech.glide.load.resource.gif.c.class, f0, z);
        return this.E0();
    }

    @Nullable
    public final Drawable N() {
        return this.g;
    }

    @CheckResult
    @NonNull
    final a N0(@NonNull r r0, @NonNull n n0) {
        if(this.v) {
            return this.o().N0(r0, n0);
        }
        this.u(r0);
        return this.L0(n0);
    }

    public final int O() {
        return this.h;
    }

    @CheckResult
    @NonNull
    public a O0(@NonNull Class class0, @NonNull n n0) {
        return this.P0(class0, n0, true);
    }

    @NonNull
    public final com.bumptech.glide.j P() {
        return this.d;
    }

    @NonNull
    a P0(@NonNull Class class0, @NonNull n n0, boolean z) {
        if(this.v) {
            return this.o().P0(class0, n0, z);
        }
        m.e(class0);
        m.e(n0);
        this.r.put(class0, n0);
        int v = this.a;
        this.n = true;
        this.a = 0x10800 | v;
        this.y = false;
        if(z) {
            this.a = v | 0x30800;
            this.m = true;
        }
        return this.E0();
    }

    @NonNull
    public final Class Q() {
        return this.s;
    }

    @CheckResult
    @NonNull
    public a Q0(@NonNull n[] arr_n) {
        if(arr_n.length > 1) {
            return this.M0(new h(arr_n), true);
        }
        return arr_n.length == 1 ? this.L0(arr_n[0]) : this.E0();
    }

    @NonNull
    public final g R() {
        return this.l;
    }

    @CheckResult
    @NonNull
    @Deprecated
    public a R0(@NonNull n[] arr_n) {
        return this.M0(new h(arr_n), true);
    }

    public final float S() {
        return this.b;
    }

    @CheckResult
    @NonNull
    public a S0(boolean z) {
        if(this.v) {
            return this.o().S0(z);
        }
        this.z = z;
        this.a |= 0x100000;
        return this.E0();
    }

    @Nullable
    public final Resources.Theme T() {
        return this.u;
    }

    @CheckResult
    @NonNull
    public a T0(boolean z) {
        if(this.v) {
            return this.o().T0(z);
        }
        this.w = z;
        this.a |= 0x40000;
        return this.E0();
    }

    @NonNull
    public final Map U() {
        return this.r;
    }

    public final boolean V() {
        return this.z;
    }

    public final boolean W() {
        return this.w;
    }

    protected final boolean X() {
        return this.v;
    }

    public final boolean Y() {
        return this.e0(4);
    }

    // 去混淆评级： 中等(90)
    public final boolean Z(a a0) {
        return Float.compare(a0.b, this.b) == 0 && this.f == a0.f && o.e(this.e, a0.e) && this.h == a0.h && o.e(this.g, a0.g) && this.p == a0.p && o.e(this.o, a0.o) && this.i == a0.i && this.j == a0.j && this.k == a0.k && this.m == a0.m && this.n == a0.n && this.w == a0.w && this.x == a0.x && this.c.equals(a0.c) && this.d == a0.d && this.q.equals(a0.q) && this.r.equals(a0.r) && this.s.equals(a0.s) && o.e(this.l, a0.l) && o.e(this.u, a0.u);
    }

    public final boolean a0() {
        return this.t;
    }

    public final boolean b0() {
        return this.i;
    }

    public final boolean c0() {
        return this.e0(8);
    }

    @Override
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.o();
    }

    boolean d0() {
        return this.y;
    }

    private boolean e0(int v) {
        return a.f0(this.a, v);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof a ? this.Z(((a)object0)) : false;
    }

    private static boolean f0(int v, int v1) {
        return (v & v1) != 0;
    }

    public final boolean g0() {
        return this.e0(0x100);
    }

    public final boolean h0() {
        return this.n;
    }

    @Override
    public int hashCode() {
        return o.r(this.u, o.r(this.l, o.r(this.s, o.r(this.r, o.r(this.q, o.r(this.d, o.r(this.c, o.t(this.x, o.t(this.w, o.t(this.n, o.t(this.m, (o.t(this.i, o.r(this.o, o.r(this.g, o.r(this.e, o.n(this.b) * 0x1F + this.f) * 0x1F + this.h) * 0x1F + this.p)) * 0x1F + this.j) * 0x1F + this.k)))))))))));
    }

    public final boolean i0() {
        return this.m;
    }

    @CheckResult
    @NonNull
    public a j(@NonNull a a0) {
        if(this.v) {
            return this.o().j(a0);
        }
        if(a.f0(a0.a, 2)) {
            this.b = a0.b;
        }
        if(a.f0(a0.a, 0x40000)) {
            this.w = a0.w;
        }
        if(a.f0(a0.a, 0x100000)) {
            this.z = a0.z;
        }
        if(a.f0(a0.a, 4)) {
            this.c = a0.c;
        }
        if(a.f0(a0.a, 8)) {
            this.d = a0.d;
        }
        if(a.f0(a0.a, 16)) {
            this.e = a0.e;
            this.f = 0;
            this.a &= -33;
        }
        if(a.f0(a0.a, 0x20)) {
            this.f = a0.f;
            this.e = null;
            this.a &= -17;
        }
        if(a.f0(a0.a, 0x40)) {
            this.g = a0.g;
            this.h = 0;
            this.a &= 0xFFFFFF7F;
        }
        if(a.f0(a0.a, 0x80)) {
            this.h = a0.h;
            this.g = null;
            this.a &= -65;
        }
        if(a.f0(a0.a, 0x100)) {
            this.i = a0.i;
        }
        if(a.f0(a0.a, 0x200)) {
            this.k = a0.k;
            this.j = a0.j;
        }
        if(a.f0(a0.a, 0x400)) {
            this.l = a0.l;
        }
        if(a.f0(a0.a, 0x1000)) {
            this.s = a0.s;
        }
        if(a.f0(a0.a, 0x2000)) {
            this.o = a0.o;
            this.p = 0;
            this.a &= 0xFFFFBFFF;
        }
        if(a.f0(a0.a, 0x4000)) {
            this.p = a0.p;
            this.o = null;
            this.a &= 0xFFFFDFFF;
        }
        if(a.f0(a0.a, 0x8000)) {
            this.u = a0.u;
        }
        if(a.f0(a0.a, 0x10000)) {
            this.n = a0.n;
        }
        if(a.f0(a0.a, 0x20000)) {
            this.m = a0.m;
        }
        if(a.f0(a0.a, 0x800)) {
            this.r.putAll(a0.r);
            this.y = a0.y;
        }
        if(a.f0(a0.a, 0x80000)) {
            this.x = a0.x;
        }
        if(!this.n) {
            this.r.clear();
            this.m = false;
            this.a &= 0xFFFDF7FF;
            this.y = true;
        }
        this.a |= a0.a;
        this.q.d(a0.q);
        return this.E0();
    }

    public final boolean j0() {
        return this.e0(0x800);
    }

    @NonNull
    public a k() {
        if(this.t && !this.v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.v = true;
        return this.l0();
    }

    public final boolean k0() {
        return o.x(this.k, this.j);
    }

    @CheckResult
    @NonNull
    public a l() {
        com.bumptech.glide.load.resource.bitmap.n n0 = new com.bumptech.glide.load.resource.bitmap.n();
        return this.N0(r.e, n0);
    }

    @NonNull
    public a l0() {
        this.t = true;
        return this;
    }

    @CheckResult
    @NonNull
    public a m() {
        com.bumptech.glide.load.resource.bitmap.o o0 = new com.bumptech.glide.load.resource.bitmap.o();
        return this.B0(r.d, o0);
    }

    @CheckResult
    @NonNull
    public a m0(boolean z) {
        if(this.v) {
            return this.o().m0(z);
        }
        this.x = z;
        this.a |= 0x80000;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a n() {
        p p0 = new p();
        return this.N0(r.d, p0);
    }

    @CheckResult
    @NonNull
    public a n0() {
        com.bumptech.glide.load.resource.bitmap.n n0 = new com.bumptech.glide.load.resource.bitmap.n();
        return this.t0(r.e, n0);
    }

    @CheckResult
    public a o() {
        try {
            a a0 = (a)super.clone();
            com.bumptech.glide.load.j j0 = new com.bumptech.glide.load.j();
            a0.q = j0;
            j0.d(this.q);
            b b0 = new b();
            a0.r = b0;
            b0.putAll(this.r);
            a0.t = false;
            a0.v = false;
            return a0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @CheckResult
    @NonNull
    public a o0() {
        com.bumptech.glide.load.resource.bitmap.o o0 = new com.bumptech.glide.load.resource.bitmap.o();
        return this.r0(r.d, o0);
    }

    @CheckResult
    @NonNull
    public a p(@NonNull Class class0) {
        if(this.v) {
            return this.o().p(class0);
        }
        this.s = (Class)m.e(class0);
        this.a |= 0x1000;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a p0() {
        p p0 = new p();
        return this.t0(r.e, p0);
    }

    @CheckResult
    @NonNull
    public a q() {
        return this.F0(x.k, Boolean.FALSE);
    }

    @CheckResult
    @NonNull
    public a q0() {
        B b0 = new B();
        return this.r0(r.c, b0);
    }

    @CheckResult
    @NonNull
    public a r(@NonNull j j0) {
        if(this.v) {
            return this.o().r(j0);
        }
        this.c = (j)m.e(j0);
        this.a |= 4;
        return this.E0();
    }

    @NonNull
    private a r0(@NonNull r r0, @NonNull n n0) {
        return this.C0(r0, n0, false);
    }

    @CheckResult
    @NonNull
    public a s() {
        return this.F0(com.bumptech.glide.load.resource.gif.i.b, Boolean.TRUE);
    }

    @CheckResult
    @NonNull
    public a s0(@NonNull n n0) {
        return this.M0(n0, false);
    }

    @CheckResult
    @NonNull
    public a t() {
        if(this.v) {
            return this.o().t();
        }
        this.r.clear();
        this.m = false;
        this.n = false;
        this.a = this.a & 0xFFFDF7FF | 0x10000;
        this.y = true;
        return this.E0();
    }

    @NonNull
    final a t0(@NonNull r r0, @NonNull n n0) {
        if(this.v) {
            return this.o().t0(r0, n0);
        }
        this.u(r0);
        return this.M0(n0, false);
    }

    @CheckResult
    @NonNull
    public a u(@NonNull r r0) {
        Object object0 = m.e(r0);
        return this.F0(r.h, object0);
    }

    @CheckResult
    @NonNull
    public a u0(@NonNull Class class0, @NonNull n n0) {
        return this.P0(class0, n0, false);
    }

    @CheckResult
    @NonNull
    public a v(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        Object object0 = m.e(bitmap$CompressFormat0);
        return this.F0(e.c, object0);
    }

    @CheckResult
    @NonNull
    public a v0(int v) {
        return this.w0(v, v);
    }

    @CheckResult
    @NonNull
    public a w(@IntRange(from = 0L, to = 100L) int v) {
        return this.F0(e.b, v);
    }

    @CheckResult
    @NonNull
    public a w0(int v, int v1) {
        if(this.v) {
            return this.o().w0(v, v1);
        }
        this.k = v;
        this.j = v1;
        this.a |= 0x200;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a x(@DrawableRes int v) {
        if(this.v) {
            return this.o().x(v);
        }
        this.f = v;
        this.e = null;
        this.a = (this.a | 0x20) & -17;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a x0(@DrawableRes int v) {
        if(this.v) {
            return this.o().x0(v);
        }
        this.h = v;
        this.g = null;
        this.a = (this.a | 0x80) & -65;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a y(@Nullable Drawable drawable0) {
        if(this.v) {
            return this.o().y(drawable0);
        }
        this.e = drawable0;
        this.f = 0;
        this.a = (this.a | 16) & -33;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a y0(@Nullable Drawable drawable0) {
        if(this.v) {
            return this.o().y0(drawable0);
        }
        this.g = drawable0;
        this.h = 0;
        this.a = (this.a | 0x40) & 0xFFFFFF7F;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a z(@DrawableRes int v) {
        if(this.v) {
            return this.o().z(v);
        }
        this.p = v;
        this.o = null;
        this.a = (this.a | 0x4000) & 0xFFFFDFFF;
        return this.E0();
    }

    @CheckResult
    @NonNull
    public a z0(@NonNull com.bumptech.glide.j j0) {
        if(this.v) {
            return this.o().z0(j0);
        }
        this.d = (com.bumptech.glide.j)m.e(j0);
        this.a |= 8;
        return this.E0();
    }
}

