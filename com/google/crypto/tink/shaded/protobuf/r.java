package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;

@y
abstract class r {
    class a extends r {
        a() {
            super();
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r
        public d a(int v) {
            return d.j(ByteBuffer.allocateDirect(v));
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.r
        public d b(int v) {
            return d.k(new byte[v]);
        }
    }

    private static final r a;

    static {
        r.a = new a();
    }

    public abstract d a(int arg1);

    public abstract d b(int arg1);

    public static r c() {
        return r.a;
    }
}

