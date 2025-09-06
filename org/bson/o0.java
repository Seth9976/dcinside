package org.bson;

import org.bson.codecs.H;
import org.bson.codecs.T;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.c;
import org.bson.codecs.configuration.d;

final class o0 {
    private static final d a;

    static {
        o0.a = c.d(new b[]{new H()});
    }

    static Z a(byte[] arr_b, p p0) {
        X x0 = X.e;
        if(p0.z0() != x0 && p0.z0() != X.f) {
            Class class0 = H.e(p0.z0());
            return (Z)o0.a.a(class0).g(p0, T.a().a());
        }
        int v = p0.g2().getPosition();
        org.bson.io.d d0 = p0.g2().I1(4);
        int v1 = p0.g2().readInt32();
        d0.reset();
        p0.Y1();
        return p0.z0() == x0 ? new n0(arr_b, v, v1) : new m0(arr_b, v, v1);
    }
}

