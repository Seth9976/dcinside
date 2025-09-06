package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

final class b extends OutputStream {
    private long a;

    b() {
        this.a = 0L;
    }

    long a() {
        return this.a;
    }

    @Override
    public void write(int v) {
        ++this.a;
    }

    @Override
    public void write(byte[] arr_b) {
        this.a += (long)arr_b.length;
    }

    @Override
    public void write(@NonNull byte[] arr_b, int v, int v1) {
        if(v < 0 || v > arr_b.length || v1 < 0 || (v + v1 > arr_b.length || v + v1 < 0)) {
            throw new IndexOutOfBoundsException();
        }
        this.a += (long)v1;
    }
}

