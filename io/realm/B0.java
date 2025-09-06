package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.s;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Map.Entry;
import o3.h;

class b0 extends j1 {
    b0(a a0, OsMap osMap0, Class class0, Class class1) {
        super(a0, osMap0, class0, class1);
    }

    @Override  // io.realm.x1
    public Map.Entry b(a a0, long v, Object object0) {
        return new AbstractMap.SimpleImmutableEntry(object0, a0.Q(this.d, null, v));
    }

    @Override  // io.realm.x1
    public Object c(a a0, long v) {
        return this.j(a0, v);
    }

    @Override  // io.realm.x1
    public Object h(a a0, OsMap osMap0, Object object0, @h Object object1) {
        return this.k(a0, osMap0, object0, ((X0)object1));
    }

    public X0 j(a a0, long v) {
        return a0.Q(this.d, null, v);
    }

    public X0 k(a a0, OsMap osMap0, Object object0, @h X0 x00) {
        long v = osMap0.l(object0);
        if(x00 == null) {
            osMap0.p(object0, null);
        }
        else if(a0.e0().m(this.d).A()) {
            p.g(((F0)a0), x00, osMap0.f(object0));
        }
        else {
            if(p.a(a0, x00, this.d.getSimpleName(), "dictionary")) {
                x00 = p.c(a0, x00);
            }
            osMap0.r(object0, ((s)x00).R3().g().F());
        }
        if(v == -1L) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        return a0.L(this.d, v, false, arrayList0);
    }
}

