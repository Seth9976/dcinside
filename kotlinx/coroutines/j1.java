package kotlinx.coroutines;

import A3.o;
import M3.b;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.h;
import y4.l;
import y4.m;

public final class j1 {
    @l
    public static final A a(@m I0 i00) {
        return new i1(i00);
    }

    public static A c(I0 i00, int v, Object object0) {
        if((v & 1) != 0) {
            i00 = null;
        }
        return j1.a(i00);
    }

    public static I0 d(I0 i00, int v, Object object0) {
        if((v & 1) != 0) {
            i00 = null;
        }
        return j1.a(i00);
    }

    @m
    public static final Object e(@l o o0, @l d d0) {
        h1 h10 = new h1(d0.getContext(), d0);
        Object object0 = b.d(h10, h10, o0);
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

