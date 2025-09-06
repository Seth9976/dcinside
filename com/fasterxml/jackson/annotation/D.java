package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface d {
    public static class com.fasterxml.jackson.annotation.d.a implements b, Serializable {
        protected final Object a;
        protected final Boolean b;
        private static final long c = 1L;
        protected static final com.fasterxml.jackson.annotation.d.a d;

        static {
            com.fasterxml.jackson.annotation.d.a.d = new com.fasterxml.jackson.annotation.d.a(null, null);
        }

        protected com.fasterxml.jackson.annotation.d.a(Object object0, Boolean boolean0) {
            this.a = object0;
            this.b = boolean0;
        }

        @Override  // com.fasterxml.jackson.annotation.b
        public Class a() {
            return d.class;
        }

        private static boolean b(Object object0, Boolean boolean0) {
            return object0 == null && boolean0 == null;
        }

        public static com.fasterxml.jackson.annotation.d.a c(Object object0, Boolean boolean0) {
            if("".equals(object0)) {
                object0 = null;
            }
            return com.fasterxml.jackson.annotation.d.a.b(object0, boolean0) ? com.fasterxml.jackson.annotation.d.a.d : new com.fasterxml.jackson.annotation.d.a(object0, boolean0);
        }

        public static com.fasterxml.jackson.annotation.d.a d() {
            return com.fasterxml.jackson.annotation.d.a.d;
        }

        public static com.fasterxml.jackson.annotation.d.a e(Object object0) {
            return com.fasterxml.jackson.annotation.d.a.c(object0, null);
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(object0 == null) {
                return false;
            }
            if(object0.getClass() == this.getClass() && Q.c(this.b, ((com.fasterxml.jackson.annotation.d.a)object0).b)) {
                return this.a == null ? ((com.fasterxml.jackson.annotation.d.a)object0).a == null : this.a.equals(((com.fasterxml.jackson.annotation.d.a)object0).a);
            }
            return false;
        }

        public static com.fasterxml.jackson.annotation.d.a f(d d0) {
            return d0 == null ? com.fasterxml.jackson.annotation.d.a.d : com.fasterxml.jackson.annotation.d.a.c(d0.value(), d0.useInput().a());
        }

        public Object g() {
            return this.a;
        }

        public Boolean h() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = this.a == null ? 1 : this.a.hashCode() + 1;
            return this.b == null ? v : v + this.b.hashCode();
        }

        public boolean i() {
            return this.a != null;
        }

        public boolean j(boolean z) {
            return this.b == null ? z : this.b.booleanValue();
        }

        public com.fasterxml.jackson.annotation.d.a k(Object object0) {
            if(object0 == null) {
                return this.a == null ? this : new com.fasterxml.jackson.annotation.d.a(null, this.b);
            }
            return object0.equals(this.a) ? this : new com.fasterxml.jackson.annotation.d.a(object0, this.b);
        }

        public com.fasterxml.jackson.annotation.d.a l(Boolean boolean0) {
            if(boolean0 == null) {
                return this.b == null ? this : new com.fasterxml.jackson.annotation.d.a(this.a, null);
            }
            return boolean0.equals(this.b) ? this : new com.fasterxml.jackson.annotation.d.a(this.a, boolean0);
        }

        @Override
        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.a, this.b);
        }
    }

    Q useInput() default Q.c;

    String value() default "";
}

