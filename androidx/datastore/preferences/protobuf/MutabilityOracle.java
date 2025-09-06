package androidx.datastore.preferences.protobuf;

interface MutabilityOracle {
    public static final MutabilityOracle a;

    static {
        MutabilityOracle.a = new MutabilityOracle() {
            @Override  // androidx.datastore.preferences.protobuf.MutabilityOracle
            public void ensureMutable() {
                throw new UnsupportedOperationException();
            }
        };
    }

    void ensureMutable();
}

