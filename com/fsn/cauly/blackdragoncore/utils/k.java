package com.fsn.cauly.blackdragoncore.utils;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class k extends Animation {
    protected final float a;
    protected final float b;
    protected final float c;
    protected final float d;
    protected final float e;
    protected final boolean f;
    protected Camera g;

    public k(float f, float f1, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }

    @Override  // android.view.animation.Animation
    protected void applyTransformation(float f, Transformation transformation0) {
        float f1 = this.a + (this.b - this.a) * f;
        float f2 = this.c;
        float f3 = this.d;
        Camera camera0 = this.g;
        camera0.save();
        Matrix matrix0 = transformation0.getMatrix();
        if(this.f) {
            camera0.translate(0.0f, 0.0f, this.e * f);
        }
        else {
            camera0.translate(0.0f, 0.0f, this.e * (1.0f - f));
        }
        camera0.rotateY(f1);
        camera0.getMatrix(matrix0);
        camera0.restore();
        matrix0.preTranslate(-f2, -f3);
        matrix0.postTranslate(f2, f3);
    }

    @Override  // android.view.animation.Animation
    public void initialize(int v, int v1, int v2, int v3) {
        super.initialize(v, v1, v2, v3);
        this.g = new Camera();
    }
}

