package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
final class g extends a {
    @l
    private final Thread d;
    @m
    private final o0 e;

    public g(@l kotlin.coroutines.g g0, @l Thread thread0, @m o0 o00) {
        super(g0, true, true);
        this.d = thread0;
        this.e = o00;
    }

    public final Object Q1() {
        C c0;
        S0 s00;
        b b0 = c.a;
        if(b0 != null) {
            b0.d();
        }
        try {
            o0 o00 = this.e;
            c0 = null;
            if(o00 != null) {
                o0.i2(o00, false, 1, null);
            }
            try {
                while(true) {
                    if(Thread.interrupted()) {
                        InterruptedException interruptedException0 = new InterruptedException();
                        this.h0(interruptedException0);
                        throw interruptedException0;
                    }
                    long v1 = this.e == null ? 0x7FFFFFFFFFFFFFFFL : this.e.t2();
                    if(this.k()) {
                        break;
                    }
                    b b1 = c.a;
                    if(b1 == null) {
                        s00 = null;
                    }
                    else {
                        b1.c(this, v1);
                        s00 = S0.a;
                    }
                    if(s00 == null) {
                        LockSupport.parkNanos(this, v1);
                    }
                }
            }
            catch(Throwable throwable0) {
                o0 o01 = this.e;
                if(o01 != null) {
                    o0.J1(o01, false, 1, null);
                }
                throw throwable0;
            }
            o0 o02 = this.e;
            if(o02 != null) {
                o0.J1(o02, false, 1, null);
            }
        }
        finally {
            b b2 = c.a;
            if(b2 != null) {
                b2.h();
            }
        }
        Object object0 = R0.h(this.K0());
        if(object0 instanceof C) {
            c0 = (C)object0;
        }
        if(c0 != null) {
            throw c0.a;
        }
        return object0;
    }

    @Override  // kotlinx.coroutines.Q0
    protected boolean X0() {
        return true;
    }

    @Override  // kotlinx.coroutines.Q0
    protected void b0(@m Object object0) {
        S0 s00;
        if(!L.g(Thread.currentThread(), this.d)) {
            Thread thread0 = this.d;
            b b0 = c.a;
            if(b0 == null) {
                s00 = null;
            }
            else {
                b0.g(thread0);
                s00 = S0.a;
            }
            if(s00 == null) {
                LockSupport.unpark(thread0);
            }
        }
    }
}

