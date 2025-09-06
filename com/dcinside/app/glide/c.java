package com.dcinside.app.glide;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.j;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.h;
import java.io.File;
import java.net.URL;
import java.util.List;

public class c extends m implements Cloneable {
    c(@NonNull com.bumptech.glide.c c0, @NonNull n n0, @NonNull Class class0, @NonNull Context context0) {
        super(c0, n0, class0, context0);
    }

    c(@NonNull Class class0, @NonNull m m0) {
        super(class0, m0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a A(@Nullable Drawable drawable0) {
        return this.j2(drawable0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @Deprecated
    public m A1(@Nullable URL uRL0) {
        return this.w2(uRL0);
    }

    @CheckResult
    @NonNull
    public c A2() {
        return (c)super.n0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a B() {
        return this.k2();
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m B1(@Nullable byte[] arr_b) {
        return this.x2(arr_b);
    }

    @CheckResult
    @NonNull
    public c B2() {
        return (c)super.o0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a C(@NonNull b b0) {
        return this.l2(b0);
    }

    @CheckResult
    @NonNull
    public c C2() {
        return (c)super.p0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a D(@IntRange(from = 0L) long v) {
        return this.m2(v);
    }

    @CheckResult
    @NonNull
    public c D2() {
        return (c)super.q0();
    }

    @CheckResult
    @NonNull
    public c E2(@NonNull com.bumptech.glide.load.n n0) {
        return (c)super.s0(n0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a F0(@NonNull i i0, @NonNull Object object0) {
        return this.L2(i0, object0);
    }

    @CheckResult
    @NonNull
    public c F2(@NonNull Class class0, @NonNull com.bumptech.glide.load.n n0) {
        return (c)super.u0(class0, n0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a G0(@NonNull g g0) {
        return this.M2(g0);
    }

    @CheckResult
    @NonNull
    public c G2(int v) {
        return (c)super.v0(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a H0(@FloatRange(from = 0.0, to = 1.0) float f) {
        return this.N2(f);
    }

    @CheckResult
    @NonNull
    public c H2(int v, int v1) {
        return (c)super.w0(v, v1);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a I0(boolean z) {
        return this.O2(z);
    }

    @CheckResult
    @NonNull
    public c I2(@DrawableRes int v) {
        return (c)super.x0(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a J0(@Nullable Resources.Theme resources$Theme0) {
        return this.P2(resources$Theme0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    @Deprecated
    public m J1(float f) {
        return this.Q2(f);
    }

    @CheckResult
    @NonNull
    public c J2(@Nullable Drawable drawable0) {
        return (c)super.y0(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a K0(@IntRange(from = 0L) int v) {
        return this.U2(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m K1(@Nullable m m0) {
        return this.R2(m0);
    }

    @CheckResult
    @NonNull
    public c K2(@NonNull j j0) {
        return (c)super.z0(j0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a L0(@NonNull com.bumptech.glide.load.n n0) {
        return this.V2(n0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m L1(@Nullable List list0) {
        return this.S2(list0);
    }

    @CheckResult
    @NonNull
    public c L2(@NonNull i i0, @NonNull Object object0) {
        return (c)super.F0(i0, object0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    @SafeVarargs
    public m M1(@Nullable m[] arr_m) {
        return this.T2(arr_m);
    }

    @CheckResult
    @NonNull
    public c M2(@NonNull g g0) {
        return (c)super.G0(g0);
    }

    @CheckResult
    @NonNull
    public c N2(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (c)super.H0(f);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a O0(@NonNull Class class0, @NonNull com.bumptech.glide.load.n n0) {
        return this.W2(class0, n0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m O1(@NonNull o o0) {
        return this.Z2(o0);
    }

    @CheckResult
    @NonNull
    public c O2(boolean z) {
        return (c)super.I0(z);
    }

    @CheckResult
    @NonNull
    public c P1(@Nullable h h0) {
        return (c)super.U0(h0);
    }

    @CheckResult
    @NonNull
    public c P2(@Nullable Resources.Theme resources$Theme0) {
        return (c)super.J0(resources$Theme0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a Q0(@NonNull com.bumptech.glide.load.n[] arr_n) {
        return this.X2(arr_n);
    }

    @CheckResult
    @NonNull
    public c Q1(@NonNull a a0) {
        return (c)super.V0(a0);
    }

    @CheckResult
    @NonNull
    @Deprecated
    public c Q2(float f) {
        return (c)super.J1(f);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    @Deprecated
    public a R0(@NonNull com.bumptech.glide.load.n[] arr_n) {
        return this.Y2(arr_n);
    }

    @NonNull
    public c R1() {
        return (c)super.k();
    }

    @CheckResult
    @NonNull
    public c R2(@Nullable m m0) {
        return (c)super.K1(m0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a S0(boolean z) {
        return this.a3(z);
    }

    @CheckResult
    @NonNull
    public c S1() {
        return (c)super.l();
    }

    @CheckResult
    @NonNull
    public c S2(@Nullable List list0) {
        return (c)super.L1(list0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a T0(boolean z) {
        return this.b3(z);
    }

    @CheckResult
    @NonNull
    public c T1() {
        return (c)super.m();
    }

    @CheckResult
    @NonNull
    @SafeVarargs
    public final c T2(@Nullable m[] arr_m) {
        return (c)super.M1(arr_m);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m U0(@Nullable h h0) {
        return this.P1(h0);
    }

    @CheckResult
    @NonNull
    public c U1() {
        return (c)super.n();
    }

    @CheckResult
    @NonNull
    public c U2(@IntRange(from = 0L) int v) {
        return (c)super.K0(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m V0(@NonNull a a0) {
        return this.Q1(a0);
    }

    @CheckResult
    public c V1() {
        return (c)super.a1();
    }

    @CheckResult
    @NonNull
    public c V2(@NonNull com.bumptech.glide.load.n n0) {
        return (c)super.L0(n0);
    }

    @CheckResult
    @NonNull
    public c W1(@NonNull Class class0) {
        return (c)super.p(class0);
    }

    @CheckResult
    @NonNull
    public c W2(@NonNull Class class0, @NonNull com.bumptech.glide.load.n n0) {
        return (c)super.O0(class0, n0);
    }

    @CheckResult
    @NonNull
    public c X1() {
        return (c)super.q();
    }

    @CheckResult
    @NonNull
    public c X2(@NonNull com.bumptech.glide.load.n[] arr_n) {
        return (c)super.Q0(arr_n);
    }

    @CheckResult
    @NonNull
    public c Y1(@NonNull com.bumptech.glide.load.engine.j j0) {
        return (c)super.r(j0);
    }

    @CheckResult
    @NonNull
    @Deprecated
    public c Y2(@NonNull com.bumptech.glide.load.n[] arr_n) {
        return (c)super.R0(arr_n);
    }

    @CheckResult
    @NonNull
    public c Z1() {
        return (c)super.s();
    }

    @CheckResult
    @NonNull
    public c Z2(@NonNull o o0) {
        return (c)super.O1(o0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @Deprecated
    public Object a(@Nullable URL uRL0) {
        return this.w2(uRL0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    public m a1() {
        return this.V1();
    }

    @CheckResult
    @NonNull
    public c a2() {
        return (c)super.t();
    }

    @CheckResult
    @NonNull
    public c a3(boolean z) {
        return (c)super.S0(z);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object b(@Nullable File file0) {
        return this.s2(file0);
    }

    @CheckResult
    @NonNull
    public c b2(@NonNull r r0) {
        return (c)super.u(r0);
    }

    @CheckResult
    @NonNull
    public c b3(boolean z) {
        return (c)super.T0(z);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object c(@Nullable Drawable drawable0) {
        return this.q2(drawable0);
    }

    @CheckResult
    @NonNull
    public c c2(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return (c)super.v(bitmap$CompressFormat0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.V1();
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object d(@Nullable Object object0) {
        return this.u2(object0);
    }

    @CheckResult
    @NonNull
    public c d2(@IntRange(from = 0L, to = 100L) int v) {
        return (c)super.w(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object e(@Nullable Uri uri0) {
        return this.r2(uri0);
    }

    @Override  // com.bumptech.glide.m
    @NonNull
    public m e1(@Nullable m m0) {
        return this.g2(m0);
    }

    @CheckResult
    @NonNull
    public c e2(@DrawableRes int v) {
        return (c)super.x(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object f(@Nullable byte[] arr_b) {
        return this.x2(arr_b);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m f1(Object object0) {
        return this.h2(object0);
    }

    @CheckResult
    @NonNull
    public c f2(@Nullable Drawable drawable0) {
        return (c)super.y(drawable0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object g(@Nullable Bitmap bitmap0) {
        return this.p2(bitmap0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    protected m g1() {
        return this.n2();
    }

    @NonNull
    public c g2(@Nullable m m0) {
        return (c)super.e1(m0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object h(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.t2(integer0);
    }

    @CheckResult
    @NonNull
    public c h2(Object object0) {
        return (c)super.f1(object0);
    }

    @CheckResult
    @NonNull
    public c i2(@DrawableRes int v) {
        return (c)super.z(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public a j(@NonNull a a0) {
        return this.Q1(a0);
    }

    @CheckResult
    @NonNull
    public c j2(@Nullable Drawable drawable0) {
        return (c)super.A(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @NonNull
    public a k() {
        return this.R1();
    }

    @CheckResult
    @NonNull
    public c k2() {
        return (c)super.B();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a l() {
        return this.S1();
    }

    @Override  // com.bumptech.glide.request.a
    @NonNull
    public a l0() {
        return this.y2();
    }

    @CheckResult
    @NonNull
    public c l2(@NonNull b b0) {
        return (c)super.C(b0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.v2(s);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a m() {
        return this.T1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a m0(boolean z) {
        return this.z2(z);
    }

    @CheckResult
    @NonNull
    public c m2(@IntRange(from = 0L) long v) {
        return (c)super.D(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a n() {
        return this.U1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a n0() {
        return this.A2();
    }

    @CheckResult
    @NonNull
    protected c n2() {
        return new c(File.class, this).Q1(m.b9);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    public a o() {
        return this.V1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a o0() {
        return this.B2();
    }

    @CheckResult
    @NonNull
    public c o2(@Nullable h h0) {
        return (c)super.s1(h0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a p(@NonNull Class class0) {
        return this.W1(class0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a p0() {
        return this.C2();
    }

    @CheckResult
    @NonNull
    public c p2(@Nullable Bitmap bitmap0) {
        return (c)super.t1(bitmap0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a q() {
        return this.X1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a q0() {
        return this.D2();
    }

    @CheckResult
    @NonNull
    public c q2(@Nullable Drawable drawable0) {
        return (c)super.u1(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a r(@NonNull com.bumptech.glide.load.engine.j j0) {
        return this.Y1(j0);
    }

    @CheckResult
    @NonNull
    public c r2(@Nullable Uri uri0) {
        return (c)super.v1(uri0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a s() {
        return this.Z1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a s0(@NonNull com.bumptech.glide.load.n n0) {
        return this.E2(n0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m s1(@Nullable h h0) {
        return this.o2(h0);
    }

    @CheckResult
    @NonNull
    public c s2(@Nullable File file0) {
        return (c)super.w1(file0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a t() {
        return this.a2();
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m t1(@Nullable Bitmap bitmap0) {
        return this.p2(bitmap0);
    }

    @CheckResult
    @NonNull
    public c t2(@DrawableRes @Nullable @RawRes Integer integer0) {
        return (c)super.x1(integer0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a u(@NonNull r r0) {
        return this.b2(r0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a u0(@NonNull Class class0, @NonNull com.bumptech.glide.load.n n0) {
        return this.F2(class0, n0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m u1(@Nullable Drawable drawable0) {
        return this.q2(drawable0);
    }

    @CheckResult
    @NonNull
    public c u2(@Nullable Object object0) {
        return (c)super.y1(object0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a v(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return this.c2(bitmap$CompressFormat0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a v0(int v) {
        return this.G2(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m v1(@Nullable Uri uri0) {
        return this.r2(uri0);
    }

    @CheckResult
    @NonNull
    public c v2(@Nullable String s) {
        return (c)super.z1(s);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a w(@IntRange(from = 0L, to = 100L) int v) {
        return this.d2(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a w0(int v, int v1) {
        return this.H2(v, v1);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m w1(@Nullable File file0) {
        return this.s2(file0);
    }

    @CheckResult
    @Deprecated
    public c w2(@Nullable URL uRL0) {
        return (c)super.A1(uRL0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a x(@DrawableRes int v) {
        return this.e2(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a x0(@DrawableRes int v) {
        return this.I2(v);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m x1(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.t2(integer0);
    }

    @CheckResult
    @NonNull
    public c x2(@Nullable byte[] arr_b) {
        return (c)super.B1(arr_b);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a y(@Nullable Drawable drawable0) {
        return this.f2(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a y0(@Nullable Drawable drawable0) {
        return this.J2(drawable0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m y1(@Nullable Object object0) {
        return this.u2(object0);
    }

    @NonNull
    public c y2() {
        return (c)super.l0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a z(@DrawableRes int v) {
        return this.i2(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a z0(@NonNull j j0) {
        return this.K2(j0);
    }

    @Override  // com.bumptech.glide.m
    @CheckResult
    @NonNull
    public m z1(@Nullable String s) {
        return this.v2(s);
    }

    @CheckResult
    @NonNull
    public c z2(boolean z) {
        return (c)super.m0(z);
    }
}

