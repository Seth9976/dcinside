package kotlinx.coroutines.selects;

import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.K;
import kotlinx.coroutines.o;
import y4.l;
import y4.m;

public final class p {
    private static final void c(o o0, Object object0) {
        K k0 = (K)o0.getContext().get(K.a);
        if(k0 != null) {
            o0.X(k0, object0);
            return;
        }
        o0.resumeWith(object0);
    }

    private static final void d(o o0, Throwable throwable0) {
        K k0 = (K)o0.getContext().get(K.a);
        if(k0 != null) {
            o0.u(k0, throwable0);
            return;
        }
        o0.resumeWith(e0.b(f0.a(throwable0)));
    }

    @b0
    @m
    public static final Object e(@l Function1 function10, @l d d0) {
        kotlinx.coroutines.selects.d d1 = new kotlinx.coroutines.selects.d(d0);
        try {
            function10.invoke(d1);
        }
        catch(Throwable throwable0) {
            d1.R(throwable0);
        }
        Object object0 = d1.Q();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @b0
    private static final Object f(Function1 function10, d d0) {
        kotlinx.coroutines.selects.d d1 = new kotlinx.coroutines.selects.d(d0);
        try {
            function10.invoke(d1);
        }
        catch(Throwable throwable0) {
            d1.R(throwable0);
        }
        Object object0 = d1.Q();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @b0
    @m
    public static final Object g(@l Function1 function10, @l d d0) {
        s s0 = new s(d0);
        try {
            function10.invoke(s0);
        }
        catch(Throwable throwable0) {
            s0.S(throwable0);
        }
        Object object0 = s0.T();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @b0
    private static final Object h(Function1 function10, d d0) {
        s s0 = new s(d0);
        try {
            function10.invoke(s0);
        }
        catch(Throwable throwable0) {
            s0.S(throwable0);
        }
        Object object0 = s0.T();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

