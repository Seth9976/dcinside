package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

public final class a extends InputStream {
    private com.bykv.vk.openvk.preload.geckox.buffer.a a;
    private long b;

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a a0) {
        this.a = a0;
    }

    @Override
    public final int available() throws IOException {
        long v = this.a.b() - this.a.c();
        return v <= 0x7FFFFFFFL ? ((int)v) : 0x7FFFFFFF;
    }

    @Override
    public final void close() throws IOException {
    }

    @Override
    public final void mark(int v) {
        synchronized(this) {
            this.b = (long)v;
        }
    }

    @Override
    public final boolean markSupported() {
        return true;
    }

    @Override
    public final int read() throws IOException {
        return this.a.d();
    }

    @Override
    public final int read(byte[] arr_b) throws IOException {
        return this.a.b(arr_b);
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        return this.a.b(arr_b, v, v1);
    }

    @Override
    public final void reset() throws IOException {
        synchronized(this) {
            this.a.b(this.b);
        }
    }

    @Override
    public final long skip(long v) throws IOException {
        return this.a.a(v);
    }
}

