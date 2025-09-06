package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.U;
import y4.l;
import z3.f;

public final class n extends k {
    @l
    @f
    public final Runnable c;

    public n(@l Runnable runnable0, long v, @l kotlinx.coroutines.scheduling.l l0) {
        super(v, l0);
        this.c = runnable0;
    }

    @Override
    public void run() {
        try {
            this.c.run();
        }
        finally {
            this.b.t();
        }
    }

    @Override
    @l
    public String toString() {
        return "Task[" + U.a(this.c) + '@' + U.b(this.c) + ", " + this.a + ", " + this.b + ']';
    }
}

