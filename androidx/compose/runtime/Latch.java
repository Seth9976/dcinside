package androidx.compose.runtime;

import A3.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,90:1\n70#2:91\n70#2:92\n70#2:93\n70#2:103\n314#3,9:94\n323#3,2:104\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:91\n51#1:92\n57#1:93\n79#1:103\n78#1:94,9\n78#1:104,2\n*E\n"})
public final class Latch {
    @l
    private final Object a;
    @l
    private List b;
    @l
    private List c;
    private boolean d;

    public Latch() {
        this.a = new Object();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = true;
    }

    @m
    public final Object c(@l d d0) {
        if(this.e()) {
            return S0.a;
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        synchronized(this.a) {
            this.b.add(p0);
        }
        p0.K(new Function1(p0) {
            final Latch e;
            final o f;

            {
                this.e = latch0;
                this.f = o0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                synchronized(this.e.a) {
                    this.e.b.remove(this.f);
                }
            }
        });
        Object object1 = p0.x();
        if(object1 == b.l()) {
            h.c(d0);
        }
        return object1 == b.l() ? object1 : S0.a;
    }

    public final void d() {
        synchronized(this.a) {
            this.d = false;
        }
    }

    public final boolean e() {
        synchronized(this.a) {
        }
        return this.d;
    }

    public final void f() {
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            if(!this.e()) {
                List list0 = this.b;
                this.b = this.c;
                this.c = list0;
                this.d = true;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((d)list0.get(v1)).resumeWith(S0.a);
                }
                list0.clear();
                goto label_18;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    label_18:
        __monitor_exit(object0);
        return;
    label_20:
        __monitor_exit(object0);
    }

    public final Object g(@l a a0) {
        L.p(a0, "block");
        this.d();
        try {
            return a0.invoke();
        }
        finally {
            this.f();
        }
    }
}

