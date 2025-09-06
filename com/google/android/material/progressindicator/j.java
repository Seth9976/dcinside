package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R.drawable;
import java.util.List;

public final class j extends g {
    private h r;
    private i s;
    private Drawable t;

    j(@NonNull Context context0, @NonNull c c0, @NonNull h h0, @NonNull i i0) {
        super(context0, c0);
        this.H(h0);
        this.G(i0);
    }

    @NonNull
    public static j A(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        return j.B(context0, linearProgressIndicatorSpec0, new k(linearProgressIndicatorSpec0));
    }

    @NonNull
    static j B(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0, @NonNull k k0) {
        return linearProgressIndicatorSpec0.h == 0 ? new j(context0, linearProgressIndicatorSpec0, k0, new l(linearProgressIndicatorSpec0)) : new j(context0, linearProgressIndicatorSpec0, k0, new m(context0, linearProgressIndicatorSpec0));
    }

    @NonNull
    i C() {
        return this.s;
    }

    @NonNull
    h D() {
        return this.r;
    }

    @Nullable
    @RestrictTo({Scope.b})
    public Drawable E() {
        return this.t;
    }

    private boolean F() {
        return this.c != null && this.c.a(this.a.getContentResolver()) == 0.0f;
    }

    void G(@NonNull i i0) {
        this.s = i0;
        i0.e(this);
    }

    void H(@NonNull h h0) {
        this.r = h0;
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public void I(@Nullable Drawable drawable0) {
        this.t = drawable0;
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean b(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        return super.b(animatable2Compat$AnimationCallback0);
    }

    @Override  // com.google.android.material.progressindicator.g
    public void d(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        super.d(animatable2Compat$AnimationCallback0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Rect rect0 = new Rect();
        if(!this.getBounds().isEmpty() && this.isVisible() && canvas0.getClipBounds(rect0)) {
            if(this.F()) {
                Drawable drawable0 = this.t;
                if(drawable0 != null) {
                    drawable0.setBounds(this.getBounds());
                    DrawableCompat.n(this.t, this.b.c[0]);
                    this.t.draw(canvas0);
                    return;
                }
            }
            canvas0.save();
            this.r.g(canvas0, this.getBounds(), this.k(), this.o(), this.n());
            int v1 = this.b.g;
            int v2 = this.getAlpha();
            if(v1 == 0) {
                this.r.d(canvas0, this.m, 0.0f, 1.0f, this.b.d, v2, 0);
            }
            else {
                a h$a0 = (a)this.s.b.get(0);
                List list0 = this.s.b;
                Object object0 = list0.get(list0.size() - 1);
                h h0 = this.r;
                if(h0 instanceof k) {
                    h0.d(canvas0, this.m, 0.0f, h$a0.a, this.b.d, v2, v1);
                    this.r.d(canvas0, this.m, ((a)object0).b, 1.0f, this.b.d, v2, v1);
                }
                else {
                    v2 = 0;
                    h0.d(canvas0, this.m, ((a)object0).b, h$a0.a + 1.0f, this.b.d, 0, v1);
                }
            }
            for(int v = 0; v < this.s.b.size(); ++v) {
                a h$a1 = (a)this.s.b.get(v);
                h h1 = this.r;
                int v3 = this.getAlpha();
                h1.c(canvas0, this.m, h$a1, v3);
                if(v > 0 && v1 > 0) {
                    a h$a2 = (a)this.s.b.get(v - 1);
                    this.r.d(canvas0, this.m, h$a2.b, h$a1.a, this.b.d, v2, v1);
                }
            }
            canvas0.restore();
        }
    }

    @Override  // com.google.android.material.progressindicator.g
    public void e() {
        super.e();
    }

    @Override  // com.google.android.material.progressindicator.g
    public int getAlpha() {
        return super.getAlpha();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.r.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.r.f();
    }

    @Override  // com.google.android.material.progressindicator.g
    public int getOpacity() {
        return super.getOpacity();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean m() {
        return super.m();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean n() {
        return super.n();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean o() {
        return super.o();
    }

    @Override  // com.google.android.material.progressindicator.g
    public void setAlpha(@IntRange(from = 0L, to = 0xFFL) int v) {
        super.setAlpha(v);
    }

    @Override  // com.google.android.material.progressindicator.g
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        super.setColorFilter(colorFilter0);
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean setVisible(boolean z, boolean z1) {
        return super.setVisible(z, z1);
    }

    @Override  // com.google.android.material.progressindicator.g
    public void start() {
        super.start();
    }

    @Override  // com.google.android.material.progressindicator.g
    public void stop() {
        super.stop();
    }

    @Override  // com.google.android.material.progressindicator.g
    public boolean w(boolean z, boolean z1, boolean z2) {
        return super.w(z, z1, z2);
    }

    @Override  // com.google.android.material.progressindicator.g
    boolean x(boolean z, boolean z1, boolean z2) {
        boolean z3 = super.x(z, z1, z2);
        if(this.F()) {
            Drawable drawable0 = this.t;
            if(drawable0 != null) {
                return drawable0.setVisible(z, z1);
            }
        }
        if(!this.isRunning()) {
            this.s.a();
        }
        if(z && (z2 || Build.VERSION.SDK_INT <= 22 && !this.F())) {
            this.s.i();
        }
        return z3;
    }

    @NonNull
    public static j y(@NonNull Context context0, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        return j.z(context0, circularProgressIndicatorSpec0, new d(circularProgressIndicatorSpec0));
    }

    @NonNull
    static j z(@NonNull Context context0, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0, @NonNull d d0) {
        j j0 = new j(context0, circularProgressIndicatorSpec0, d0, new e(circularProgressIndicatorSpec0));
        j0.I(VectorDrawableCompat.c(context0.getResources(), drawable.indeterminate_static, null));
        return j0;
    }
}

