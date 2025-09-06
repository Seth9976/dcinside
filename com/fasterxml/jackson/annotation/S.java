package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface s {
    public static class com.fasterxml.jackson.annotation.s.a implements b, Serializable {
        protected final Set a;
        protected final boolean b;
        protected final boolean c;
        protected final boolean d;
        protected final boolean e;
        private static final long f = 1L;
        protected static final com.fasterxml.jackson.annotation.s.a g;

        static {
            com.fasterxml.jackson.annotation.s.a.g = new com.fasterxml.jackson.annotation.s.a(Collections.emptySet(), false, false, false, true);
        }

        protected com.fasterxml.jackson.annotation.s.a(Set set0, boolean z, boolean z1, boolean z2, boolean z3) {
            this.a = set0 == null ? Collections.emptySet() : set0;
            this.b = z;
            this.c = z1;
            this.d = z2;
            this.e = z3;
        }

        public com.fasterxml.jackson.annotation.s.a A(Set set0) {
            return com.fasterxml.jackson.annotation.s.a.f(set0, this.b, this.c, this.d, this.e);
        }

        public com.fasterxml.jackson.annotation.s.a B(String[] arr_s) {
            return com.fasterxml.jackson.annotation.s.a.f(com.fasterxml.jackson.annotation.s.a.b(arr_s), this.b, this.c, this.d, this.e);
        }

        // 去混淆评级： 低(20)
        public com.fasterxml.jackson.annotation.s.a C() {
            return this.e ? this : com.fasterxml.jackson.annotation.s.a.f(this.a, this.b, this.c, this.d, true);
        }

        public com.fasterxml.jackson.annotation.s.a D(com.fasterxml.jackson.annotation.s.a s$a0) {
            if(s$a0 != null && s$a0 != com.fasterxml.jackson.annotation.s.a.g) {
                if(!s$a0.e) {
                    return s$a0;
                }
                if(com.fasterxml.jackson.annotation.s.a.d(this, s$a0)) {
                    return this;
                }
                Set set0 = com.fasterxml.jackson.annotation.s.a.e(this.a, s$a0.a);
                boolean z = false;
                boolean z1 = this.b || s$a0.b;
                boolean z2 = this.c || s$a0.c;
                if(this.d || s$a0.d) {
                    z = true;
                }
                return com.fasterxml.jackson.annotation.s.a.f(set0, z1, z2, z, true);
            }
            return this;
        }

        public com.fasterxml.jackson.annotation.s.a E() {
            return this.c ? com.fasterxml.jackson.annotation.s.a.f(this.a, this.b, false, this.d, this.e) : this;
        }

        public com.fasterxml.jackson.annotation.s.a F() {
            return this.d ? com.fasterxml.jackson.annotation.s.a.f(this.a, this.b, this.c, false, this.e) : this;
        }

        public com.fasterxml.jackson.annotation.s.a G() {
            return this.b ? com.fasterxml.jackson.annotation.s.a.f(this.a, false, this.c, this.d, this.e) : this;
        }

        public com.fasterxml.jackson.annotation.s.a H() {
            return com.fasterxml.jackson.annotation.s.a.f(null, this.b, this.c, this.d, this.e);
        }

        public com.fasterxml.jackson.annotation.s.a I() {
            return this.e ? com.fasterxml.jackson.annotation.s.a.f(this.a, this.b, this.c, this.d, false) : this;
        }

        @Override  // com.fasterxml.jackson.annotation.b
        public Class a() {
            return s.class;
        }

        private static Set b(String[] arr_s) {
            if(arr_s != null && arr_s.length != 0) {
                Set set0 = new HashSet(arr_s.length);
                for(int v = 0; v < arr_s.length; ++v) {
                    set0.add(arr_s[v]);
                }
                return set0;
            }
            return Collections.emptySet();
        }

        private static boolean c(Set set0, boolean z, boolean z1, boolean z2, boolean z3) {
            return z == com.fasterxml.jackson.annotation.s.a.g.b && z1 == com.fasterxml.jackson.annotation.s.a.g.c && z2 == com.fasterxml.jackson.annotation.s.a.g.d && z3 == com.fasterxml.jackson.annotation.s.a.g.e && (set0 == null || set0.size() == 0);
        }

        private static boolean d(com.fasterxml.jackson.annotation.s.a s$a0, com.fasterxml.jackson.annotation.s.a s$a1) {
            return s$a0.b == s$a1.b && s$a0.e == s$a1.e && s$a0.c == s$a1.c && s$a0.d == s$a1.d && s$a0.a.equals(s$a1.a);
        }

        private static Set e(Set set0, Set set1) {
            if(set0.isEmpty()) {
                return set1;
            }
            if(set1.isEmpty()) {
                return set0;
            }
            Set set2 = new HashSet(set0.size() + set1.size());
            ((AbstractCollection)set2).addAll(set0);
            ((AbstractCollection)set2).addAll(set1);
            return set2;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 == null ? false : object0.getClass() == this.getClass() && com.fasterxml.jackson.annotation.s.a.d(this, ((com.fasterxml.jackson.annotation.s.a)object0));
        }

        // 去混淆评级： 低(20)
        public static com.fasterxml.jackson.annotation.s.a f(Set set0, boolean z, boolean z1, boolean z2, boolean z3) {
            return com.fasterxml.jackson.annotation.s.a.c(set0, z, z1, z2, z3) ? com.fasterxml.jackson.annotation.s.a.g : new com.fasterxml.jackson.annotation.s.a(set0, z, z1, z2, z3);
        }

        public static com.fasterxml.jackson.annotation.s.a g() {
            return com.fasterxml.jackson.annotation.s.a.g;
        }

        // 去混淆评级： 低(20)
        public Set h() {
            return this.d ? Collections.emptySet() : this.a;
        }

        @Override
        public int hashCode() {
            int v = this.a.size();
            int v1 = this.b ? 1 : -3;
            int v2 = this.c ? 3 : -7;
            int v3 = this.d ? 7 : -11;
            return this.e ? v + v1 + v2 + v3 + 11 : v + v1 + v2 + v3 - 13;
        }

        // 去混淆评级： 低(20)
        public Set i() {
            return this.c ? Collections.emptySet() : this.a;
        }

        // 去混淆评级： 低(20)
        public static com.fasterxml.jackson.annotation.s.a j(boolean z) {
            return z ? com.fasterxml.jackson.annotation.s.a.g.z() : com.fasterxml.jackson.annotation.s.a.g.G();
        }

        public static com.fasterxml.jackson.annotation.s.a k(Set set0) {
            return com.fasterxml.jackson.annotation.s.a.g.A(set0);
        }

        public static com.fasterxml.jackson.annotation.s.a l(String[] arr_s) {
            if(arr_s.length == 0) {
                return com.fasterxml.jackson.annotation.s.a.g;
            }
            Set set0 = com.fasterxml.jackson.annotation.s.a.b(arr_s);
            return com.fasterxml.jackson.annotation.s.a.g.A(set0);
        }

        public static com.fasterxml.jackson.annotation.s.a m(s s0) {
            return s0 == null ? com.fasterxml.jackson.annotation.s.a.g : com.fasterxml.jackson.annotation.s.a.f(com.fasterxml.jackson.annotation.s.a.b(s0.value()), s0.ignoreUnknown(), s0.allowGetters(), s0.allowSetters(), false);
        }

        public boolean n() {
            return this.c;
        }

        public boolean o() {
            return this.d;
        }

        public boolean p() {
            return this.b;
        }

        public Set q() {
            return this.a;
        }

        public boolean r() {
            return this.e;
        }

        public static com.fasterxml.jackson.annotation.s.a s(com.fasterxml.jackson.annotation.s.a s$a0, com.fasterxml.jackson.annotation.s.a s$a1) {
            return s$a0 == null ? s$a1 : s$a0.D(s$a1);
        }

        @Override
        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.a, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
        }

        public static com.fasterxml.jackson.annotation.s.a u(com.fasterxml.jackson.annotation.s.a[] arr_s$a) {
            com.fasterxml.jackson.annotation.s.a s$a0 = null;
            for(int v = 0; v < arr_s$a.length; ++v) {
                com.fasterxml.jackson.annotation.s.a s$a1 = arr_s$a[v];
                if(s$a1 != null) {
                    if(s$a0 != null) {
                        s$a1 = s$a0.D(s$a1);
                    }
                    s$a0 = s$a1;
                }
            }
            return s$a0;
        }

        // 去混淆评级： 低(20)
        protected Object w() {
            return com.fasterxml.jackson.annotation.s.a.c(this.a, this.b, this.c, this.d, this.e) ? com.fasterxml.jackson.annotation.s.a.g : this;
        }

        // 去混淆评级： 低(20)
        public com.fasterxml.jackson.annotation.s.a x() {
            return this.c ? this : com.fasterxml.jackson.annotation.s.a.f(this.a, this.b, true, this.d, this.e);
        }

        // 去混淆评级： 低(20)
        public com.fasterxml.jackson.annotation.s.a y() {
            return this.d ? this : com.fasterxml.jackson.annotation.s.a.f(this.a, this.b, this.c, true, this.e);
        }

        // 去混淆评级： 低(20)
        public com.fasterxml.jackson.annotation.s.a z() {
            return this.b ? this : com.fasterxml.jackson.annotation.s.a.f(this.a, true, this.c, this.d, this.e);
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}

