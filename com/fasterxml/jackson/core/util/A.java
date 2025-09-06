package com.fasterxml.jackson.core.util;

import j..util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class a implements g {
    protected final AtomicReferenceArray a;
    protected final AtomicReferenceArray b;
    private u c;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    private static final int[] l;
    private static final int[] m;

    static {
        a.l = new int[]{8000, 8000, 2000, 2000};
        a.m = new int[]{4000, 4000, 200, 200};
    }

    public a() {
        this(4, 4);
    }

    protected a(int v, int v1) {
        this.a = new AtomicReferenceArray(v);
        this.b = new AtomicReferenceArray(v1);
    }

    @Override  // com.fasterxml.jackson.core.util.u$g
    public void a() {
        u u0 = this.c;
        if(u0 != null) {
            this.c = null;
            u0.S3(this);
        }
    }

    @Override  // com.fasterxml.jackson.core.util.u$g
    public g b(u u0) {
        return this.m(u0);
    }

    public final byte[] c(int v) [...] // 潜在的解密器

    public byte[] d(int v, int v1) {
        int v2 = this.h(v);
        if(v1 < v2) {
            v1 = v2;
        }
        byte[] arr_b = (byte[])this.a.getAndSet(v, null);
        return arr_b != null && arr_b.length >= v1 ? arr_b : this.g(v1);
    }

    public final char[] e(int v) {
        return this.f(v, 0);
    }

    public char[] f(int v, int v1) {
        int v2 = this.j(v);
        if(v1 < v2) {
            v1 = v2;
        }
        char[] arr_c = (char[])this.b.getAndSet(v, null);
        return arr_c != null && arr_c.length >= v1 ? arr_c : this.i(v1);
    }

    protected byte[] g(int v) {
        return new byte[v];
    }

    protected int h(int v) {
        return a.l[v];
    }

    protected char[] i(int v) {
        return new char[v];
    }

    protected int j(int v) {
        return a.m[v];
    }

    public void k(int v, byte[] arr_b) {
        this.a.set(v, arr_b);
    }

    public void l(int v, char[] arr_c) {
        this.b.set(v, arr_c);
    }

    public a m(u u0) {
        if(this.c != null) {
            throw new IllegalStateException("BufferRecycler already linked to pool: " + u0);
        }
        Objects.requireNonNull(u0);
        this.c = u0;
        return this;
    }
}

