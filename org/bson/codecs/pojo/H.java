package org.bson.codecs.pojo;

import org.bson.O;
import org.bson.types.ObjectId;

final class h implements e {
    @Override  // org.bson.codecs.pojo.e
    public void a(c c0) {
        if(c0.m() == null && c0.n() != null) {
            K k0 = c0.p(c0.n());
            if(k0 != null) {
                Class class0 = k0.j().getType();
                if(c0.m() == null && class0.equals(ObjectId.class)) {
                    c0.t(q.a);
                    return;
                }
                if(c0.m() == null && class0.equals(O.class)) {
                    c0.t(q.b);
                }
            }
        }
    }
}

