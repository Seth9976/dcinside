package com.canhub.cropper;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import kotlin.jvm.internal.L;
import y4.l;

public final class k extends Animation implements Animation.AnimationListener {
    @l
    private final ImageView a;
    @l
    private final CropOverlayView b;
    @l
    private final float[] c;
    @l
    private final float[] d;
    @l
    private final RectF e;
    @l
    private final RectF f;
    @l
    private final float[] g;
    @l
    private final float[] h;

    public k(@l ImageView imageView0, @l CropOverlayView cropOverlayView0) {
        L.p(imageView0, "imageView");
        L.p(cropOverlayView0, "cropOverlayView");
        super();
        this.a = imageView0;
        this.b = cropOverlayView0;
        this.c = new float[8];
        this.d = new float[8];
        this.e = new RectF();
        this.f = new RectF();
        this.g = new float[9];
        this.h = new float[9];
        this.setDuration(300L);
        this.setFillAfter(true);
        this.setInterpolator(new AccelerateDecelerateInterpolator());
        this.setAnimationListener(this);
    }

    public final void a(@l float[] arr_f, @l Matrix matrix0) {
        L.p(arr_f, "boundPoints");
        L.p(matrix0, "imageMatrix");
        System.arraycopy(arr_f, 0, this.d, 0, 8);
        RectF rectF0 = this.b.getCropWindowRect();
        this.f.set(rectF0);
        matrix0.getValues(this.h);
    }

    @Override  // android.view.animation.Animation
    protected void applyTransformation(float f, @l Transformation transformation0) {
        L.p(transformation0, "t");
        RectF rectF0 = new RectF();
        rectF0.left = this.e.left + (this.f.left - this.e.left) * f;
        rectF0.top = this.e.top + (this.f.top - this.e.top) * f;
        rectF0.right = this.e.right + (this.f.right - this.e.right) * f;
        rectF0.bottom = this.e.bottom + (this.f.bottom - this.e.bottom) * f;
        float[] arr_f = new float[8];
        for(int v1 = 0; v1 < 8; ++v1) {
            float f1 = this.c[v1];
            arr_f[v1] = f1 + (this.d[v1] - f1) * f;
        }
        this.b.setCropWindowRect(rectF0);
        int v2 = this.a.getWidth();
        int v3 = this.a.getHeight();
        this.b.v(arr_f, v2, v3);
        this.b.invalidate();
        float[] arr_f1 = new float[9];
        for(int v = 0; v < 9; ++v) {
            float f2 = this.g[v];
            arr_f1[v] = f2 + (this.h[v] - f2) * f;
        }
        this.a.getImageMatrix().setValues(arr_f1);
        this.a.invalidate();
    }

    public final void b(@l float[] arr_f, @l Matrix matrix0) {
        L.p(arr_f, "boundPoints");
        L.p(matrix0, "imageMatrix");
        this.reset();
        System.arraycopy(arr_f, 0, this.c, 0, 8);
        RectF rectF0 = this.b.getCropWindowRect();
        this.e.set(rectF0);
        matrix0.getValues(this.g);
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationEnd(@l Animation animation0) {
        L.p(animation0, "animation");
        this.a.clearAnimation();
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationRepeat(@l Animation animation0) {
        L.p(animation0, "animation");
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public void onAnimationStart(@l Animation animation0) {
        L.p(animation0, "animation");
    }
}

