package com.google.common.collect;

import J1.c;
import j..util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import o3.a;

@c
@C1
class i1 extends f1 {
    @a
    private transient int[] h;
    @a
    private transient int[] i;
    private transient int j;
    private transient int k;
    private static final int l = -2;

    i1() {
    }

    i1(int v) {
        super(v);
    }

    @Override  // com.google.common.collect.f1
    void A(int v, int v1) {
        int v2 = this.size();
        super.A(v, v1);
        this.X(this.T(v), this.q(v));
        if(v < v2 - 1) {
            this.X(this.T(v2 - 1), v);
            this.X(v, this.q(v2 - 1));
        }
        this.U()[v2 - 1] = 0;
        this.V()[v2 - 1] = 0;
    }

    @Override  // com.google.common.collect.f1
    void G(int v) {
        super.G(v);
        this.h = Arrays.copyOf(this.U(), v);
        this.i = Arrays.copyOf(this.V(), v);
    }

    public static i1 P() {
        return new i1();
    }

    public static i1 Q(Collection collection0) {
        i1 i10 = i1.S(collection0.size());
        i10.addAll(collection0);
        return i10;
    }

    @SafeVarargs
    public static i1 R(Object[] arr_object) {
        i1 i10 = i1.S(arr_object.length);
        Collections.addAll(i10, arr_object);
        return i10;
    }

    public static i1 S(int v) {
        return new i1(v);
    }

    private int T(int v) {
        return this.U()[v] - 1;
    }

    private int[] U() {
        int[] arr_v = this.h;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    private int[] V() {
        int[] arr_v = this.i;
        Objects.requireNonNull(arr_v);
        return arr_v;
    }

    private void W(int v, int v1) {
        this.U()[v] = v1 + 1;
    }

    private void X(int v, int v1) {
        if(v == -2) {
            this.j = v1;
        }
        else {
            this.Y(v, v1);
        }
        if(v1 == -2) {
            this.k = v;
            return;
        }
        this.W(v1, v);
    }

    private void Y(int v, int v1) {
        this.V()[v] = v1 + 1;
    }

    @Override  // com.google.common.collect.f1
    int c(int v, int v1) {
        return v < this.size() ? v : v1;
    }

    @Override  // com.google.common.collect.f1
    public void clear() {
        if(this.B()) {
            return;
        }
        this.j = -2;
        this.k = -2;
        int[] arr_v = this.h;
        if(arr_v != null && this.i != null) {
            Arrays.fill(arr_v, 0, this.size(), 0);
            Arrays.fill(this.i, 0, this.size(), 0);
        }
        super.clear();
    }

    @Override  // com.google.common.collect.f1
    int d() {
        int v = super.d();
        this.h = new int[v];
        this.i = new int[v];
        return v;
    }

    @Override  // com.google.common.collect.f1
    @O1.a
    Set g() {
        Set set0 = super.g();
        this.h = null;
        this.i = null;
        return set0;
    }

    @Override  // com.google.common.collect.f1
    int p() {
        return this.j;
    }

    @Override  // com.google.common.collect.f1
    int q(int v) {
        return this.V()[v] - 1;
    }

    @Override  // com.google.common.collect.f1
    public Object[] toArray() {
        return Z3.l(this);
    }

    @Override  // com.google.common.collect.f1
    public Object[] toArray(Object[] arr_object) {
        return Z3.m(this, arr_object);
    }

    @Override  // com.google.common.collect.f1
    void x(int v) {
        super.x(v);
        this.j = -2;
        this.k = -2;
    }

    @Override  // com.google.common.collect.f1
    void y(int v, @d4 Object object0, int v1, int v2) {
        super.y(v, object0, v1, v2);
        this.X(this.k, v);
        this.X(v, -2);
    }
}

