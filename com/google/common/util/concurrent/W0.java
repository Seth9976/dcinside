package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.collect.g4;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

@c
@d
@N
final class w0 {
    interface a {
        void b(Object arg1);
    }

    static final class b implements Runnable {
        final Object a;
        final Executor b;
        @P1.a("this")
        final Queue c;
        @P1.a("this")
        final Queue d;
        @P1.a("this")
        boolean e;

        b(Object object0, Executor executor0) {
            this.c = g4.d();
            this.d = g4.d();
            this.a = H.E(object0);
            this.b = (Executor)H.E(executor0);
        }

        void a(a w0$a0, Object object0) {
            synchronized(this) {
                this.c.add(w0$a0);
                this.d.add(object0);
            }
        }

        void b() {
            boolean z;
            __monitor_enter(this);
            if(this.e) {
                z = false;
            }
            else {
                z = true;
                this.e = true;
            }
            __monitor_exit(this);
            if(z) {
                try {
                    this.b.execute(this);
                }
                catch(Exception exception0) {
                    synchronized(this) {
                        this.e = false;
                    }
                    w0.b.a().log(Level.SEVERE, "Exception while running callbacks for " + this.a + " on " + this.b, exception0);
                    throw exception0;
                }
            }
        }

        @Override
        public void run() {
            int v1;
            Object object0;
            a w0$a0;
            while(true) {
                try {
                    int v = 1;
                    __monitor_enter(this);
                    try {
                        H.g0(this.e);
                        w0$a0 = (a)this.c.poll();
                        object0 = this.d.poll();
                        if(w0$a0 == null) {
                            this.e = false;
                            try {
                                __monitor_exit(this);
                                return;
                            }
                            catch(Throwable throwable2) {
                                v1 = 0;
                                goto label_17;
                            }
                        }
                        __monitor_exit(this);
                        goto label_26;
                    }
                    catch(Throwable throwable1) {
                        throwable2 = throwable1;
                        v1 = 1;
                    }
                    while(true) {
                    label_17:
                        __monitor_exit(this);
                        break;
                    }
                    try {
                        throw throwable2;
                    }
                    catch(Throwable throwable3) {
                        throwable0 = throwable3;
                        v = v1;
                        break;
                    }
                    try {
                    label_26:
                        w0$a0.b(this.a);
                    }
                    catch(Exception exception0) {
                        w0.b.a().log(Level.SEVERE, "Exception while executing callback: " + this.a + " " + object0, exception0);
                    }
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            if(v != 0) {
                synchronized(this) {
                    this.e = false;
                }
            }
            throw throwable0;
        }
    }

    private final List a;
    private static final s0 b;

    static {
        w0.b = new s0(w0.class);
    }

    w0() {
        this.a = DesugarCollections.synchronizedList(new ArrayList());
    }

    public void b(Object object0, Executor executor0) {
        H.F(object0, "listener");
        H.F(executor0, "executor");
        b w0$b0 = new b(object0, executor0);
        this.a.add(w0$b0);
    }

    public void c() {
        for(int v = 0; v < this.a.size(); ++v) {
            ((b)this.a.get(v)).b();
        }
    }

    public void d(a w0$a0) {
        this.f(w0$a0, w0$a0);
    }

    public void e(a w0$a0, String s) {
        this.f(w0$a0, s);
    }

    private void f(a w0$a0, Object object0) {
        H.F(w0$a0, "event");
        H.F(object0, "label");
        synchronized(this.a) {
            for(Object object1: this.a) {
                ((b)object1).a(w0$a0, object0);
            }
        }
    }
}

