package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.j;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

public final class b extends OutputStream {
    private final OutputStream a;
    private final Timer b;
    j c;
    long d;

    public b(OutputStream outputStream0, j j0, Timer timer0) {
        this.d = -1L;
        this.a = outputStream0;
        this.c = j0;
        this.b = timer0;
    }

    @Override
    public void close() throws IOException {
        long v = this.d;
        if(v != -1L) {
            this.c.x(v);
        }
        this.c.B(this.b.d());
        try {
            this.a.close();
        }
        catch(IOException iOException0) {
            this.c.C(this.b.d());
            com.google.firebase.perf.network.j.d(this.c);
            throw iOException0;
        }
    }

    @Override
    public void flush() throws IOException {
        try {
            this.a.flush();
        }
        catch(IOException iOException0) {
            this.c.C(this.b.d());
            com.google.firebase.perf.network.j.d(this.c);
            throw iOException0;
        }
    }

    @Override
    public void write(int v) throws IOException {
        try {
            this.a.write(v);
            long v1 = this.d + 1L;
            this.d = v1;
            this.c.x(v1);
        }
        catch(IOException iOException0) {
            this.c.C(this.b.d());
            com.google.firebase.perf.network.j.d(this.c);
            throw iOException0;
        }
    }

    @Override
    public void write(byte[] arr_b) throws IOException {
        try {
            this.a.write(arr_b);
            long v = this.d + ((long)arr_b.length);
            this.d = v;
            this.c.x(v);
        }
        catch(IOException iOException0) {
            this.c.C(this.b.d());
            com.google.firebase.perf.network.j.d(this.c);
            throw iOException0;
        }
    }

    @Override
    public void write(byte[] arr_b, int v, int v1) throws IOException {
        try {
            this.a.write(arr_b, v, v1);
            long v2 = this.d + ((long)v1);
            this.d = v2;
            this.c.x(v2);
        }
        catch(IOException iOException0) {
            this.c.C(this.b.d());
            com.google.firebase.perf.network.j.d(this.c);
            throw iOException0;
        }
    }
}

