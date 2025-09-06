package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import y4.m;

@b0
@s0({"SMAP\nSelectUnbiased.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1855#2,2:66\n*S KotlinDebug\n*F\n+ 1 SelectUnbiased.kt\nkotlinx/coroutines/selects/UnbiasedSelectImplementation\n*L\n60#1:66,2\n*E\n"})
public class t extends l {
    @y4.l
    private final List g;

    public t(@y4.l g g0) {
        super(g0);
        this.g = new ArrayList();
    }

    @b0
    static Object P(t t0, d d0) {
        t0.Q();
        return t0.super.w(d0);
    }

    private final void Q() {
        try {
            Collections.shuffle(this.g);
            for(Object object0: this.g) {
                l.I(this, ((a)object0), false, 1, null);
            }
        }
        finally {
            this.g.clear();
        }
    }

    @Override  // kotlinx.coroutines.selects.l
    public void b(@y4.l e e0, @y4.l Function1 function10) {
        a l$a0 = new a(this, e0.d(), e0.c(), e0.b(), o.l(), function10, e0.a());
        this.g.add(l$a0);
    }

    @Override  // kotlinx.coroutines.selects.l
    public void e(@y4.l i i0, Object object0, @y4.l A3.o o0) {
        a l$a0 = new a(this, i0.d(), i0.c(), i0.b(), object0, o0, i0.a());
        this.g.add(l$a0);
    }

    @Override  // kotlinx.coroutines.selects.l
    public void f(@y4.l kotlinx.coroutines.selects.g g0, @y4.l A3.o o0) {
        a l$a0 = new a(this, g0.d(), g0.c(), g0.b(), null, o0, g0.a());
        this.g.add(l$a0);
    }

    @Override  // kotlinx.coroutines.selects.l
    @b0
    @m
    public Object w(@y4.l d d0) {
        return t.P(this, d0);
    }
}

