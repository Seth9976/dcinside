package com.google.crypto.tink.shaded.protobuf;

@y
final class d1 {
    private static final b1 a;
    private static final b1 b;

    static {
        d1.a = d1.c();
        d1.b = new c1();
    }

    static b1 a() {
        return d1.a;
    }

    static b1 b() {
        return d1.b;
    }

    private static b1 c() {
        try {
            return (b1)Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

