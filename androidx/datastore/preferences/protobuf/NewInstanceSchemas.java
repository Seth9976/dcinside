package androidx.datastore.preferences.protobuf;

final class NewInstanceSchemas {
    private static final NewInstanceSchema a;
    private static final NewInstanceSchema b;

    static {
        NewInstanceSchemas.a = NewInstanceSchemas.c();
        NewInstanceSchemas.b = new NewInstanceSchemaLite();
    }

    static NewInstanceSchema a() {
        return NewInstanceSchemas.a;
    }

    static NewInstanceSchema b() {
        return NewInstanceSchemas.b;
    }

    private static NewInstanceSchema c() {
        try {
            return (NewInstanceSchema)Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

