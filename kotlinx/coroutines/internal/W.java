package kotlinx.coroutines.internal;

import kotlin.jvm.internal.s0;

@s0({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class w {
    public static final void a(int v) {
        if(v < 1) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + v).toString());
        }
    }
}

