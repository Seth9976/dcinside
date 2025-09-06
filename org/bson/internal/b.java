package org.bson.internal;

import org.bson.codecs.N;
import org.bson.codecs.configuration.d;

class b implements d {
    private final b a;
    private final e b;
    private final Class c;

    private b(b b0, Class class0) {
        this.a = b0;
        this.c = class0;
        this.b = b0.b;
    }

    b(e e0, Class class0) {
        this.c = class0;
        this.a = null;
        this.b = e0;
    }

    @Override  // org.bson.codecs.configuration.d
    public N a(Class class0) {
        if(this.d(class0).booleanValue()) {
            return new f(this.b, class0);
        }
        b b0 = new b(this, class0);
        return this.b.c(b0);
    }

    public Class b() {
        return this.c;
    }

    private Boolean d(Class class0) {
        while(this != null) {
            if(this.c.equals(class0)) {
                return true;
            }
            this = this.a;
        }
        return false;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || !this.c.equals(((b)object0).c)) {
            return false;
        }
        b b0 = this.a;
        if(b0 != null) {
            return b0.equals(((b)object0).a) ? this.b.equals(((b)object0).b) : false;
        }
        return ((b)object0).a == null ? this.b.equals(((b)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.a == null ? this.b.hashCode() * 0x1F + this.c.hashCode() : (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }
}

