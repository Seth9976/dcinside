package com.google.common.base;

import J1.b;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

@b
@k
public final class z {
    static class a {
    }

    public static final class com.google.common.base.z.b {
        static final class com.google.common.base.z.b.a extends com.google.common.base.z.b.b {
            private com.google.common.base.z.b.a() {
            }

            com.google.common.base.z.b.a(a z$a0) {
            }
        }

        static class com.google.common.base.z.b.b {
            @o3.a
            String a;
            @o3.a
            Object b;
            @o3.a
            com.google.common.base.z.b.b c;

        }

        private final String a;
        private final com.google.common.base.z.b.b b;
        private com.google.common.base.z.b.b c;
        private boolean d;
        private boolean e;

        private com.google.common.base.z.b(String s) {
            com.google.common.base.z.b.b z$b$b0 = new com.google.common.base.z.b.b();
            this.b = z$b$b0;
            this.c = z$b$b0;
            this.d = false;
            this.e = false;
            this.a = (String)H.E(s);
        }

        com.google.common.base.z.b(String s, a z$a0) {
            this(s);
        }

        @O1.a
        public com.google.common.base.z.b a(String s, char c) {
            return this.m(s, String.valueOf(c));
        }

        @O1.a
        public com.google.common.base.z.b b(String s, double f) {
            return this.m(s, String.valueOf(f));
        }

        @O1.a
        public com.google.common.base.z.b c(String s, float f) {
            return this.m(s, String.valueOf(f));
        }

        @O1.a
        public com.google.common.base.z.b d(String s, int v) {
            return this.m(s, String.valueOf(v));
        }

        @O1.a
        public com.google.common.base.z.b e(String s, long v) {
            return this.m(s, String.valueOf(v));
        }

        @O1.a
        public com.google.common.base.z.b f(String s, @o3.a Object object0) {
            return this.j(s, object0);
        }

        @O1.a
        public com.google.common.base.z.b g(String s, boolean z) {
            return this.m(s, String.valueOf(z));
        }

        private com.google.common.base.z.b.b h() {
            com.google.common.base.z.b.b z$b$b0 = new com.google.common.base.z.b.b();
            this.c.c = z$b$b0;
            this.c = z$b$b0;
            return z$b$b0;
        }

        @O1.a
        private com.google.common.base.z.b i(@o3.a Object object0) {
            this.h().b = object0;
            return this;
        }

        @O1.a
        private com.google.common.base.z.b j(String s, @o3.a Object object0) {
            com.google.common.base.z.b.b z$b$b0 = this.h();
            z$b$b0.b = object0;
            z$b$b0.a = (String)H.E(s);
            return this;
        }

        private com.google.common.base.z.b.a k() {
            com.google.common.base.z.b.a z$b$a0 = new com.google.common.base.z.b.a(null);
            this.c.c = z$b$a0;
            this.c = z$b$a0;
            return z$b$a0;
        }

        @O1.a
        private com.google.common.base.z.b l(Object object0) {
            this.k().b = object0;
            return this;
        }

        @O1.a
        private com.google.common.base.z.b m(String s, Object object0) {
            com.google.common.base.z.b.a z$b$a0 = this.k();
            z$b$a0.b = object0;
            z$b$a0.a = (String)H.E(s);
            return this;
        }

        @O1.a
        public com.google.common.base.z.b n(char c) {
            return this.l(String.valueOf(c));
        }

        @O1.a
        public com.google.common.base.z.b o(double f) {
            return this.l(String.valueOf(f));
        }

        @O1.a
        public com.google.common.base.z.b p(float f) {
            return this.l(String.valueOf(f));
        }

        @O1.a
        public com.google.common.base.z.b q(int v) {
            return this.l(String.valueOf(v));
        }

        @O1.a
        public com.google.common.base.z.b r(long v) {
            return this.l(String.valueOf(v));
        }

        @O1.a
        public com.google.common.base.z.b s(@o3.a Object object0) {
            return this.i(object0);
        }

        @O1.a
        public com.google.common.base.z.b t(boolean z) {
            return this.l(String.valueOf(z));
        }

        @Override
        public String toString() {
            boolean z = this.d;
            boolean z1 = this.e;
            StringBuilder stringBuilder0 = new StringBuilder(0x20);
            stringBuilder0.append(this.a);
            stringBuilder0.append('{');
            com.google.common.base.z.b.b z$b$b0 = this.b.c;
            String s = "";
            while(z$b$b0 != null) {
                Object object0 = z$b$b0.b;
                if(z$b$b0 instanceof com.google.common.base.z.b.a || !z || object0 != null && (!z1 || !com.google.common.base.z.b.u(object0))) {
                    stringBuilder0.append(s);
                    String s1 = z$b$b0.a;
                    if(s1 != null) {
                        stringBuilder0.append(s1);
                        stringBuilder0.append('=');
                    }
                    if(object0 == null || !object0.getClass().isArray()) {
                        stringBuilder0.append(object0);
                    }
                    else {
                        String s2 = Arrays.deepToString(new Object[]{object0});
                        stringBuilder0.append(s2, 1, s2.length() - 1);
                    }
                    s = ", ";
                }
                z$b$b0 = z$b$b0.c;
            }
            stringBuilder0.append('}');
            return stringBuilder0.toString();
        }

        private static boolean u(Object object0) {
            if(object0 instanceof CharSequence) {
                return ((CharSequence)object0).length() == 0;
            }
            if(object0 instanceof Collection) {
                return ((Collection)object0).isEmpty();
            }
            if(object0 instanceof Map) {
                return ((Map)object0).isEmpty();
            }
            return object0 instanceof C ? !((C)object0).e() : object0.getClass().isArray() && Array.getLength(object0) == 0;
        }

        @O1.a
        public com.google.common.base.z.b v() {
            this.d = true;
            return this;
        }
    }

    public static Object a(@o3.a Object object0, @o3.a Object object1) {
        if(object0 != null) {
            return object0;
        }
        if(object1 == null) {
            throw new NullPointerException("Both parameters are null");
        }
        return object1;
    }

    public static com.google.common.base.z.b b(Class class0) {
        return new com.google.common.base.z.b(class0.getSimpleName(), null);
    }

    public static com.google.common.base.z.b c(Object object0) {
        return new com.google.common.base.z.b(object0.getClass().getSimpleName(), null);
    }

    public static com.google.common.base.z.b d(String s) {
        return new com.google.common.base.z.b(s, null);
    }
}

