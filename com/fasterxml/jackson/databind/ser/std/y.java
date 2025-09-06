package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.n.c;
import com.fasterxml.jackson.core.io.n;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;

public class y {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static abstract class b extends L implements k {
        protected final com.fasterxml.jackson.core.n.b d;
        protected final String e;
        protected final boolean f;

        protected b(Class class0, com.fasterxml.jackson.core.n.b n$b0, String s) {
            boolean z = false;
            super(class0, false);
            this.d = n$b0;
            this.e = s;
            if(n$b0 == com.fasterxml.jackson.core.n.b.a || n$b0 == com.fasterxml.jackson.core.n.b.b || n$b0 == com.fasterxml.jackson.core.n.b.c) {
                z = true;
            }
            this.f = z;
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.L
        @Deprecated
        public p a(I i0, Type type0) {
            return this.x(this.e, true);
        }

        @Override  // com.fasterxml.jackson.databind.ser.k
        public r c(I i0, d d0) throws o {
            com.fasterxml.jackson.annotation.n.d n$d0 = this.C(i0, d0, this.g());
            if(n$d0 != null && a.a[n$d0.m().ordinal()] == 1) {
                return this.g() == BigDecimal.class ? x.P() : Q.d;
            }
            return this;
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.L
        public void e(g g0, m m0) throws o {
            if(this.f) {
                this.J(g0, m0, this.d);
                return;
            }
            this.I(g0, m0, this.d);
        }
    }

    @com.fasterxml.jackson.databind.annotation.b
    public static class com.fasterxml.jackson.databind.ser.std.y.c extends b {
        public com.fasterxml.jackson.databind.ser.std.y.c(Class class0) {
            super(class0, com.fasterxml.jackson.core.n.b.e, "number");
        }

        @Deprecated
        public static boolean P(double f) {
            return n.o(f);
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.C3(((double)(((Double)object0))));
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.L
        public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
            if(n.o(((double)(((Double)object0))))) {
                com.fasterxml.jackson.core.type.c c0 = j0.o(k0, j0.f(object0, com.fasterxml.jackson.core.r.s));
                k0.C3(((double)(((Double)object0))));
                j0.v(k0, c0);
                return;
            }
            k0.C3(((double)(((Double)object0))));
        }
    }

    @com.fasterxml.jackson.databind.annotation.b
    public static class com.fasterxml.jackson.databind.ser.std.y.d extends b {
        static final com.fasterxml.jackson.databind.ser.std.y.d g;

        static {
            com.fasterxml.jackson.databind.ser.std.y.d.g = new com.fasterxml.jackson.databind.ser.std.y.d();
        }

        public com.fasterxml.jackson.databind.ser.std.y.d() {
            super(Float.class, com.fasterxml.jackson.core.n.b.d, "number");
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.E3(((float)(((Float)object0))));
        }
    }

    @com.fasterxml.jackson.databind.annotation.b
    public static class e extends b {
        static final e g;

        static {
            e.g = new e();
        }

        public e() {
            super(Number.class, com.fasterxml.jackson.core.n.b.a, "integer");
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.F3(((Number)object0).intValue());
        }
    }

    @com.fasterxml.jackson.databind.annotation.b
    public static class f extends b {
        public f(Class class0) {
            super(class0, com.fasterxml.jackson.core.n.b.a, "integer");
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.F3(((int)(((Integer)object0))));
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.L
        public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
            this.m(object0, k0, i0);
        }
    }

    @com.fasterxml.jackson.databind.annotation.b
    public static class com.fasterxml.jackson.databind.ser.std.y.g extends b {
        public com.fasterxml.jackson.databind.ser.std.y.g(Class class0) {
            super(class0, com.fasterxml.jackson.core.n.b.b, "integer");
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.N3(((long)(((Long)object0))));
        }
    }

    @com.fasterxml.jackson.databind.annotation.b
    public static class h extends b {
        static final h g;

        static {
            h.g = new h();
        }

        public h() {
            super(Short.class, com.fasterxml.jackson.core.n.b.a, "integer");
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.Z3(((short)(((Short)object0))));
        }
    }

    public static void a(Map map0) {
        map0.put("java.lang.Integer", new f(Integer.class));
        map0.put("int", new f(Integer.TYPE));
        map0.put("java.lang.Long", new com.fasterxml.jackson.databind.ser.std.y.g(Long.class));
        map0.put("long", new com.fasterxml.jackson.databind.ser.std.y.g(Long.TYPE));
        map0.put("java.lang.Byte", e.g);
        map0.put("byte", e.g);
        map0.put("java.lang.Short", h.g);
        map0.put("short", h.g);
        map0.put("java.lang.Double", new com.fasterxml.jackson.databind.ser.std.y.c(Double.class));
        map0.put("double", new com.fasterxml.jackson.databind.ser.std.y.c(Double.TYPE));
        map0.put("java.lang.Float", com.fasterxml.jackson.databind.ser.std.y.d.g);
        map0.put("float", com.fasterxml.jackson.databind.ser.std.y.d.g);
    }
}

