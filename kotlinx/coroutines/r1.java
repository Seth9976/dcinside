package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.y;
import y4.l;
import y4.m;

final class r1 implements D0 {
    private volatile int _state$volatile;
    @l
    private final I0 a;
    private final Thread b;
    @m
    private k0 c;
    private static final AtomicIntegerFieldUpdater d;

    static {
        r1.d = AtomicIntegerFieldUpdater.newUpdater(r1.class, "_state$volatile");
    }

    public r1(@l I0 i00) {
        this.a = i00;
        this.b = Thread.currentThread();
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@m Throwable throwable0) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = r1.d;
        do {
            int v = atomicIntegerFieldUpdater0.get(this);
            if(v != 0) {
                if(v != 1 && v != 2 && v != 3) {
                    this.e(v);
                    throw new y();
                }
                return;
            }
        }
        while(!r1.d.compareAndSet(this, 0, 2));
        this.b.interrupt();
        r1.d.set(this, 3);
    }

    public final void b() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = r1.d;
        while(true) {
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v) {
                case 0: {
                    if(r1.d.compareAndSet(this, 0, 1)) {
                        k0 k00 = this.c;
                        if(k00 != null) {
                            k00.dispose();
                        }
                        return;
                    }
                    if(false) {
                        Thread.interrupted();
                        return;
                    }
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    Thread.interrupted();
                    return;
                }
                default: {
                    this.e(v);
                    throw new y();
                }
            }
        }
    }

    private final int c() {
        return this._state$volatile;
    }

    private final Void e(int v) {
        throw new IllegalStateException(("Illegal state " + v).toString());
    }

    private final void f(Object object0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0, Function1 function10) {
        while(true) {
            function10.invoke(atomicIntegerFieldUpdater0.get(object0));
        }
    }

    private final void g(int v) {
        this._state$volatile = v;
    }

    public final void h() {
        this.c = M0.C(this.a, true, true, this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0 = r1.d;
    alab1:
        while(true) {
            int v = atomicIntegerFieldUpdater0.get(this);
            switch(v) {
                case 0: {
                    if(!r1.d.compareAndSet(this, 0, 0)) {
                        break;
                    }
                    break alab1;
                }
                case 2: 
                case 3: {
                    return;
                }
                default: {
                    this.e(v);
                    throw new y();
                }
            }
        }
    }
}

