package io.realm.kotlin;

import io.realm.P0;
import io.realm.X0;
import io.realm.d1;
import io.realm.e1;
import kotlin.jvm.internal.L;
import y4.l;

public final class g {
    public static final void a(@l X0 x00, @l P0 p00) {
        L.p(x00, "<this>");
        L.p(p00, "listener");
        d1.s5(x00, p00);
    }

    public static final void b(@l X0 x00, @l e1 e10) {
        L.p(x00, "<this>");
        L.p(e10, "listener");
        d1.t5(x00, e10);
    }

    public static final void c(@l X0 x00) {
        L.p(x00, "<this>");
        d1.A5(x00);
    }

    @l
    public static final X0 d(@l X0 x00) {
        L.p(x00, "<this>");
        X0 x01 = d1.C5(x00);
        if(x01 == null) {
            throw new NullPointerException("null cannot be cast to non-null type T of io.realm.kotlin.RealmModelExtensionsKt.freeze");
        }
        return x01;
    }

    public static final boolean e(@l X0 x00) {
        L.p(x00, "<this>");
        return d1.F5(x00);
    }

    public static final boolean f(@l X0 x00) {
        L.p(x00, "<this>");
        return d1.G5(x00);
    }

    public static final boolean g(@l X0 x00) {
        L.p(x00, "<this>");
        return d1.H5(x00);
    }

    public static final boolean h(@l X0 x00) {
        L.p(x00, "<this>");
        return d1.I5(x00);
    }

    public static final boolean i(@l X0 x00) {
        L.p(x00, "<this>");
        return d1.J5(x00);
    }

    public static final void j(@l X0 x00) {
        L.p(x00, "<this>");
        d1.L5(x00);
    }

    public static final void k(@l X0 x00, @l P0 p00) {
        L.p(x00, "<this>");
        L.p(p00, "listener");
        d1.N5(x00, p00);
    }

    public static final void l(@l X0 x00, @l e1 e10) {
        L.p(x00, "<this>");
        L.p(e10, "listener");
        d1.O5(x00, e10);
    }
}

