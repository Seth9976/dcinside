package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.util.J;
import com.fasterxml.jackson.databind.util.w;

public final class m {
    static final class a {
        public final r a;
        public final a b;
        protected final Class c;
        protected final com.fasterxml.jackson.databind.m d;
        protected final boolean e;

        public a(a m$a0, J j0, r r0) {
            this.b = m$a0;
            this.a = r0;
            this.e = j0.c();
            this.c = j0.a();
            this.d = j0.b();
        }

        // 去混淆评级： 低(20)
        public boolean a(com.fasterxml.jackson.databind.m m0) {
            return this.e && m0.equals(this.d);
        }

        public boolean b(Class class0) {
            return this.c == class0 && this.e;
        }

        // 去混淆评级： 低(20)
        public boolean c(com.fasterxml.jackson.databind.m m0) {
            return !this.e && m0.equals(this.d);
        }

        public boolean d(Class class0) {
            return this.c == class0 && !this.e;
        }
    }

    private final a[] a;
    private final int b;
    private final int c;

    public m(w w0) {
        int v = m.b(w0.size());
        this.b = v;
        this.c = v - 1;
        a[] arr_m$a = new a[v];
        w0.a((J j0, r r0) -> {
            int v = j0.hashCode() & this.c;
            arr_m$a[v] = new a(arr_m$a[v], j0, r0);
        });
        this.a = arr_m$a;
    }

    private static final int b(int v) {
        int v1;
        for(v1 = 8; v1 < (v > 0x40 ? v + (v >> 2) : v + v); v1 += v1) {
        }
        return v1;
    }

    public static m c(w w0) {
        return new m(w0);
    }

    // 检测为 Lambda 实现
    private void d(a[] arr_m$a, J j0, r r0) [...]

    public int e() {
        return this.b;
    }

    public r f(com.fasterxml.jackson.databind.m m0) {
        a m$a0 = this.a[J.h(m0) & this.c];
        if(m$a0 == null) {
            return null;
        }
        if(m$a0.a(m0)) {
            return m$a0.a;
        }
        while(true) {
            m$a0 = m$a0.b;
            if(m$a0 == null) {
                break;
            }
            if(m$a0.a(m0)) {
                return m$a0.a;
            }
        }
        return null;
    }

    public r g(Class class0) {
        a m$a0 = this.a[J.i(class0) & this.c];
        if(m$a0 == null) {
            return null;
        }
        if(m$a0.b(class0)) {
            return m$a0.a;
        }
        while(true) {
            m$a0 = m$a0.b;
            if(m$a0 == null) {
                break;
            }
            if(m$a0.b(class0)) {
                return m$a0.a;
            }
        }
        return null;
    }

    public r h(com.fasterxml.jackson.databind.m m0) {
        a m$a0 = this.a[J.j(m0) & this.c];
        if(m$a0 == null) {
            return null;
        }
        if(m$a0.c(m0)) {
            return m$a0.a;
        }
        while(true) {
            m$a0 = m$a0.b;
            if(m$a0 == null) {
                break;
            }
            if(m$a0.c(m0)) {
                return m$a0.a;
            }
        }
        return null;
    }

    public r i(Class class0) {
        a m$a0 = this.a[J.k(class0) & this.c];
        if(m$a0 == null) {
            return null;
        }
        if(m$a0.d(class0)) {
            return m$a0.a;
        }
        while(true) {
            m$a0 = m$a0.b;
            if(m$a0 == null) {
                break;
            }
            if(m$a0.d(class0)) {
                return m$a0.a;
            }
        }
        return null;
    }
}

