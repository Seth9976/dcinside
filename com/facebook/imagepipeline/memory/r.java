package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class r implements C, Closeable {
    @h
    private ByteBuffer a;
    private final int b;
    private final long c;
    private static final String d = "BufferMemoryChunk";

    public r(int v) {
        this.a = ByteBuffer.allocateDirect(v);
        this.b = v;
        this.c = (long)System.identityHashCode(this);
    }

    @Override  // com.facebook.imagepipeline.memory.C
    @h
    public ByteBuffer F() {
        synchronized(this) {
        }
        return this.a;
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
            com.facebook.common.internal.n.i(this.a);
            return this.a.get(v);
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public long a() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int b(int v, byte[] arr_b, int v1, int v2) {
        synchronized(this) {
            com.facebook.common.internal.n.i(arr_b);
            com.facebook.common.internal.n.o(!this.isClosed());
            com.facebook.common.internal.n.i(this.a);
            int v4 = E.a(v, v2, this.b);
            E.b(v, arr_b.length, v1, v4, this.b);
            this.a.position(v);
            this.a.put(arr_b, v1, v4);
            return v4;
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public void c(int v, C c0, int v1, int v2) {
        com.facebook.common.internal.n.i(c0);
        if(c0.a() == this.a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(this.a()) + " to BufferMemoryChunk " + Long.toHexString(c0.a()) + " which are the same ");
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
            this.a = null;
        }
    }

    private void e(int v, C c0, int v1, int v2) {
        if(!(c0 instanceof r)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        com.facebook.common.internal.n.o(!this.isClosed());
        com.facebook.common.internal.n.o(!c0.isClosed());
        com.facebook.common.internal.n.i(this.a);
        E.b(v, c0.getSize(), v1, v2, this.b);
        this.a.position(v);
        ByteBuffer byteBuffer0 = (ByteBuffer)com.facebook.common.internal.n.i(c0.F());
        byteBuffer0.position(v1);
        byte[] arr_b = new byte[v2];
        this.a.get(arr_b, 0, v2);
        byteBuffer0.put(arr_b, 0, v2);
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int getSize() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.a == null;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int m(int v, byte[] arr_b, int v1, int v2) {
        synchronized(this) {
            com.facebook.common.internal.n.i(arr_b);
            com.facebook.common.internal.n.o(!this.isClosed());
            com.facebook.common.internal.n.i(this.a);
            int v4 = E.a(v, v2, this.b);
            E.b(v, arr_b.length, v1, v4, this.b);
            this.a.position(v);
            this.a.get(arr_b, v1, v4);
            return v4;
        }
    }
}

