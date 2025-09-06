package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.i;
import y4.l;
import z3.f;

final class g0 implements Executor {
    @l
    @f
    public final K a;

    public g0(@l K k0) {
        this.a = k0;
    }

    @Override
    public void execute(@l Runnable runnable0) {
        i i0 = i.a;
        if(this.a.i1(i0)) {
            this.a.b1(i0, runnable0);
            return;
        }
        runnable0.run();
    }

    // 去混淆评级： 低(20)
    @Override
    @l
    public String toString() {
        return "K@57f8508c";
    }
}

