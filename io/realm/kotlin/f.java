package io.realm.kotlin;

import io.realm.E;
import io.realm.F0;
import io.realm.T0;
import io.realm.a;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.i;
import y4.l;

public final class f {
    @l
    public static final i a(@l T0 t00) {
        i i0;
        L.p(t00, "<this>");
        a a0 = t00.d;
        if(a0 instanceof F0) {
            i0 = ((F0)a0).T().h().i(((F0)a0), t00);
            L.o(i0, "realmInstance.configurat…From(realmInstance, this)");
            return i0;
        }
        if(!(a0 instanceof E)) {
            throw new IllegalStateException("Wrong type of Realm.");
        }
        i0 = ((E)a0).T().h().n(((E)a0), t00);
        L.o(i0, "realmInstance.configurat…From(realmInstance, this)");
        return i0;
    }

    @l
    public static final i b(@l T0 t00) {
        i i0;
        L.p(t00, "<this>");
        a a0 = t00.d;
        if(a0 instanceof F0) {
            i0 = ((F0)a0).T().h().d(((F0)a0), t00);
            L.o(i0, "realmInstance.configurat…from(realmInstance, this)");
            return i0;
        }
        if(!(a0 instanceof E)) {
            throw new IllegalStateException("Wrong type of Realm.");
        }
        i0 = ((E)a0).T().h().a(((E)a0), t00);
        L.o(i0, "realmInstance.configurat…from(realmInstance, this)");
        return i0;
    }
}

