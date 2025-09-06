package com.facebook.animated.gif;

import android.graphics.Bitmap.Config;
import com.facebook.common.internal.f;
import com.facebook.imagepipeline.animated.base.b;
import com.facebook.imagepipeline.animated.base.e;
import com.facebook.imagepipeline.animated.factory.c;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;
import o3.h;
import p3.d;

@f
@n(a.a)
@d
public class GifImage implements e, c {
    @h
    private Bitmap.Config b;
    private static final int c = 0;
    private static final int d = -1;
    private static volatile boolean e;
    @f
    private long mNativeContext;

    @f
    public GifImage() {
        this.b = null;
    }

    @f
    GifImage(long v) {
        this.b = null;
        this.mNativeContext = v;
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int a() {
        int v = this.nativeGetLoopCount();
        switch(v) {
            case -1: {
                return 1;
            }
            case 0: {
                return 0;
            }
            default: {
                return v + 1;
            }
        }
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int b() {
        return this.nativeGetFrameCount();
    }

    @Override  // com.facebook.imagepipeline.animated.factory.c
    public e c(ByteBuffer byteBuffer0, com.facebook.imagepipeline.common.d d0) {
        return GifImage.l(byteBuffer0, d0);
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public boolean d() {
        return false;
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public void dispose() {
        this.nativeDispose();
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public b e(int v) {
        GifFrame gifFrame0 = this.q(v);
        try {
            int v2 = gifFrame0.getXOffset();
            int v3 = gifFrame0.getYOffset();
            int v4 = gifFrame0.getWidth();
            int v5 = gifFrame0.getHeight();
            com.facebook.imagepipeline.animated.base.b.b b$b0 = GifImage.p(gifFrame0.b());
            return new b(v, v2, v3, v4, v5, com.facebook.imagepipeline.animated.base.b.a.a, b$b0);
        }
        finally {
            gifFrame0.dispose();
        }
    }

    @Override  // com.facebook.imagepipeline.animated.factory.c
    public e f(long v, int v1, com.facebook.imagepipeline.common.d d0) {
        return GifImage.n(v, v1, d0);
    }

    @Override
    protected void finalize() {
        this.nativeFinalize();
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public com.facebook.imagepipeline.animated.base.f g(int v) {
        return this.q(v);
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int getDuration() {
        return this.nativeGetDuration();
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int getHeight() {
        return this.nativeGetHeight();
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int getWidth() {
        return this.nativeGetWidth();
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    @h
    public Bitmap.Config h() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int[] i() {
        return this.nativeGetFrameDurations();
    }

    public static GifImage j(byte[] arr_b) {
        com.facebook.common.internal.n.i(arr_b);
        ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(arr_b.length);
        byteBuffer0.put(arr_b);
        byteBuffer0.rewind();
        return GifImage.l(byteBuffer0, com.facebook.imagepipeline.common.d.a());
    }

    public static GifImage k(ByteBuffer byteBuffer0) {
        return GifImage.l(byteBuffer0, com.facebook.imagepipeline.common.d.a());
    }

    public static GifImage l(ByteBuffer byteBuffer0, com.facebook.imagepipeline.common.d d0) {
        GifImage.o();
        byteBuffer0.rewind();
        GifImage gifImage0 = GifImage.nativeCreateFromDirectByteBuffer(byteBuffer0, d0.b, d0.g);
        gifImage0.b = d0.i;
        return gifImage0;
    }

    public static GifImage m(int v, com.facebook.imagepipeline.common.d d0) {
        GifImage.o();
        return GifImage.nativeCreateFromFileDescriptor(v, d0.b, d0.g);
    }

    public static GifImage n(long v, int v1, com.facebook.imagepipeline.common.d d0) {
        GifImage.o();
        com.facebook.common.internal.n.d(Boolean.valueOf(v != 0L));
        GifImage gifImage0 = GifImage.nativeCreateFromNativeMemory(v, v1, d0.b, d0.g);
        gifImage0.b = d0.i;
        return gifImage0;
    }

    @f
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer arg0, int arg1, boolean arg2) {
    }

    @f
    private static native GifImage nativeCreateFromFileDescriptor(int arg0, int arg1, boolean arg2) {
    }

    @f
    private static native GifImage nativeCreateFromNativeMemory(long arg0, int arg1, int arg2, boolean arg3) {
    }

    @f
    private native void nativeDispose() {
    }

    @f
    private native void nativeFinalize() {
    }

    @f
    private native int nativeGetDuration() {
    }

    @f
    private native GifFrame nativeGetFrame(int arg1) {
    }

    @f
    private native int nativeGetFrameCount() {
    }

    @f
    private native int[] nativeGetFrameDurations() {
    }

    @f
    private native int nativeGetHeight() {
    }

    @f
    private native int nativeGetLoopCount() {
    }

    @f
    private native int nativeGetSizeInBytes() {
    }

    @f
    private native int nativeGetWidth() {
    }

    @f
    private native boolean nativeIsAnimated() {
    }

    private static void o() {
        synchronized(GifImage.class) {
            if(!GifImage.e) {
                GifImage.e = true;
                o1.a.f("gifimage");
            }
        }
    }

    private static com.facebook.imagepipeline.animated.base.b.b p(int v) {
        if(v == 0) {
            return com.facebook.imagepipeline.animated.base.b.b.a;
        }
        switch(v) {
            case 1: {
                return com.facebook.imagepipeline.animated.base.b.b.a;
            }
            case 2: {
                return com.facebook.imagepipeline.animated.base.b.b.b;
            }
            case 3: {
                return com.facebook.imagepipeline.animated.base.b.b.c;
            }
            default: {
                return com.facebook.imagepipeline.animated.base.b.b.a;
            }
        }
    }

    public GifFrame q(int v) {
        return this.nativeGetFrame(v);
    }

    public boolean r() {
        return this.nativeIsAnimated();
    }

    @Override  // com.facebook.imagepipeline.animated.base.e
    public int z() {
        return this.nativeGetSizeInBytes();
    }
}

