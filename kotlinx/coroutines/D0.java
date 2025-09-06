package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.internal.o;
import y4.l;
import y4.m;
import z3.f;

@b0
public final class d0 extends Q {
    @f
    private volatile int _decision$volatile;
    private static final AtomicIntegerFieldUpdater e;

    static {
        d0.e = AtomicIntegerFieldUpdater.newUpdater(d0.class, "_decision$volatile");
    }

    public d0(@l g g0, @l d d0) {
        super(g0, d0);
    }

    @Override  // kotlinx.coroutines.internal.Q
    protected void L1(@m Object object0) {
        if(this.T1()) {
            return;
        }
        o.e(b.e(this.d), G.a(object0, this.d), null, 2, null);
    }

    @m
    public final Object Q1() {
        if(this.U1()) {
            return b.l();
        }
        Object object0 = R0.h(this.K0());
        if(object0 instanceof C) {
            throw ((C)object0).a;
        }
        return object0;
    }

    private final void S1(Object object0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicIntegerFieldUpdater0.get(object0));
        }
    }

    private final boolean T1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = d0.e;
    alab1:
        while(true) {
            switch(atomicIntegerFieldUpdater0.get(this)) {
                case 0: {
                    if(!d0.e.compareAndSet(this, 0, 2)) {
                        break;
                    }
                    break alab1;
                }
                case 1: {
                    return false;
                }
                default: {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
        return true;
    }

    private final boolean U1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = d0.e;
    alab1:
        while(true) {
            switch(atomicIntegerFieldUpdater0.get(this)) {
                case 0: {
                    if(!d0.e.compareAndSet(this, 0, 1)) {
                        break;
                    }
                    break alab1;
                }
                case 2: {
                    return false;
                }
                default: {
                    throw new IllegalStateException("Already suspended");
                }
            }
        }
        return true;
    }

    @Override  // kotlinx.coroutines.internal.Q
    protected void b0(@m Object object0) {
        this.L1(object0);
    }
}

