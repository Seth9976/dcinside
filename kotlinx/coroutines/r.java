package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.n;
import y4.l;
import y4.m;

@s0({"SMAP\nCancellableContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"})
public final class r {
    @E0
    public static final void a(@l o o0, @l k0 k00) {
        r.c(o0, new l0(k00));
    }

    @l
    public static final p b(@l d d0) {
        if(!(d0 instanceof n)) {
            return new p(d0, 1);
        }
        p p0 = ((n)d0).l();
        if(p0 != null) {
            if(!p0.W()) {
                p0 = null;
            }
            return p0 == null ? new p(d0, 2) : p0;
        }
        return new p(d0, 2);
    }

    public static final void c(@l o o0, @l kotlinx.coroutines.n n0) {
        if(!(o0 instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p)o0).M(n0);
    }

    @m
    public static final Object d(@l Function1 function10, @l d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        function10.invoke(p0);
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    private static final Object e(Function1 function10, d d0) {
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        function10.invoke(p0);
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @m
    public static final Object f(@l Function1 function10, @l d d0) {
        p p0 = r.b(b.e(d0));
        try {
            function10.invoke(p0);
        }
        catch(Throwable throwable0) {
            p0.V();
            throw throwable0;
        }
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    private static final Object g(Function1 function10, d d0) {
        p p0 = r.b(b.e(d0));
        try {
            function10.invoke(p0);
        }
        catch(Throwable throwable0) {
            p0.V();
            throw throwable0;
        }
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

