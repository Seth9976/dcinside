package com.google.common.eventbus;

import com.google.common.base.H;
import com.google.common.base.z;
import com.google.common.util.concurrent.C0;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

@e
public class f {
    static final class a implements l {
        static final a a;

        static {
            a.a = new a();
        }

        @Override  // com.google.common.eventbus.l
        public void a(Throwable throwable0, k k0) {
            Logger logger0 = a.b(k0);
            Level level0 = Level.SEVERE;
            if(logger0.isLoggable(level0)) {
                logger0.log(level0, a.c(k0), throwable0);
            }
        }

        // 去混淆评级： 低(40)
        private static Logger b(k k0) {
            return Logger.getLogger(("com.google.common.eventbus.f." + k0.b().c()));
        }

        private static String c(k k0) {
            Method method0 = k0.d();
            return "Exception thrown by subscriber method " + method0.getName() + '(' + method0.getParameterTypes()[0].getName() + ')' + " on subscriber " + k0.c() + " when dispatching event: " + k0.a();
        }
    }

    private final String a;
    private final Executor b;
    private final l c;
    private final m d;
    private final d e;
    private static final Logger f;

    static {
        f.f = Logger.getLogger("com.google.common.eventbus.f");
    }

    public f() {
        this("default");
    }

    public f(l l0) {
        this("default", C0.c(), d.d(), l0);
    }

    public f(String s) {
        this(s, C0.c(), d.d(), a.a);
    }

    f(String s, Executor executor0, d d0, l l0) {
        this.d = new m(this);
        this.a = (String)H.E(s);
        this.b = (Executor)H.E(executor0);
        this.e = (d)H.E(d0);
        this.c = (l)H.E(l0);
    }

    final Executor a() {
        return this.b;
    }

    void b(Throwable throwable0, k k0) {
        H.E(throwable0);
        H.E(k0);
        try {
            this.c.a(throwable0, k0);
        }
        catch(Throwable throwable1) {
            f.f.log(Level.SEVERE, String.format(Locale.ROOT, "Exception %s thrown while handling exception: %s", throwable1, throwable0), throwable1);
        }
    }

    public final String c() {
        return this.a;
    }

    public void d(Object object0) {
        Iterator iterator0 = this.d.f(object0);
        if(iterator0.hasNext()) {
            this.e.a(object0, iterator0);
            return;
        }
        if(!(object0 instanceof c)) {
            this.d(new c(this, object0));
        }
    }

    public void e(Object object0) {
        this.d.h(object0);
    }

    public void f(Object object0) {
        this.d.i(object0);
    }

    @Override
    public String toString() {
        return z.c(this).s(this.a).toString();
    }
}

