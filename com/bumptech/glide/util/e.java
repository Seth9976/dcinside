package com.bumptech.glide.util;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class e extends InputStream {
    private InputStream a;
    private IOException b;
    @GuardedBy("POOL")
    private static final Queue c;

    static {
        e.c = o.g(0);
    }

    static void a() {
        synchronized(e.c) {
            while(true) {
                Queue queue1 = e.c;
                if(queue1.isEmpty()) {
                    break;
                }
                queue1.remove();
            }
        }
    }

    @Override
    public int available() throws IOException {
        return this.a.available();
    }

    @Nullable
    public IOException b() {
        return this.b;
    }

    @NonNull
    public static e c(@NonNull InputStream inputStream0) {
        e e0;
        synchronized(e.c) {
            e0 = (e)e.c.poll();
        }
        if(e0 == null) {
            e0 = new e();
        }
        e0.e(inputStream0);
        return e0;
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    void e(@NonNull InputStream inputStream0) {
        this.a = inputStream0;
    }

    @Override
    public void mark(int v) {
        this.a.mark(v);
    }

    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override
    public int read() throws IOException {
        try {
            return this.a.read();
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        try {
            return this.a.read(arr_b);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        try {
            return this.a.read(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }

    public void release() {
        this.b = null;
        this.a = null;
        synchronized(e.c) {
            e.c.offer(this);
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            this.a.reset();
        }
    }

    @Override
    public long skip(long v) throws IOException {
        try {
            return this.a.skip(v);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            throw iOException0;
        }
    }
}

