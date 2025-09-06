package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import O1.a;
import com.google.common.primitives.k;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@c
@d
@N
public class y implements Serializable {
    private transient AtomicLongArray a;
    private static final long b;

    public y(int v) {
        this.a = new AtomicLongArray(v);
    }

    public y(double[] arr_f) {
        long[] arr_v = new long[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_v[v] = Double.doubleToRawLongBits(arr_f[v]);
        }
        this.a = new AtomicLongArray(arr_v);
    }

    @a
    public double a(int v, double f) {
        double f1;
        do {
            long v1 = this.a.get(v);
            f1 = Double.longBitsToDouble(v1) + f;
        }
        while(!this.a.compareAndSet(v, v1, Double.doubleToRawLongBits(f1)));
        return f1;
    }

    public final boolean b(int v, double f, double f1) {
        return this.a.compareAndSet(v, Double.doubleToRawLongBits(f), Double.doubleToRawLongBits(f1));
    }

    public final double c(int v) {
        return Double.longBitsToDouble(this.a.get(v));
    }

    @a
    public final double d(int v, double f) {
        double f1;
        do {
            long v1 = this.a.get(v);
            f1 = Double.longBitsToDouble(v1);
        }
        while(!this.a.compareAndSet(v, v1, Double.doubleToRawLongBits(f1 + f)));
        return f1;
    }

    public final double e(int v, double f) {
        return Double.longBitsToDouble(this.a.getAndSet(v, Double.doubleToRawLongBits(f)));
    }

    public final void f(int v, double f) {
        this.a.lazySet(v, Double.doubleToRawLongBits(f));
    }

    public final int g() {
        return this.a.length();
    }

    private void h(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        int v = objectInputStream0.readInt();
        com.google.common.primitives.k.c k$c0 = k.e();
        for(int v1 = 0; v1 < v; ++v1) {
            k$c0.a(Double.doubleToRawLongBits(objectInputStream0.readDouble()));
        }
        this.a = new AtomicLongArray(k$c0.f().C());
    }

    public final void i(int v, double f) {
        this.a.set(v, Double.doubleToRawLongBits(f));
    }

    public final boolean j(int v, double f, double f1) {
        return this.a.weakCompareAndSet(v, Double.doubleToRawLongBits(f), Double.doubleToRawLongBits(f1));
    }

    private void k(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        int v = this.g();
        objectOutputStream0.writeInt(v);
        for(int v1 = 0; v1 < v; ++v1) {
            objectOutputStream0.writeDouble(this.c(v1));
        }
    }

    @Override
    public String toString() {
        int v = this.g();
        if(v - 1 == -1) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder(v * 19);
        stringBuilder0.append('[');
        for(int v1 = 0; true; ++v1) {
            stringBuilder0.append(Double.longBitsToDouble(this.a.get(v1)));
            if(v1 == v - 1) {
                break;
            }
            stringBuilder0.append(',');
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

