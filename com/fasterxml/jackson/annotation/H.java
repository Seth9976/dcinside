package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface h {
    static class com.fasterxml.jackson.annotation.h.a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[S.values().length];
            com.fasterxml.jackson.annotation.h.a.b = arr_v;
            try {
                arr_v[S.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.b[S.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.b[S.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.b[S.e.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.b[S.f.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.b[S.b.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.b[S.g.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[c.values().length];
            com.fasterxml.jackson.annotation.h.a.a = arr_v1;
            try {
                arr_v1[c.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.a[c.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.a[c.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.a[c.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.fasterxml.jackson.annotation.h.a.a[c.d.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static class b implements com.fasterxml.jackson.annotation.b, Serializable {
        protected final c a;
        protected final c b;
        protected final c c;
        protected final c d;
        protected final c e;
        private static final long f = 1L;
        private static final c g;
        protected static final b h;
        protected static final b i;

        static {
            b.g = c.d;
            b.h = new b(c.d, c.d, c.d, c.a, c.d);
            b.i = new b(c.f, c.f, c.f, c.f, c.f);
        }

        private b(c h$c0, c h$c1, c h$c2, c h$c3, c h$c4) {
            this.a = h$c0;
            this.b = h$c1;
            this.c = h$c2;
            this.d = h$c3;
            this.e = h$c4;
        }

        @Override  // com.fasterxml.jackson.annotation.b
        public Class a() {
            return h.class;
        }

        private static boolean b(b h$b0, b h$b1) {
            return h$b0.a == h$b1.a && h$b0.b == h$b1.b && h$b0.c == h$b1.c && h$b0.d == h$b1.d && h$b0.e == h$b1.e;
        }

        private static b c(c h$c0, c h$c1, c h$c2, c h$c3, c h$c4) {
            if(h$c0 == b.g) {
                return h$c1 != b.h.b || h$c2 != b.h.c || h$c3 != b.h.d || h$c4 != b.h.e ? null : b.h;
            }
            return h$c0 != c.f || h$c1 != c.f || h$c2 != c.f || h$c3 != c.f || h$c4 != c.f ? null : b.i;
        }

        public static b d(c h$c0, c h$c1, c h$c2, c h$c3, c h$c4) {
            b h$b0 = b.c(h$c0, h$c1, h$c2, h$c3, h$c4);
            return h$b0 == null ? new b(h$c0, h$c1, h$c2, h$c3, h$c4) : h$b0;
        }

        public static b e(S s0, c h$c0) {
            c h$c1 = c.f;
            switch(s0) {
                case 1: {
                    return b.d(h$c1, h$c1, h$c1, h$c1, h$c0);
                }
                case 2: {
                    return b.d(h$c0, h$c1, h$c1, h$c1, h$c1);
                }
                case 3: {
                    return b.d(h$c1, h$c0, h$c1, h$c1, h$c1);
                }
                case 4: {
                    return b.d(h$c1, h$c1, h$c0, h$c1, h$c1);
                }
                case 6: {
                    return b.d(h$c1, h$c1, h$c1, h$c0, h$c1);
                }
                case 7: {
                    return b.d(h$c0, h$c0, h$c0, h$c0, h$c0);
                }
                default: {
                    return b.d(h$c1, h$c1, h$c1, h$c1, h$c1);
                }
            }
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 == null ? false : object0.getClass() == this.getClass() && b.b(this, ((b)object0));
        }

        public static b f() {
            return b.h;
        }

        public static b g(h h0) {
            return b.d(h0.fieldVisibility(), h0.getterVisibility(), h0.isGetterVisibility(), h0.setterVisibility(), h0.creatorVisibility());
        }

        public c h() {
            return this.e;
        }

        @Override
        public int hashCode() {
            return this.a.ordinal() + 1 ^ this.b.ordinal() * 3 - this.c.ordinal() * 7 + this.d.ordinal() * 11 ^ this.e.ordinal() * 13;
        }

        public c i() {
            return this.a;
        }

        public c j() {
            return this.b;
        }

        public c k() {
            return this.c;
        }

        public c l() {
            return this.d;
        }

        public static b m(b h$b0, b h$b1) {
            return h$b0 == null ? h$b1 : h$b0.u(h$b1);
        }

        public static b n() {
            return b.i;
        }

        protected Object o() {
            b h$b0 = b.c(this.a, this.b, this.c, this.d, this.e);
            return h$b0 == null ? this : h$b0;
        }

        public b p(c h$c0) {
            return b.d(this.a, this.b, this.c, this.d, h$c0);
        }

        public b q(c h$c0) {
            return b.d(h$c0, this.b, this.c, this.d, this.e);
        }

        public b r(c h$c0) {
            return b.d(this.a, h$c0, this.c, this.d, this.e);
        }

        public b s(c h$c0) {
            return b.d(this.a, this.b, h$c0, this.d, this.e);
        }

        @Override
        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this.a, this.b, this.c, this.d, this.e);
        }

        public b u(b h$b0) {
            if(h$b0 == null || h$b0 == b.i || h$b0 == this || b.b(this, h$b0)) {
                return this;
            }
            c h$c0 = h$b0.a;
            c h$c1 = c.f;
            if(h$c0 == h$c1) {
                h$c0 = this.a;
            }
            return b.d(h$c0, (h$b0.b == h$c1 ? this.b : h$b0.b), (h$b0.c == h$c1 ? this.c : h$b0.c), (h$b0.d == h$c1 ? this.d : h$b0.d), (h$b0.e == h$c1 ? this.e : h$b0.e));
        }

        public b w(c h$c0) {
            return b.d(this.a, this.b, this.c, h$c0, this.e);
        }
    }

    public static enum c {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean a(Member member0) {
            switch(this) {
                case 1: {
                    return true;
                }
                case 3: {
                    return !Modifier.isPrivate(member0.getModifiers());
                }
                case 4: {
                    return Modifier.isProtected(member0.getModifiers()) ? true : Modifier.isPublic(member0.getModifiers());
                }
                case 5: {
                    return Modifier.isPublic(member0.getModifiers());
                }
                default: {
                    return false;
                }
            }
        }
    }

    c creatorVisibility() default c.f;

    c fieldVisibility() default c.f;

    c getterVisibility() default c.f;

    c isGetterVisibility() default c.f;

    c setterVisibility() default c.f;
}

