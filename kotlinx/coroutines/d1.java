package kotlinx.coroutines;

import kotlin.S0;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nExecutors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Executors.kt\nkotlinx/coroutines/ResumeUndispatchedRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
final class d1 implements Runnable {
    @l
    private final K a;
    @l
    private final o b;

    public d1(@l K k0, @l o o0) {
        this.a = k0;
        this.b = o0;
    }

    @Override
    public void run() {
        this.b.X(this.a, S0.a);
    }
}

