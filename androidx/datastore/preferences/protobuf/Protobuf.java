package androidx.datastore.preferences.protobuf;

import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.ConcurrentMap;

final class Protobuf {
    private final SchemaFactory a;
    private final ConcurrentMap b;
    private static final Protobuf c;

    static {
        Protobuf.c = new Protobuf();
    }

    private Protobuf() {
        this.b = new ConcurrentHashMap();
        this.a = new ManifestSchemaFactory();
    }

    public static Protobuf a() {
        return Protobuf.c;
    }

    int b() {
        int v = 0;
        for(Object object0: this.b.values()) {
            Schema schema0 = (Schema)object0;
            if(schema0 instanceof MessageSchema) {
                v += ((MessageSchema)schema0).q();
            }
        }
        return v;
    }

    public boolean c(Object object0) {
        return this.j(object0).isInitialized(object0);
    }

    public void d(Object object0) {
        this.j(object0).makeImmutable(object0);
    }

    public void e(Object object0, Reader reader0) throws IOException {
        this.f(object0, reader0, ExtensionRegistryLite.d());
    }

    public void f(Object object0, Reader reader0, ExtensionRegistryLite extensionRegistryLite0) throws IOException {
        this.j(object0).b(object0, reader0, extensionRegistryLite0);
    }

    public Schema g(Class class0, Schema schema0) {
        Internal.e(class0, "messageType");
        Internal.e(schema0, "schema");
        return (Schema)this.b.putIfAbsent(class0, schema0);
    }

    public Schema h(Class class0, Schema schema0) {
        Internal.e(class0, "messageType");
        Internal.e(schema0, "schema");
        return (Schema)this.b.put(class0, schema0);
    }

    public Schema i(Class class0) {
        Internal.e(class0, "messageType");
        Schema schema0 = (Schema)this.b.get(class0);
        if(schema0 == null) {
            schema0 = this.a.createSchema(class0);
            Schema schema1 = this.g(class0, schema0);
            return schema1 == null ? schema0 : schema1;
        }
        return schema0;
    }

    public Schema j(Object object0) {
        return this.i(object0.getClass());
    }

    public void k(Object object0, Writer writer0) throws IOException {
        this.j(object0).a(object0, writer0);
    }
}

