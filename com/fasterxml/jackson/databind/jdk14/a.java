package com.fasterxml.jackson.databind.jdk14;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.introspect.f;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.z;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

public class a {
    static class com.fasterxml.jackson.databind.jdk14.a.a {
        protected final d a;
        protected final t b;
        protected final b c;
        protected final List d;
        protected final f e;
        protected final com.fasterxml.jackson.databind.jdk14.a.b[] f;

        com.fasterxml.jackson.databind.jdk14.a.a(d d0, b b0, t t0) {
            this.a = d0;
            this.c = b0;
            this.b = t0;
            com.fasterxml.jackson.databind.jdk14.a.b[] arr_a$b = c.c().b(d0.f());
            this.f = arr_a$b;
            f f0 = null;
            if(arr_a$b == null) {
                this.d = d0.x();
                this.e = null;
                return;
            }
            if(arr_a$b.length == 0) {
                f0 = d0.y();
                this.d = Collections.singletonList(f0);
            }
            else {
                List list0 = d0.x();
                this.d = list0;
                for(Object object0: list0) {
                    f f1 = (f)object0;
                    if(f1.D() == arr_a$b.length) {
                        int v = 0;
                    label_23:
                        if(v < arr_a$b.length) {
                            if(!f1.F(v).equals(this.f[v].a)) {
                                continue;
                            }
                            ++v;
                            goto label_23;
                        }
                        f0 = f1;
                        break;
                    }
                }
            }
            if(f0 == null) {
                throw new IllegalArgumentException("Failed to find the canonical Record constructor of type " + h.Q(this.a.g()));
            }
            this.e = f0;
        }

        public f a(List list0) {
            for(Object object0: this.d) {
                f f0 = (f)object0;
                com.fasterxml.jackson.annotation.k.a k$a0 = this.c.k(this.b, f0);
                if(k$a0 != null && com.fasterxml.jackson.annotation.k.a.d != k$a0) {
                    if(com.fasterxml.jackson.annotation.k.a.b == k$a0) {
                        return null;
                    }
                    if(f0 != this.e) {
                        return null;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            com.fasterxml.jackson.databind.jdk14.a.b[] arr_a$b = this.f;
            if(arr_a$b == null) {
                return null;
            }
            for(int v = 0; v < arr_a$b.length; ++v) {
                list0.add(arr_a$b[v].b);
            }
            return this.e;
        }
    }

    static class com.fasterxml.jackson.databind.jdk14.a.b {
        public final Class a;
        public final String b;

        public com.fasterxml.jackson.databind.jdk14.a.b(Class class0, String s) {
            this.a = class0;
            this.b = s;
        }
    }

    static class c {
        private final Method a;
        private final Method b;
        private final Method c;
        private static final c d;
        private static final RuntimeException e;

        static {
            c a$c0;
            try {
                a$c0 = new c();
                runtimeException0 = null;
            }
            catch(RuntimeException runtimeException0) {
                a$c0 = null;
            }
            c.d = a$c0;
            c.e = runtimeException0;
        }

        private c() throws RuntimeException {
            try {
                this.a = Class.class.getMethod("getRecordComponents", null);
                Class class0 = Class.forName("java.lang.reflect.RecordComponent");
                this.b = class0.getMethod("getName", null);
                this.c = class0.getMethod("getType", null);
            }
            catch(Exception exception0) {
                throw new RuntimeException(String.format("Failed to access Methods needed to support `java.lang.Record`: (%s) %s", exception0.getClass().getName(), exception0.getMessage()), exception0);
            }
        }

        public String[] a(Class class0) throws IllegalArgumentException {
            Object[] arr_object = this.d(class0);
            if(arr_object == null) {
                return null;
            }
            String[] arr_s = new String[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                try {
                    arr_s[v] = (String)this.b.invoke(arr_object[v], null);
                }
                catch(Exception exception0) {
                    String s = h.l0(class0);
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", v, ((int)arr_object.length), s), exception0);
                }
            }
            return arr_s;
        }

        public com.fasterxml.jackson.databind.jdk14.a.b[] b(Class class0) throws IllegalArgumentException {
            Class class1;
            String s;
            Object[] arr_object = this.d(class0);
            if(arr_object == null) {
                return null;
            }
            com.fasterxml.jackson.databind.jdk14.a.b[] arr_a$b = new com.fasterxml.jackson.databind.jdk14.a.b[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                try {
                    s = (String)this.b.invoke(arr_object[v], null);
                }
                catch(Exception exception0) {
                    String s1 = h.l0(class0);
                    throw new IllegalArgumentException(String.format("Failed to access name of field #%d (of %d) of Record type %s", v, ((int)arr_object.length), s1), exception0);
                }
                try {
                    class1 = (Class)this.c.invoke(arr_object[v], null);
                }
                catch(Exception exception1) {
                    String s2 = h.l0(class0);
                    throw new IllegalArgumentException(String.format("Failed to access type of field #%d (of %d) of Record type %s", v, ((int)arr_object.length), s2), exception1);
                }
                arr_a$b[v] = new com.fasterxml.jackson.databind.jdk14.a.b(class1, s);
            }
            return arr_a$b;
        }

        public static c c() {
            RuntimeException runtimeException0 = c.e;
            if(runtimeException0 != null) {
                throw runtimeException0;
            }
            return c.d;
        }

        protected Object[] d(Class class0) throws IllegalArgumentException {
            try {
                return (Object[])this.a.invoke(class0, null);
            }
            catch(Exception exception0) {
                if(!z.c(exception0)) {
                    throw new IllegalArgumentException("Failed to access RecordComponents of type " + h.l0(class0));
                }
                return null;
            }
        }
    }

    public static f a(com.fasterxml.jackson.databind.h h0, com.fasterxml.jackson.databind.c c0, List list0) {
        return a.b(c0.A(), h0.o(), h0.g0(), list0);
    }

    public static f b(d d0, b b0, t t0, List list0) {
        return new com.fasterxml.jackson.databind.jdk14.a.a(d0, b0, t0).a(list0);
    }

    public static String[] c(Class class0) {
        return c.c().a(class0);
    }
}

