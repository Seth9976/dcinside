package io.realm.kotlin;

import io.realm.E;
import io.realm.F0;
import io.realm.G;
import io.realm.X0;
import io.realm.a;
import io.realm.internal.s;
import io.realm.rx.b;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public final class h {
    @l
    public static final i a(@m X0 x00) {
        i i0;
        if(x00 == null) {
            i0 = null;
        }
        else {
            if(!(x00 instanceof s)) {
                return k.L0(new b(x00, null));
            }
            a a0 = ((s)x00).R3().f();
            if(a0 instanceof F0) {
                i0 = ((F0)a0).T().h().j(((F0)a0), x00);
                return i0 == null ? k.L0(null) : i0;
            }
            if(!(a0 instanceof E)) {
                throw new UnsupportedOperationException(a0.getClass() + " is not supported as a candidate for \'toFlow\'. Only subclasses of RealmModel/RealmObject can be used.");
            }
            i0 = ((E)a0).T().h().l(((E)a0), ((G)x00));
            if(i0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<io.realm.rx.ObjectChange<T of io.realm.kotlin.RealmObjectExtensionsKt.toChangesetFlow$lambda-3$lambda-2>?>");
            }
        }
        return i0 == null ? k.L0(null) : i0;
    }

    @l
    public static final i b(@m X0 x00) {
        i i0;
        if(x00 == null) {
            i0 = null;
        }
        else {
            if(!(x00 instanceof s)) {
                return k.L0(x00);
            }
            a a0 = ((s)x00).R3().f();
            if(a0 instanceof F0) {
                i0 = ((F0)a0).T().h().h(((F0)a0), x00);
                return i0 == null ? k.L0(null) : i0;
            }
            if(!(a0 instanceof E)) {
                throw new UnsupportedOperationException(a0.getClass() + " is not supported as a candidate for \'toFlow\'. Only subclasses of RealmModel/RealmObject can be used.");
            }
            i0 = ((E)a0).T().h().c(((E)a0), ((G)x00));
            if(i0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of io.realm.kotlin.RealmObjectExtensionsKt.toFlow$lambda-1$lambda-0?>");
            }
        }
        return i0 == null ? k.L0(null) : i0;
    }
}

