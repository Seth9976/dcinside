package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

public final class a extends InputStream {
    private final InputStream a;
    private final j b;
    private final Timer c;
    private long d;
    private long e;
    private long f;

    public a(InputStream inputStream0, j j0, Timer timer0) {
        this.d = -1L;
        this.f = -1L;
        this.c = timer0;
        this.a = inputStream0;
        this.b = j0;
        this.e = j0.g();
    }

    @Override
    public int available() throws IOException {
        try {
            return this.a.available();
        }
        catch(IOException iOException0) {
            long v = this.c.d();
            this.b.C(v);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    @Override
    public void close() throws IOException {
        long v = this.c.d();
        if(this.f == -1L) {
            this.f = v;
        }
        try {
            this.a.close();
            long v1 = this.d;
            if(v1 != -1L) {
                this.b.A(v1);
            }
            long v2 = this.e;
            if(v2 != -1L) {
                this.b.D(v2);
            }
            this.b.C(this.f);
            this.b.c();
            return;
        }
        catch(IOException iOException0) {
        }
        long v3 = this.c.d();
        this.b.C(v3);
        com.google.firebase.perf.network.j.d(this.b);
        throw iOException0;
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
            int v = this.a.read();
            long v1 = this.c.d();
            if(this.e == -1L) {
                this.e = v1;
            }
            if(v == -1 && this.f == -1L) {
                this.f = v1;
                this.b.C(v1);
                this.b.c();
                return v;
            }
            long v2 = this.d + 1L;
            this.d = v2;
            this.b.A(v2);
            return v;
        }
        catch(IOException iOException0) {
        }
        long v3 = this.c.d();
        this.b.C(v3);
        com.google.firebase.perf.network.j.d(this.b);
        throw iOException0;
    }

    @Override
    public int read(byte[] arr_b) throws IOException {
        try {
            int v = this.a.read(arr_b);
            long v1 = this.c.d();
            if(this.e == -1L) {
                this.e = v1;
            }
            if(v == -1 && this.f == -1L) {
                this.f = v1;
                this.b.C(v1);
                this.b.c();
                return v;
            }
            long v2 = this.d + ((long)v);
            this.d = v2;
            this.b.A(v2);
            return v;
        }
        catch(IOException iOException0) {
        }
        long v3 = this.c.d();
        this.b.C(v3);
        com.google.firebase.perf.network.j.d(this.b);
        throw iOException0;
    }

    @Override
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        try {
            int v2 = this.a.read(arr_b, v, v1);
            long v3 = this.c.d();
            if(this.e == -1L) {
                this.e = v3;
            }
            if(v2 == -1 && this.f == -1L) {
                this.f = v3;
                this.b.C(v3);
                this.b.c();
                return v2;
            }
            long v4 = this.d + ((long)v2);
            this.d = v4;
            this.b.A(v4);
            return v2;
        }
        catch(IOException iOException0) {
        }
        long v5 = this.c.d();
        this.b.C(v5);
        com.google.firebase.perf.network.j.d(this.b);
        throw iOException0;
    }

    @Override
    public void reset() throws IOException {
        try {
            this.a.reset();
        }
        catch(IOException iOException0) {
            long v = this.c.d();
            this.b.C(v);
            com.google.firebase.perf.network.j.d(this.b);
            throw iOException0;
        }
    }

    @Override
    public long skip(long v) throws IOException {
        try {
            long v1 = this.a.skip(v);
            long v2 = this.c.d();
            if(this.e == -1L) {
                this.e = v2;
            }
            if(v1 == -1L && this.f == -1L) {
                this.f = v2;
                this.b.C(v2);
                return v1;
            }
            long v3 = this.d + v1;
            this.d = v3;
            this.b.A(v3);
            return v1;
        }
        catch(IOException iOException0) {
        }
        long v4 = this.c.d();
        this.b.C(v4);
        com.google.firebase.perf.network.j.d(this.b);
        throw iOException0;
    }
}

