package org.bson.codecs.pojo;

import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import org.bson.codecs.configuration.a;

final class m {
    private final Map a;
    private final Set b;

    m(Map map0, Set set0) {
        this.a = new ConcurrentHashMap();
        for(Object object0: map0.values()) {
            b b0 = (b)object0;
            if(b0.b() != null) {
                this.a.put(b0.b(), b0.l());
            }
        }
        this.b = set0;
    }

    void a(b b0) {
        if(b0.b() != null) {
            this.a.put(b0.b(), b0.l());
        }
    }

    private Class b(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public Class c(String s) {
        if(this.a.containsKey(s)) {
            return (Class)this.a.get(s);
        }
        Class class0 = this.b(s);
        if(class0 == null) {
            class0 = this.d(s);
        }
        if(class0 == null) {
            throw new a(String.format("A class could not be found for the discriminator: \'%s\'.", s));
        }
        this.a.put(s, class0);
        return class0;
    }

    private Class d(String s) {
        Class class0 = null;
        for(Object object0: this.b) {
            class0 = this.b(((String)object0) + "." + s);
            if(class0 != null) {
                break;
            }
        }
        return class0;
    }
}

