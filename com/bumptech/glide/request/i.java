package com.bumptech.glide.request;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.resource.bitmap.r;

public class i extends a {
    @Nullable
    private static i N8;
    @Nullable
    private static i O8;
    @Nullable
    private static i P8;
    @Nullable
    private static i Q8;
    @Nullable
    private static i R8;
    @Nullable
    private static i S8;
    @Nullable
    private static i T8;
    @Nullable
    private static i U8;

    @CheckResult
    @NonNull
    public static i U0(@NonNull n n0) {
        return (i)new i().L0(n0);
    }

    @CheckResult
    @NonNull
    public static i V0() {
        if(i.R8 == null) {
            i.R8 = (i)((i)new i().l()).k();
        }
        return i.R8;
    }

    @CheckResult
    @NonNull
    public static i W0() {
        if(i.Q8 == null) {
            i.Q8 = (i)((i)new i().m()).k();
        }
        return i.Q8;
    }

    @CheckResult
    @NonNull
    public static i X0() {
        if(i.S8 == null) {
            i.S8 = (i)((i)new i().n()).k();
        }
        return i.S8;
    }

    @CheckResult
    @NonNull
    public static i Y0(@NonNull Class class0) {
        return (i)new i().p(class0);
    }

    @CheckResult
    @NonNull
    public static i Z0(@NonNull j j0) {
        return (i)new i().r(j0);
    }

    @CheckResult
    @NonNull
    public static i a1(@NonNull r r0) {
        return (i)new i().u(r0);
    }

    @CheckResult
    @NonNull
    public static i b1(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0) {
        return (i)new i().v(bitmap$CompressFormat0);
    }

    @CheckResult
    @NonNull
    public static i c1(@IntRange(from = 0L, to = 100L) int v) {
        return (i)new i().w(v);
    }

    @CheckResult
    @NonNull
    public static i d1(@DrawableRes int v) {
        return (i)new i().x(v);
    }

    @CheckResult
    @NonNull
    public static i e1(@Nullable Drawable drawable0) {
        return (i)new i().y(drawable0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.bumptech.glide.request.a
    public boolean equals(Object object0) {
        return object0 instanceof i && super.equals(object0);
    }

    @CheckResult
    @NonNull
    public static i f1() {
        if(i.P8 == null) {
            i.P8 = (i)((i)new i().B()).k();
        }
        return i.P8;
    }

    @CheckResult
    @NonNull
    public static i g1(@NonNull b b0) {
        return (i)new i().C(b0);
    }

    @CheckResult
    @NonNull
    public static i h1(@IntRange(from = 0L) long v) {
        return (i)new i().D(v);
    }

    @Override  // com.bumptech.glide.request.a
    public int hashCode() {
        return super.hashCode();
    }

    @CheckResult
    @NonNull
    public static i i1() {
        if(i.U8 == null) {
            i.U8 = (i)((i)new i().s()).k();
        }
        return i.U8;
    }

    @CheckResult
    @NonNull
    public static i j1() {
        if(i.T8 == null) {
            i.T8 = (i)((i)new i().t()).k();
        }
        return i.T8;
    }

    @CheckResult
    @NonNull
    public static i k1(@NonNull com.bumptech.glide.load.i i0, @NonNull Object object0) {
        return (i)new i().F0(i0, object0);
    }

    @CheckResult
    @NonNull
    public static i m1(int v) {
        return i.n1(v, v);
    }

    @CheckResult
    @NonNull
    public static i n1(int v, int v1) {
        return (i)new i().w0(v, v1);
    }

    @CheckResult
    @NonNull
    public static i o1(@DrawableRes int v) {
        return (i)new i().x0(v);
    }

    @CheckResult
    @NonNull
    public static i p1(@Nullable Drawable drawable0) {
        return (i)new i().y0(drawable0);
    }

    @CheckResult
    @NonNull
    public static i q1(@NonNull com.bumptech.glide.j j0) {
        return (i)new i().z0(j0);
    }

    @CheckResult
    @NonNull
    public static i r1(@NonNull g g0) {
        return (i)new i().G0(g0);
    }

    @CheckResult
    @NonNull
    public static i s1(@FloatRange(from = 0.0, to = 1.0) float f) {
        return (i)new i().H0(f);
    }

    @CheckResult
    @NonNull
    public static i t1(boolean z) {
        if(z) {
            if(i.N8 == null) {
                i.N8 = (i)((i)new i().I0(true)).k();
            }
            return i.N8;
        }
        if(i.O8 == null) {
            i.O8 = (i)((i)new i().I0(false)).k();
        }
        return i.O8;
    }

    @CheckResult
    @NonNull
    public static i u1(@IntRange(from = 0L) int v) {
        return (i)new i().K0(v);
    }
}

