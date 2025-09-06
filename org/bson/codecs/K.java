package org.bson.codecs;

import T3.a;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;

public class k implements b {
    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, d d0) {
        return a.class.isAssignableFrom(class0) ? new j(d0) : null;
    }
}

