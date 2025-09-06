package org.slf4j;

import java.io.Closeable;
import java.util.Map;
import org.slf4j.helpers.i;
import org.slf4j.helpers.m;
import org.slf4j.impl.StaticMDCBinder;
import org.slf4j.spi.MDCAdapter;

public class c {
    static class a {
    }

    public static class b implements Closeable {
        private final String a;

        private b(String s) {
            this.a = s;
        }

        b(String s, a c$a0) {
            this(s);
        }

        @Override
        public void close() {
            c.h(this.a);
        }
    }

    static final String a = "http://www.slf4j.org/codes.html#null_MDCA";
    static final String b = "http://www.slf4j.org/codes.html#no_static_mdc_binder";
    static MDCAdapter c;

    static {
        try {
            c.c = c.a();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            c.c = new i();
            String s = noClassDefFoundError0.getMessage();
            if(s == null || !s.contains("StaticMDCBinder")) {
                throw noClassDefFoundError0;
            }
            m.c("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            m.c("Defaulting to no-operation MDCAdapter implementation.");
            m.c("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
        catch(Exception exception0) {
            m.d("MDC binding unsuccessful.", exception0);
        }
    }

    private static MDCAdapter a() throws NoClassDefFoundError {
        try {
            return StaticMDCBinder.getSingleton().getMDCA();
        }
        catch(NoSuchMethodError unused_ex) {
            return StaticMDCBinder.SINGLETON.getMDCA();
        }
    }

    public static void b() {
        MDCAdapter mDCAdapter0 = c.c;
        if(mDCAdapter0 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter0.clear();
    }

    public static String c(String s) throws IllegalArgumentException {
        if(s == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter0 = c.c;
        if(mDCAdapter0 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return mDCAdapter0.get(s);
    }

    public static Map d() {
        MDCAdapter mDCAdapter0 = c.c;
        if(mDCAdapter0 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        return mDCAdapter0.b();
    }

    public static MDCAdapter e() {
        return c.c;
    }

    public static void f(String s, String s1) throws IllegalArgumentException {
        if(s == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter0 = c.c;
        if(mDCAdapter0 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter0.a(s, s1);
    }

    public static b g(String s, String s1) throws IllegalArgumentException {
        c.f(s, s1);
        return new b(s, null);
    }

    public static void h(String s) throws IllegalArgumentException {
        if(s == null) {
            throw new IllegalArgumentException("key parameter cannot be null");
        }
        MDCAdapter mDCAdapter0 = c.c;
        if(mDCAdapter0 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter0.remove(s);
    }

    public static void i(Map map0) {
        MDCAdapter mDCAdapter0 = c.c;
        if(mDCAdapter0 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        mDCAdapter0.c(map0);
    }
}

