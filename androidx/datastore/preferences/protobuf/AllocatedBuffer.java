package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

abstract class AllocatedBuffer {
    public abstract byte[] a();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract int e();

    public abstract ByteBuffer f();

    public abstract int g();

    public abstract AllocatedBuffer h(int arg1);

    public abstract int i();

    public static AllocatedBuffer j(ByteBuffer byteBuffer0) {
        Internal.e(byteBuffer0, "buffer");
        return new AllocatedBuffer() {
            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public byte[] a() {
                return byteBuffer0.array();
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int b() {
                return byteBuffer0.arrayOffset();
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean c() {
                return byteBuffer0.hasArray();
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean d() {
                return true;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int e() {
                return byteBuffer0.limit();
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public ByteBuffer f() {
                return byteBuffer0;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int g() {
                return byteBuffer0.position();
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public AllocatedBuffer h(int v) {
                byteBuffer0.position(v);
                return this;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int i() {
                return byteBuffer0.remaining();
            }
        };
    }

    public static AllocatedBuffer k(byte[] arr_b) {
        return AllocatedBuffer.m(arr_b, 0, arr_b.length);
    }

    public static AllocatedBuffer l(byte[] arr_b, int v, int v1) {
        if(v < 0 || v1 < 0 || v + v1 > arr_b.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", ((int)arr_b.length), v, v1));
        }
        return AllocatedBuffer.m(arr_b, v, v1);
    }

    private static AllocatedBuffer m(byte[] arr_b, int v, int v1) {
        return new AllocatedBuffer() {
            private int a;

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public byte[] a() {
                return arr_b;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int b() {
                return v;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean c() {
                return true;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public boolean d() {
                return false;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int e() {
                return v1;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public ByteBuffer f() {
                throw new UnsupportedOperationException();
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int g() {
                return this.a;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public AllocatedBuffer h(int v) {
                if(v < 0 || v > v1) {
                    throw new IllegalArgumentException("Invalid position: " + v);
                }
                this.a = v;
                return this;
            }

            @Override  // androidx.datastore.preferences.protobuf.AllocatedBuffer
            public int i() {
                return v1 - this.a;
            }
        };
    }
}

