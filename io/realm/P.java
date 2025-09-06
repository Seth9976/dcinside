package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Util;
import io.realm.internal.s;
import io.realm.internal.t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import o3.h;

public class p {
    public static final String a = "list";
    public static final String b = "dictionary";
    public static final String c = "set";

    static boolean a(a a0, X0 x00, String s, String s1) {
        if(x00 instanceof s) {
            if(((s)x00) instanceof G) {
                if(((s)x00).R3().f() == a0) {
                    String s2 = ((G)x00).s6();
                    if(!s.equals(G0.class.getCanonicalName()) && !s.equals(s2)) {
                        throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from %s\'s. Type of the %s is \'%s\', type of object is \'%s\'.", s1, s1, s, s2));
                    }
                    return false;
                }
                a a1 = ((s)x00).R3().f();
                if(a0.b != a1.b) {
                    throw new IllegalStateException("Cannot pass an object to a Realm instance created in another thread.");
                }
                throw new IllegalArgumentException("Cannot pass DynamicRealmObject between Realm instances.");
            }
            if(((s)x00).R3().g() != null && ((s)x00).R3().f().getPath().equals(a0.getPath())) {
                if(a0 != ((s)x00).R3().f()) {
                    throw new IllegalArgumentException("Cannot pass an object from another Realm instance.");
                }
                return false;
            }
        }
        return true;
    }

    public static void b(a a0, @h Object object0, boolean z) {
        if(z && object0 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        a0.k();
        a0.e.capabilities.c("Listeners cannot be used on current thread.");
    }

    public static X0 c(a a0, X0 x00) {
        return OsObjectStore.c(((F0)a0).f0(), ((F0)a0).T().s().o(x00.getClass())) == null ? ((F0)a0).o2(x00, new W[0]) : ((F0)a0).t2(x00, new W[0]);
    }

    static G0 d(a a0, G0 g00) {
        if(g00.r() == io.realm.G0.a.l) {
            Class class0 = g00.s();
            X0 x00 = g00.k(class0);
            if(x00 instanceof s) {
                if(((s)x00) instanceof G) {
                    if(((s)x00).R3().f() == a0) {
                        return g00;
                    }
                    a a1 = ((s)x00).R3().f();
                    if(a0.b != a1.b) {
                        throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
                    }
                    throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                }
                if(a0.e0().m(class0).A()) {
                    throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
                }
                if(((s)x00).R3().g() != null && ((s)x00).R3().f().getPath().equals(a0.getPath())) {
                    if(a0 != ((s)x00).R3().f()) {
                        throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
                    }
                    return g00;
                }
            }
            return G0.v(p.c(a0, x00));
        }
        return g00;
    }

    static boolean e(Class class0) {
        return X0.class.isAssignableFrom(class0);
    }

    static boolean f(a a0, X0 x00) {
        if(a0 instanceof F0) {
            return a0.e0().m(x00.getClass()).A();
        }
        String s = ((G)x00).s6();
        return a0.e0().n(s).A();
    }

    static void g(F0 f00, X0 x00, long v) {
        t t0 = f00.T().s();
        Class class0 = Util.h(x00.getClass());
        t0.z(f00, x00, t0.x(class0, f00, f00.n4(class0).U(v), f00.e0().j(class0), true, Collections.EMPTY_LIST), new HashMap(), Collections.EMPTY_SET);
    }
}

