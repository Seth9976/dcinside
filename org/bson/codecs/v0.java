package org.bson.codecs;

import java.util.UUID;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;
import org.bson.r0;

public class v0 implements b {
    private r0 a;

    public v0(r0 r00) {
        this.a = r00;
    }

    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, d d0) {
        return class0 == UUID.class ? new t0(this.a) : null;
    }
}

