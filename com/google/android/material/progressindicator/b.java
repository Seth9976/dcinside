package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.internal.D;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public abstract class b extends ProgressBar {
    class a implements Runnable {
        final b a;

        @Override
        public void run() {
            b.this.l();
        }
    }

    class com.google.android.material.progressindicator.b.b implements Runnable {
        final b a;

        @Override
        public void run() {
            b.this.k();
            b.this.g = -1L;
        }
    }

    class c extends AnimationCallback {
        final b b;

        @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
        public void b(Drawable drawable0) {
            b.this.setIndeterminate(false);
            int v = b.this.b;
            boolean z = b.this.c;
            b.this.p(v, z);
        }
    }

    class d extends AnimationCallback {
        final b b;

        @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback
        public void b(Drawable drawable0) {
            super.b(drawable0);
            if(!b.this.i) {
                b.this.setVisibility(b.this.j);
            }
        }
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @RestrictTo({Scope.b})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    com.google.android.material.progressindicator.c a;
    private int b;
    private boolean c;
    private boolean d;
    private final int e;
    private final int f;
    private long g;
    com.google.android.material.progressindicator.a h;
    private boolean i;
    private int j;
    private final Runnable k;
    private final Runnable l;
    private final AnimationCallback m;
    private final AnimationCallback n;
    public static final int o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    static final int v = 0;
    static final float w = 0.2f;
    static final int x = 0xFF;
    static final int y = 1000;

    static {
        b.v = style.Widget_MaterialComponents_ProgressIndicator;
    }

    protected b(@NonNull Context context0, @Nullable AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        super(I1.a.c(context0, attributeSet0, v, b.v), attributeSet0, v);
        this.g = -1L;
        this.i = false;
        this.j = 4;
        this.k = () -> {
            if(b.this.f > 0) {
                b.this.g = SystemClock.uptimeMillis();
            }
            b.this.setVisibility(0);
        };
        this.l = new com.google.android.material.progressindicator.b.b(this);
        this.m = new c(this);
        this.n = new d(this);
        Context context1 = this.getContext();
        this.a = this.i(context1, attributeSet0);
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.BaseProgressIndicator, v, v1, new int[0]);
        this.e = typedArray0.getInt(styleable.BaseProgressIndicator_showDelay, -1);
        this.f = Math.min(typedArray0.getInt(styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        typedArray0.recycle();
        this.h = new com.google.android.material.progressindicator.a();
        this.d = true;
    }

    @Override  // android.widget.ProgressBar
    @Nullable
    public Drawable getCurrentDrawable() {
        return this.isIndeterminate() ? this.getIndeterminateDrawable() : this.getProgressDrawable();
    }

    @Nullable
    private h getCurrentDrawingDelegate() {
        if(this.isIndeterminate()) {
            return this.getIndeterminateDrawable() == null ? null : this.getIndeterminateDrawable().D();
        }
        return this.getProgressDrawable() == null ? null : this.getProgressDrawable().F();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    @Override  // android.widget.ProgressBar
    @Nullable
    public Drawable getIndeterminateDrawable() {
        return this.getIndeterminateDrawable();
    }

    @Nullable
    public j getIndeterminateDrawable() {
        return (j)super.getIndeterminateDrawable();
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.a.c;
    }

    @Px
    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    @Override  // android.widget.ProgressBar
    @Nullable
    public Drawable getProgressDrawable() {
        return this.getProgressDrawable();
    }

    @Nullable
    public com.google.android.material.progressindicator.f getProgressDrawable() {
        return (com.google.android.material.progressindicator.f)super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    @ColorInt
    public int getTrackColor() {
        return this.a.d;
    }

    @Px
    public int getTrackCornerRadius() {
        return this.a.b;
    }

    @Px
    public int getTrackThickness() {
        return this.a.a;
    }

    protected void h(boolean z) {
        if(!this.d) {
            return;
        }
        ((g)this.getCurrentDrawable()).w(this.s(), false, z);
    }

    abstract com.google.android.material.progressindicator.c i(@NonNull Context arg1, @NonNull AttributeSet arg2);

    @Override  // android.view.View
    public void invalidate() {
        super.invalidate();
        if(this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if(this.getVisibility() != 0) {
            this.removeCallbacks(this.k);
            return;
        }
        this.removeCallbacks(this.l);
        long v = SystemClock.uptimeMillis() - this.g;
        int v1 = this.f;
        if(v >= ((long)v1)) {
            this.l.run();
            return;
        }
        this.postDelayed(this.l, ((long)v1) - v);
    }

    private void k() {
        ((g)this.getCurrentDrawable()).w(false, false, true);
        if(this.n()) {
            this.setVisibility(4);
        }
    }

    // 检测为 Lambda 实现
    private void l() [...]

    boolean m() {
        for(View view0 = this; true; view0 = (View)viewParent0) {
            if(view0.getVisibility() != 0) {
                return false;
            }
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 == null) {
                return this.getWindowVisibility() == 0;
            }
            if(!(viewParent0 instanceof View)) {
                return true;
            }
        }
    }

    // 去混淆评级： 低(30)
    private boolean n() {
        return (this.getProgressDrawable() == null || !this.getProgressDrawable().isVisible()) && (this.getIndeterminateDrawable() == null || !this.getIndeterminateDrawable().isVisible());
    }

    private void o() {
        if(this.getProgressDrawable() != null && this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().C().d(this.m);
        }
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().d(this.n);
        }
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().d(this.n);
        }
    }

    @Override  // android.widget.ProgressBar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o();
        if(this.s()) {
            this.l();
        }
    }

    @Override  // android.widget.ProgressBar
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.l);
        this.removeCallbacks(this.k);
        ((g)this.getCurrentDrawable()).m();
        this.r();
        super.onDetachedFromWindow();
    }

    @Override  // android.widget.ProgressBar
    protected void onDraw(@NonNull Canvas canvas0) {
        synchronized(this) {
            int v1 = canvas0.save();
            if(this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
                canvas0.translate(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()));
            }
            if(this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                canvas0.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
            }
            this.getCurrentDrawable().draw(canvas0);
            canvas0.restoreToCount(v1);
        }
    }

    @Override  // android.widget.ProgressBar
    protected void onMeasure(int v, int v1) {
        synchronized(this) {
            h h0 = this.getCurrentDrawingDelegate();
            if(h0 == null) {
                return;
            }
            this.setMeasuredDimension((h0.f() >= 0 ? h0.f() + this.getPaddingLeft() + this.getPaddingRight() : View.getDefaultSize(this.getSuggestedMinimumWidth(), v)), (h0.e() >= 0 ? h0.e() + this.getPaddingTop() + this.getPaddingBottom() : View.getDefaultSize(this.getSuggestedMinimumHeight(), v1)));
        }
    }

    @Override  // android.view.View
    protected void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        this.h(v == 0);
    }

    @Override  // android.view.View
    protected void onWindowVisibilityChanged(int v) {
        super.onWindowVisibilityChanged(v);
        this.h(false);
    }

    public void p(int v, boolean z) {
        if(!this.isIndeterminate()) {
            super.setProgress(v);
            if(this.getProgressDrawable() != null && !z) {
                this.getProgressDrawable().jumpToCurrentState();
            }
        }
        else if(this.getProgressDrawable() != null) {
            this.b = v;
            this.c = z;
            this.i = true;
            if(this.getIndeterminateDrawable().isVisible() && this.h.a(this.getContext().getContentResolver()) != 0.0f) {
                this.getIndeterminateDrawable().C().f();
                return;
            }
            j j0 = this.getIndeterminateDrawable();
            this.m.b(j0);
        }
    }

    public void q() {
        if(this.e > 0) {
            this.removeCallbacks(this.k);
            this.postDelayed(this.k, ((long)this.e));
            return;
        }
        this.k.run();
    }

    private void r() {
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().b(this.n);
            this.getIndeterminateDrawable().C().j();
        }
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().b(this.n);
        }
    }

    // 去混淆评级： 低(20)
    boolean s() {
        return ViewCompat.T0(this) && this.getWindowVisibility() == 0 && this.m();
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public void setAnimatorDurationScaleProvider(@NonNull com.google.android.material.progressindicator.a a0) {
        this.h = a0;
        if(this.getProgressDrawable() != null) {
            this.getProgressDrawable().c = a0;
        }
        if(this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().c = a0;
        }
    }

    public void setHideAnimationBehavior(int v) {
        this.a.f = v;
        this.invalidate();
    }

    @Override  // android.widget.ProgressBar
    public void setIndeterminate(boolean z) {
        synchronized(this) {
            if(z == this.isIndeterminate()) {
                return;
            }
            g g0 = (g)this.getCurrentDrawable();
            if(g0 != null) {
                g0.m();
            }
            super.setIndeterminate(z);
            g g1 = (g)this.getCurrentDrawable();
            if(g1 != null) {
                g1.w(this.s(), false, false);
            }
            if(g1 instanceof j && this.s()) {
                ((j)g1).C().i();
            }
            this.i = false;
        }
    }

    @Override  // android.widget.ProgressBar
    public void setIndeterminateDrawable(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            super.setIndeterminateDrawable(null);
            return;
        }
        if(!(drawable0 instanceof j)) {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
        ((g)drawable0).m();
        super.setIndeterminateDrawable(drawable0);
    }

    public void setIndicatorColor(@ColorInt int[] arr_v) {
        if(arr_v.length == 0) {
            arr_v = new int[]{v.b(this.getContext(), attr.colorPrimary, -1)};
        }
        if(!Arrays.equals(this.getIndicatorColor(), arr_v)) {
            this.a.c = arr_v;
            this.getIndeterminateDrawable().C().c();
            this.invalidate();
        }
    }

    public void setIndicatorTrackGapSize(@Px int v) {
        com.google.android.material.progressindicator.c c0 = this.a;
        if(c0.g != v) {
            c0.g = v;
            c0.e();
            this.invalidate();
        }
    }

    @Override  // android.widget.ProgressBar
    public void setProgress(int v) {
        synchronized(this) {
            if(this.isIndeterminate()) {
                return;
            }
            this.p(v, false);
        }
    }

    @Override  // android.widget.ProgressBar
    public void setProgressDrawable(@Nullable Drawable drawable0) {
        if(drawable0 == null) {
            super.setProgressDrawable(null);
            return;
        }
        if(!(drawable0 instanceof com.google.android.material.progressindicator.f)) {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
        ((com.google.android.material.progressindicator.f)drawable0).m();
        super.setProgressDrawable(((com.google.android.material.progressindicator.f)drawable0));
        ((com.google.android.material.progressindicator.f)drawable0).K(((float)this.getProgress()) / ((float)this.getMax()));
    }

    public void setShowAnimationBehavior(int v) {
        this.a.e = v;
        this.invalidate();
    }

    public void setTrackColor(@ColorInt int v) {
        com.google.android.material.progressindicator.c c0 = this.a;
        if(c0.d != v) {
            c0.d = v;
            this.invalidate();
        }
    }

    public void setTrackCornerRadius(@Px int v) {
        com.google.android.material.progressindicator.c c0 = this.a;
        if(c0.b != v) {
            c0.b = Math.min(v, c0.a / 2);
            this.invalidate();
        }
    }

    public void setTrackThickness(@Px int v) {
        com.google.android.material.progressindicator.c c0 = this.a;
        if(c0.a != v) {
            c0.a = v;
            this.requestLayout();
        }
    }

    public void setVisibilityAfterHide(int v) {
        if(v != 0 && v != 4 && v != 8) {
            throw new IllegalArgumentException("The component\'s visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.j = v;
    }
}

