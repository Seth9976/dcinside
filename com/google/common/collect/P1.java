package com.google.common.collect;

import J1.b;
import com.google.common.primitives.l;
import com.google.common.primitives.n;
import java.util.Comparator;

@b
@C1
public abstract class p1 {
    class a extends p1 {
        a() {
            super(null);
        }

        @Override  // com.google.common.collect.p1
        public p1 d(double f, double f1) {
            return this.o(Double.compare(f, f1));
        }

        @Override  // com.google.common.collect.p1
        public p1 e(float f, float f1) {
            return this.o(Float.compare(f, f1));
        }

        @Override  // com.google.common.collect.p1
        public p1 f(int v, int v1) {
            return this.o(l.e(v, v1));
        }

        @Override  // com.google.common.collect.p1
        public p1 g(long v, long v1) {
            return this.o(n.e(v, v1));
        }

        @Override  // com.google.common.collect.p1
        public p1 i(Comparable comparable0, Comparable comparable1) {
            return this.o(comparable0.compareTo(comparable1));
        }

        @Override  // com.google.common.collect.p1
        public p1 j(@d4 Object object0, @d4 Object object1, Comparator comparator0) {
            return this.o(comparator0.compare(object0, object1));
        }

        @Override  // com.google.common.collect.p1
        public p1 k(boolean z, boolean z1) {
            return this.o(com.google.common.primitives.a.d(z, z1));
        }

        @Override  // com.google.common.collect.p1
        public p1 l(boolean z, boolean z1) {
            return this.o(com.google.common.primitives.a.d(z1, z));
        }

        @Override  // com.google.common.collect.p1
        public int m() {
            return 0;
        }

        p1 o(int v) {
            if(v < 0) {
                return p1.b;
            }
            return v <= 0 ? p1.a : p1.c;
        }
    }

    static final class com.google.common.collect.p1.b extends p1 {
        final int d;

        com.google.common.collect.p1.b(int v) {
            super(null);
            this.d = v;
        }

        @Override  // com.google.common.collect.p1
        public p1 d(double f, double f1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 e(float f, float f1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 f(int v, int v1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 g(long v, long v1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 i(Comparable comparable0, Comparable comparable1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 j(@d4 Object object0, @d4 Object object1, Comparator comparator0) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 k(boolean z, boolean z1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public p1 l(boolean z, boolean z1) {
            return this;
        }

        @Override  // com.google.common.collect.p1
        public int m() {
            return this.d;
        }
    }

    private static final p1 a;
    private static final p1 b;
    private static final p1 c;

    static {
        p1.a = new a();
        p1.b = new com.google.common.collect.p1.b(-1);
        p1.c = new com.google.common.collect.p1.b(1);
    }

    private p1() {
    }

    p1(a p1$a0) {
    }

    public abstract p1 d(double arg1, double arg2);

    public abstract p1 e(float arg1, float arg2);

    public abstract p1 f(int arg1, int arg2);

    public abstract p1 g(long arg1, long arg2);

    @Deprecated
    public final p1 h(Boolean boolean0, Boolean boolean1) {
        return this.k(boolean0.booleanValue(), boolean1.booleanValue());
    }

    public abstract p1 i(Comparable arg1, Comparable arg2);

    public abstract p1 j(@d4 Object arg1, @d4 Object arg2, Comparator arg3);

    public abstract p1 k(boolean arg1, boolean arg2);

    public abstract p1 l(boolean arg1, boolean arg2);

    public abstract int m();

    public static p1 n() {
        return p1.a;
    }
}

