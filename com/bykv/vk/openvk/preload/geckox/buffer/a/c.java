package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.buffer.a;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

final class c implements a {
    private long a;
    private long b;
    private RandomAccessFile c;
    private AtomicBoolean d;
    private File e;

    c(long v, File file0) throws IOException {
        this.d = new AtomicBoolean(false);
        this.a = v;
        this.e = file0;
        file0.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
            this.c = randomAccessFile0;
            randomAccessFile0.setLength(v);
        }
        catch(Exception exception0) {
            CloseableUtils.close(this.c);
            throw new IOException("create raf swap failed! path: " + file0.getAbsolutePath() + " caused by: " + exception0.getMessage(), exception0);
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] arr_b, int v, int v1) throws IOException {
        if(this.d.get()) {
            throw new IOException("released!");
        }
        if(arr_b != null && arr_b.length != 0 && v1 > 0 && v >= 0 && v < arr_b.length) {
            if(v + v1 > arr_b.length) {
                v1 = arr_b.length - v;
            }
            __monitor_enter(this);
            try {
                long v2 = this.b;
                long v3 = this.a;
                if(v2 == v3) {
                    __monitor_exit(this);
                    return 0;
                }
                if(((long)v1) + v2 > v3) {
                    v1 = (int)(v3 - v2);
                }
                this.c.write(arr_b, v, v1);
                this.b += (long)v1;
                __monitor_exit(this);
                return v1;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        }
        return 0;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long a(long v) throws IOException {
        synchronized(this) {
            if(!this.d.get()) {
                if(((long)(((int)v))) != v) {
                    throw new IOException("too large:" + v);
                }
                int v2 = this.c.skipBytes(((int)v));
                this.b = this.c.getFilePointer();
                return (long)v2;
            }
        }
        throw new IOException("released!");
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if(this.d.get()) {
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
        if(this.d.get()) {
            throw new IOException("released!");
        }
        if(arr_b != null && v1 > 0 && v >= 0 && v < arr_b.length) {
            if(v + v1 > arr_b.length) {
                v1 = arr_b.length - v;
            }
            __monitor_enter(this);
            try {
                long v2 = this.b;
                long v3 = this.a;
                if(v2 == v3) {
                    __monitor_exit(this);
                    return -1;
                }
                if(((long)v1) + v2 > v3) {
                    v1 = (int)(v3 - v2);
                }
                int v4 = this.c.read(arr_b, v, v1);
                if(v4 == -1) {
                    __monitor_exit(this);
                    return -1;
                }
                this.b += (long)v4;
                __monitor_exit(this);
                return v4;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(this);
            throw throwable0;
        }
        return 0;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.a;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long v) throws IOException {
        if(this.d.get()) {
            throw new IOException("released!");
        }
        if(v >= 0L) {
            long v1 = this.a;
            if(v > v1) {
                v = v1;
            }
        }
        else {
            v = 0L;
        }
        this.b = v;
        this.c.seek(v);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if(this.d.get()) {
            throw new IOException("released!");
        }
        return this.b;
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] arr_b = new byte[1];
        return this.b(arr_b) == 0 ? -1 : arr_b[0];
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if(this.d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.c);
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.e;
    }
}

