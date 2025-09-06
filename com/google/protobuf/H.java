package com.google.protobuf;

import java.nio.ByteBuffer;

@k
abstract class h {
    class a extends h {
        a() {
            super();
        }

        @Override  // com.google.protobuf.h
        public b allocateDirectBuffer(int v) {
            return b.wrap(ByteBuffer.allocateDirect(v));
        }

        @Override  // com.google.protobuf.h
        public b allocateHeapBuffer(int v) {
            return b.wrap(new byte[v]);
        }
    }

    private static final h UNPOOLED;

    static {
        h.UNPOOLED = new a();
    }

    public abstract b allocateDirectBuffer(int arg1);

    public abstract b allocateHeapBuffer(int arg1);

    public static h unpooled() {
        return h.UNPOOLED;
    }
}

