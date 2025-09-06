package org.bson.json;

class d implements a {
    @Override  // org.bson.json.a
    public void a(Object object0, Z z0) {
        this.b(((Long)object0), z0);
    }

    public void b(Long long0, Z z0) {
        z0.e();
        z0.b("$date");
        z0.s("$numberLong", Long.toString(((long)long0)));
        z0.g();
        z0.g();
    }
}

