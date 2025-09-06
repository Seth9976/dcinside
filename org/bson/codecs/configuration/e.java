package org.bson.codecs.configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.codecs.N;

final class e implements b {
    private final Map a;

    e(List list0) {
        this.a = new HashMap();
        for(Object object0: list0) {
            Class class0 = ((N)object0).d();
            this.a.put(class0, ((N)object0));
        }
    }

    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, d d0) {
        return (N)this.a.get(class0);
    }
}

