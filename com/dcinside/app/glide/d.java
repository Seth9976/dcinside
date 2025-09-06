package com.dcinside.app.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.c;
import com.bumptech.glide.m;
import com.bumptech.glide.manager.j;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.n;
import com.bumptech.glide.request.h;
import com.bumptech.glide.request.i;
import java.io.File;
import java.net.URL;

public class d extends n {
    public d(@NonNull c c0, @NonNull j j0, @NonNull p p0, @NonNull Context context0) {
        super(c0, j0, p0, context0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m H(@Nullable Bitmap bitmap0) {
        return this.n0(bitmap0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m I(@Nullable Drawable drawable0) {
        return this.o0(drawable0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m J(@Nullable Uri uri0) {
        return this.p0(uri0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m K(@Nullable File file0) {
        return this.q0(file0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m L(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.r0(integer0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m M(@Nullable Object object0) {
        return this.s0(object0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m N(@Nullable String s) {
        return this.t0(s);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @Deprecated
    public m O(@Nullable URL uRL0) {
        return this.u0(uRL0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m P(@Nullable byte[] arr_b) {
        return this.v0(arr_b);
    }

    @Override  // com.bumptech.glide.n
    @NonNull
    public n W(@NonNull i i0) {
        return this.w0(i0);
    }

    @Override  // com.bumptech.glide.n
    protected void Y(@NonNull i i0) {
        if(i0 instanceof b) {
            super.Y(i0);
            return;
        }
        super.Y(new b().v1(i0));
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @Deprecated
    public Object a(@Nullable URL uRL0) {
        return this.u0(uRL0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object b(@Nullable File file0) {
        return this.q0(file0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object c(@Nullable Drawable drawable0) {
        return this.o0(drawable0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object d(@Nullable Object object0) {
        return this.s0(object0);
    }

    @NonNull
    public d d0(h h0) {
        return (d)super.i(h0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object e(@Nullable Uri uri0) {
        return this.p0(uri0);
    }

    @NonNull
    public d e0(@NonNull i i0) {
        synchronized(this) {
            return (d)super.j(i0);
        }
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object f(@Nullable byte[] arr_b) {
        return this.v0(arr_b);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c f0(@NonNull Class class0) {
        return new com.dcinside.app.glide.c(this.a, this, class0, this.b);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object g(@Nullable Bitmap bitmap0) {
        return this.n0(bitmap0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c g0() {
        return (com.dcinside.app.glide.c)super.l();
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object h(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.r0(integer0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c h0() {
        return (com.dcinside.app.glide.c)super.m();
    }

    @Override  // com.bumptech.glide.n
    @NonNull
    public n i(h h0) {
        return this.d0(h0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c i0() {
        return (com.dcinside.app.glide.c)super.n();
    }

    @Override  // com.bumptech.glide.n
    @NonNull
    public n j(@NonNull i i0) {
        return this.e0(i0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c j0() {
        return (com.dcinside.app.glide.c)super.o();
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m k(@NonNull Class class0) {
        return this.f0(class0);
    }

    @NonNull
    public d k0() {
        synchronized(this) {
            return (d)super.r();
        }
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m l() {
        return this.g0();
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c l0(@Nullable Object object0) {
        return (com.dcinside.app.glide.c)super.t(object0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.t0(s);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m m() {
        return this.h0();
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c m0() {
        return (com.dcinside.app.glide.c)super.u();
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m n() {
        return this.i0();
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c n0(@Nullable Bitmap bitmap0) {
        return (com.dcinside.app.glide.c)super.H(bitmap0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m o() {
        return this.j0();
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c o0(@Nullable Drawable drawable0) {
        return (com.dcinside.app.glide.c)super.I(drawable0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c p0(@Nullable Uri uri0) {
        return (com.dcinside.app.glide.c)super.J(uri0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c q0(@Nullable File file0) {
        return (com.dcinside.app.glide.c)super.K(file0);
    }

    @Override  // com.bumptech.glide.n
    @NonNull
    public n r() {
        return this.k0();
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c r0(@DrawableRes @Nullable @RawRes Integer integer0) {
        return (com.dcinside.app.glide.c)super.L(integer0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c s0(@Nullable Object object0) {
        return (com.dcinside.app.glide.c)super.M(object0);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m t(@Nullable Object object0) {
        return this.l0(object0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c t0(@Nullable String s) {
        return (com.dcinside.app.glide.c)super.N(s);
    }

    @Override  // com.bumptech.glide.n
    @CheckResult
    @NonNull
    public m u() {
        return this.m0();
    }

    @CheckResult
    @Deprecated
    public com.dcinside.app.glide.c u0(@Nullable URL uRL0) {
        return (com.dcinside.app.glide.c)super.O(uRL0);
    }

    @CheckResult
    @NonNull
    public com.dcinside.app.glide.c v0(@Nullable byte[] arr_b) {
        return (com.dcinside.app.glide.c)super.P(arr_b);
    }

    @NonNull
    public d w0(@NonNull i i0) {
        synchronized(this) {
            return (d)super.W(i0);
        }
    }
}

