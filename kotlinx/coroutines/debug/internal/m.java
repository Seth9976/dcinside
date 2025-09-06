package kotlinx.coroutines.debug.internal;

import kotlin.b0;
import kotlin.coroutines.jvm.internal.e;
import y4.l;
import z3.f;

@b0
public final class m implements e {
    @y4.m
    private final e a;
    @l
    @f
    public final StackTraceElement b;

    public m(@y4.m e e0, @l StackTraceElement stackTraceElement0) {
        this.a = e0;
        this.b = stackTraceElement0;
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @y4.m
    public e getCallerFrame() {
        return this.a;
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @l
    public StackTraceElement getStackTraceElement() {
        return this.b;
    }
}

