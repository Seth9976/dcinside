package org.bson.json;

import org.bson.o;

class c implements a {
    @Override  // org.bson.json.a
    public void a(Object object0, Z z0) {
        this.b(((o)object0), z0);
    }

    public void b(o o0, Z z0) {
        z0.e();
        z0.b("$binary");
        z0.s("base64", org.bson.internal.a.c(o0.n0()));
        z0.s("subType", String.format("%02X", o0.o0()));
        z0.g();
        z0.g();
    }
}

