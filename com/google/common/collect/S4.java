package com.google.common.collect;

import J1.c;
import J1.d;
import J1.e;
import com.google.common.base.H;
import com.google.common.primitives.l;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import o3.a;

@c
@C1
final class s4 extends j3 {
    @e
    final transient t4 h;
    private final transient long[] i;
    private final transient int j;
    private final transient int k;
    private static final long[] l;
    static final j3 m;

    static {
        s4.l = new long[]{0L};
        s4.m = new s4(c4.K());
    }

    s4(t4 t40, long[] arr_v, int v, int v1) {
        this.h = t40;
        this.i = arr_v;
        this.j = v;
        this.k = v1;
    }

    s4(Comparator comparator0) {
        this.h = k3.a0(comparator0);
        this.i = s4.l;
        this.j = 0;
        this.k = 0;
    }

    @Override  // com.google.common.collect.j3
    public M4 B3(Object object0, y y0) {
        return this.F0(object0, y0);
    }

    @Override  // com.google.common.collect.j3
    public j3 F0(Object object0, y y0) {
        return H.E(y0) == y.c ? this.J0(this.h.K0(object0, true), this.k) : this.J0(this.h.K0(object0, false), this.k);
    }

    private int I0(int v) {
        return (int)(this.i[this.j + v + 1] - this.i[this.j + v]);
    }

    j3 J0(int v, int v1) {
        H.f0(v, v1, this.k);
        if(v == v1) {
            return j3.b0(this.comparator());
        }
        return v != 0 || v1 != this.k ? new s4(this.h.I0(v, v1), this.i, this.j + v, v1 - v) : this;
    }

    @Override  // com.google.common.collect.j3
    public k3 a0() {
        return this.h;
    }

    @Override  // com.google.common.collect.j3
    public j3 c0(Object object0, y y0) {
        return H.E(y0) == y.c ? this.J0(0, this.h.J0(object0, true)) : this.J0(0, this.h.J0(object0, false));
    }

    @Override  // com.google.common.collect.j3
    public NavigableSet f() {
        return this.a0();
    }

    @Override  // com.google.common.collect.j3
    public Set f() {
        return this.a0();
    }

    @Override  // com.google.common.collect.j3
    public SortedSet f() {
        return this.a0();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a firstEntry() {
        return this.isEmpty() ? null : this.z(0);
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return this.j > 0 || this.k < this.i.length - 1;
    }

    @Override  // com.google.common.collect.j3
    @d
    Object k() {
        return super.k();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a lastEntry() {
        return this.isEmpty() ? null : this.z(this.k - 1);
    }

    @Override  // com.google.common.collect.S3
    public int size() {
        return l.z(this.i[this.k + this.j] - this.i[this.j]);
    }

    @Override  // com.google.common.collect.j3
    public M4 t1(Object object0, y y0) {
        return this.c0(object0, y0);
    }

    @Override  // com.google.common.collect.j3
    public a3 x() {
        return this.a0();
    }

    @Override  // com.google.common.collect.S3
    public int y3(@a Object object0) {
        int v = this.h.indexOf(object0);
        return v < 0 ? 0 : this.I0(v);
    }

    @Override  // com.google.common.collect.W2
    com.google.common.collect.S3.a z(int v) {
        return T3.k(this.h.a().get(v), this.I0(v));
    }
}

