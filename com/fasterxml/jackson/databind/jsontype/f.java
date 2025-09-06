package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.m;
import java.io.IOException;

public abstract class f {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[r.values().length];
            a.a = arr_v;
            try {
                arr_v[r.q.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.r.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.s.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.t.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.u.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static Object a(n n0, h h0, m m0) throws IOException {
        return f.b(n0, h0, m0.g());
    }

    public static Object b(n n0, h h0, Class class0) throws IOException {
        r r0 = n0.Y();
        if(r0 == null) {
            return null;
        }
        int v = a.a[r0.ordinal()];
        switch(v) {
            case 1: {
                if(class0.isAssignableFrom(String.class)) {
                    return n0.R2();
                }
                break;
            }
            case 2: {
                if(class0.isAssignableFrom(Integer.class)) {
                    return n0.Q1();
                }
                break;
            }
            case 3: {
                if(class0.isAssignableFrom(Double.class)) {
                    return n0.j1();
                }
                break;
            }
            default: {
                Class class1 = Boolean.class;
                switch(v) {
                    case 4: {
                        if(class0.isAssignableFrom(class1)) {
                            return true;
                        }
                        break;
                    }
                    case 5: {
                        if(class0.isAssignableFrom(class1)) {
                            return false;
                        }
                        break;
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public abstract Object c(n arg1, h arg2) throws IOException;

    public abstract Object d(n arg1, h arg2) throws IOException;

    public abstract Object e(n arg1, h arg2) throws IOException;

    public abstract Object f(n arg1, h arg2) throws IOException;

    public abstract f g(d arg1);

    public abstract Class h();

    public abstract String i();

    public abstract g j();

    public abstract com.fasterxml.jackson.annotation.H.a k();

    public boolean l() {
        return this.h() != null;
    }
}

