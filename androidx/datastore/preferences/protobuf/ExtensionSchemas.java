package androidx.datastore.preferences.protobuf;

final class ExtensionSchemas {
    private static final ExtensionSchema a;
    private static final ExtensionSchema b;

    static {
        ExtensionSchemas.a = new ExtensionSchemaLite();
        ExtensionSchemas.b = ExtensionSchemas.c();
    }

    static ExtensionSchema a() {
        ExtensionSchema extensionSchema0 = ExtensionSchemas.b;
        if(extensionSchema0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return extensionSchema0;
    }

    static ExtensionSchema b() {
        return ExtensionSchemas.a;
    }

    private static ExtensionSchema c() {
        try {
            return (ExtensionSchema)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

