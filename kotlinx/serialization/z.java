package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.b0;
import kotlin.reflect.d;
import kotlin.reflect.s;
import kotlinx.serialization.modules.f;
import y4.l;
import y4.m;

public final class z {
    @b0
    @l
    public static final i a(@l String s) {
        return B.c(s);
    }

    @b0
    @l
    public static final i b(@l f f0, @l d d0) {
        return B.d(f0, d0);
    }

    @b0
    @l
    public static final i c(@l f f0, @l d d0, @l i[] arr_i) {
        return B.e(f0, d0, arr_i);
    }

    @m
    public static final i d(@l d d0, @l List list0, @l List list1) {
        return B.g(d0, list0, list1);
    }

    public static final i e() {
        return B.h();
    }

    @kotlinx.serialization.f
    @l
    public static final i f(@l Type type0) {
        return A.d(type0);
    }

    @h
    @l
    public static final i g(@l d d0) {
        return B.i(d0);
    }

    @l
    public static final i h(@l s s0) {
        return B.j(s0);
    }

    public static final i i(f f0) {
        return B.k(f0);
    }

    @kotlinx.serialization.f
    @l
    public static final i j(@l f f0, @l Type type0) {
        return A.e(f0, type0);
    }

    @l
    public static final i k(@l f f0, @l s s0) {
        return B.l(f0, s0);
    }

    @kotlinx.serialization.f
    @m
    public static final i l(@l Type type0) {
        return A.h(type0);
    }

    @h
    @m
    public static final i m(@l d d0) {
        return B.n(d0);
    }

    @m
    public static final i n(@l s s0) {
        return B.o(s0);
    }

    @kotlinx.serialization.f
    @m
    public static final i o(@l f f0, @l Type type0) {
        return A.i(f0, type0);
    }

    @m
    public static final i p(@l f f0, @l s s0) {
        return B.p(f0, s0);
    }

    @m
    public static final List q(@l f f0, @l List list0, boolean z) {
        return B.q(f0, list0, z);
    }
}

