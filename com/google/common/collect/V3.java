package com.google.common.collect;

import J1.b;
import java.util.Set;
import o3.a;

@b(emulated = true, serializable = true)
@C1
public final class v3 extends f {
    v3(int v) {
        super(v);
    }

    @Override  // com.google.common.collect.i
    public boolean contains(@a Object object0) {
        return super.contains(object0);
    }

    @Override  // com.google.common.collect.i
    public Set entrySet() {
        return super.entrySet();
    }

    @Override  // com.google.common.collect.i
    public Set f() {
        return super.f();
    }

    @Override  // com.google.common.collect.f
    a4 i(int v) {
        return new b4(v);
    }

    @Override  // com.google.common.collect.i
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public static v3 l() {
        return v3.m(3);
    }

    public static v3 m(int v) {
        return new v3(v);
    }

    public static v3 n(Iterable iterable0) {
        v3 v30 = v3.m(T3.l(iterable0));
        p3.a(v30, iterable0);
        return v30;
    }
}

