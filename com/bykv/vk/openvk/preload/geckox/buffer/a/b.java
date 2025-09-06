package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.buffer.a;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

final class b implements a {
    private RandomAccessFile a;
    private AtomicBoolean b;
    private File c;

    b(File file0) throws IOException {
        this.b = new AtomicBoolean(false);
        this.c = file0;
        file0.getParentFile().mkdirs();
        try {
            this.a = new RandomAccessFile(file0, "rw");
        }
        catch(Exception exception0) {
            CloseableUtils.close(this.a);
            throw new IOException("create raf mSwap failed! path: " + file0.getAbsolutePath() + " caused by: " + exception0.getMessage(), exception0);
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] arr_b, int v, int v1) throws IOException {
        if(this.b.get()) {
            throw new IOException("released!");
        }
        if(arr_b != null && arr_b.length != 0 && v1 > 0 && v >= 0 && v < arr_b.length) {
            if(v + v1 > arr_b.length) {
                v1 = arr_b.length - v;
            }
            synchronized(this) {
                this.a.write(arr_b, v, v1);
                return v1;
            }
        }
        return 0;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long a(long v) throws IOException {
        synchronized(this) {
            if(!this.b.get()) {
                if(((long)(((int)v))) != v) {
                    throw new IOException("too large:" + v);
                }
                return this.a.skipBytes(((int)v));
            }
        }
        throw new IOException("released!");
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if(this.b.get()) {
            throw new IOException("released!");
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int v) throws IOException {
        this.a(new byte[]{((byte)v)});
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] arr_b) throws IOException {
        this.a(arr_b, 0, arr_b.length);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] arr_b) throws IOException {
        return this.b(arr_b, 0, arr_b.length);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] arr_b, int v, int v1) throws IOException {
        if(this.b.get()) {
            throw new IOException("released!");
        }
        if(arr_b != null && v1 > 0 && v >= 0 && v < arr_b.length) {
            if(v + v1 > arr_b.length) {
                v1 = arr_b.length - v;
            }
            synchronized(this) {
                return this.a.read(arr_b, v, v1);
            }
        }
        return 0;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.a.length();
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long v) throws IOException {
        if(this.b.get()) {
            throw new IOException("released!");
        }
        if(v < 0L) {
            v = 0L;
        }
        this.a.seek(v);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if(this.b.get()) {
            throw new IOException("released!");
        }
        return this.a.getFilePointer();
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] arr_b = new byte[1];
        return this.b(arr_b) <= 0 ? -1 : arr_b[0];
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if(this.b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.a);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.c;
    }
}

