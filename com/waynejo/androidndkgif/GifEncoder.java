package com.waynejo.androidndkgif;

import android.graphics.Bitmap;
import java.io.FileNotFoundException;
import java.util.Locale;

public class GifEncoder {
    public static enum a {
        ENCODING_TYPE_SIMPLE_FAST,
        ENCODING_TYPE_FAST,
        ENCODING_TYPE_NORMAL_LOW_MEMORY,
        ENCODING_TYPE_STABLE_HIGH_MEMORY;

    }

    private long a;
    private int b;
    private int c;
    private int d;

    static {
        System.loadLibrary("androidndkgif");
    }

    public GifEncoder() {
        this.a = 0L;
        this.b = 1;
    }

    public void a() {
        this.nativeClose(this.a);
        this.a = 0L;
    }

    public boolean b(Bitmap bitmap0, int v) {
        if(0L == this.a) {
            return false;
        }
        if(bitmap0.getWidth() != this.c || bitmap0.getHeight() != this.d) {
            throw new RuntimeException(String.format(Locale.ENGLISH, "The size specified at initialization differs from the size of the image.\n expected:(%d, %d) actual:(%d,%d)", this.c, this.d, bitmap0.getWidth(), bitmap0.getHeight()));
        }
        this.nativeEncodeFrame(this.a, bitmap0, v);
        return true;
    }

    public void c(int v, int v1, String s) throws FileNotFoundException {
        this.d(v, v1, s, a.c);
    }

    public void d(int v, int v1, String s, a gifEncoder$a0) throws FileNotFoundException {
        if(0L != this.a) {
            this.a();
        }
        this.c = v;
        this.d = v1;
        long v2 = this.nativeInit(v, v1, s, gifEncoder$a0.ordinal(), this.b);
        this.a = v2;
        if(0L == v2) {
            throw new FileNotFoundException();
        }
    }

    public void e(boolean z) {
        long v = this.a;
        if(0L == v) {
            return;
        }
        this.nativeSetDither(v, z);
    }

    public void f(int v) {
        this.b = v;
        long v1 = this.a;
        if(0L == v1) {
            return;
        }
        this.nativeSetThreadCount(v1, v);
    }

    private native void nativeClose(long arg1) {
    }

    private native boolean nativeEncodeFrame(long arg1, Bitmap arg2, int arg3) {
    }

    private native long nativeInit(int arg1, int arg2, String arg3, int arg4, int arg5) {
    }

    private native void nativeSetDither(long arg1, boolean arg2) {
    }

    private native void nativeSetThreadCount(long arg1, int arg2) {
    }
}

