package org.bson.codecs.jsr310;

import org.bson.P;
import org.bson.X;
import org.bson.codecs.N;

abstract class a implements N {
    long c(P p0) {
        X x0 = p0.z0();
        X x1 = X.k;
        if(!x0.equals(x1)) {
            throw new org.bson.codecs.configuration.a(String.format("Could not decode into %s, expected \'%s\' BsonType but got \'%s\'.", this.d().getSimpleName(), x1, x0));
        }
        return p0.m3();
    }
}

