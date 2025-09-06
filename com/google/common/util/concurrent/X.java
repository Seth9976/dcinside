package com.google.common.util.concurrent;

import O1.a;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@N
public class x extends Number implements Serializable {
    private transient AtomicLong a;
    private static final long b;

    public x() {
        this(0.0);
    }

    public x(double f) {
        this.a = new AtomicLong(Double.doubleToRawLongBits(f));
    }

    @a
    public final double a(double f) {
        double f1;
        do {
            long v = this.a.get();
            f1 = Double.longBitsToDouble(v) + f;
        }
        while(!this.a.compareAndSet(v, Double.doubleToRawLongBits(f1)));
        return f1;
    }

    public final boolean b(double f, double f1) {
        return this.a.compareAndSet(Double.doubleToRawLongBits(f), Double.doubleToRawLongBits(f1));
    }

    public final double c() {
        return Double.longBitsToDouble(this.a.get());
    }

    @a
    public final double d(double f) {
        double f1;
        do {
            long v = this.a.get();
            f1 = Double.longBitsToDouble(v);
        }
        while(!this.a.compareAndSet(v, Double.doubleToRawLongBits(f1 + f)));
        return f1;
    }

    @Override
    public double doubleValue() {
        return this.c();
    }

    public final double e(double f) {
        return Double.longBitsToDouble(this.a.getAndSet(Double.doubleToRawLongBits(f)));
    }

    public final void f(double f) {
        this.a.lazySet(Double.doubleToRawLongBits(f));
    }

    @Override
    public float floatValue() {
        return (float)this.c();
    }

    private void g(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        this.a = new AtomicLong();
        this.h(objectInputStream0.readDouble());
    }

    public final void h(double f) {
        this.a.set(Double.doubleToRawLongBits(f));
    }

    public final boolean i(double f, double f1) {
        return this.a.weakCompareAndSet(Double.doubleToRawLongBits(f), Double.doubleToRawLongBits(f1));
    }

    @Override
    public int intValue() {
        return (int)this.c();
    }

    private void j(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeDouble(this.c());
    }

    @Override
    public long longValue() {
        return (long)this.c();
    }

    @Override
    public String toString() {
        return Double.toString(this.c());
    }
}

