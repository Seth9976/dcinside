package org.bson.codecs.pojo;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import org.bson.P;
import org.bson.X;
import org.bson.a0;
import org.bson.codecs.N;
import org.bson.codecs.T;
import org.bson.codecs.Y;

final class y implements F {
    static class a implements N {
        private final Class a;
        private final N b;

        a(Class class0, N n0) {
            this.a = class0;
            this.b = n0;
        }

        public Map c(P p0, T t0) {
            p0.g0();
            Map map0 = this.i();
            while(p0.T2() != X.b) {
                if(p0.z0() == X.l) {
                    map0.put(p0.n0(), null);
                    p0.o0();
                }
                else {
                    map0.put(p0.n0(), this.b.g(p0, t0));
                }
            }
            p0.E1();
            return map0;
        }

        @Override  // org.bson.codecs.X
        public Class d() {
            return this.a;
        }

        @Override  // org.bson.codecs.X
        public void e(a0 a00, Object object0, Y y0) {
            this.h(a00, ((Map)object0), y0);
        }

        @Override  // org.bson.codecs.S
        public Object g(P p0, T t0) {
            return this.c(p0, t0);
        }

        public void h(a0 a00, Map map0, Y y0) {
            a00.e0();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                a00.k(((String)map$Entry0.getKey()));
                if(map$Entry0.getValue() == null) {
                    a00.i();
                }
                else {
                    Object object1 = map$Entry0.getValue();
                    this.b.e(a00, object1, y0);
                }
            }
            a00.J1();
        }

        private Map i() {
            if(this.a.isInterface()) {
                return new HashMap();
            }
            try {
                return (Map)this.a.getDeclaredConstructor(null).newInstance(null);
            }
            catch(Exception exception0) {
                throw new org.bson.codecs.configuration.a(exception0.getMessage(), exception0);
            }
        }
    }

    @Override  // org.bson.codecs.pojo.F
    public N a(Q q0, G g0) {
        Class class0 = q0.getType();
        Class class1 = Map.class;
        if(class1.isAssignableFrom(class0) && q0.getTypeParameters().size() == 2) {
            Class class2 = ((Q)q0.getTypeParameters().get(0)).getType();
            if(class2.equals(String.class)) {
                try {
                    return new a(q0.getType(), g0.a(((Q)q0.getTypeParameters().get(1))));
                }
                catch(org.bson.codecs.configuration.a a0) {
                    if(((Q)q0.getTypeParameters().get(1)).getType() == Object.class) {
                        try {
                            return g0.a(O.b(class1).c());
                        }
                        catch(org.bson.codecs.configuration.a unused_ex) {
                        }
                    }
                    throw a0;
                }
            }
            throw new org.bson.codecs.configuration.a(String.format("Invalid Map type. Maps MUST have string keys, found %s instead.", class2));
        }
        return null;
    }
}

