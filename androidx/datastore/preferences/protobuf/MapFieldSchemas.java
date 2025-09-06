package androidx.datastore.preferences.protobuf;

final class MapFieldSchemas {
    private static final MapFieldSchema a;
    private static final MapFieldSchema b;

    static {
        MapFieldSchemas.a = MapFieldSchemas.c();
        MapFieldSchemas.b = new MapFieldSchemaLite();
    }

    static MapFieldSchema a() {
        return MapFieldSchemas.a;
    }

    static MapFieldSchema b() {
        return MapFieldSchemas.b;
    }

    private static MapFieldSchema c() {
        try {
            return (MapFieldSchema)Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

