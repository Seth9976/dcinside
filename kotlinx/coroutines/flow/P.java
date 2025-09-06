package kotlinx.coroutines.flow;

import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.flow.internal.r.a;
import kotlinx.coroutines.flow.internal.r;
import y4.l;

final class p {
    @k(level = m.c, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final i a(i i0, int v) {
        return p.d(i0, v, null, 2, null);
    }

    @l
    public static final i b(@l i i0, int v, @l kotlinx.coroutines.channels.i i1) {
        int v1;
        kotlinx.coroutines.channels.i i2;
        if(v < 0 && (v != -2 && v != -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + v).toString());
        }
        if(v == -1 && i1 != kotlinx.coroutines.channels.i.a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if(v == -1) {
            i2 = kotlinx.coroutines.channels.i.b;
            v1 = 0;
        }
        else {
            v1 = v;
            i2 = i1;
        }
        return i0 instanceof r ? a.a(((r)i0), null, v1, i2, 1, null) : new kotlinx.coroutines.flow.internal.i(i0, null, v1, i2, 2, null);
    }

    public static i c(i i0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -2;
        }
        return p.a(i0, v);
    }

    public static i d(i i0, int v, kotlinx.coroutines.channels.i i1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = -2;
        }
        if((v1 & 2) != 0) {
            i1 = kotlinx.coroutines.channels.i.a;
        }
        return kotlinx.coroutines.flow.k.o(i0, v, i1);
    }

    @l
    public static final i e(@l i i0) {
        return !(i0 instanceof c) ? new d(i0) : i0;
    }

    private static final void f(g g0) {
        if(g0.get(I0.B8) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + g0).toString());
        }
    }

    @l
    public static final i g(@l i i0) {
        return p.d(i0, -1, null, 2, null);
    }

    @l
    public static final i h(@l i i0, @l g g0) {
        p.f(g0);
        if(!L.g(g0, kotlin.coroutines.i.a)) {
            return i0 instanceof r ? a.a(((r)i0), g0, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.i(i0, g0, 0, null, 12, null);
        }
        return i0;
    }
}

