package com.waynejo.androidndkgif;

import android.graphics.Bitmap;

public class GifDecoder {
    private int a;
    private int b;
    private Bitmap[] c;
    private int[] d;
    private int e;
    private boolean f;

    static {
        System.loadLibrary("androidndkgif");
    }

    public GifDecoder() {
        this.a = 0;
        this.b = 0;
        this.c = new Bitmap[0];
        this.d = new int[0];
        this.f = false;
    }

    public int e(int v) {
        return this.e == 0 ? 0 : this.d[v % this.e];
    }

    public Bitmap f(int v) {
        return this.e == 0 ? null : this.c[v % this.e];
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.b;
    }

    public boolean i(String s) {
        long v = this.nativeInit();
        if(!this.nativeLoad(v, s)) {
            this.nativeClose(v);
            return false;
        }
        this.a = this.nativeGetWidth(v);
        this.b = this.nativeGetHeight(v);
        int v2 = this.nativeGetFrameCount(v);
        this.e = v2;
        this.c = new Bitmap[v2];
        this.d = new int[v2];
        for(int v1 = 0; v1 < this.e; ++v1) {
            Bitmap[] arr_bitmap = this.c;
            arr_bitmap[v1] = this.nativeGetFrame(v, v1);
            int[] arr_v = this.d;
            arr_v[v1] = this.nativeGetDelay(v, v1);
        }
        this.nativeClose(v);
        return true;
    }

    public b j(String s) {
        class a extends b {
            boolean a;
            final long b;
            final long c;
            final GifDecoder d;

            a(long v, long v1) {
                this.b = v;
                this.c = v1;
                super();
                this.a = false;
            }

            @Override  // com.waynejo.androidndkgif.b
            public void a() {
                if(!this.a) {
                    GifDecoder.this.nativeClose(this.c);
                    GifDecoder.this.f = false;
                    this.a = true;
                }
            }

            @Override  // com.waynejo.androidndkgif.b
            public GifImage b() {
                return GifDecoder.this.nativeBitmapIteratornext(this.c, this.b);
            }

            @Override  // com.waynejo.androidndkgif.b
            public boolean hasNext() {
                return GifDecoder.this.nativeBitmapIteratorHasNext(this.b);
            }

            @Override  // com.waynejo.androidndkgif.b
            public Object next() {
                return this.b();
            }
        }

        if(this.f) {
            return null;
        }
        long v = this.nativeInit();
        long v1 = this.nativeLoadUsingIterator(v, s);
        if(0L == v1) {
            this.nativeClose(v);
            return null;
        }
        this.a = this.nativeGetWidth(v);
        this.b = this.nativeGetHeight(v);
        this.f = true;
        return new a(this, v1, v);
    }

    public int k() {
        return this.a;
    }

    private native boolean nativeBitmapIteratorHasNext(long arg1) {
    }

    private native GifImage nativeBitmapIteratornext(long arg1, long arg2) {
    }

    private native void nativeClose(long arg1) {
    }

    private native int nativeGetDelay(long arg1, int arg2) {
    }

    private native Bitmap nativeGetFrame(long arg1, int arg2) {
    }

    private native int nativeGetFrameCount(long arg1) {
    }

    private native int nativeGetHeight(long arg1) {
    }

    private native int nativeGetWidth(long arg1) {
    }

    private native long nativeInit() {
    }

    private native boolean nativeLoad(long arg1, String arg2) {
    }

    private native long nativeLoadUsingIterator(long arg1, String arg2) {
    }
}

