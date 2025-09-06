package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.r;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.util.h;
import j..util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class o extends f {
    public static class a implements Serializable {
        protected transient Object a;
        protected String b;
        protected int c;
        protected String d;
        private static final long e = 2L;

        protected a() {
            this.c = -1;
        }

        public a(Object object0) {
            this.c = -1;
            this.a = object0;
        }

        public a(Object object0, int v) {
            this.a = object0;
            this.c = v;
        }

        public a(Object object0, String s) {
            this.c = -1;
            this.a = object0;
            if(s == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this.b = s;
        }

        public String a() [...] // 潜在的解密器

        public String b() {
            return this.b;
        }

        @r
        public Object c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        void e(String s) {
            this.d = s;
        }

        void f(String s) {
            this.b = s;
        }

        void g(int v) {
            this.c = v;
        }

        Object h() {
            new String("UNKNOWN[?]");
            return this;
        }

        // 去混淆评级： 低(20)
        @Override
        public String toString() [...] // 潜在的解密器
    }

    protected LinkedList e;
    protected transient Closeable f;
    private static final long g = 3L;
    static final int h = 1000;

    public o(Closeable closeable0, String s) {
        super(s);
        this.f = closeable0;
        if(closeable0 instanceof n) {
            this.b = ((n)closeable0).i3();
        }
    }

    public o(Closeable closeable0, String s, l l0) {
        super(s, l0);
        this.f = closeable0;
    }

    public o(Closeable closeable0, String s, Throwable throwable0) {
        super(s, throwable0);
        this.f = closeable0;
        if(throwable0 instanceof com.fasterxml.jackson.core.f) {
            this.b = ((com.fasterxml.jackson.core.f)throwable0).a();
            return;
        }
        if(closeable0 instanceof n) {
            this.b = ((n)closeable0).i3();
        }
    }

    @Deprecated
    public o(String s) {
        super(s);
    }

    @Deprecated
    public o(String s, l l0) {
        super(s, l0);
    }

    @Deprecated
    public o(String s, l l0, Throwable throwable0) {
        super(s, l0, throwable0);
    }

    @Deprecated
    public o(String s, Throwable throwable0) {
        super(s, throwable0);
    }

    public o A(Throwable throwable0) {
        this.initCause(throwable0);
        return this;
    }

    public static o B(Throwable throwable0, a o$a0) {
        Closeable closeable0;
        o o0;
        if(throwable0 instanceof o) {
            o0 = (o)throwable0;
        }
        else {
            String s = h.q(throwable0);
            if(s == null || s.isEmpty()) {
                s = "(was " + throwable0.getClass().getName() + ")";
            }
            if(throwable0 instanceof com.fasterxml.jackson.core.f) {
                Object object0 = ((com.fasterxml.jackson.core.f)throwable0).c();
                closeable0 = object0 instanceof Closeable ? ((Closeable)object0) : null;
            }
            else {
                closeable0 = null;
            }
            o0 = new o(closeable0, s, throwable0);
        }
        o0.z(o$a0);
        return o0;
    }

    public static o C(Throwable throwable0, Object object0, int v) {
        return o.B(throwable0, new a(object0, v));
    }

    public static o D(Throwable throwable0, Object object0, String s) {
        return o.B(throwable0, new a(object0, s));
    }

    @Override  // com.fasterxml.jackson.core.p
    @r
    public Object c() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.f
    public void f(Object object0, int v) {
        this.z(new a(object0, v));
    }

    @Override  // com.fasterxml.jackson.databind.f
    public void g(Object object0, String s) {
        this.z(new a(object0, s));
    }

    @Override
    public String getLocalizedMessage() {
        return this.i();
    }

    @Override  // com.fasterxml.jackson.core.p
    public String getMessage() {
        return this.i();
    }

    protected void h(StringBuilder stringBuilder0) {
        LinkedList linkedList0 = this.e;
        if(linkedList0 == null) {
            return;
        }
        Iterator iterator0 = linkedList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            stringBuilder0.append("UNKNOWN[?]");
            if(iterator0.hasNext()) {
                stringBuilder0.append("->");
            }
        }
    }

    protected String i() {
        String s = super.getMessage();
        if(this.e == null) {
            return s;
        }
        StringBuilder stringBuilder0 = s == null ? new StringBuilder() : new StringBuilder(s);
        stringBuilder0.append(" (through reference chain: ");
        StringBuilder stringBuilder1 = this.y(stringBuilder0);
        stringBuilder1.append(')');
        return stringBuilder1.toString();
    }

    private static k j(I i0) {
        return i0 == null ? null : i0.w0();
    }

    private static n k(com.fasterxml.jackson.databind.h h0) {
        return h0 == null ? null : h0.m0();
    }

    public static o l(k k0, String s) {
        return new o(k0, s, null);
    }

    public static o m(k k0, String s, Throwable throwable0) {
        return new o(k0, s, throwable0);
    }

    public static o n(n n0, String s) {
        return new o(n0, s);
    }

    public static o o(n n0, String s, Throwable throwable0) {
        return new o(n0, s, throwable0);
    }

    public static o p(com.fasterxml.jackson.databind.h h0, String s) {
        return new o(o.k(h0), s);
    }

    public static o q(com.fasterxml.jackson.databind.h h0, String s, Throwable throwable0) {
        return new o(o.k(h0), s, throwable0);
    }

    public static o r(I i0, String s) {
        return new o(o.j(i0), s);
    }

    public static o s(I i0, String s, Throwable throwable0) {
        return new o(o.j(i0), s, throwable0);
    }

    @Override  // com.fasterxml.jackson.core.p
    public String toString() {
        return this.getClass().getName() + ": " + this.getMessage();
    }

    public static o u(IOException iOException0) {
        return new o(null, String.format("Unexpected IOException (of type %s): %s", iOException0.getClass().getName(), h.q(iOException0)));
    }

    public List w() {
        return this.e == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(this.e);
    }

    public String x() {
        return this.y(new StringBuilder()).toString();
    }

    public StringBuilder y(StringBuilder stringBuilder0) {
        this.h(stringBuilder0);
        return stringBuilder0;
    }

    public void z(a o$a0) {
        if(this.e == null) {
            this.e = new LinkedList();
        }
        if(this.e.size() < 1000) {
            this.e.addFirst(o$a0);
        }
    }
}

