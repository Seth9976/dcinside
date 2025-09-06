package com.facebook.imagepipeline.memory;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.facebook.common.internal.f;
import java.io.Closeable;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;
import o3.h;

@f
@n(a.a)
public class NativeMemoryChunk implements C, Closeable {
    private final long a;
    private final int b;
    private boolean c;
    private static final String d = "NativeMemoryChunk";

    static {
        o1.a.f("imagepipeline");
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0L;
        this.c = true;
    }

    public NativeMemoryChunk(int v) {
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
        this.b = v;
        this.a = NativeMemoryChunk.nativeAllocate(v);
        this.c = false;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    @h
    public ByteBuffer F() {
        return null;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public byte G(int v) {
        synchronized(this) {
            boolean z = false;
            com.facebook.common.internal.n.o(!this.isClosed());
            com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0));
            if(v < this.b) {
                z = true;
            }
            com.facebook.common.internal.n.d(Boolean.valueOf(z));
            return NativeMemoryChunk.nativeReadByte(this.a + ((long)v));
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public long a() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int b(int v, byte[] arr_b, int v1, int v2) {
        synchronized(this) {
            com.facebook.common.internal.n.i(arr_b);
            com.facebook.common.internal.n.o(!this.isClosed());
            int v4 = E.a(v, v2, this.b);
            E.b(v, arr_b.length, v1, v4, this.b);
            NativeMemoryChunk.nativeCopyFromByteArray(this.a + ((long)v), arr_b, v1, v4);
            return v4;
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public void c(int v, C c0, int v1, int v2) {
        com.facebook.common.internal.n.i(c0);
        if(c0.a() == this.a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(c0)) + " which share the same address " + Long.toHexString(this.a));
            com.facebook.common.internal.n.d(Boolean.FALSE);
        }
        if(c0.a() < this.a()) {
            synchronized(c0) {
                synchronized(this) {
                    this.e(v, c0, v1, v2);
                }
            }
            return;
        }
        synchronized(this) {
            synchronized(c0) {
                this.e(v, c0, v1, v2);
            }
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public void close() {
        synchronized(this) {
            if(!this.c) {
                this.c = true;
                NativeMemoryChunk.nativeFree(this.a);
            }
        }
    }

    private void e(int v, C c0, int v1, int v2) {
        if(!(c0 instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        com.facebook.common.internal.n.o(!this.isClosed());
        com.facebook.common.internal.n.o(!c0.isClosed());
        E.b(v, c0.getSize(), v1, v2, this.b);
        NativeMemoryChunk.nativeMemcpy(c0.getNativePtr() + ((long)v1), this.a + ((long)v), v2);
    }

    @Override
    protected void finalize() throws Throwable {
        if(this.isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            this.close();
        }
        finally {
            super.finalize();
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public long getNativePtr() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int getSize() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int m(int v, byte[] arr_b, int v1, int v2) {
        synchronized(this) {
            com.facebook.common.internal.n.i(arr_b);
            com.facebook.common.internal.n.o(!this.isClosed());
            int v4 = E.a(v, v2, this.b);
            E.b(v, arr_b.length, v1, v4, this.b);
            NativeMemoryChunk.nativeCopyToByteArray(this.a + ((long)v), arr_b, v1, v4);
            return v4;
        }
    }

    @f
    private static native long nativeAllocate(int arg0) {
    }

    @f
    private static native void nativeCopyFromByteArray(long arg0, byte[] arg1, int arg2, int arg3) {
    }

    @f
    private static native void nativeCopyToByteArray(long arg0, byte[] arg1, int arg2, int arg3) {
    }

    @f
    private static native void nativeFree(long arg0) {
    }

    @f
    private static native void nativeMemcpy(long arg0, long arg1, int arg2) {
    }

    @f
    private static native byte nativeReadByte(long arg0) {
    }
}

