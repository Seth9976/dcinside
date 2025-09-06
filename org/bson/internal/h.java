package org.bson.internal;

import R3.a;
import org.bson.codecs.N;
import org.bson.codecs.configuration.b;
import org.bson.codecs.m0;
import org.bson.r0;

public class h implements e {
    private final b a;
    private final c b;
    private final r0 c;

    h(b b0, r0 r00) {
        this.b = new c();
        this.c = (r0)a.e("uuidRepresentation", r00);
        this.a = (b)a.e("wrapped", b0);
    }

    @Override  // org.bson.codecs.configuration.d
    public N a(Class class0) {
        return this.c(new org.bson.internal.b(this, class0));
    }

    public r0 b() {
        return this.c;
    }

    @Override  // org.bson.internal.e
    public N c(org.bson.internal.b b0) {
        if(!this.b.a(b0.b())) {
            N n0 = this.a.b(b0.b(), b0);
            if(n0 instanceof m0) {
                n0 = ((m0)n0).c(this.c);
            }
            this.b.c(b0.b(), n0);
        }
        return this.b.b(b0.b());
    }

    public b d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 != null && this.getClass() == object0.getClass() && this.a.equals(((h)object0).a) ? this.c == ((h)object0).c : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.c.hashCode();
    }
}

