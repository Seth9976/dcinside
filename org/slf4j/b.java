package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.event.e;
import org.slf4j.helpers.h;
import org.slf4j.helpers.k;
import org.slf4j.helpers.l;
import org.slf4j.helpers.m;
import org.slf4j.impl.StaticLoggerBinder;

public final class b {
    static final String a = "http://www.slf4j.org/codes.html";
    static final String b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final String c = "http://www.slf4j.org/codes.html#multiple_bindings";
    static final String d = "http://www.slf4j.org/codes.html#null_LF";
    static final String e = "http://www.slf4j.org/codes.html#version_mismatch";
    static final String f = "http://www.slf4j.org/codes.html#substituteLogger";
    static final String g = "http://www.slf4j.org/codes.html#loggerNameMismatch";
    static final String h = "http://www.slf4j.org/codes.html#replay";
    static final String i = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final String j = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final int k = 0;
    static final int l = 1;
    static final int m = 2;
    static final int n = 3;
    static final int o = 4;
    static volatile int p = 0;
    static final l q = null;
    static final h r = null;
    static final String s = "slf4j.detectLoggerNameMismatch";
    static final String t = "java.vendor.url";
    static boolean u;
    private static final String[] v;
    private static String w;

    static {
        b.q = new l();
        b.r = new h();
        b.u = m.f("slf4j.detectLoggerNameMismatch");
        b.v = new String[]{"1.6", "1.7"};
        b.w = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    private static final void a() {
        Set set0;
        try {
            if(b.l()) {
                set0 = null;
            }
            else {
                set0 = b.f();
                b.s(set0);
            }
            StaticLoggerBinder.getSingleton();
            b.p = 3;
            b.r(set0);
            b.g();
            b.p();
            b.q.b();
            return;
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
        }
        catch(NoSuchMethodError noSuchMethodError0) {
            goto label_25;
        }
        catch(Exception exception0) {
            b.e(exception0);
            throw new IllegalStateException("Unexpected initialization failure", exception0);
        }
        if(b.m(noClassDefFoundError0.getMessage())) {
            b.p = 4;
            m.c("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            m.c("Defaulting to no-operation (NOP) logger implementation");
            m.c("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            return;
        }
        b.e(noClassDefFoundError0);
        throw noClassDefFoundError0;
    label_25:
        String s = noSuchMethodError0.getMessage();
        if(s != null && s.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
            b.p = 2;
            m.c("slf4j-api 1.6.x (or later) is incompatible with this binding.");
            m.c("Your binding is version 1.5.5 or earlier.");
            m.c("Upgrade your binding to version 1.6.x.");
        }
        throw noSuchMethodError0;
    }

    private static void b(e e0, int v) {
        if(e0.h().d0()) {
            b.c(v);
            return;
        }
        if(!e0.h().l0()) {
            b.d();
        }
    }

    private static void c(int v) {
        m.c(("A number (" + v + ") of logging calls during the initialization phase have been intercepted and are"));
        m.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        m.c("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void d() {
        m.c("The following set of substitute loggers may have been accessed");
        m.c("during the initialization phase. Logging calls during this");
        m.c("phase were not honored. However, subsequent logging calls to these");
        m.c("loggers will work as normally expected.");
        m.c("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    static void e(Throwable throwable0) {
        b.p = 2;
        m.d("Failed to instantiate SLF4J LoggerFactory", throwable0);
    }

    static Set f() {
        Set set0 = new LinkedHashSet();
        try {
            ClassLoader classLoader0 = b.class.getClassLoader();
            Enumeration enumeration0 = classLoader0 == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader0.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while(true) {
                if(!enumeration0.hasMoreElements()) {
                    return set0;
                }
                set0.add(((URL)enumeration0.nextElement()));
            }
        }
        catch(IOException iOException0) {
        }
        m.d("Error getting resources from path", iOException0);
        return set0;
    }

    private static void g() {
        l l0 = b.q;
        synchronized(l0) {
            l0.f();
            for(Object object0: l0.e()) {
                ((k)object0).p0(b.j(((k)object0).getName()));
            }
        }
    }

    public static ILoggerFactory h() {
        if(b.p == 0) {
            Class class0 = b.class;
            synchronized(class0) {
                if(b.p == 0) {
                    b.p = 1;
                    b.o();
                }
            }
        }
        switch(b.p) {
            case 1: {
                return b.q;
            }
            case 2: {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            case 3: {
                return StaticLoggerBinder.getSingleton().getLoggerFactory();
            }
            case 4: {
                return b.r;
            }
            default: {
                throw new IllegalStateException("Unreachable code");
            }
        }
    }

    public static a i(Class class0) {
        a a0 = b.j(class0.getName());
        if(b.u) {
            Class class1 = m.a();
            if(class1 != null && b.n(class0, class1)) {
                m.c(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", a0.getName(), class1.getName()));
                m.c("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return a0;
    }

    public static a j(String s) {
        return b.h().a(s);
    }

    private static boolean k(Set set0) {
        return set0.size() > 1;
    }

    // 去混淆评级： 中等(90)
    private static boolean l() {
        return true;
    }

    private static boolean m(String s) {
        if(s == null) {
            return false;
        }
        return s.contains("org/slf4j/impl/StaticLoggerBinder") ? true : s.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean n(Class class0, Class class1) {
        return !class1.isAssignableFrom(class0);
    }

    private static final void o() {
        b.a();
        if(b.p == 3) {
            b.u();
        }
    }

    private static void p() {
        LinkedBlockingQueue linkedBlockingQueue0 = b.q.c();
        int v = linkedBlockingQueue0.size();
        ArrayList arrayList0 = new ArrayList(0x80);
        int v1 = 0;
        while(linkedBlockingQueue0.drainTo(arrayList0, 0x80) != 0) {
            for(Object object0: arrayList0) {
                e e0 = (e)object0;
                b.q(e0);
                if(v1 == 0) {
                    b.b(e0, v);
                }
                ++v1;
            }
            arrayList0.clear();
        }
    }

    private static void q(e e0) {
        if(e0 == null) {
            return;
        }
        k k0 = e0.h();
        String s = k0.getName();
        if(k0.n0()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if(!k0.l0()) {
            if(k0.d0()) {
                k0.o0(e0);
                return;
            }
            m.c(s);
        }
    }

    private static void r(Set set0) {
        if(set0 != null && b.k(set0)) {
            m.c(("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]"));
        }
    }

    private static void s(Set set0) {
        if(b.k(set0)) {
            m.c("Class path contains multiple SLF4J bindings.");
            for(Object object0: set0) {
                m.c(("Found binding in [" + ((URL)object0) + "]"));
            }
            m.c("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    static void t() {
        b.p = 0;
    }

    private static final void u() {
        try {
            String s = StaticLoggerBinder.REQUESTED_API_VERSION;
            String[] arr_s = b.v;
            boolean z = false;
            for(int v = 0; v < arr_s.length; ++v) {
                if(s.startsWith(arr_s[v])) {
                    z = true;
                }
            }
            if(!z) {
                m.c(("The requested version " + s + " by your slf4j binding is not compatible with " + "[1.6, 1.7]"));
                m.c("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
                return;
            }
            return;
        }
        catch(NoSuchFieldError unused_ex) {
            return;
        }
        catch(Throwable throwable0) {
        }
        m.d("Unexpected problem occured during version sanity check", throwable0);
    }
}

