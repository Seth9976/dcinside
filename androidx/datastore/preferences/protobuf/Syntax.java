package androidx.datastore.preferences.protobuf;

public enum Syntax implements EnumLite {
    static final class SyntaxVerifier implements EnumVerifier {
        static final EnumVerifier a;

        static {
            SyntaxVerifier.a = new SyntaxVerifier();
        }

        @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
        public boolean isInRange(int v) {
            return Syntax.a(v) != null;
        }
    }

    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int e = 0;
    public static final int f = 1;
    private static final EnumLiteMap g;

    static {
        Syntax.g = new EnumLiteMap() {
            public Syntax a(int v) {
                return Syntax.a(v);
            }

            @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        };
    }

    private Syntax(int v1) {
        this.a = v1;
    }

    public static Syntax a(int v) {
        switch(v) {
            case 0: {
                return Syntax.b;
            }
            case 1: {
                return Syntax.c;
            }
            default: {
                return null;
            }
        }
    }

    public static EnumLiteMap b() {
        return Syntax.g;
    }

    public static EnumVerifier c() {
        return SyntaxVerifier.a;
    }

    @Deprecated
    public static Syntax d(int v) {
        return Syntax.a(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == Syntax.d) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

