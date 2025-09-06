package org.bson.codecs.pojo;

import org.bson.P;
import org.bson.a0;
import org.bson.codecs.T;
import org.bson.codecs.Y;

final class a extends A {
    private final A a;

    a(A a0) {
        this.a = a0;
    }

    @Override  // org.bson.codecs.pojo.A
    b c() {
        return this.a.c();
    }

    @Override  // org.bson.codecs.X
    public Class d() {
        return this.a.d();
    }

    @Override  // org.bson.codecs.X
    public void e(a0 a00, Object object0, Y y0) {
        try {
            this.a.e(a00, object0, y0);
        }
        catch(org.bson.codecs.configuration.a a0) {
            throw new org.bson.codecs.configuration.a(String.format("An exception occurred when encoding using the AutomaticPojoCodec.%nEncoding a %s: \'%s\' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", this.d().getSimpleName(), object0, a0.getMessage()), a0);
        }
    }

    @Override  // org.bson.codecs.S
    public Object g(P p0, T t0) {
        try {
            return this.a.g(p0, t0);
        }
        catch(org.bson.codecs.configuration.a a0) {
            throw new org.bson.codecs.configuration.a(String.format("An exception occurred when decoding using the AutomaticPojoCodec.%nDecoding into a \'%s\' failed with the following exception:%n%n%s%n%nA custom Codec or PojoCodec may need to be explicitly configured and registered to handle this type.", this.a.d().getSimpleName(), a0.getMessage()), a0);
        }
    }
}

