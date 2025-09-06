package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.y;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.t;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class v {
    static class a extends HashMap {
        protected final Locale a;
        private static final long b = 1L;

        @Deprecated
        public a() {
            this(Locale.getDefault());
        }

        public a(Locale locale0) {
            this.a = locale0;
        }

        public static a a(Locale locale0) {
            return new a(locale0);
        }

        public y b(Object object0) {
            return (y)super.get(((String)object0).toLowerCase(this.a));
        }

        public y c(String s, y y0) {
            return (y)super.put(s.toLowerCase(this.a), y0);
        }

        @Override
        public Object get(Object object0) {
            return this.b(object0);
        }

        @Override
        public Object put(Object object0, Object object1) {
            return this.c(((String)object0), ((y)object1));
        }
    }

    protected final int a;
    protected final B b;
    protected final HashMap c;
    protected final y[] d;

    protected v(h h0, B b0, y[] arr_y, boolean z, boolean z1) {
        this.b = b0;
        this.c = z ? a.a(h0.g0().N()) : new HashMap();
        this.a = arr_y.length;
        this.d = new y[arr_y.length];
        if(z1) {
            g g0 = h0.g0();
            for(int v1 = 0; v1 < arr_y.length; ++v1) {
                y y0 = arr_y[v1];
                if(!y0.J()) {
                    List list0 = y0.f(g0);
                    if(!list0.isEmpty()) {
                        for(Object object0: list0) {
                            this.c.put(((com.fasterxml.jackson.databind.B)object0).d(), y0);
                        }
                    }
                }
            }
        }
        for(int v = 0; v < arr_y.length; ++v) {
            y y1 = arr_y[v];
            this.d[v] = y1;
            if(!y1.J()) {
                String s = y1.getName();
                this.c.put(s, y1);
            }
        }
    }

    public Object a(h h0, com.fasterxml.jackson.databind.deser.impl.y y0) throws IOException {
        Object object0 = this.b.w(h0, this.d, y0);
        if(object0 != null) {
            object0 = y0.i(h0, object0);
            for(x x0 = y0.f(); x0 != null; x0 = x0.a) {
                x0.a(object0);
            }
        }
        return object0;
    }

    @Deprecated
    public static v b(h h0, B b0, y[] arr_y) throws o {
        return v.d(h0, b0, arr_y, h0.z(t.y));
    }

    public static v c(h h0, B b0, y[] arr_y, c c0) throws o {
        y[] arr_y1 = new y[arr_y.length];
        for(int v = 0; v < arr_y.length; ++v) {
            y y0 = arr_y[v];
            if(!y0.G() && !y0.K()) {
                y0 = y0.V(h0.X(y0.getType(), y0));
            }
            arr_y1[v] = y0;
        }
        return new v(h0, b0, arr_y1, c0.A(), true);
    }

    public static v d(h h0, B b0, y[] arr_y, boolean z) throws o {
        y[] arr_y1 = new y[arr_y.length];
        for(int v = 0; v < arr_y.length; ++v) {
            y y0 = arr_y[v];
            if(!y0.G()) {
                y0 = y0.V(h0.X(y0.getType(), y0));
            }
            arr_y1[v] = y0;
        }
        return new v(h0, b0, arr_y1, z, false);
    }

    public y e(int v) {
        for(Object object0: this.c.values()) {
            y y0 = (y)object0;
            if(y0.D() == v) {
                return y0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public y f(String s) {
        return (y)this.c.get(s);
    }

    public Collection g() {
        return this.c.values();
    }

    public com.fasterxml.jackson.databind.deser.impl.y h(n n0, h h0, s s0) {
        return new com.fasterxml.jackson.databind.deser.impl.y(n0, h0, this.a, s0);
    }
}

