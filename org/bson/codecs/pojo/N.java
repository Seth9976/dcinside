package org.bson.codecs.pojo;

import org.bson.P;
import org.bson.a0;
import org.bson.codecs.N;
import org.bson.codecs.T;
import org.bson.codecs.Y;
import org.bson.codecs.configuration.d;

final class n implements F {
    static class a implements N {
        private final Class a;

        a(Class class0) {
            this.a = class0;
        }

        public Enum c(P p0, T t0) {
            String s = p0.readString();
            return Enum.valueOf(this.a, s);
        }

        @Override  // org.bson.codecs.X
        public Class d() {
            return this.a;
        }

        @Override  // org.bson.codecs.X
        public void e(a0 a00, Object object0, Y y0) {
            this.h(a00, ((Enum)object0), y0);
        }

        @Override  // org.bson.codecs.S
        public Object g(P p0, T t0) {
            return this.c(p0, t0);
        }

        public void h(a0 a00, Enum enum0, Y y0) {
            a00.d(enum0.name());
        }
    }

    private final d a;

    n(d d0) {
        this.a = d0;
    }

    @Override  // org.bson.codecs.pojo.F
    public N a(Q q0, G g0) {
        Class class0 = q0.getType();
        if(Enum.class.isAssignableFrom(class0)) {
            try {
                return this.a.a(class0);
            }
            catch(org.bson.codecs.configuration.a unused_ex) {
                return new a(class0);
            }
        }
        return null;
    }
}

