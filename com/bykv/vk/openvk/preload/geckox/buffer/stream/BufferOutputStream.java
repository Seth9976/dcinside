package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import com.bykv.vk.openvk.preload.geckox.buffer.a;
import java.io.IOException;

public class BufferOutputStream extends b {
    private a mBuffer;

    public BufferOutputStream(a a0) {
        this.mBuffer = a0;
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public void flush() throws IOException {
    }

    @Override
    public void write(int v) throws IOException {
        this.mBuffer.a(v);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long v, int v1) throws IOException {
        synchronized(this) {
            this.mBuffer.b(v);
            this.mBuffer.a(v1);
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long v, byte[] arr_b) throws IOException {
        synchronized(this) {
            this.mBuffer.b(v);
            this.mBuffer.a(arr_b);
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.stream.b
    public void write(long v, byte[] arr_b, int v1, int v2) throws IOException {
        synchronized(this) {
            this.mBuffer.b(v);
            this.mBuffer.a(arr_b, v1, v2);
        }
    }

    @Override
    public void write(byte[] arr_b) throws IOException {
        this.mBuffer.a(arr_b);
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        this.mBuffer.a(arr_b, v, v1);
    }
}

