package com.google.common.cache;

import J1.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@b(emulated = true)
@i
final class r extends A implements p, Serializable {
    private static final long j = 0x6499DE12A37D0A3DL;

    @Override  // com.google.common.cache.p
    public void a(long v) {
        com.google.common.cache.A.b[] arr_a$b = this.a;
        if(arr_a$b != null || !this.d(this.b, this.b + v)) {
            int[] arr_v = (int[])A.d.get();
            if(arr_v == null || arr_a$b == null || arr_a$b.length < 1) {
                this.i(v, arr_v, true);
            }
            else {
                com.google.common.cache.A.b a$b0 = arr_a$b[arr_a$b.length - 1 & arr_v[0]];
                if(a$b0 == null) {
                    this.i(v, arr_v, true);
                }
                else if(!a$b0.a(a$b0.h, a$b0.h + v)) {
                    this.i(v, arr_v, false);
                }
            }
        }
    }

    @Override  // com.google.common.cache.p
    public void b() {
        this.a(1L);
    }

    @Override
    public double doubleValue() {
        return (double)this.sum();
    }

    @Override  // com.google.common.cache.A
    final long f(long v, long v1) {
        return v + v1;
    }

    @Override
    public float floatValue() {
        return (float)this.sum();
    }

    @Override
    public int intValue() {
        return (int)this.sum();
    }

    public void j() {
        this.a(-1L);
    }

    private void k(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        this.c = 0;
        this.a = null;
        this.b = objectInputStream0.readLong();
    }

    public void l() {
        this.h(0L);
    }

    @Override
    public long longValue() {
        return this.sum();
    }

    public long m() {
        long v = this.b;
        com.google.common.cache.A.b[] arr_a$b = this.a;
        this.b = 0L;
        if(arr_a$b != null) {
            for(int v1 = 0; v1 < arr_a$b.length; ++v1) {
                com.google.common.cache.A.b a$b0 = arr_a$b[v1];
                if(a$b0 != null) {
                    v += a$b0.h;
                    a$b0.h = 0L;
                }
            }
        }
        return v;
    }

    private void n(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeLong(this.sum());
    }

    @Override  // com.google.common.cache.p
    public long sum() {
        long v = this.b;
        com.google.common.cache.A.b[] arr_a$b = this.a;
        if(arr_a$b != null) {
            for(int v1 = 0; v1 < arr_a$b.length; ++v1) {
                com.google.common.cache.A.b a$b0 = arr_a$b[v1];
                if(a$b0 != null) {
                    v += a$b0.h;
                }
            }
        }
        return v;
    }

    @Override
    public String toString() {
        return Long.toString(this.sum());
    }
}

