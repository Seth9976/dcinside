package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public interface i extends Closeable {
    public static class com.facebook.common.memory.i.a extends RuntimeException {
        public com.facebook.common.memory.i.a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    @h
    ByteBuffer F();

    byte G(int arg1);

    @Override
    void close();

    long getNativePtr();

    boolean isClosed();

    int m(int arg1, byte[] arg2, int arg3, int arg4);

    int size();
}

