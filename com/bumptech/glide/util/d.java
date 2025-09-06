package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

@Deprecated
public class d extends InputStream {
    private InputStream a;
    private IOException b;
    private static final Queue c;

    static {
        d.c = o.g(0);
    }

    static void a() {
        while(true) {
            Queue queue0 = d.c;
            if(queue0.isEmpty()) {
                break;
            }
            queue0.remove();
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
    public static d c(@NonNull InputStream inputStream0) {
        d d0;
        synchronized(d.c) {
            d0 = (d)d.c.poll();
        }
        if(d0 == null) {
            d0 = new d();
        }
        d0.e(inputStream0);
        return d0;
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
    public int read() {
        try {
            return this.a.read();
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return -1;
        }
    }

    @Override
    public int read(byte[] arr_b) {
        try {
            return this.a.read(arr_b);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return -1;
        }
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) {
        try {
            return this.a.read(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return -1;
        }
    }

    public void release() {
        this.b = null;
        this.a = null;
        synchronized(d.c) {
            d.c.offer(this);
        }
    }

    @Override
    public void reset() throws IOException {
        synchronized(this) {
            this.a.reset();
        }
    }

    @Override
    public long skip(long v) {
        try {
            return this.a.skip(v);
        }
        catch(IOException iOException0) {
            this.b = iOException0;
            return 0L;
        }
    }
}

