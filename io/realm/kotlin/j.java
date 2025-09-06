package io.realm.kotlin;

import io.realm.E;
import io.realm.F0;
import io.realm.a;
import io.realm.g1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.i;
import y4.l;

public final class j {
    @l
    public static final i a(@l g1 g10) {
        i i0;
        L.p(g10, "<this>");
        a a0 = g10.a;
        if(a0 instanceof F0) {
            i0 = ((F0)a0).T().h().k(((F0)a0), g10);
            L.o(i0, "realmInstance.configurat…From(realmInstance, this)");
            return i0;
        }
        if(!(a0 instanceof E)) {
            throw new IllegalStateException("Wrong type of Realm.");
        }
        i0 = ((E)a0).T().h().m(((E)a0), g10);
        L.o(i0, "realmInstance.configurat…From(realmInstance, this)");
        return i0;
    }

    @l
    public static final i b(@l g1 g10) {
        i i0;
        L.p(g10, "<this>");
        a a0 = g10.a;
        if(a0 instanceof F0) {
            i0 = ((F0)a0).T().h().g(((F0)a0), g10);
            L.o(i0, "realmInstance.configurat…from(realmInstance, this)");
            return i0;
        }
        if(!(a0 instanceof E)) {
            throw new IllegalStateException("Wrong type of Realm.");
        }
        i0 = ((E)a0).T().h().b(((E)a0), g10);
        L.o(i0, "realmInstance.configurat…from(realmInstance, this)");
        return i0;
    }
}

