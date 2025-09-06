package com.google.common.collect;

import J1.c;
import J1.d;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import o3.a;

@c
@C1
final class y1 extends j3 {
    private final transient j3 h;

    y1(j3 j30) {
        this.h = j30;
    }

    @Override  // com.google.common.collect.j3
    public M4 B3(Object object0, y y0) {
        return this.F0(object0, y0);
    }

    @Override  // com.google.common.collect.j3
    public j3 F0(Object object0, y y0) {
        return this.h.c0(object0, y0).Z();
    }

    @Override  // com.google.common.collect.j3
    public M4 Y0() {
        return this.Z();
    }

    @Override  // com.google.common.collect.j3
    public j3 Z() {
        return this.h;
    }

    @Override  // com.google.common.collect.j3
    public k3 a0() {
        return this.h.a0().Z();
    }

    @Override  // com.google.common.collect.j3
    public j3 c0(Object object0, y y0) {
        return this.h.F0(object0, y0).Z();
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

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a firstEntry() {
        return this.h.lastEntry();
    }

    @Override  // com.google.common.collect.K2
    boolean h() {
        return this.h.h();
    }

    @Override  // com.google.common.collect.j3
    @d
    Object k() {
        return super.k();
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a lastEntry() {
        return this.h.firstEntry();
    }

    @Override  // com.google.common.collect.S3
    public int size() {
        return this.h.size();
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
        return this.h.y3(object0);
    }

    @Override  // com.google.common.collect.W2
    com.google.common.collect.S3.a z(int v) {
        return (com.google.common.collect.S3.a)this.h.y().a().O().get(v);
    }
}

