package com.google.protobuf;

import java.nio.ByteBuffer;

@k
abstract class b {
    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @j
    public abstract b position(int arg1);

    public abstract int remaining();

    public static b wrap(ByteBuffer byteBuffer0) {
        class a extends b {
            final ByteBuffer val$buffer;

            a(ByteBuffer byteBuffer0) {
            }

            @Override  // com.google.protobuf.b
            public byte[] array() {
                return this.val$buffer.array();
            }

            @Override  // com.google.protobuf.b
            public int arrayOffset() {
                return this.val$buffer.arrayOffset();
            }

            @Override  // com.google.protobuf.b
            public boolean hasArray() {
                return this.val$buffer.hasArray();
            }

            @Override  // com.google.protobuf.b
            public boolean hasNioBuffer() {
                return true;
            }

            @Override  // com.google.protobuf.b
            public int limit() {
                return this.val$buffer.limit();
            }

            @Override  // com.google.protobuf.b
            public ByteBuffer nioBuffer() {
                return this.val$buffer;
            }

            @Override  // com.google.protobuf.b
            public int position() {
                return this.val$buffer.position();
            }

            @Override  // com.google.protobuf.b
            public b position(int v) {
                D.position(this.val$buffer, v);
                return this;
            }

            @Override  // com.google.protobuf.b
            public int remaining() {
                return this.val$buffer.remaining();
            }
        }

        Internal.checkNotNull(byteBuffer0, "buffer");
        return new a(byteBuffer0);
    }

    public static b wrap(byte[] arr_b) {
        return b.wrapNoCheck(arr_b, 0, arr_b.length);
    }

    public static b wrap(byte[] arr_b, int v, int v1) {
        if(v < 0 || v1 < 0 || v + v1 > arr_b.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
        }
        return b.wrapNoCheck(arr_b, v, v1);
    }

    private static b wrapNoCheck(byte[] arr_b, int v, int v1) {
        class com.google.protobuf.b.b extends b {
            private int position;
            final byte[] val$bytes;
            final int val$length;
            final int val$offset;

            com.google.protobuf.b.b(byte[] arr_b, int v, int v1) {
                this.val$offset = v;
                this.val$length = v1;
                super();
            }

            @Override  // com.google.protobuf.b
            public byte[] array() {
                return this.val$bytes;
            }

            @Override  // com.google.protobuf.b
            public int arrayOffset() {
                return this.val$offset;
            }

            @Override  // com.google.protobuf.b
            public boolean hasArray() {
                return true;
            }

            @Override  // com.google.protobuf.b
            public boolean hasNioBuffer() {
                return false;
            }

            @Override  // com.google.protobuf.b
            public int limit() {
                return this.val$length;
            }

            @Override  // com.google.protobuf.b
            public ByteBuffer nioBuffer() {
                throw new UnsupportedOperationException();
            }

            @Override  // com.google.protobuf.b
            public int position() {
                return this.position;
            }

            @Override  // com.google.protobuf.b
            public b position(int v) {
                if(v < 0 || v > this.val$length) {
                    throw new IllegalArgumentException("Invalid position: " + v);
                }
                this.position = v;
                return this;
            }

            @Override  // com.google.protobuf.b
            public int remaining() {
                return this.val$length - this.position;
            }
        }

        return new com.google.protobuf.b.b(arr_b, v, v1);
    }
}

