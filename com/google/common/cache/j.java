package com.google.common.cache;

import J1.c;
import com.google.common.base.H;
import com.google.common.collect.Q2;
import com.google.common.collect.p2;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@c
@i
public abstract class j extends p2 implements com.google.common.cache.c {
    public static abstract class a extends j {
        private final com.google.common.cache.c a;

        protected a(com.google.common.cache.c c0) {
            this.a = (com.google.common.cache.c)H.E(c0);
        }

        @Override  // com.google.common.cache.j
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.cache.j
        protected final com.google.common.cache.c M() {
            return this.a;
        }
    }

    @Override  // com.google.common.cache.c
    public void A() {
        this.M().A();
    }

    @Override  // com.google.common.cache.c
    public Q2 B(Iterable iterable0) {
        return this.M().B(iterable0);
    }

    @Override  // com.google.common.cache.c
    public h C() {
        return this.M().C();
    }

    @Override  // com.google.common.cache.c
    public void H(Object object0) {
        this.M().H(object0);
    }

    @Override  // com.google.common.collect.p2
    protected Object K() {
        return this.M();
    }

    protected abstract com.google.common.cache.c M();

    @Override  // com.google.common.cache.c
    public ConcurrentMap c() {
        return this.M().c();
    }

    @Override  // com.google.common.cache.c
    public void j() {
        this.M().j();
    }

    @Override  // com.google.common.cache.c
    public Object l(Object object0, Callable callable0) throws ExecutionException {
        return this.M().l(object0, callable0);
    }

    @Override  // com.google.common.cache.c
    public void put(Object object0, Object object1) {
        this.M().put(object0, object1);
    }

    @Override  // com.google.common.cache.c
    public void putAll(Map map0) {
        this.M().putAll(map0);
    }

    @Override  // com.google.common.cache.c
    public long size() {
        return this.M().size();
    }

    @Override  // com.google.common.cache.c
    @o3.a
    public Object u(Object object0) {
        return this.M().u(object0);
    }

    @Override  // com.google.common.cache.c
    public void y(Iterable iterable0) {
        this.M().y(iterable0);
    }
}

