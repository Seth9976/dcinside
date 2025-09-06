package androidx.datastore.preferences.protobuf;

public enum NullValue implements EnumLite {
    static final class NullValueVerifier implements EnumVerifier {
        static final EnumVerifier a;

        static {
            NullValueVerifier.a = new NullValueVerifier();
        }

        @Override  // androidx.datastore.preferences.protobuf.Internal$EnumVerifier
        public boolean isInRange(int v) {
            return NullValue.a(v) != null;
        }
    }

    NULL_VALUE(0),
    UNRECOGNIZED(-1);

    private final int a;
    public static final int d;
    private static final EnumLiteMap e;

    static {
        NullValue.e = new EnumLiteMap() {
            public NullValue a(int v) {
                return NullValue.a(v);
            }

            @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLiteMap
            public EnumLite findValueByNumber(int v) {
                return this.a(v);
            }
        };
    }

    private NullValue(int v1) {
        this.a = v1;
    }

    public static NullValue a(int v) {
        return v == 0 ? NullValue.b : null;
    }

    public static EnumLiteMap b() {
        return NullValue.e;
    }

    public static EnumVerifier c() {
        return NullValueVerifier.a;
    }

    @Deprecated
    public static NullValue d(int v) {
        return NullValue.a(v);
    }

    @Override  // androidx.datastore.preferences.protobuf.Internal$EnumLite
    public final int getNumber() {
        if(this == NullValue.c) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.a;
    }
}

