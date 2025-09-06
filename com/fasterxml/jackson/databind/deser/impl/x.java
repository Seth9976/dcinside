package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.y;
import java.io.IOException;
import java.util.Map;

public abstract class x {
    static final class a extends x {
        final com.fasterxml.jackson.databind.deser.x c;
        final String d;

        public a(x x0, Object object0, com.fasterxml.jackson.databind.deser.x x1, String s) {
            super(x0, object0);
            this.c = x1;
            this.d = s;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.x
        public void a(Object object0) throws IOException {
            this.c.o(object0, this.d, this.b);
        }
    }

    static final class b extends x {
        final Object c;

        public b(x x0, Object object0, Object object1) {
            super(x0, object0);
            this.c = object1;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.x
        public void a(Object object0) throws IOException {
            ((Map)object0).put(this.c, this.b);
        }
    }

    static final class c extends x {
        final y c;

        public c(x x0, Object object0, y y0) {
            super(x0, object0);
            this.c = y0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.x
        public void a(Object object0) throws IOException {
            this.c.M(object0, this.b);
        }
    }

    public final x a;
    public final Object b;

    protected x(x x0, Object object0) {
        this.a = x0;
        this.b = object0;
    }

    public abstract void a(Object arg1) throws IOException;
}

