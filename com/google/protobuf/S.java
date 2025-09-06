package com.google.protobuf;

@k
final class s {
    private static final q FULL_SCHEMA;
    private static final q LITE_SCHEMA;

    static {
        s.LITE_SCHEMA = new r();
        s.FULL_SCHEMA = s.loadSchemaForFullRuntime();
    }

    static q full() {
        q q0 = s.FULL_SCHEMA;
        if(q0 == null) {
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        return q0;
    }

    static q lite() {
        return s.LITE_SCHEMA;
    }

    private static q loadSchemaForFullRuntime() {
        try {
            return (q)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

