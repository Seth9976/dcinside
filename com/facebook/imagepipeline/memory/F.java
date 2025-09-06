package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;
import o3.h;

@TargetApi(27)
@n(a.a)
public class f implements C, Closeable {
    @h
    private SharedMemory a;
    @h
    private ByteBuffer b;
    private final long c;
    private static final String d = "AshmemMemoryChunk";

    @VisibleForTesting
    public f() {
        this.a = null;
        this.b = null;
        this.c = (long)System.identityHashCode(this);
    }

    public f(int v) {
        com.facebook.common.internal.n.d(Boolean.valueOf(v > 0));
        try {
            SharedMemory sharedMemory0 = SharedMemory.create("AshmemMemoryChunk", v);
            this.a = sharedMemory0;
            this.b = sharedMemory0.mapReadWrite();
            this.c = (long)System.identityHashCode(this);
        }
        catch(ErrnoException errnoException0) {
            throw new RuntimeException("Fail to create AshmemMemory", errnoException0);
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    @h
    public ByteBuffer F() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public byte G(int v) {
        synchronized(this) {
            boolean z = false;
            com.facebook.common.internal.n.o(!this.isClosed());
            com.facebook.common.internal.n.d(Boolean.valueOf(v >= 0));
            if(v < this.getSize()) {
                z = true;
            }
            com.facebook.common.internal.n.d(Boolean.valueOf(z));
            com.facebook.common.internal.n.i(this.b);
            return this.b.get(v);
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
            com.facebook.common.internal.n.i(this.b);
            int v4 = E.a(v, v2, this.getSize());
            int v5 = this.getSize();
            E.b(v, arr_b.length, v1, v4, v5);
            this.b.position(v);
            this.b.put(arr_b, v1, v4);
            return v4;
        }
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public void c(int v, C c0, int v1, int v2) {
        com.facebook.common.internal.n.i(c0);
        if(c0.a() == this.a()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(this.a()) + " to AshmemMemoryChunk " + Long.toHexString(c0.a()) + " which are the same ");
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
            if(!this.isClosed()) {
                SharedMemory sharedMemory0 = this.a;
                if(sharedMemory0 != null) {
                    sharedMemory0.close();
                }
                ByteBuffer byteBuffer0 = this.b;
                if(byteBuffer0 != null) {
                    SharedMemory.unmap(byteBuffer0);
                }
                this.b = null;
                this.a = null;
            }
        }
    }

    private void e(int v, C c0, int v1, int v2) {
        if(!(c0 instanceof f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        com.facebook.common.internal.n.o(!this.isClosed());
        com.facebook.common.internal.n.o(!c0.isClosed());
        com.facebook.common.internal.n.i(this.b);
        com.facebook.common.internal.n.i(c0.F());
        E.b(v, c0.getSize(), v1, v2, this.getSize());
        this.b.position(v);
        c0.F().position(v1);
        byte[] arr_b = new byte[v2];
        this.b.get(arr_b, 0, v2);
        c0.F().put(arr_b, 0, v2);
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int getSize() {
        com.facebook.common.internal.n.i(this.a);
        return this.a.getSize();
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public boolean isClosed() {
        synchronized(this) {
        }
        return this.b == null || this.a == null;
    }

    @Override  // com.facebook.imagepipeline.memory.C
    public int m(int v, byte[] arr_b, int v1, int v2) {
        synchronized(this) {
            com.facebook.common.internal.n.i(arr_b);
            com.facebook.common.internal.n.i(this.b);
            int v4 = E.a(v, v2, this.getSize());
            int v5 = this.getSize();
            E.b(v, arr_b.length, v1, v4, v5);
            this.b.position(v);
            this.b.get(arr_b, v1, v4);
            return v4;
        }
    }
}

