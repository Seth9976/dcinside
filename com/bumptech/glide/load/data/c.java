package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.bitmap_recycle.b;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends OutputStream {
    @NonNull
    private final OutputStream a;
    private byte[] b;
    private b c;
    private int d;

    public c(@NonNull OutputStream outputStream0, @NonNull b b0) {
        this(outputStream0, b0, 0x10000);
    }

    @VisibleForTesting
    c(@NonNull OutputStream outputStream0, b b0, int v) {
        this.a = outputStream0;
        this.c = b0;
        this.b = (byte[])b0.d(v, byte[].class);
    }

    private void a() throws IOException {
        int v = this.d;
        if(v > 0) {
            this.a.write(this.b, 0, v);
            this.d = 0;
        }
    }

    private void b() throws IOException {
        if(this.d == this.b.length) {
            this.a();
        }
    }

    @Override
    public void close() throws IOException {
        try {
            this.flush();
        }
        finally {
            this.a.close();
        }
        this.release();
    }

    @Override
    public void flush() throws IOException {
        this.a();
        this.a.flush();
    }

    private void release() {
        byte[] arr_b = this.b;
        if(arr_b != null) {
            this.c.put(arr_b);
            this.b = null;
        }
    }

    @Override
    public void write(int v) throws IOException {
        int v1 = this.d;
        this.d = v1 + 1;
        this.b[v1] = (byte)v;
        this.b();
    }

    @Override
    public void write(@NonNull byte[] arr_b) throws IOException {
        this.write(arr_b, 0, arr_b.length);
    }

    @Override
    public void write(@NonNull byte[] arr_b, int v, int v1) throws IOException {
        int v2 = 0;
        do {
            int v3 = v1 - v2;
            int v4 = v + v2;
            int v5 = this.d;
            if(v5 == 0 && v3 >= this.b.length) {
                this.a.write(arr_b, v4, v3);
                return;
            }
            int v6 = Math.min(v3, this.b.length - v5);
            System.arraycopy(arr_b, v4, this.b, this.d, v6);
            this.d += v6;
            v2 += v6;
            this.b();
        }
        while(v2 < v1);
    }
}

