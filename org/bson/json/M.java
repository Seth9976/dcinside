package org.bson.json;

import org.bson.W;
import org.bson.internal.j;

class m implements a {
    @Override  // org.bson.json.a
    public void a(Object object0, Z z0) {
        this.b(((W)object0), z0);
    }

    public void b(W w0, Z z0) {
        z0.e();
        z0.b("$timestamp");
        z0.c("t", j.g(this.c(w0.m0())));
        z0.c("i", j.g(((long)w0.k0()) & 0xFFFFFFFFL));
        z0.g();
        z0.g();
    }

    private long c(int v) [...] // Inlined contents
}

