package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import com.facebook.common.memory.e;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@TargetApi(21)
@n(a.a)
@d
public class q extends g implements k {
    public q(e e0, O o0, P p0, boolean z) {
        super(e0, o0, p0, z);
        this.E();
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected int A(int v) {
        return v;
    }

    @Override  // com.facebook.imagepipeline.memory.g
    @h
    protected Object C(com.facebook.imagepipeline.memory.n n0) {
        return this.S(n0);
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected boolean G(Object object0) {
        return this.T(((Bitmap)object0));
    }

    protected Bitmap P(int v) {
        return Bitmap.createBitmap(1, ((int)Math.ceil(((double)v) / 2.0)), Bitmap.Config.RGB_565);
    }

    protected void Q(Bitmap bitmap0) {
        com.facebook.common.internal.n.i(bitmap0);
        bitmap0.recycle();
    }

    protected int R(Bitmap bitmap0) {
        com.facebook.common.internal.n.i(bitmap0);
        return bitmap0.getAllocationByteCount();
    }

    @h
    protected Bitmap S(com.facebook.imagepipeline.memory.n n0) {
        Bitmap bitmap0 = (Bitmap)super.C(n0);
        if(bitmap0 != null) {
            bitmap0.eraseColor(0);
        }
        return bitmap0;
    }

    protected boolean T(Bitmap bitmap0) {
        com.facebook.common.internal.n.i(bitmap0);
        return !bitmap0.isRecycled() && bitmap0.isMutable();
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected Object g(int v) {
        return this.P(v);
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected void u(Object object0) {
        this.Q(((Bitmap)object0));
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected int x(int v) {
        return v;
    }

    @Override  // com.facebook.imagepipeline.memory.g
    protected int y(Object object0) {
        return this.R(((Bitmap)object0));
    }
}

