package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.util.concurrent.Executor;
import java.util.logging.Level;

@c
@d
@N
public final class P {
    static final class a {
        final Runnable a;
        final Executor b;
        @o3.a
        a c;

        a(Runnable runnable0, Executor executor0, @o3.a a p$a0) {
            this.a = runnable0;
            this.b = executor0;
            this.c = p$a0;
        }
    }

    @P1.a("this")
    @o3.a
    private a a;
    @P1.a("this")
    private boolean b;
    private static final s0 c;

    static {
        P.c = new s0(P.class);
    }

    public void a(Runnable runnable0, Executor executor0) {
        H.F(runnable0, "Runnable was null.");
        H.F(executor0, "Executor was null.");
        synchronized(this) {
            if(!this.b) {
                this.a = new a(runnable0, executor0, this.a);
                return;
            }
        }
        P.c(runnable0, executor0);
    }

    public void b() {
        a p$a1;
        a p$a0;
        synchronized(this) {
            if(this.b) {
                return;
            }
            this.b = true;
            p$a0 = this.a;
            p$a1 = null;
            this.a = null;
        }
        while(p$a0 != null) {
            a p$a2 = p$a0.c;
            p$a0.c = p$a1;
            p$a1 = p$a0;
            p$a0 = p$a2;
        }
        while(p$a1 != null) {
            P.c(p$a1.a, p$a1.b);
            p$a1 = p$a1.c;
        }
    }

    private static void c(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(Exception exception0) {
            P.c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, exception0);
        }
    }
}

