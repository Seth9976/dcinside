package kotlinx.coroutines.internal;

import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.k1;
import y4.l;
import y4.m;
import z3.f;

final class h0 {
    @l
    @f
    public final g a;
    @l
    private final Object[] b;
    @l
    private final k1[] c;
    private int d;

    public h0(@l g g0, int v) {
        this.a = g0;
        this.b = new Object[v];
        this.c = new k1[v];
    }

    public final void a(@l k1 k10, @m Object object0) {
        int v = this.d;
        this.b[v] = object0;
        this.d = v + 1;
        L.n(k10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        this.c[v] = k10;
    }

    public final void b(@l g g0) {
        int v = this.c.length - 1;
        if(v >= 0) {
            while(true) {
                k1 k10 = this.c[v];
                L.m(k10);
                k10.L(g0, this.b[v]);
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
    }
}

