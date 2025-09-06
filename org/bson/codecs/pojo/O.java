package org.bson.codecs.pojo;

import org.bson.codecs.N;
import org.bson.codecs.configuration.d;

final class o implements F {
    private final d a;
    private final A b;

    o(A a0, d d0) {
        this.b = a0;
        this.a = d0;
    }

    @Override  // org.bson.codecs.pojo.F
    public N a(Q q0, G g0) {
        if(q0.getType() == this.b.d()) {
            return this.b;
        }
        Class class0 = q0.getType();
        return this.a.a(class0);
    }
}

