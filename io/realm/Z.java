package io.realm;

import j..util.Objects;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import o3.h;

class z extends g0 {
    z(a a0, k0 k00, x1 x10) {
        super(a0, k00, x10);
    }

    @Override  // io.realm.g0
    i0 c(long v) {
        return new t1(v);
    }

    @Override  // io.realm.g0
    boolean d(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null keys are not allowed when calling \'containsKey\'.");
        }
        if(!this.l(object0, String.class)) {
            throw new ClassCastException("Only String keys can be used with \'containsKey\'.");
        }
        return this.b.b(object0);
    }

    @Override  // io.realm.g0
    public Set entrySet() {
        return this.b.e();
    }

    @Override  // io.realm.g0
    U0 f(k3.a a0) {
        return this.t(a0);
    }

    @Override
    public Object get(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null keys are not allowed when calling \'get\'.");
        }
        if(!this.l(object0, String.class)) {
            throw new ClassCastException("Only String keys can be used with \'containsKey\'.");
        }
        return this.b.g(((String)object0));
    }

    @Override  // io.realm.g0
    public Object put(Object object0, @h Object object1) {
        return this.u(((String)object0), object1);
    }

    @Override  // io.realm.g0
    void r(Map map0) {
        for(Object object0: map0.entrySet()) {
            if(((String)((Map.Entry)object0).getKey()) == null) {
                throw new NullPointerException("Null keys are not allowed.");
            }
            if(false) {
                break;
            }
        }
    }

    R0 t(k3.a a0) {
        return this.c.a(((a)a0.a));
    }

    public Object u(String s, @h Object object0) {
        if(s != null) {
            try {
                return this.b.l(s, object0);
            }
            catch(IllegalStateException illegalStateException0) {
                String s1 = illegalStateException0.getMessage();
                Objects.requireNonNull(s1);
                if(s1.contains("Data type mismatch")) {
                    throw new NullPointerException("Cannot insert null values in a dictionary marked with \'@Required\'.");
                }
                throw illegalStateException0;
            }
        }
        throw new NullPointerException("Null keys are not allowed.");
    }
}

