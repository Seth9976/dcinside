package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.io.Serializable;
import java.util.NoSuchElementException;

@b
@C1
abstract class w1 implements Serializable, Comparable {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[y.values().length];
            a.a = arr_v;
            try {
                arr_v[y.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[y.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class com.google.common.collect.w1.b extends w1 {
        private static final com.google.common.collect.w1.b c;
        private static final long d;

        static {
            com.google.common.collect.w1.b.c = new com.google.common.collect.w1.b();
        }

        private com.google.common.collect.w1.b() {
            super("");
        }

        @Override  // com.google.common.collect.w1
        public int compareTo(Object object0) {
            return this.f(((w1)object0));
        }

        @Override  // com.google.common.collect.w1
        public int f(w1 w10) {
            return w10 == this ? 0 : 1;
        }

        @Override  // com.google.common.collect.w1
        void g(StringBuilder stringBuilder0) {
            throw new AssertionError();
        }

        @Override  // com.google.common.collect.w1
        void h(StringBuilder stringBuilder0) {
            stringBuilder0.append("+∞)");
        }

        @Override  // com.google.common.collect.w1
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override  // com.google.common.collect.w1
        Comparable i() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override  // com.google.common.collect.w1
        Comparable j(B1 b10) {
            return b10.e();
        }

        @Override  // com.google.common.collect.w1
        boolean k(Comparable comparable0) {
            return false;
        }

        @Override  // com.google.common.collect.w1
        Comparable l(B1 b10) {
            throw new AssertionError();
        }

        @Override  // com.google.common.collect.w1
        y m() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override  // com.google.common.collect.w1
        y n() {
            throw new IllegalStateException();
        }

        @Override  // com.google.common.collect.w1
        w1 p(y y0, B1 b10) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override  // com.google.common.collect.w1
        w1 r(y y0, B1 b10) {
            throw new IllegalStateException();
        }

        @Override
        public String toString() {
            return "+∞";
        }

        private Object u() {
            return com.google.common.collect.w1.b.c;
        }
    }

    static final class c extends w1 {
        private static final long c;

        c(Comparable comparable0) {
            super(((Comparable)H.E(comparable0)));
        }

        @Override  // com.google.common.collect.w1
        public int compareTo(Object object0) {
            return super.f(((w1)object0));
        }

        @Override  // com.google.common.collect.w1
        w1 e(B1 b10) {
            Comparable comparable0 = this.l(b10);
            return comparable0 == null ? w1.a() : w1.d(comparable0);
        }

        @Override  // com.google.common.collect.w1
        void g(StringBuilder stringBuilder0) {
            stringBuilder0.append('(');
            stringBuilder0.append(this.a);
        }

        @Override  // com.google.common.collect.w1
        void h(StringBuilder stringBuilder0) {
            stringBuilder0.append(this.a);
            stringBuilder0.append(']');
        }

        @Override  // com.google.common.collect.w1
        public int hashCode() {
            return ~this.a.hashCode();
        }

        @Override  // com.google.common.collect.w1
        Comparable j(B1 b10) {
            return this.a;
        }

        @Override  // com.google.common.collect.w1
        boolean k(Comparable comparable0) {
            return h4.h(this.a, comparable0) < 0;
        }

        @Override  // com.google.common.collect.w1
        @o3.a
        Comparable l(B1 b10) {
            return b10.g(this.a);
        }

        @Override  // com.google.common.collect.w1
        y m() {
            return y.b;
        }

        @Override  // com.google.common.collect.w1
        y n() {
            return y.c;
        }

        @Override  // com.google.common.collect.w1
        w1 p(y y0, B1 b10) {
            switch(y0) {
                case 1: {
                    Comparable comparable0 = b10.g(this.a);
                    return comparable0 == null ? w1.c() : w1.d(comparable0);
                }
                case 2: {
                    return this;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }

        @Override  // com.google.common.collect.w1
        w1 r(y y0, B1 b10) {
            switch(y0) {
                case 1: {
                    return this;
                }
                case 2: {
                    Comparable comparable0 = b10.g(this.a);
                    return comparable0 == null ? w1.a() : w1.d(comparable0);
                }
                default: {
                    throw new AssertionError();
                }
            }
        }

        @Override
        public String toString() {
            return "/" + this.a + "\\";
        }
    }

    static final class d extends w1 {
        private static final d c;
        private static final long d;

        static {
            d.c = new d();
        }

        private d() {
            super("");
        }

        @Override  // com.google.common.collect.w1
        public int compareTo(Object object0) {
            return this.f(((w1)object0));
        }

        @Override  // com.google.common.collect.w1
        w1 e(B1 b10) {
            try {
                return w1.d(b10.f());
            }
            catch(NoSuchElementException unused_ex) {
                return this;
            }
        }

        @Override  // com.google.common.collect.w1
        public int f(w1 w10) {
            return w10 == this ? 0 : -1;
        }

        @Override  // com.google.common.collect.w1
        void g(StringBuilder stringBuilder0) {
            stringBuilder0.append("(-∞");
        }

        @Override  // com.google.common.collect.w1
        void h(StringBuilder stringBuilder0) {
            throw new AssertionError();
        }

        @Override  // com.google.common.collect.w1
        public int hashCode() {
            return System.identityHashCode(this);
        }

        @Override  // com.google.common.collect.w1
        Comparable i() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override  // com.google.common.collect.w1
        Comparable j(B1 b10) {
            throw new AssertionError();
        }

        @Override  // com.google.common.collect.w1
        boolean k(Comparable comparable0) {
            return true;
        }

        @Override  // com.google.common.collect.w1
        Comparable l(B1 b10) {
            return b10.f();
        }

        @Override  // com.google.common.collect.w1
        y m() {
            throw new IllegalStateException();
        }

        @Override  // com.google.common.collect.w1
        y n() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override  // com.google.common.collect.w1
        w1 p(y y0, B1 b10) {
            throw new IllegalStateException();
        }

        @Override  // com.google.common.collect.w1
        w1 r(y y0, B1 b10) {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override
        public String toString() {
            return "-∞";
        }

        private Object u() {
            return d.c;
        }
    }

    static final class e extends w1 {
        private static final long c;

        e(Comparable comparable0) {
            super(((Comparable)H.E(comparable0)));
        }

        @Override  // com.google.common.collect.w1
        public int compareTo(Object object0) {
            return super.f(((w1)object0));
        }

        @Override  // com.google.common.collect.w1
        void g(StringBuilder stringBuilder0) {
            stringBuilder0.append('[');
            stringBuilder0.append(this.a);
        }

        @Override  // com.google.common.collect.w1
        void h(StringBuilder stringBuilder0) {
            stringBuilder0.append(this.a);
            stringBuilder0.append(')');
        }

        @Override  // com.google.common.collect.w1
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override  // com.google.common.collect.w1
        @o3.a
        Comparable j(B1 b10) {
            return b10.i(this.a);
        }

        @Override  // com.google.common.collect.w1
        boolean k(Comparable comparable0) {
            return h4.h(this.a, comparable0) <= 0;
        }

        @Override  // com.google.common.collect.w1
        Comparable l(B1 b10) {
            return this.a;
        }

        @Override  // com.google.common.collect.w1
        y m() {
            return y.c;
        }

        @Override  // com.google.common.collect.w1
        y n() {
            return y.b;
        }

        @Override  // com.google.common.collect.w1
        w1 p(y y0, B1 b10) {
            switch(y0) {
                case 1: {
                    return this;
                }
                case 2: {
                    Comparable comparable0 = b10.i(this.a);
                    return comparable0 == null ? w1.c() : new c(comparable0);
                }
                default: {
                    throw new AssertionError();
                }
            }
        }

        @Override  // com.google.common.collect.w1
        w1 r(y y0, B1 b10) {
            switch(y0) {
                case 1: {
                    Comparable comparable0 = b10.i(this.a);
                    return comparable0 == null ? w1.a() : new c(comparable0);
                }
                case 2: {
                    return this;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }

        @Override
        public String toString() {
            return "\\" + this.a + "/";
        }
    }

    final Comparable a;
    private static final long b;

    w1(Comparable comparable0) {
        this.a = comparable0;
    }

    static w1 a() {
        return com.google.common.collect.w1.b.c;
    }

    static w1 b(Comparable comparable0) {
        return new c(comparable0);
    }

    static w1 c() {
        return d.c;
    }

    @Override
    public int compareTo(Object object0) {
        return this.f(((w1)object0));
    }

    static w1 d(Comparable comparable0) {
        return new e(comparable0);
    }

    w1 e(B1 b10) {
        return this;
    }

    @Override
    public boolean equals(@o3.a Object object0) {
        if(object0 instanceof w1) {
            w1 w10 = (w1)object0;
            try {
                if(this.f(w10) == 0) {
                    return true;
                }
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return false;
    }

    public int f(w1 w10) {
        if(w10 == w1.c()) {
            return 1;
        }
        if(w10 == w1.a()) {
            return -1;
        }
        int v = h4.h(this.a, w10.a);
        return v == 0 ? com.google.common.primitives.a.d(this instanceof c, w10 instanceof c) : v;
    }

    abstract void g(StringBuilder arg1);

    abstract void h(StringBuilder arg1);

    @Override
    public abstract int hashCode();

    Comparable i() {
        return this.a;
    }

    @o3.a
    abstract Comparable j(B1 arg1);

    abstract boolean k(Comparable arg1);

    @o3.a
    abstract Comparable l(B1 arg1);

    abstract y m();

    abstract y n();

    abstract w1 p(y arg1, B1 arg2);

    abstract w1 r(y arg1, B1 arg2);
}

