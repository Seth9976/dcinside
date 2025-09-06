package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.e;
import y4.l;
import y4.m;

final class z implements d, e {
    @l
    private final d a;
    @l
    private final g b;

    public z(@l d d0, @l g g0) {
        this.a = d0;
        this.b = g0;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public e getCallerFrame() {
        return this.a instanceof e ? ((e)this.a) : null;
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return this.b;
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        this.a.resumeWith(object0);
    }
}

