package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import com.google.android.material.animation.b;
import com.google.android.material.shape.a;
import com.google.android.material.shape.c;
import com.google.android.material.shape.e;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import com.google.android.material.shape.u;

public class MaskableFrameLayout extends FrameLayout implements m, t {
    private float a;
    private final RectF b;
    @Nullable
    private q c;
    @NonNull
    private p d;
    private final u e;
    @Nullable
    private Boolean f;
    private static final int g = -1;

    public MaskableFrameLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public MaskableFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public MaskableFrameLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = -1.0f;
        this.b = new RectF();
        this.e = u.a(this);
        this.f = null;
        this.setShapeAppearanceModel(p.f(context0, attributeSet0, v, 0, 0).m());
    }

    // 检测为 Lambda 实现
    private void c(Canvas canvas0) [...]

    // 检测为 Lambda 实现
    private static e d(e e0) [...]

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        o o0 = (Canvas canvas0) -> super.dispatchDraw(canvas0);
        this.e.e(canvas0, o0);
    }

    private void e() {
        this.e.f(this, this.b);
        q q0 = this.c;
        if(q0 != null) {
            q0.a(this.b);
        }
    }

    private void f() {
        if(this.a != -1.0f) {
            float f = b.b(0.0f, ((float)this.getWidth()) / 2.0f, 0.0f, 1.0f, this.a);
            this.setMaskRectF(new RectF(f, 0.0f, ((float)this.getWidth()) - f, ((float)this.getHeight())));
        }
    }

    @Override  // android.view.View
    public void getFocusedRect(Rect rect0) {
        rect0.set(((int)this.b.left), ((int)this.b.top), ((int)this.b.right), ((int)this.b.bottom));
    }

    @Override  // com.google.android.material.carousel.m
    @NonNull
    public RectF getMaskRectF() {
        return this.b;
    }

    @Override  // com.google.android.material.carousel.m
    @Deprecated
    public float getMaskXPercentage() {
        return this.a;
    }

    @Override  // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.d;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean boolean0 = this.f;
        if(boolean0 != null) {
            this.e.h(this, boolean0.booleanValue());
        }
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        this.f = Boolean.valueOf(this.e.c());
        this.e.h(this, true);
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        if(this.a != -1.0f) {
            this.f();
        }
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.b.isEmpty() && motionEvent0.getAction() == 0) {
            float f = motionEvent0.getX();
            float f1 = motionEvent0.getY();
            return this.b.contains(f, f1) ? super.onTouchEvent(motionEvent0) : false;
        }
        return super.onTouchEvent(motionEvent0);
    }

    @RestrictTo({Scope.b})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        this.e.h(this, z);
    }

    @Override  // com.google.android.material.carousel.m
    public void setMaskRectF(@NonNull RectF rectF0) {
        this.b.set(rectF0);
        this.e();
    }

    @Override  // com.google.android.material.carousel.m
    @Deprecated
    public void setMaskXPercentage(float f) {
        float f1 = MathUtils.d(f, 0.0f, 1.0f);
        if(this.a != f1) {
            this.a = f1;
            this.f();
        }
    }

    @Override  // com.google.android.material.carousel.m
    public void setOnMaskChangedListener(@Nullable q q0) {
        this.c = q0;
    }

    @Override  // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p p0) {
        p p1 = p0.y((e e0) -> (e0 instanceof a ? c.b(((a)e0)) : e0));
        this.d = p1;
        this.e.g(this, p1);
    }
}

