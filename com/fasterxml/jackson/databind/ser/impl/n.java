package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsonFormatVisitors.l;
import com.fasterxml.jackson.databind.node.u;
import com.fasterxml.jackson.databind.ser.c;
import com.fasterxml.jackson.databind.ser.d;
import com.fasterxml.jackson.databind.ser.o;
import com.fasterxml.jackson.databind.ser.p;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class n implements c, o {
    public static class b extends n implements Serializable {
        protected final Set a;
        private static final long b = 1L;
        static final b c;

        static {
            b.c = new b(Collections.emptySet());
        }

        public b(Set set0) {
            this.a = set0;
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.n
        protected boolean l(d d0) {
            String s = d0.getName();
            return this.a.contains(s);
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.n
        protected boolean m(p p0) {
            String s = p0.getName();
            return this.a.contains(s);
        }
    }

    public static class com.fasterxml.jackson.databind.ser.impl.n.c extends n implements Serializable {
        protected final Set a;
        private static final long b = 1L;
        static final com.fasterxml.jackson.databind.ser.impl.n.c c;

        static {
            com.fasterxml.jackson.databind.ser.impl.n.c.c = new com.fasterxml.jackson.databind.ser.impl.n.c(Collections.emptySet());
        }

        public com.fasterxml.jackson.databind.ser.impl.n.c(Set set0) {
            this.a = set0;
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.n
        protected boolean l(d d0) {
            String s = d0.getName();
            return !this.a.contains(s);
        }

        @Override  // com.fasterxml.jackson.databind.ser.impl.n
        protected boolean m(p p0) {
            String s = p0.getName();
            return !this.a.contains(s);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.c
    @Deprecated
    public void a(Object object0, k k0, I i0, d d0) throws Exception {
        if(this.l(d0)) {
            d0.o(object0, k0, i0);
            return;
        }
        if(!k0.q()) {
            d0.p(object0, k0, i0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.o
    public void b(Object object0, k k0, I i0, p p0) throws Exception {
        if(this.m(p0)) {
            p0.o(object0, k0, i0);
            return;
        }
        if(!k0.q()) {
            p0.p(object0, k0, i0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.o
    public void c(p p0, l l0, I i0) throws com.fasterxml.jackson.databind.o {
        if(this.m(p0)) {
            p0.g(l0, i0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.o
    public void d(Object object0, k k0, I i0, p p0) throws Exception {
        p0.n(object0, k0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.c
    @Deprecated
    public void e(d d0, u u0, I i0) throws com.fasterxml.jackson.databind.o {
        if(this.l(d0)) {
            d0.l(u0, i0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.o
    @Deprecated
    public void f(p p0, u u0, I i0) throws com.fasterxml.jackson.databind.o {
        if(this.m(p0)) {
            p0.l(u0, i0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.c
    @Deprecated
    public void g(d d0, l l0, I i0) throws com.fasterxml.jackson.databind.o {
        if(this.l(d0)) {
            d0.g(l0, i0);
        }
    }

    public static n h() {
        return b.c;
    }

    public static n i(Set set0) {
        return new b(set0);
    }

    public static n j(String[] arr_s) {
        HashSet hashSet0 = new HashSet(arr_s.length);
        Collections.addAll(hashSet0, arr_s);
        return new b(hashSet0);
    }

    public static o k(c c0) {
        static final class a implements o {
            final c a;

            a(c c0) {
                this.a = c0;
                super();
            }

            @Override  // com.fasterxml.jackson.databind.ser.o
            public void b(Object object0, k k0, I i0, p p0) throws Exception {
                this.a.a(object0, k0, i0, ((d)p0));
            }

            @Override  // com.fasterxml.jackson.databind.ser.o
            public void c(p p0, l l0, I i0) throws com.fasterxml.jackson.databind.o {
                this.a.g(((d)p0), l0, i0);
            }

            @Override  // com.fasterxml.jackson.databind.ser.o
            public void d(Object object0, k k0, I i0, p p0) throws Exception {
                throw new UnsupportedOperationException();
            }

            @Override  // com.fasterxml.jackson.databind.ser.o
            public void f(p p0, u u0, I i0) throws com.fasterxml.jackson.databind.o {
                this.a.e(((d)p0), u0, i0);
            }
        }

        return new a(c0);
    }

    protected boolean l(d d0) {
        return true;
    }

    protected boolean m(p p0) {
        return true;
    }

    protected boolean n(Object object0) [...] // Inlined contents

    public static n o() {
        return com.fasterxml.jackson.databind.ser.impl.n.c.c;
    }

    @Deprecated
    public static n p(Set set0) {
        return new b(set0);
    }

    public static n q(Set set0) {
        return new com.fasterxml.jackson.databind.ser.impl.n.c(set0);
    }

    public static n r(String[] arr_s) {
        HashSet hashSet0 = new HashSet(arr_s.length);
        Collections.addAll(hashSet0, arr_s);
        return new com.fasterxml.jackson.databind.ser.impl.n.c(hashSet0);
    }
}

