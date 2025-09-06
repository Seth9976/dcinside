package com.facebook.cache.disk;

import com.facebook.cache.common.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public interface f {
    public static class com.facebook.cache.disk.f.a {
        public List a;
        public Map b;

        public com.facebook.cache.disk.f.a() {
            this.a = new ArrayList();
            this.b = new HashMap();
        }
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final float d;
        public final String e;

        protected b(String s, String s1, String s2, float f, String s3) {
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = f;
            this.e = s3;
        }
    }

    public interface c {
        r0.a R();

        String getId();

        long getSize();

        long getTimestamp();
    }

    public interface d {
        boolean A();

        r0.a B(Object arg1, long arg2) throws IOException;

        void C(m arg1, Object arg2) throws IOException;

        r0.a D(Object arg1) throws IOException;
    }

    Collection T() throws IOException;

    com.facebook.cache.disk.f.a a() throws IOException;

    void b() throws IOException;

    long c(c arg1) throws IOException;

    d d(String arg1, Object arg2) throws IOException;

    boolean e(String arg1, Object arg2) throws IOException;

    String f();

    void g();

    boolean h(String arg1, Object arg2) throws IOException;

    @h
    r0.a i(String arg1, Object arg2) throws IOException;

    boolean isEnabled();

    boolean isExternal();

    long remove(String arg1) throws IOException;
}

