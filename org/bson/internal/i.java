package org.bson.internal;

import R3.a;
import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.N;
import org.bson.codecs.configuration.b;
import org.bson.codecs.configuration.d;

public final class i implements b, d, e {
    private final List a;
    private final c b;

    public i(List list0) {
        this.b = new c();
        a.d("codecProviders must not be null or empty", list0 != null && list0.size() > 0);
        this.a = new ArrayList(list0);
    }

    @Override  // org.bson.codecs.configuration.d
    public N a(Class class0) {
        return this.c(new org.bson.internal.b(this, class0));
    }

    @Override  // org.bson.codecs.configuration.b
    public N b(Class class0, d d0) {
        for(Object object0: this.a) {
            N n0 = ((b)object0).b(class0, d0);
            if(n0 != null) {
                return n0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Override  // org.bson.internal.e
    public N c(org.bson.internal.b b0) {
        if(!this.b.a(b0.b())) {
            for(Object object0: this.a) {
                N n0 = ((b)object0).b(b0.b(), b0);
                if(n0 != null) {
                    this.b.c(b0.b(), n0);
                    return n0;
                }
                if(false) {
                    break;
                }
            }
            this.b.c(b0.b(), null);
        }
        return this.b.b(b0.b());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(i.class != class0 || this.a.size() != ((i)object0).a.size()) {
                return false;
            }
            for(int v = 0; v < this.a.size(); ++v) {
                if(((b)this.a.get(v)).getClass() != ((b)((i)object0).a.get(v)).getClass()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}

