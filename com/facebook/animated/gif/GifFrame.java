package com.facebook.animated.gif;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.animated.base.f;
import k1.n.a;
import k1.n;
import p3.d;

@n(a.a)
@d
public class GifFrame implements f {
    @com.facebook.common.internal.f
    private long mNativeContext;

    @com.facebook.common.internal.f
    GifFrame(long v) {
        this.mNativeContext = v;
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public void a(int v, int v1, Bitmap bitmap0) {
        this.nativeRenderFrame(v, v1, bitmap0);
    }

    public int b() {
        return this.nativeGetDisposalMode();
    }

    public int c() {
        return this.nativeGetTransparentPixelColor();
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public int d() {
        return this.nativeGetDurationMs();
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public void dispose() {
        this.nativeDispose();
    }

    public boolean e() {
        return this.nativeHasTransparency();
    }

    @Override
    protected void finalize() {
        this.nativeFinalize();
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public int getHeight() {
        return this.nativeGetHeight();
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public int getWidth() {
        return this.nativeGetWidth();
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public int getXOffset() {
        return this.nativeGetXOffset();
    }

    @Override  // com.facebook.imagepipeline.animated.base.f
    public int getYOffset() {
        return this.nativeGetYOffset();
    }

    @com.facebook.common.internal.f
    private native void nativeDispose() {
    }

    @com.facebook.common.internal.f
    private native void nativeFinalize() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetDisposalMode() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetDurationMs() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetHeight() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetTransparentPixelColor() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetWidth() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetXOffset() {
    }

    @com.facebook.common.internal.f
    private native int nativeGetYOffset() {
    }

    @com.facebook.common.internal.f
    private native boolean nativeHasTransparency() {
    }

    @com.facebook.common.internal.f
    private native void nativeRenderFrame(int arg1, int arg2, Bitmap arg3) {
    }
}

