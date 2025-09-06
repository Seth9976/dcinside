package com.google.common.cache;

import J1.c;
import com.google.common.base.H;
import com.google.common.collect.Q2;
import java.util.concurrent.ExecutionException;

@c
@i
public abstract class k extends j implements l {
    public static abstract class a extends k {
        private final l a;

        protected a(l l0) {
            this.a = (l)H.E(l0);
        }

        @Override  // com.google.common.cache.k
        protected Object K() {
            return this.N();
        }

        @Override  // com.google.common.cache.k
        protected com.google.common.cache.c M() {
            return this.N();
        }

        @Override  // com.google.common.cache.k
        protected final l N() {
            return this.a;
        }
    }

    @Override  // com.google.common.cache.l
    @O1.a
    public Object D(Object object0) {
        return this.N().D(object0);
    }

    @Override  // com.google.common.cache.l
    @O1.a
    public Q2 F(Iterable iterable0) throws ExecutionException {
        return this.N().F(iterable0);
    }

    @Override  // com.google.common.cache.l
    public void I(Object object0) {
        this.N().I(object0);
    }

    @Override  // com.google.common.cache.j
    protected Object K() {
        return this.N();
    }

    @Override  // com.google.common.cache.j
    protected com.google.common.cache.c M() {
        return this.N();
    }

    protected abstract l N();

    @Override  // com.google.common.cache.l
    public Object apply(Object object0) {
        return this.N().apply(object0);
    }

    @Override  // com.google.common.cache.l
    @O1.a
    public Object get(Object object0) throws ExecutionException {
        return this.N().get(object0);
    }
}

