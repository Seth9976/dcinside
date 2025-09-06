package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.b;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.f;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.l;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.request.target.r;
import com.bumptech.glide.request.transition.g;
import j..util.Objects;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

public class m extends a implements i, Cloneable {
    static class com.bumptech.glide.m.a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[j.values().length];
            com.bumptech.glide.m.a.b = arr_v;
            try {
                arr_v[j.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.b[j.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.b[j.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.b[j.a.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[ImageView.ScaleType.values().length];
            com.bumptech.glide.m.a.a = arr_v1;
            try {
                arr_v1[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bumptech.glide.m.a.a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final Context N8;
    private final n O8;
    private final Class P8;
    private final c Q8;
    private final e R8;
    @NonNull
    private o S8;
    @Nullable
    private Object T8;
    @Nullable
    private List U8;
    @Nullable
    private m V8;
    @Nullable
    private m W8;
    @Nullable
    private Float X8;
    private boolean Y8;
    private boolean Z8;
    private boolean a9;
    protected static final com.bumptech.glide.request.i b9;

    static {
        m.b9 = (com.bumptech.glide.request.i)((com.bumptech.glide.request.i)((com.bumptech.glide.request.i)new com.bumptech.glide.request.i().r(com.bumptech.glide.load.engine.j.c)).z0(j.d)).I0(true);
    }

    @SuppressLint({"CheckResult"})
    protected m(@NonNull c c0, n n0, Class class0, Context context0) {
        this.Y8 = true;
        this.Q8 = c0;
        this.O8 = n0;
        this.P8 = class0;
        this.N8 = context0;
        this.S8 = n0.x(class0);
        this.R8 = c0.k();
        this.k1(n0.v());
        this.V0(n0.w());
    }

    @SuppressLint({"CheckResult"})
    protected m(Class class0, m m0) {
        this(m0.Q8, m0.O8, class0, m0.N8);
        this.T8 = m0.T8;
        this.Z8 = m0.Z8;
        this.V0(m0);
    }

    @CheckResult
    @Deprecated
    public m A1(@Nullable URL uRL0) {
        return this.C1(uRL0);
    }

    @CheckResult
    @NonNull
    public m B1(@Nullable byte[] arr_b) {
        m m0 = this.C1(arr_b);
        if(!m0.Y()) {
            m0 = m0.V0(com.bumptech.glide.request.i.Z0(com.bumptech.glide.load.engine.j.b));
        }
        return m0.g0() ? m0 : m0.V0(com.bumptech.glide.request.i.t1(true));
    }

    @NonNull
    private m C1(@Nullable Object object0) {
        if(this.X()) {
            return this.a1().C1(object0);
        }
        this.T8 = object0;
        this.Z8 = true;
        return (m)this.E0();
    }

    private m D1(@Nullable Uri uri0, m m0) {
        return uri0 == null || !"android.resource".equals(uri0.getScheme()) ? m0 : this.W0(m0);
    }

    private com.bumptech.glide.request.e E1(Object object0, p p0, h h0, a a0, f f0, o o0, j j0, int v, int v1, Executor executor0) {
        Object object1 = this.T8;
        List list0 = this.U8;
        k k0 = this.R8.f();
        g g0 = o0.c();
        return com.bumptech.glide.request.k.y(this.N8, this.R8, object0, object1, this.P8, a0, v, v1, j0, p0, h0, list0, f0, k0, g0, executor0);
    }

    @NonNull
    public p F1() {
        return this.G1(0x80000000, 0x80000000);
    }

    @NonNull
    public p G1(int v, int v1) {
        return this.n1(com.bumptech.glide.request.target.m.b(this.O8, v, v1));
    }

    @NonNull
    public d H1() {
        return this.I1(0x80000000, 0x80000000);
    }

    @NonNull
    public d I1(int v, int v1) {
        com.bumptech.glide.request.g g0 = new com.bumptech.glide.request.g(v, v1);
        return (d)this.p1(g0, g0, com.bumptech.glide.util.f.a());
    }

    @CheckResult
    @NonNull
    @Deprecated
    public m J1(float f) {
        if(this.X()) {
            return this.a1().J1(f);
        }
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.X8 = f;
        return (m)this.E0();
    }

    @CheckResult
    @NonNull
    public m K1(@Nullable m m0) {
        if(this.X()) {
            return this.a1().K1(m0);
        }
        this.V8 = m0;
        return (m)this.E0();
    }

    @CheckResult
    @NonNull
    public m L1(@Nullable List list0) {
        m m0 = null;
        if(list0 != null && !list0.isEmpty()) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                m m1 = (m)list0.get(v);
                if(m1 != null) {
                    m0 = m0 == null ? m1 : m1.K1(m0);
                }
            }
            return this.K1(m0);
        }
        return this.K1(null);
    }

    @CheckResult
    @NonNull
    public m M1(@Nullable m[] arr_m) {
        return arr_m == null || arr_m.length == 0 ? this.K1(null) : this.L1(Arrays.asList(arr_m));
    }

    @CheckResult
    @NonNull
    public m O1(@NonNull o o0) {
        if(this.X()) {
            return this.a1().O1(o0);
        }
        this.S8 = (o)com.bumptech.glide.util.m.e(o0);
        this.Y8 = false;
        return (m)this.E0();
    }

    @CheckResult
    @NonNull
    public m U0(@Nullable h h0) {
        if(this.X()) {
            return this.a1().U0(h0);
        }
        if(h0 != null) {
            if(this.U8 == null) {
                this.U8 = new ArrayList();
            }
            this.U8.add(h0);
        }
        return (m)this.E0();
    }

    @CheckResult
    @NonNull
    public m V0(@NonNull a a0) {
        com.bumptech.glide.util.m.e(a0);
        return (m)super.j(a0);
    }

    private m W0(m m0) {
        return (m)((m)m0.J0(this.N8.getTheme())).G0(com.bumptech.glide.signature.a.c(this.N8));
    }

    private com.bumptech.glide.request.e X0(p p0, @Nullable h h0, a a0, Executor executor0) {
        return this.Y0(new Object(), p0, h0, null, this.S8, a0.P(), a0.M(), a0.L(), a0, executor0);
    }

    private com.bumptech.glide.request.e Y0(Object object0, p p0, @Nullable h h0, @Nullable f f0, o o0, j j0, int v, int v1, a a0, Executor executor0) {
        f f2;
        f f1;
        if(this.W8 == null) {
            f2 = null;
            f1 = f0;
        }
        else {
            f1 = new b(object0, f0);
            f2 = f1;
        }
        com.bumptech.glide.request.e e0 = this.Z0(object0, p0, h0, f1, o0, j0, v, v1, a0, executor0);
        if(f2 == null) {
            return e0;
        }
        int v2 = this.W8.M();
        int v3 = this.W8.L();
        if(com.bumptech.glide.util.o.x(v, v1) && !this.W8.k0()) {
            v2 = a0.M();
            v3 = a0.L();
        }
        ((b)f2).o(e0, this.W8.Y0(object0, p0, h0, f2, this.W8.S8, this.W8.P(), v2, v3, this.W8, executor0));
        return f2;
    }

    private com.bumptech.glide.request.e Z0(Object object0, p p0, h h0, @Nullable f f0, o o0, j j0, int v, int v1, a a0, Executor executor0) {
        m m0 = this.V8;
        if(m0 != null) {
            if(this.a9) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            o o1 = m0.Y8 ? o0 : m0.S8;
            j j1 = m0.c0() ? this.V8.P() : this.j1(j0);
            int v2 = this.V8.M();
            int v3 = this.V8.L();
            if(com.bumptech.glide.util.o.x(v, v1) && !this.V8.k0()) {
                v2 = a0.M();
                v3 = a0.L();
            }
            l l0 = new l(object0, f0);
            com.bumptech.glide.request.e e0 = this.E1(object0, p0, h0, a0, l0, o0, j0, v, v1, executor0);
            this.a9 = true;
            com.bumptech.glide.request.e e1 = this.V8.Y0(object0, p0, h0, l0, o1, j1, v2, v3, this.V8, executor0);
            this.a9 = false;
            l0.n(e0, e1);
            return l0;
        }
        if(this.X8 != null) {
            com.bumptech.glide.request.e e2 = new l(object0, f0);
            ((l)e2).n(this.E1(object0, p0, h0, a0, ((f)e2), o0, j0, v, v1, executor0), this.E1(object0, p0, h0, a0.o().H0(((float)this.X8)), ((f)e2), o0, this.j1(j0), v, v1, executor0));
            return e2;
        }
        return this.E1(object0, p0, h0, a0, f0, o0, j0, v, v1, executor0);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @Deprecated
    public Object a(@Nullable URL uRL0) {
        return this.A1(uRL0);
    }

    @CheckResult
    public m a1() {
        m m0 = (m)super.o();
        m0.S8 = m0.S8.a();
        if(m0.U8 != null) {
            m0.U8 = new ArrayList(m0.U8);
        }
        m m1 = m0.V8;
        if(m1 != null) {
            m0.V8 = m1.a1();
        }
        m m2 = m0.W8;
        if(m2 != null) {
            m0.W8 = m2.a1();
        }
        return m0;
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object b(@Nullable File file0) {
        return this.w1(file0);
    }

    private m b1() {
        return this.a1().e1(null).K1(null);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object c(@Nullable Drawable drawable0) {
        return this.u1(drawable0);
    }

    @CheckResult
    @Deprecated
    public d c1(int v, int v1) {
        return this.g1().I1(v, v1);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.a1();
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object d(@Nullable Object object0) {
        return this.y1(object0);
    }

    @CheckResult
    @Deprecated
    public p d1(@NonNull p p0) {
        return this.g1().n1(p0);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object e(@Nullable Uri uri0) {
        return this.v1(uri0);
    }

    @NonNull
    public m e1(@Nullable m m0) {
        if(this.X()) {
            return this.a1().e1(m0);
        }
        this.W8 = m0;
        return (m)this.E0();
    }

    // 去混淆评级： 中等(90)
    @Override  // com.bumptech.glide.request.a
    public boolean equals(Object object0) {
        return object0 instanceof m && super.equals(((m)object0)) && Objects.equals(this.P8, ((m)object0).P8) && this.S8.equals(((m)object0).S8) && Objects.equals(this.T8, ((m)object0).T8) && Objects.equals(this.U8, ((m)object0).U8) && Objects.equals(this.V8, ((m)object0).V8) && Objects.equals(this.W8, ((m)object0).W8) && Objects.equals(this.X8, ((m)object0).X8) && this.Y8 == ((m)object0).Y8 && this.Z8 == ((m)object0).Z8;
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object f(@Nullable byte[] arr_b) {
        return this.B1(arr_b);
    }

    @CheckResult
    @NonNull
    public m f1(Object object0) {
        return object0 == null ? this.e1(null) : this.e1(this.b1().y1(object0));
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object g(@Nullable Bitmap bitmap0) {
        return this.t1(bitmap0);
    }

    @CheckResult
    @NonNull
    protected m g1() {
        return new m(File.class, this).V0(m.b9);
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object h(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.x1(integer0);
    }

    Object h1() {
        return this.T8;
    }

    @Override  // com.bumptech.glide.request.a
    public int hashCode() {
        return com.bumptech.glide.util.o.t(this.Z8, com.bumptech.glide.util.o.t(this.Y8, com.bumptech.glide.util.o.r(this.X8, com.bumptech.glide.util.o.r(this.W8, com.bumptech.glide.util.o.r(this.V8, com.bumptech.glide.util.o.r(this.U8, com.bumptech.glide.util.o.r(this.T8, com.bumptech.glide.util.o.r(this.S8, com.bumptech.glide.util.o.r(this.P8, super.hashCode())))))))));
    }

    n i1() {
        return this.O8;
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a j(@NonNull a a0) {
        return this.V0(a0);
    }

    @NonNull
    private j j1(@NonNull j j0) {
        switch(j0) {
            case 1: {
                return j.c;
            }
            case 2: {
                return j.b;
            }
            case 3: 
            case 4: {
                return j.a;
            }
            default: {
                throw new IllegalArgumentException("unknown priority: " + this.P());
            }
        }
    }

    @SuppressLint({"CheckResult"})
    private void k1(List list0) {
        for(Object object0: list0) {
            this.U0(((h)object0));
        }
    }

    @Override  // com.bumptech.glide.i
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.z1(s);
    }

    @Deprecated
    public d m1(int v, int v1) {
        return this.I1(v, v1);
    }

    @NonNull
    public p n1(@NonNull p p0) {
        return this.p1(p0, null, com.bumptech.glide.util.f.b());
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    public a o() {
        return this.a1();
    }

    private p o1(@NonNull p p0, @Nullable h h0, a a0, Executor executor0) {
        com.bumptech.glide.util.m.e(p0);
        if(!this.Z8) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.request.e e0 = this.X0(p0, h0, a0, executor0);
        com.bumptech.glide.request.e e1 = p0.z();
        if(e0.g(e1) && !this.r1(a0, e1)) {
            if(!((com.bumptech.glide.request.e)com.bumptech.glide.util.m.e(e1)).isRunning()) {
                e1.i();
            }
            return p0;
        }
        this.O8.q(p0);
        p0.E(e0);
        this.O8.Z(p0, e0);
        return p0;
    }

    @NonNull
    p p1(@NonNull p p0, @Nullable h h0, Executor executor0) {
        return this.o1(p0, h0, this, executor0);
    }

    @NonNull
    public r q1(@NonNull ImageView imageView0) {
        a a0;
        com.bumptech.glide.util.o.b();
        com.bumptech.glide.util.m.e(imageView0);
        if(!this.j0() && this.h0() && imageView0.getScaleType() != null) {
            switch(imageView0.getScaleType()) {
                case 1: {
                    a0 = this.o().n0();
                    return (r)this.o1(this.R8.a(imageView0, this.P8), null, a0, com.bumptech.glide.util.f.b());
                }
                case 2: {
                    a0 = this.o().o0();
                    return (r)this.o1(this.R8.a(imageView0, this.P8), null, a0, com.bumptech.glide.util.f.b());
                }
                case 3: 
                case 4: 
                case 5: {
                    a0 = this.o().q0();
                    return (r)this.o1(this.R8.a(imageView0, this.P8), null, a0, com.bumptech.glide.util.f.b());
                }
                case 6: {
                    a0 = this.o().o0();
                    return (r)this.o1(this.R8.a(imageView0, this.P8), null, a0, com.bumptech.glide.util.f.b());
                }
                default: {
                    return (r)this.o1(this.R8.a(imageView0, this.P8), null, this, com.bumptech.glide.util.f.b());
                }
            }
        }
        return (r)this.o1(this.R8.a(imageView0, this.P8), null, this, com.bumptech.glide.util.f.b());
    }

    // 去混淆评级： 低(20)
    private boolean r1(a a0, com.bumptech.glide.request.e e0) {
        return !a0.b0() && e0.e();
    }

    @CheckResult
    @NonNull
    public m s1(@Nullable h h0) {
        if(this.X()) {
            return this.a1().s1(h0);
        }
        this.U8 = null;
        return this.U0(h0);
    }

    @CheckResult
    @NonNull
    public m t1(@Nullable Bitmap bitmap0) {
        return this.C1(bitmap0).V0(com.bumptech.glide.request.i.Z0(com.bumptech.glide.load.engine.j.b));
    }

    @CheckResult
    @NonNull
    public m u1(@Nullable Drawable drawable0) {
        return this.C1(drawable0).V0(com.bumptech.glide.request.i.Z0(com.bumptech.glide.load.engine.j.b));
    }

    @CheckResult
    @NonNull
    public m v1(@Nullable Uri uri0) {
        return this.D1(uri0, this.C1(uri0));
    }

    @CheckResult
    @NonNull
    public m w1(@Nullable File file0) {
        return this.C1(file0);
    }

    @CheckResult
    @NonNull
    public m x1(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.W0(this.C1(integer0));
    }

    @CheckResult
    @NonNull
    public m y1(@Nullable Object object0) {
        return this.C1(object0);
    }

    @CheckResult
    @NonNull
    public m z1(@Nullable String s) {
        return this.C1(s);
    }
}

