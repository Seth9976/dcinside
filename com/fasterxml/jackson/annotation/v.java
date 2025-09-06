package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
public @interface v {
    public static class com.fasterxml.jackson.annotation.v.a implements b, Serializable {
        protected final Set a;
        private static final long b = 1L;
        protected static final com.fasterxml.jackson.annotation.v.a c;

        static {
            com.fasterxml.jackson.annotation.v.a.c = new com.fasterxml.jackson.annotation.v.a(null);
        }

        protected com.fasterxml.jackson.annotation.v.a(Set set0) {
            this.a = set0;
        }

        @Override  // com.fasterxml.jackson.annotation.b
        public Class a() {
            return v.class;
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

        private static boolean c(Set set0, Set set1) {
            return set0 == null ? set1 == null : set0.equals(set1);
        }

        public static com.fasterxml.jackson.annotation.v.a d() {
            return com.fasterxml.jackson.annotation.v.a.c;
        }

        public static com.fasterxml.jackson.annotation.v.a e(v v0) {
            return v0 == null ? com.fasterxml.jackson.annotation.v.a.c : new com.fasterxml.jackson.annotation.v.a(com.fasterxml.jackson.annotation.v.a.b(v0.value()));
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            return object0 == null ? false : object0.getClass() == this.getClass() && com.fasterxml.jackson.annotation.v.a.c(this.a, ((com.fasterxml.jackson.annotation.v.a)object0).a);
        }

        public Set f() {
            return this.a;
        }

        public com.fasterxml.jackson.annotation.v.a g(com.fasterxml.jackson.annotation.v.a v$a0) {
            if(v$a0 != null) {
                Set set0 = v$a0.f();
                if(set0 != null) {
                    if(this.a == null) {
                        return v$a0;
                    }
                    HashSet hashSet0 = new HashSet();
                    for(Object object0: set0) {
                        String s = (String)object0;
                        if(this.a.contains(s)) {
                            hashSet0.add(s);
                        }
                    }
                    return new com.fasterxml.jackson.annotation.v.a(hashSet0);
                }
            }
            return this;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.size();
        }

        @Override
        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.a);
        }
    }

    String[] value() default {};
}

