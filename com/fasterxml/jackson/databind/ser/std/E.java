package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.n.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
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

@b
public final class e extends L implements k {
    static final class a extends L implements k {
        protected final boolean d;
        private static final long e = 1L;

        public a(boolean z) {
            super((z ? Boolean.TYPE : Boolean.class), false);
            this.d = z;
        }

        @Override  // com.fasterxml.jackson.databind.ser.k
        public r c(I i0, d d0) throws o {
            return this.C(i0, d0, Boolean.class) != null ? new e(this.d) : this;
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.L
        public void e(g g0, m m0) throws o {
            this.J(g0, m0, com.fasterxml.jackson.core.n.b.a);
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.M
        public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            k0.F3(!Boolean.FALSE.equals(object0));
        }

        @Override  // com.fasterxml.jackson.databind.ser.std.L
        public final void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
            k0.b3(Boolean.TRUE.equals(object0));
        }
    }

    protected final boolean d;
    private static final long e = 1L;

    public e(boolean z) {
        super((z ? Boolean.TYPE : Boolean.class), false);
        this.d = z;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    @Deprecated
    public p a(I i0, Type type0) {
        return this.x("boolean", !this.d);
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        com.fasterxml.jackson.annotation.n.d n$d0 = this.C(i0, d0, this.g());
        return n$d0 != null && n$d0.m() == c.i ? new Q(this.a) : this;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public void e(g g0, m m0) throws o {
        g0.s(m0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        k0.b3(Boolean.TRUE.equals(object0));
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.L
    public final void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
        k0.b3(Boolean.TRUE.equals(object0));
    }
}

