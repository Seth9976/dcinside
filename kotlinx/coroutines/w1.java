package kotlinx.coroutines;

import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.internal.Q;
import kotlinx.coroutines.internal.b0;
import y4.l;
import y4.m;

@s0({"SMAP\nCoroutineContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,310:1\n1#2:311\n103#3,13:312\n*S KotlinDebug\n*F\n+ 1 CoroutineContext.kt\nkotlinx/coroutines/UndispatchedCoroutine\n*L\n265#1:312,13\n*E\n"})
public final class w1 extends Q {
    @l
    private final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    public w1(@l g g0, @l d d0) {
        super((g0.get(x1.a) == null ? g0.plus(x1.a) : g0), d0);
        this.e = new ThreadLocal();
        if(!(d0.getContext().get(e.z8) instanceof K)) {
            Object object0 = b0.c(g0, null);
            b0.a(g0, object0);
            this.R1(g0, object0);
        }
    }

    @Override  // kotlinx.coroutines.internal.Q
    protected void L1(@m Object object0) {
        if(this.threadLocalIsSet) {
            V v0 = (V)this.e.get();
            if(v0 != null) {
                b0.a(((g)v0.a()), v0.b());
            }
            this.e.remove();
        }
        Object object1 = G.a(object0, this.d);
        d d0 = this.d;
        g g0 = d0.getContext();
        w1 w10 = null;
        Object object2 = b0.c(g0, null);
        if(object2 != b0.a) {
            w10 = J.g(d0, g0, object2);
        }
        try {
            this.d.resumeWith(object1);
        }
        finally {
            if(w10 == null || w10.Q1()) {
                b0.a(g0, object2);
            }
        }
    }

    public final boolean Q1() {
        int v = !this.threadLocalIsSet || this.e.get() != null ? 0 : 1;
        this.e.remove();
        return v ^ 1;
    }

    public final void R1(@l g g0, @m Object object0) {
        this.threadLocalIsSet = true;
        V v0 = r0.a(g0, object0);
        this.e.set(v0);
    }
}

