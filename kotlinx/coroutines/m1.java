package kotlinx.coroutines;

import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.V;
import kotlinx.coroutines.internal.e0;
import y4.l;
import y4.m;

@s0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
public final class m1 {
    @l
    public static final m1 a;
    @l
    private static final ThreadLocal b;

    static {
        m1.a = new m1();
        m1.b = e0.b(new V("ThreadLocalEventLoop"));
    }

    @m
    public final o0 a() {
        return (o0)m1.b.get();
    }

    @l
    public final o0 b() {
        ThreadLocal threadLocal0 = m1.b;
        o0 o00 = (o0)threadLocal0.get();
        if(o00 == null) {
            o00 = r0.a();
            threadLocal0.set(o00);
        }
        return o00;
    }

    public final void c() {
        m1.b.set(null);
    }

    public final void d(@l o0 o00) {
        m1.b.set(o00);
    }
}

