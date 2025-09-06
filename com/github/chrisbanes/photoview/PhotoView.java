package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageView;

public class PhotoView extends AppCompatImageView {
    private l a;
    private ImageView.ScaleType b;

    public PhotoView(Context context0) {
        this(context0, null);
    }

    public PhotoView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PhotoView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.e();
    }

    public void a(Matrix matrix0) {
        this.a.D(matrix0);
    }

    public void d(Matrix matrix0) {
        this.a.P(matrix0);
    }

    private void e() {
        this.a = new l(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType imageView$ScaleType0 = this.b;
        if(imageView$ScaleType0 != null) {
            this.setScaleType(imageView$ScaleType0);
            this.b = null;
        }
    }

    public boolean f() {
        return this.a.S();
    }

    public boolean g(Matrix matrix0) {
        return this.a.W(matrix0);
    }

    public l getAttacher() {
        return this.a;
    }

    public RectF getDisplayRect() {
        return this.a.E();
    }

    @Override  // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.a.H();
    }

    public float getMaximumScale() {
        return this.a.K();
    }

    public float getMediumScale() {
        return this.a.L();
    }

    public float getMinimumScale() {
        return this.a.M();
    }

    public float getScale() {
        return this.a.N();
    }

    @Override  // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.a.O();
    }

    public void h(float f, float f1, float f2, boolean z) {
        this.a.o0(f, f1, f2, z);
    }

    public void i(float f, boolean z) {
        this.a.p0(f, z);
    }

    public void j(float f, float f1, float f2) {
        this.a.q0(f, f1, f2);
    }

    public boolean k(Matrix matrix0) {
        return this.a.W(matrix0);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.a.U(z);
    }

    @Override  // android.widget.ImageView
    protected boolean setFrame(int v, int v1, int v2, int v3) {
        boolean z = super.setFrame(v, v1, v2, v3);
        if(z) {
            this.a.v0();
        }
        return z;
    }

    @Override  // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable0) {
        super.setImageDrawable(drawable0);
        l l0 = this.a;
        if(l0 != null) {
            l0.v0();
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int v) {
        super.setImageResource(v);
        l l0 = this.a;
        if(l0 != null) {
            l0.v0();
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatImageView
    public void setImageURI(Uri uri0) {
        super.setImageURI(uri0);
        l l0 = this.a;
        if(l0 != null) {
            l0.v0();
        }
    }

    public void setMaximumScale(float f) {
        this.a.Y(f);
    }

    public void setMediumScale(float f) {
        this.a.Z(f);
    }

    public void setMinimumScale(float f) {
        this.a.a0(f);
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.a.b0(view$OnClickListener0);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener gestureDetector$OnDoubleTapListener0) {
        this.a.c0(gestureDetector$OnDoubleTapListener0);
    }

    @Override  // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.a.d0(view$OnLongClickListener0);
    }

    public void setOnMatrixChangeListener(e e0) {
        this.a.e0(e0);
    }

    public void setOnOutsidePhotoTapListener(f f0) {
        this.a.f0(f0);
    }

    public void setOnPhotoTapListener(g g0) {
        this.a.g0(g0);
    }

    public void setOnScaleChangeListener(h h0) {
        this.a.h0(h0);
    }

    public void setOnSingleFlingListener(i i0) {
        this.a.i0(i0);
    }

    public void setOnViewDragListener(j j0) {
        this.a.j0(j0);
    }

    public void setOnViewTapListener(k k0) {
        this.a.k0(k0);
    }

    public void setRotationBy(float f) {
        this.a.l0(f);
    }

    public void setRotationTo(float f) {
        this.a.m0(f);
    }

    public void setScale(float f) {
        this.a.n0(f);
    }

    @Override  // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType imageView$ScaleType0) {
        l l0 = this.a;
        if(l0 == null) {
            this.b = imageView$ScaleType0;
            return;
        }
        l0.r0(imageView$ScaleType0);
    }

    public void setZoomTransitionDuration(int v) {
        this.a.t0(v);
    }

    public void setZoomable(boolean z) {
        this.a.u0(z);
    }
}

