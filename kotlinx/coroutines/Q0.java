package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.S0;
import y4.l;

public abstract class q0 extends o0 {
    @l
    protected abstract Thread I2();

    protected void L2(long v, @l c p0$c0) {
        V.h.T3(v, p0$c0);
    }

    protected final void R2() {
        S0 s00;
        Thread thread0 = this.I2();
        if(Thread.currentThread() != thread0) {
            b b0 = kotlinx.coroutines.c.a;
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

