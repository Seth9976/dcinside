package com.google.crypto.tink.shaded.protobuf;

interface a1 {
    class a implements a1 {
        a() {
            super();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.a1
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    }

    public static final a1 a;

    static {
        a1.a = new a();
    }

    void ensureMutable();
}

