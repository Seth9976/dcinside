package kotlinx.coroutines;

import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1461:1\n1#2:1462\n*E\n"})
final class b1 extends P0 {
    @l
    private final p e;

    public b1(@l p p0) {
        this.e = p0;
    }

    @Override  // kotlinx.coroutines.D0
    public void a(@m Throwable throwable0) {
        Object object0 = this.H().K0();
        if(object0 instanceof C) {
            Object object1 = e0.b(f0.a(((C)object0).a));
            this.e.resumeWith(object1);
            return;
        }
        Object object2 = e0.b(R0.h(object0));
        this.e.resumeWith(object2);
    }
}

