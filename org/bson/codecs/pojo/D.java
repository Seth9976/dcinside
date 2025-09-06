package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import org.bson.P;
import org.bson.X;
import org.bson.a0;
import org.bson.codecs.N;
import org.bson.codecs.T;
import org.bson.codecs.Y;

final class d implements F {
    static class a implements N {
        private final Class a;
        private final N b;

        a(Class class0, N n0) {
            this.a = class0;
            this.b = n0;
        }

        public Collection c(P p0, T t0) {
            Collection collection0 = this.i();
            p0.q3();
            while(p0.T2() != X.b) {
                if(p0.z0() == X.l) {
                    collection0.add(null);
                    p0.o0();
                }
                else {
                    collection0.add(this.b.g(p0, t0));
                }
            }
            p0.v1();
            return collection0;
        }

        @Override  // org.bson.codecs.X
        public Class d() {
            return this.a;
        }

        @Override  // org.bson.codecs.X
        public void e(a0 a00, Object object0, Y y0) {
            this.h(a00, ((Collection)object0), y0);
        }

        @Override  // org.bson.codecs.S
        public Object g(P p0, T t0) {
            return this.c(p0, t0);
        }

        public void h(a0 a00, Collection collection0, Y y0) {
            a00.o();
            for(Object object0: collection0) {
                if(object0 == null) {
                    a00.i();
                }
                else {
                    this.b.e(a00, object0, y0);
                }
            }
            a00.q();
        }

        private Collection i() {
            if(this.a.isInterface()) {
                if(this.a.isAssignableFrom(ArrayList.class)) {
                    return new ArrayList();
                }
                if(!this.a.isAssignableFrom(HashSet.class)) {
                    throw new org.bson.codecs.configuration.a(String.format("Unsupported Collection interface of %s!", this.a.getName()));
                }
                return new HashSet();
            }
            try {
                return (Collection)this.a.getDeclaredConstructor(null).newInstance(null);
            }
            catch(Exception exception0) {
                throw new org.bson.codecs.configuration.a(exception0.getMessage(), exception0);
            }
        }
    }

    @Override  // org.bson.codecs.pojo.F
    public N a(Q q0, G g0) {
        Class class0 = q0.getType();
        return Collection.class.isAssignableFrom(class0) && q0.getTypeParameters().size() == 1 ? new a(q0.getType(), g0.a(((Q)q0.getTypeParameters().get(0)))) : null;
    }
}

