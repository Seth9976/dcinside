package kotlin.coroutines;

import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.r;
import y4.l;
import y4.m;

public final class h {
    @h0(version = "1.3")
    @r
    @m
    public static final b a(@l b g$b0, @l c g$c0) {
        L.p(g$b0, "<this>");
        L.p(g$c0, "key");
        if(g$c0 instanceof kotlin.coroutines.b) {
            if(((kotlin.coroutines.b)g$c0).a(g$b0.getKey())) {
                b g$b1 = ((kotlin.coroutines.b)g$c0).b(g$b0);
                return g$b1 instanceof b ? g$b1 : null;
            }
            return null;
        }
        return g$b0.getKey() == g$c0 ? g$b0 : null;
    }

    @h0(version = "1.3")
    @r
    @l
    public static final g b(@l b g$b0, @l c g$c0) {
        L.p(g$b0, "<this>");
        L.p(g$c0, "key");
        if(g$c0 instanceof kotlin.coroutines.b) {
            return ((kotlin.coroutines.b)g$c0).a(g$b0.getKey()) && ((kotlin.coroutines.b)g$c0).b(g$b0) != null ? i.a : g$b0;
        }
        return g$b0.getKey() == g$c0 ? i.a : g$b0;
    }
}

