package kotlinx.coroutines.channels;

import A3.o;
import A3.p;
import java.util.Collection;
import java.util.Map;
import kotlin.b0;
import kotlin.c0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.Z0;
import y4.l;

public final class r {
    @l
    public static final String a = "Channel was closed";

    public static F E(F f0, g g0, o o0, int v, Object object0) {
        return u.C(f0, g0, o0, v, object0);
    }

    @b0
    @l
    public static final F J(@l F f0, @l g g0, @l o o0) {
        return u.H(f0, g0, o0);
    }

    @b0
    @l
    public static final F L(@l F f0, @l g g0, @l p p0) {
        return u.J(f0, g0, p0);
    }

    public static F M(F f0, g g0, p p0, int v, Object object0) {
        return u.K(f0, g0, p0, v, object0);
    }

    public static F O(F f0, g g0, p p0, int v, Object object0) {
        return u.M(f0, g0, p0, v, object0);
    }

    public static F Q(F f0, g g0, o o0, int v, Object object0) {
        return u.O(f0, g0, o0, v, object0);
    }

    @k(level = m.c, message = "Deprecated in the favour of \'onReceiveCatching\'")
    public static final kotlinx.coroutines.selects.g U(F f0) {
        return t.e(f0);
    }

    @k(level = m.c, message = "Deprecated in the favour of \'receiveCatching\'", replaceWith = @c0(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final Object V(F f0, d d0) {
        return t.f(f0, d0);
    }

    @k(level = m.c, message = "Left for binary compatibility")
    public static final F W(F f0) {
        return u.S(f0);
    }

    @k(level = m.c, message = "Deprecated in the favour of \'trySendBlocking\'. Consider handling the result of \'trySendBlocking\' explicitly and rethrow exception if necessary", replaceWith = @c0(expression = "trySendBlocking(element)", imports = {}))
    public static final void X(G g0, Object object0) {
        s.a(g0, object0);
    }

    @b0
    public static final void b(@l F f0, @y4.m Throwable throwable0) {
        t.a(f0, throwable0);
    }

    public static F b0(F f0, int v, g g0, int v1, Object object0) {
        return u.W(f0, v, g0, v1, object0);
    }

    @k(level = m.b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @Z0
    public static final Object c(@l kotlinx.coroutines.channels.d d0, @l Function1 function10) {
        return u.b(d0, function10);
    }

    public static final Object d(@l F f0, @l Function1 function10) {
        return t.b(f0, function10);
    }

    public static F d0(F f0, g g0, o o0, int v, Object object0) {
        return u.Y(f0, g0, o0, v, object0);
    }

    @k(level = m.b, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @y4.m
    public static final Object e(@l kotlinx.coroutines.channels.d d0, @l Function1 function10, @l d d1) {
        return u.c(d0, function10, d1);
    }

    @b0
    @y4.m
    public static final Object e0(@l F f0, @l G g0, @l d d0) {
        return u.Z(f0, g0, d0);
    }

    @y4.m
    public static final Object f(@l F f0, @l Function1 function10, @l d d0) {
        return t.c(f0, function10, d0);
    }

    @b0
    @y4.m
    public static final Object f0(@l F f0, @l Collection collection0, @l d d0) {
        return u.a0(f0, collection0, d0);
    }

    @b0
    @l
    public static final Function1 g(@l F f0) {
        return u.e(f0);
    }

    @y4.m
    public static final Object g0(@l F f0, @l d d0) {
        return t.g(f0, d0);
    }

    @b0
    @l
    public static final Function1 h(@l F[] arr_f) {
        return u.f(arr_f);
    }

    @b0
    @y4.m
    public static final Object h0(@l F f0, @l Map map0, @l d d0) {
        return u.b0(f0, map0, d0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object i0(F f0, d d0) {
        return u.c0(f0, d0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F j(F f0) {
        return u.h(f0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object j0(F f0, d d0) {
        return u.d0(f0, d0);
    }

    @b0
    @l
    public static final F k(@l F f0, @l g g0, @l o o0) {
        return u.i(f0, g0, o0);
    }

    @b0
    @y4.m
    public static final Object k0(@l F f0, @l d d0) {
        return u.e0(f0, d0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final Object l0(F f0, d d0) {
        return r.k0(f0, d0);
    }

    @l
    public static final Object m0(@l G g0, Object object0) {
        return s.b(g0, object0);
    }

    public static F n(F f0, int v, g g0, int v1, Object object0) {
        return u.l(f0, v, g0, v1, object0);
    }

    public static F o0(F f0, g g0, int v, Object object0) {
        return u.h0(f0, g0, v, object0);
    }

    public static F p(F f0, g g0, o o0, int v, Object object0) {
        return u.n(f0, g0, o0, v, object0);
    }

    @k(level = m.c, message = "Binary compatibility")
    public static final F p0(F f0, F f1) {
        return u.i0(f0, f1);
    }

    @b0
    @l
    public static final F q0(@l F f0, @l F f1, @l g g0, @l o o0) {
        return u.j0(f0, f1, g0, o0);
    }

    @b0
    @l
    public static final F s(@l F f0, @l g g0, @l o o0) {
        return u.q(f0, g0, o0);
    }

    public static F v(F f0, g g0, p p0, int v, Object object0) {
        return u.t(f0, g0, p0, v, object0);
    }

    public static F x(F f0, g g0, o o0, int v, Object object0) {
        return u.v(f0, g0, o0, v, object0);
    }

    @b0
    @l
    public static final F y(@l F f0) {
        return u.w(f0);
    }
}

