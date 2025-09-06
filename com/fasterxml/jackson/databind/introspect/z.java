package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.m;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class z extends a {
    public interface com.fasterxml.jackson.databind.introspect.z.a {
        boolean a(char arg1, String arg2, int arg3);
    }

    public static class b implements com.fasterxml.jackson.databind.introspect.z.a {
        private final boolean a;
        private final boolean b;

        protected b(boolean z, boolean z1) {
            this.a = z;
            this.b = z1;
        }

        // 去混淆评级： 低(40)
        @Override  // com.fasterxml.jackson.databind.introspect.z$a
        public boolean a(char c, String s, int v) {
            return Character.isLetter(c) ? this.a || !Character.isLowerCase(c) : this.b;
        }

        public static com.fasterxml.jackson.databind.introspect.z.a b(boolean z, boolean z1) {
            return !z && !z1 ? null : new b(z, z1);
        }
    }

    public static class c extends com.fasterxml.jackson.databind.introspect.a.b implements Serializable {
        protected final String b;
        protected final String c;
        protected final String d;
        protected final String e;
        protected final com.fasterxml.jackson.databind.introspect.z.a f;
        private static final long g = 1L;

        public c() {
            this("set", "with", "get", "is", null);
        }

        protected c(c z$c0, com.fasterxml.jackson.databind.introspect.z.a z$a0) {
            this(z$c0.b, z$c0.c, z$c0.d, z$c0.e, z$a0);
        }

        protected c(c z$c0, String s, String s1, String s2, String s3) {
            this(s, s1, s2, s3, z$c0.f);
        }

        protected c(String s, String s1, String s2, String s3, com.fasterxml.jackson.databind.introspect.z.a z$a0) {
            this.b = s;
            this.c = s1;
            this.d = s2;
            this.e = s3;
            this.f = z$a0;
        }

        @Override  // com.fasterxml.jackson.databind.introspect.a$b
        public a a(t t0, d d0, com.fasterxml.jackson.databind.c c0) {
            com.fasterxml.jackson.databind.annotation.f.a f$a0 = null;
            com.fasterxml.jackson.databind.b b0 = t0.Z() ? t0.n() : null;
            if(b0 != null) {
                f$a0 = b0.P(d0);
            }
            return f$a0 == null ? new z(t0, d0, this.c, this.d, this.e, this.f) : new z(t0, d0, f$a0.b, this.d, this.e, this.f);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.a$b
        public a b(t t0, d d0) {
            return new z(t0, d0, this.b, this.d, this.e, this.f);
        }

        @Override  // com.fasterxml.jackson.databind.introspect.a$b
        public a c(t t0, d d0) {
            return new com.fasterxml.jackson.databind.introspect.z.d(t0, d0);
        }

        public c d(com.fasterxml.jackson.databind.introspect.z.a z$a0) {
            return new c(this, z$a0);
        }

        public c e(String s) {
            return new c(this, this.b, s, this.d, this.e);
        }

        public c f(boolean z, boolean z1) {
            return this.d(b.b(z, z1));
        }

        public c g(String s) {
            return new c(this, this.b, this.c, s, this.e);
        }

        public c h(String s) {
            return new c(this, this.b, this.c, this.d, s);
        }

        public c i(String s) {
            return new c(this, s, this.c, this.d, this.e);
        }
    }

    public static class com.fasterxml.jackson.databind.introspect.z.d extends z {
        protected final Set i;

        public com.fasterxml.jackson.databind.introspect.z.d(t t0, d d0) {
            super(t0, d0, null, "get", "is", null);
            String[] arr_s = com.fasterxml.jackson.databind.jdk14.a.c(d0.f());
            Set set0 = arr_s == null ? Collections.emptySet() : new HashSet(Arrays.asList(arr_s));
            this.i = set0;
        }

        // 去混淆评级： 低(20)
        @Override  // com.fasterxml.jackson.databind.introspect.z
        public String c(l l0, String s) {
            return this.i.contains(s) ? s : super.c(l0, s);
        }
    }

    protected final t a;
    protected final d b;
    protected final com.fasterxml.jackson.databind.introspect.z.a c;
    protected final boolean d;
    protected final boolean e;
    protected final String f;
    protected final String g;
    protected final String h;

    protected z(t t0, d d0, String s, String s1, String s2, com.fasterxml.jackson.databind.introspect.z.a z$a0) {
        this.a = t0;
        this.b = d0;
        this.d = t0.a0(com.fasterxml.jackson.databind.t.C);
        this.e = t0.a0(com.fasterxml.jackson.databind.t.E);
        this.h = s;
        this.f = s1;
        this.g = s2;
        this.c = z$a0;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.a
    public String a(l l0, String s) {
        if(this.g != null && (this.e || this.e(l0.g())) && s.startsWith(this.g)) {
            return this.d ? this.i(s, this.g.length()) : this.h(s, this.g.length());
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.a
    public String b(l l0, String s) {
        if(this.h != null && s.startsWith(this.h)) {
            return this.d ? this.i(s, this.h.length()) : this.h(s, this.h.length());
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.a
    public String c(l l0, String s) {
        if(this.f != null && s.startsWith(this.f)) {
            if("getCallbacks".equals(s)) {
                if(this.f(l0)) {
                    return null;
                }
            }
            else if("getMetaClass".equals(s) && this.g(l0)) {
                return null;
            }
            return this.d ? this.i(s, this.f.length()) : this.h(s, this.f.length());
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.introspect.a
    public String d(i i0, String s) {
        return s;
    }

    private boolean e(m m0) {
        if(m0.s()) {
            m0 = m0.O();
        }
        return m0.j(Boolean.TYPE) || m0.j(Boolean.class) || m0.j(AtomicBoolean.class);
    }

    protected boolean f(l l0) {
        Class class0 = l0.f();
        if(class0.isArray()) {
            String s = class0.getComponentType().getName();
            return s.contains(".cglib") && (s.startsWith("net.sf.cglib") || s.startsWith("org.hibernate.repackage.cglib") || s.startsWith("org.springframework.cglib"));
        }
        return false;
    }

    protected boolean g(l l0) {
        return l0.f().getName().startsWith("groovy.lang");
    }

    protected String h(String s, int v) {
        int v1 = s.length();
        if(v1 == v) {
            return null;
        }
        int v2 = s.charAt(v);
        if(this.c != null && !this.c.a(((char)v2), s, v)) {
            return null;
        }
        int v3 = Character.toLowerCase(((char)v2));
        if(v2 == v3) {
            return s.substring(v);
        }
        StringBuilder stringBuilder0 = new StringBuilder(v1 - v);
        stringBuilder0.append(((char)v3));
        while(true) {
            ++v;
            if(v >= v1) {
                break;
            }
            int v4 = s.charAt(v);
            int v5 = Character.toLowerCase(((char)v4));
            if(v4 == v5) {
                stringBuilder0.append(s, v, v1);
                return stringBuilder0.toString();
            }
            stringBuilder0.append(((char)v5));
        }
        return stringBuilder0.toString();
    }

    protected String i(String s, int v) {
        int v1 = s.length();
        if(v1 == v) {
            return null;
        }
        int v2 = s.charAt(v);
        if(this.c != null && !this.c.a(((char)v2), s, v)) {
            return null;
        }
        int v3 = Character.toLowerCase(((char)v2));
        if(v2 == v3) {
            return s.substring(v);
        }
        if(v + 1 < v1 && Character.isUpperCase(s.charAt(v + 1))) {
            return s.substring(v);
        }
        StringBuilder stringBuilder0 = new StringBuilder(v1 - v);
        stringBuilder0.append(((char)v3));
        stringBuilder0.append(s, v + 1, v1);
        return stringBuilder0.toString();
    }
}

