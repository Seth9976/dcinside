package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.n.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.k;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

@b
public class x extends L implements k {
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

    static final class com.fasterxml.jackson.databind.ser.std.x.b extends S {
        static final com.fasterxml.jackson.databind.ser.std.x.b d;

        static {
            com.fasterxml.jackson.databind.ser.std.x.b.d = new com.fasterxml.jackson.databind.ser.std.x.b();
        }

        public com.fasterxml.jackson.databind.ser.std.x.b() {
            super(BigDecimal.class);
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.S
        public String P(Object object0) {
            throw new IllegalStateException();
        }

        protected boolean Q(com.fasterxml.jackson.core.k k0, BigDecimal bigDecimal0) throws IOException {
            int v = bigDecimal0.scale();
            return v >= 0xFFFFD8F1 && v <= 0x270F;
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.S
        public boolean h(I i0, Object object0) {
            return false;
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.S
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            String s;
            if(k0.d1(com.fasterxml.jackson.core.k.b.j)) {
                if(!this.Q(k0, ((BigDecimal)object0))) {
                    i0.L0(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", ((BigDecimal)object0).scale(), 0x270F, 0x270F), new Object[0]);
                }
                s = ((BigDecimal)object0).toPlainString();
            }
            else {
                s = object0.toString();
            }
            k0.d(s);
        }
    }

    protected final boolean d;
    public static final x e = null;
    protected static final int f = 0x270F;

    static {
        x.e = new x(Number.class);
    }

    public x(Class class0) {
        boolean z = false;
        super(class0, false);
        if(class0 == BigInteger.class) {
            z = true;
        }
        this.d = z;
    }

    public static r P() {
        return com.fasterxml.jackson.databind.ser.std.x.b.d;
    }

    public void Q(Number number0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(number0 instanceof BigDecimal) {
            k0.T3(((BigDecimal)number0));
            return;
        }
        if(number0 instanceof BigInteger) {
            k0.Y3(((BigInteger)number0));
            return;
        }
        if(number0 instanceof Long) {
            k0.N3(number0.longValue());
            return;
        }
        if(number0 instanceof Double) {
            k0.C3(number0.doubleValue());
            return;
        }
        if(number0 instanceof Float) {
            k0.E3(number0.floatValue());
            return;
        }
        if(!(number0 instanceof Integer) && !(number0 instanceof Byte) && !(number0 instanceof Short)) {
            k0.S3(number0.toString());
            return;
        }
        k0.F3(number0.intValue());
    }

    // 去混淆评级： 低(20)
    @Override  // com.fasterxml.jackson.databind.ser.std.L
    @Deprecated
    public p a(I i0, Type type0) {
        return this.d ? this.x("integer", true) : this.x("number", true);
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
        if(this.d) {
            this.J(g0, m0, com.fasterxml.jackson.core.n.b.c);
            return;
        }
        if(this.g() == BigDecimal.class) {
            this.I(g0, m0, com.fasterxml.jackson.core.n.b.f);
            return;
        }
        g0.q(m0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.Q(((Number)object0), k0, i0);
    }
}

