package org.bson.internal;

import org.bson.codecs.configuration.a;
import org.bson.codecs.configuration.b;
import org.bson.r0;

public final class d {
    public static org.bson.codecs.configuration.d a(org.bson.codecs.configuration.d d0, r0 r00) {
        if(r00 != r0.d) {
            if(!(d0 instanceof b)) {
                throw new a("Changing the default UuidRepresentation requires a CodecRegistry that also implements the CodecProvider interface");
            }
            return new h(((b)d0), r00);
        }
        return d0;
    }
}

