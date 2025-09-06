package com.google.common.cache;

import J1.b;
import com.google.common.collect.D3;
import com.google.common.collect.Q2;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

@b
@i
public abstract class a implements c {
    public static final class com.google.common.cache.a.a implements com.google.common.cache.a.b {
        private final p a;
        private final p b;
        private final p c;
        private final p d;
        private final p e;
        private final p f;

        public com.google.common.cache.a.a() {
            this.a = q.a();
            this.b = q.a();
            this.c = q.a();
            this.d = q.a();
            this.e = q.a();
            this.f = q.a();
        }

        @Override  // com.google.common.cache.a$b
        public void a(int v) {
            this.a.a(((long)v));
        }

        @Override  // com.google.common.cache.a$b
        public void b() {
            this.f.b();
        }

        @Override  // com.google.common.cache.a$b
        public void c(long v) {
            this.c.b();
            this.e.a(v);
        }

        @Override  // com.google.common.cache.a$b
        public void d(int v) {
            this.b.a(((long)v));
        }

        @Override  // com.google.common.cache.a$b
        public void e(long v) {
            this.d.b();
            this.e.a(v);
        }

        @Override  // com.google.common.cache.a$b
        public h f() {
            return new h(com.google.common.cache.a.a.h(this.a.sum()), com.google.common.cache.a.a.h(this.b.sum()), com.google.common.cache.a.a.h(this.c.sum()), com.google.common.cache.a.a.h(this.d.sum()), com.google.common.cache.a.a.h(this.e.sum()), com.google.common.cache.a.a.h(this.f.sum()));
        }

        public void g(com.google.common.cache.a.b a$b0) {
            h h0 = a$b0.f();
            this.a.a(h0.c());
            this.b.a(h0.j());
            this.c.a(h0.h());
            this.d.a(h0.f());
            this.e.a(h0.n());
            this.f.a(h0.b());
        }

        private static long h(long v) {
            return v >= 0L ? v : 0x7FFFFFFFFFFFFFFFL;
        }
    }

    public interface com.google.common.cache.a.b {
        void a(int arg1);

        void b();

        void c(long arg1);

        void d(int arg1);

        void e(long arg1);

        h f();
    }

    @Override  // com.google.common.cache.c
    public void A() {
    }

    @Override  // com.google.common.cache.c
    public Q2 B(Iterable iterable0) {
        LinkedHashMap linkedHashMap0 = D3.c0();
        for(Object object0: iterable0) {
            if(!linkedHashMap0.containsKey(object0)) {
                Object object1 = this.u(object0);
                if(object1 != null) {
                    linkedHashMap0.put(object0, object1);
                }
            }
        }
        return Q2.g(linkedHashMap0);
    }

    @Override  // com.google.common.cache.c
    public h C() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public void H(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public ConcurrentMap c() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public void j() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public Object l(Object object0, Callable callable0) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public void put(Object object0, Object object1) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public void putAll(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // com.google.common.cache.c
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.cache.c
    public void y(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.H(object0);
        }
    }
}

