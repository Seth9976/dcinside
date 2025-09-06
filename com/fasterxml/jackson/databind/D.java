package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.u.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.y;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

public interface d extends y {
    public static class a implements d {
        @Override  // com.fasterxml.jackson.databind.d
        public B a() {
            return B.h;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public Annotation b(Class class0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public boolean c() {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public B d() {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public com.fasterxml.jackson.annotation.n.d e(t t0, Class class0) {
            return com.fasterxml.jackson.annotation.n.d.c();
        }

        @Override  // com.fasterxml.jackson.databind.d
        public List f(t t0) {
            return Collections.emptyList();
        }

        @Override  // com.fasterxml.jackson.databind.d
        public void g(l l0, I i0) throws o {
        }

        @Override  // com.fasterxml.jackson.databind.d
        public Annotation getAnnotation(Class class0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public A getMetadata() {
            return A.k;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public String getName() {
            return "";
        }

        @Override  // com.fasterxml.jackson.databind.d
        public m getType() {
            return q.v0();
        }

        @Override  // com.fasterxml.jackson.databind.d
        public k h() {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public b i(t t0, Class class0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public boolean j() {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.d
        @Deprecated
        public com.fasterxml.jackson.annotation.n.d k(com.fasterxml.jackson.databind.b b0) {
            return com.fasterxml.jackson.annotation.n.d.c();
        }
    }

    public static class com.fasterxml.jackson.databind.d.b implements d, Serializable {
        protected final B a;
        protected final m b;
        protected final B c;
        protected final A d;
        protected final k e;
        private static final long f = 1L;

        public com.fasterxml.jackson.databind.d.b(B b0, m m0, B b1, k k0, A a0) {
            this.a = b0;
            this.b = m0;
            this.c = b1;
            this.d = a0;
            this.e = k0;
        }

        @Deprecated
        public com.fasterxml.jackson.databind.d.b(B b0, m m0, B b1, com.fasterxml.jackson.databind.util.b b2, k k0, A a0) {
            this(b0, m0, b1, k0, a0);
        }

        public com.fasterxml.jackson.databind.d.b(com.fasterxml.jackson.databind.d.b d$b0, m m0) {
            this(d$b0.a, m0, d$b0.c, d$b0.e, d$b0.d);
        }

        @Override  // com.fasterxml.jackson.databind.d
        public B a() {
            return this.a;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public Annotation b(Class class0) {
            return null;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public boolean c() {
            return this.d.l();
        }

        @Override  // com.fasterxml.jackson.databind.d
        public B d() {
            return this.c;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public com.fasterxml.jackson.annotation.n.d e(t t0, Class class0) {
            com.fasterxml.jackson.annotation.n.d n$d0 = t0.B(class0);
            com.fasterxml.jackson.databind.b b0 = t0.n();
            if(b0 != null) {
                k k0 = this.e;
                if(k0 != null) {
                    com.fasterxml.jackson.annotation.n.d n$d1 = b0.A(k0);
                    return n$d1 == null ? n$d0 : n$d0.C(n$d1);
                }
            }
            return n$d0;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public List f(t t0) {
            return Collections.emptyList();
        }

        @Override  // com.fasterxml.jackson.databind.d
        public void g(l l0, I i0) {
            throw new UnsupportedOperationException("Instances of " + this.getClass().getName() + " should not get visited");
        }

        @Override  // com.fasterxml.jackson.databind.d
        public Annotation getAnnotation(Class class0) {
            return this.e == null ? null : this.e.d(class0);
        }

        @Override  // com.fasterxml.jackson.databind.d
        public A getMetadata() {
            return this.d;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public String getName() {
            return this.a.d();
        }

        @Override  // com.fasterxml.jackson.databind.d
        public m getType() {
            return this.b;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public k h() {
            return this.e;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public b i(t t0, Class class0) {
            b u$b0 = t0.x(class0, this.b.g());
            com.fasterxml.jackson.databind.b b0 = t0.n();
            if(b0 != null) {
                k k0 = this.e;
                if(k0 != null) {
                    b u$b1 = b0.Z(k0);
                    return u$b1 == null ? u$b0 : u$b0.o(u$b1);
                }
            }
            return u$b0;
        }

        @Override  // com.fasterxml.jackson.databind.d
        public boolean j() {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.d
        @Deprecated
        public com.fasterxml.jackson.annotation.n.d k(com.fasterxml.jackson.databind.b b0) {
            k k0 = this.e;
            if(k0 != null && b0 != null) {
                com.fasterxml.jackson.annotation.n.d n$d0 = b0.A(k0);
                return n$d0 == null ? d.s2 : n$d0;
            }
            return d.s2;
        }

        public com.fasterxml.jackson.databind.d.b l(m m0) {
            return new com.fasterxml.jackson.databind.d.b(this, m0);
        }
    }

    public static final com.fasterxml.jackson.annotation.n.d s2;
    public static final b t2;

    static {
        d.s2 = new com.fasterxml.jackson.annotation.n.d();
        d.t2 = b.d();
    }

    B a();

    Annotation b(Class arg1);

    boolean c();

    B d();

    com.fasterxml.jackson.annotation.n.d e(t arg1, Class arg2);

    List f(t arg1);

    void g(l arg1, I arg2) throws o;

    Annotation getAnnotation(Class arg1);

    A getMetadata();

    @Override  // com.fasterxml.jackson.databind.util.y
    String getName();

    m getType();

    k h();

    b i(t arg1, Class arg2);

    boolean j();

    @Deprecated
    com.fasterxml.jackson.annotation.n.d k(com.fasterxml.jackson.databind.b arg1);
}

