package com.dcinside.app.glide;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.i;

public final class b extends i implements Cloneable {
    private static b V8;
    private static b W8;
    private static b X8;
    private static b Y8;
    private static b Z8;
    private static b a9;

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a A(@Nullable Drawable drawable0) {
        return this.Y1(drawable0);
    }

    @CheckResult
    @NonNull
    public b A1() {
        return (b)super.m();
    }

    @CheckResult
    @NonNull
    public b A2(@NonNull com.bumptech.glide.load.i i0, @NonNull Object object0) {
        return (b)super.F0(i0, object0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a B() {
        return this.Z1();
    }

    @CheckResult
    @NonNull
    public static b B1() {
        if(b.W8 == null) {
            b.W8 = new b().A1().w1();
        }
        return b.W8;
    }

    @CheckResult
    @NonNull
    public b B2(@NonNull g g0) {
        return (b)super.G0(g0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a C(@NonNull com.bumptech.glide.load.b b0) {
        return this.b2(b0);
    }

    @CheckResult
    @NonNull
    public b C1() {
        return (b)super.n();
    }

    @CheckResult
    @NonNull
    public static b C2(@NonNull g g0) {
        return new b().B2(g0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a D(@IntRange(from = 0L) long v) {
        return this.d2(v);
    }

    @CheckResult
    @NonNull
    public static b D1() {
        if(b.Y8 == null) {
            b.Y8 = new b().C1().w1();
        }
        return b.Y8;
    }

    @CheckResult
    @NonNull
    public b D2(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (b)super.H0(f);
    }

    @CheckResult
    public b E1() {
        return (b)super.o();
    }

    @CheckResult
    @NonNull
    public static b E2(@FloatRange(from = 0.0, to = 1.0) float f) {
        return new b().D2(f);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a F0(@NonNull com.bumptech.glide.load.i i0, @NonNull Object object0) {
        return this.A2(i0, object0);
    }

    @CheckResult
    @NonNull
    public b F1(@NonNull Class class0) {
        return (b)super.p(class0);
    }

    @CheckResult
    @NonNull
    public b F2(boolean z) {
        return (b)super.I0(z);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a G0(@NonNull g g0) {
        return this.B2(g0);
    }

    @CheckResult
    @NonNull
    public static b G1(@NonNull Class class0) {
        return new b().F1(class0);
    }

    @CheckResult
    @NonNull
    public static b G2(boolean z) {
        return new b().F2(z);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a H0(@FloatRange(from = 0.0, to = 1.0) float f) {
        return this.D2(f);
    }

    @CheckResult
    @NonNull
    public b H1() {
        return (b)super.q();
    }

    @CheckResult
    @NonNull
    public b H2(@Nullable Resources.Theme resources$Theme0) {
        return (b)super.J0(resources$Theme0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a I0(boolean z) {
        return this.F2(z);
    }

    @CheckResult
    @NonNull
    public b I1(@NonNull j j0) {
        return (b)super.r(j0);
    }

    @CheckResult
    @NonNull
    public b I2(@IntRange(from = 0L) int v) {
        return (b)super.K0(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a J0(@Nullable Resources.Theme resources$Theme0) {
        return this.H2(resources$Theme0);
    }

    @CheckResult
    @NonNull
    public static b J1(@NonNull j j0) {
        return new b().I1(j0);
    }

    @CheckResult
    @NonNull
    public static b J2(@IntRange(from = 0L) int v) {
        return new b().I2(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a K0(@IntRange(from = 0L) int v) {
        return this.I2(v);
    }

    @CheckResult
    @NonNull
    public b K1() {
        return (b)super.s();
    }

    @CheckResult
    @NonNull
    public b K2(@NonNull n n0) {
        return (b)super.L0(n0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a L0(@NonNull n n0) {
        return this.K2(n0);
    }

    @CheckResult
    @NonNull
    public b L1() {
        return (b)super.t();
    }

    @CheckResult
    @NonNull
    public b L2(@NonNull Class class0, @NonNull n n0) {
        return (b)super.O0(class0, n0);
    }

    @CheckResult
    @NonNull
    public b M1(@NonNull r r0) {
        return (b)super.u(r0);
    }

    @CheckResult
    @NonNull
    @SafeVarargs
    public final b M2(@NonNull n[] arr_n) {
        return (b)super.Q0(arr_n);
    }

    @CheckResult
    @NonNull
    @Deprecated
    @SafeVarargs
    public final b N2(@NonNull n[] arr_n) {
        return (b)super.R0(arr_n);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a O0(@NonNull Class class0, @NonNull n n0) {
        return this.L2(class0, n0);
    }

    @CheckResult
    @NonNull
    public static b O1(@NonNull r r0) {
        return new b().M1(r0);
    }

    @CheckResult
    @NonNull
    public b O2(boolean z) {
        return (b)super.S0(z);
    }

    @CheckResult
    @NonNull
    public b P1(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return (b)super.v(bitmap$CompressFormat0);
    }

    @CheckResult
    @NonNull
    public b P2(boolean z) {
        return (b)super.T0(z);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    @SafeVarargs
    public a Q0(@NonNull n[] arr_n) {
        return this.M2(arr_n);
    }

    @CheckResult
    @NonNull
    public static b Q1(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return new b().P1(bitmap$CompressFormat0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    @Deprecated
    @SafeVarargs
    public a R0(@NonNull n[] arr_n) {
        return this.N2(arr_n);
    }

    @CheckResult
    @NonNull
    public b R1(@IntRange(from = 0L, to = 100L) int v) {
        return (b)super.w(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a S0(boolean z) {
        return this.O2(z);
    }

    @CheckResult
    @NonNull
    public static b S1(@IntRange(from = 0L, to = 100L) int v) {
        return new b().R1(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a T0(boolean z) {
        return this.P2(z);
    }

    @CheckResult
    @NonNull
    public b T1(@DrawableRes int v) {
        return (b)super.x(v);
    }

    @CheckResult
    @NonNull
    public b U1(@Nullable Drawable drawable0) {
        return (b)super.y(drawable0);
    }

    @CheckResult
    @NonNull
    public static b V1(@DrawableRes int v) {
        return new b().T1(v);
    }

    @CheckResult
    @NonNull
    public static b W1(@Nullable Drawable drawable0) {
        return new b().U1(drawable0);
    }

    @CheckResult
    @NonNull
    public b X1(@DrawableRes int v) {
        return (b)super.z(v);
    }

    @CheckResult
    @NonNull
    public b Y1(@Nullable Drawable drawable0) {
        return (b)super.A(drawable0);
    }

    @CheckResult
    @NonNull
    public b Z1() {
        return (b)super.B();
    }

    @CheckResult
    @NonNull
    public static b a2() {
        if(b.V8 == null) {
            b.V8 = new b().Z1().w1();
        }
        return b.V8;
    }

    @CheckResult
    @NonNull
    public b b2(@NonNull com.bumptech.glide.load.b b0) {
        return (b)super.C(b0);
    }

    @CheckResult
    @NonNull
    public static b c2(@NonNull com.bumptech.glide.load.b b0) {
        return new b().b2(b0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.E1();
    }

    @CheckResult
    @NonNull
    public b d2(@IntRange(from = 0L) long v) {
        return (b)super.D(v);
    }

    @CheckResult
    @NonNull
    public static b e2(@IntRange(from = 0L) long v) {
        return new b().d2(v);
    }

    @NonNull
    public b f2() {
        return (b)super.l0();
    }

    @CheckResult
    @NonNull
    public static b g2() {
        if(b.a9 == null) {
            b.a9 = new b().K1().w1();
        }
        return b.a9;
    }

    @CheckResult
    @NonNull
    public static b h2() {
        if(b.Z8 == null) {
            b.Z8 = new b().L1().w1();
        }
        return b.Z8;
    }

    @CheckResult
    @NonNull
    public b i2(boolean z) {
        return (b)super.m0(z);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a j(@NonNull a a0) {
        return this.v1(a0);
    }

    @CheckResult
    @NonNull
    public static b j2(@NonNull com.bumptech.glide.load.i i0, @NonNull Object object0) {
        return new b().A2(i0, object0);
    }

    @Override  // com.bumptech.glide.request.a
    @NonNull
    public a k() {
        return this.w1();
    }

    @CheckResult
    @NonNull
    public b k2() {
        return (b)super.n0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a l() {
        return this.y1();
    }

    @Override  // com.bumptech.glide.request.a
    @NonNull
    public a l0() {
        return this.f2();
    }

    @CheckResult
    @NonNull
    public b l2() {
        return (b)super.o0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a m() {
        return this.A1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a m0(boolean z) {
        return this.i2(z);
    }

    @CheckResult
    @NonNull
    public b m2() {
        return (b)super.p0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a n() {
        return this.C1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a n0() {
        return this.k2();
    }

    @CheckResult
    @NonNull
    public b n2() {
        return (b)super.q0();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    public a o() {
        return this.E1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a o0() {
        return this.l2();
    }

    @CheckResult
    @NonNull
    public b o2(@NonNull n n0) {
        return (b)super.s0(n0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a p(@NonNull Class class0) {
        return this.F1(class0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a p0() {
        return this.m2();
    }

    @CheckResult
    @NonNull
    public b p2(@NonNull Class class0, @NonNull n n0) {
        return (b)super.u0(class0, n0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a q() {
        return this.H1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a q0() {
        return this.n2();
    }

    @CheckResult
    @NonNull
    public b q2(int v) {
        return (b)super.v0(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a r(@NonNull j j0) {
        return this.I1(j0);
    }

    @CheckResult
    @NonNull
    public b r2(int v, int v1) {
        return (b)super.w0(v, v1);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a s() {
        return this.K1();
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a s0(@NonNull n n0) {
        return this.o2(n0);
    }

    @CheckResult
    @NonNull
    public static b s2(int v) {
        return new b().q2(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a t() {
        return this.L1();
    }

    @CheckResult
    @NonNull
    public static b t2(int v, int v1) {
        return new b().r2(v, v1);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a u(@NonNull r r0) {
        return this.M1(r0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a u0(@NonNull Class class0, @NonNull n n0) {
        return this.p2(class0, n0);
    }

    @CheckResult
    @NonNull
    public b u2(@DrawableRes int v) {
        return (b)super.x0(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a v(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return this.P1(bitmap$CompressFormat0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a v0(int v) {
        return this.q2(v);
    }

    @CheckResult
    @NonNull
    public b v1(@NonNull a a0) {
        return (b)super.j(a0);
    }

    @CheckResult
    @NonNull
    public b v2(@Nullable Drawable drawable0) {
        return (b)super.y0(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a w(@IntRange(from = 0L, to = 100L) int v) {
        return this.R1(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a w0(int v, int v1) {
        return this.r2(v, v1);
    }

    @NonNull
    public b w1() {
        return (b)super.k();
    }

    @CheckResult
    @NonNull
    public static b w2(@DrawableRes int v) {
        return new b().u2(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a x(@DrawableRes int v) {
        return this.T1(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a x0(@DrawableRes int v) {
        return this.u2(v);
    }

    @CheckResult
    @NonNull
    public static b x1(@NonNull n n0) {
        return new b().K2(n0);
    }

    @CheckResult
    @NonNull
    public static b x2(@Nullable Drawable drawable0) {
        return new b().v2(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a y(@Nullable Drawable drawable0) {
        return this.U1(drawable0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a y0(@Nullable Drawable drawable0) {
        return this.v2(drawable0);
    }

    @CheckResult
    @NonNull
    public b y1() {
        return (b)super.l();
    }

    @CheckResult
    @NonNull
    public b y2(@NonNull com.bumptech.glide.j j0) {
        return (b)super.z0(j0);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a z(@DrawableRes int v) {
        return this.X1(v);
    }

    @Override  // com.bumptech.glide.request.a
    @CheckResult
    @NonNull
    public a z0(@NonNull com.bumptech.glide.j j0) {
        return this.y2(j0);
    }

    @CheckResult
    @NonNull
    public static b z1() {
        if(b.X8 == null) {
            b.X8 = new b().y1().w1();
        }
        return b.X8;
    }

    @CheckResult
    @NonNull
    public static b z2(@NonNull com.bumptech.glide.j j0) {
        return new b().y2(j0);
    }
}

