package org.bson.codecs.jsr310;

import java.util.HashMap;
import java.util.Map;
import org.bson.codecs.N;
import org.bson.codecs.configuration.b;

public class c implements b {
    private static final Map a;

    static {
        c.a = new HashMap();
        try {
            Class.forName("j$.time.Instant");
            c.a(new org.bson.codecs.jsr310.b());
            c.a(new d());
            c.a(new e());
            c.a(new f());
        }
        catch(ClassNotFoundException unused_ex) {
        }
    }

    private static void a(N n0) {
        Class class0 = n0.d();
        c.a.put(class0, n0);
    }

    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, org.bson.codecs.configuration.d d0) {
        return (N)c.a.get(class0);
    }
}

