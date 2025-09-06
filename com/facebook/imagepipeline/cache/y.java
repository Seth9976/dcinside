package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.o;
import com.facebook.common.memory.c;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class y implements B {
    private final B a;
    private final D b;

    public y(B b0, D d0) {
        this.a = b0;
        this.b = d0;
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public void b(Object object0) {
        this.a.b(object0);
    }

    @Override  // com.facebook.imagepipeline.cache.B
    @h
    public com.facebook.common.references.a c(Object object0, com.facebook.common.references.a a0) {
        this.b.c(object0);
        return this.a.c(object0, a0);
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public boolean contains(Object object0) {
        return this.a.contains(object0);
    }

    @Override  // com.facebook.cache.common.h
    @h
    public String g() {
        return this.a.g();
    }

    @Override  // com.facebook.imagepipeline.cache.B
    @h
    public com.facebook.common.references.a get(Object object0) {
        com.facebook.common.references.a a0 = this.a.get(object0);
        if(a0 == null) {
            this.b.b(object0);
            return null;
        }
        this.b.a(object0);
        return a0;
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public int getCount() {
        return this.a.getCount();
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public int i(o o0) {
        return this.a.i(o0);
    }

    @Override  // com.facebook.imagepipeline.cache.B
    @h
    public Object n(Object object0) {
        return this.a.n(object0);
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public boolean p(o o0) {
        return this.a.p(o0);
    }

    @Override  // com.facebook.common.memory.d
    public void q(c c0) {
        this.a.q(c0);
    }

    @Override  // com.facebook.imagepipeline.cache.B
    public int z() {
        return this.a.z();
    }
}

