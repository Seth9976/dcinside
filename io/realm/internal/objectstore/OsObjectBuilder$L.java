package io.realm.internal.objectstore;

import io.realm.G0;
import io.realm.I0;
import io.realm.internal.q;

class OsObjectBuilder.L implements S {
    private final q a;

    OsObjectBuilder.L() {
        this.a = new I0();
    }

    @Override  // io.realm.internal.objectstore.OsObjectBuilder$S
    public void a(long v, Object object0) {
        this.b(v, ((G0)object0));
    }

    public void b(long v, G0 g00) {
        this.a.c(v, g00);
    }
}

