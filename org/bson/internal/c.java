package org.bson.internal;

import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bson.codecs.N;
import org.bson.codecs.configuration.a;

final class c {
    private final ConcurrentMap a;

    c() {
        this.a = new ConcurrentHashMap();
    }

    public boolean a(Class class0) {
        return this.a.containsKey(class0);
    }

    public N b(Class class0) {
        if(this.a.containsKey(class0)) {
            g g0 = (g)this.a.get(class0);
            if(!g0.d()) {
                return (N)g0.b();
            }
        }
        throw new a(String.format("Can\'t find a codec for %s.", class0));
    }

    public void c(Class class0, N n0) {
        g g0 = g.e(n0);
        this.a.put(class0, g0);
    }
}

