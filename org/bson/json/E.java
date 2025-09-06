package org.bson.json;

import org.bson.types.Decimal128;

class e implements a {
    @Override  // org.bson.json.a
    public void a(Object object0, Z z0) {
        this.b(((Decimal128)object0), z0);
    }

    public void b(Decimal128 decimal1280, Z z0) {
        z0.e();
        z0.k("$numberDecimal");
        z0.d(decimal1280.toString());
        z0.g();
    }
}

