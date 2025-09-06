package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

abstract class BufferAllocator {
    private static final BufferAllocator a;

    static {
        BufferAllocator.a = new BufferAllocator() {
            @Override  // androidx.datastore.preferences.protobuf.BufferAllocator
            public AllocatedBuffer a(int v) {
                return AllocatedBuffer.j(ByteBuffer.allocateDirect(v));
            }

            @Override  // androidx.datastore.preferences.protobuf.BufferAllocator
            public AllocatedBuffer b(int v) {
                return AllocatedBuffer.k(new byte[v]);
            }
        };
    }

    public abstract AllocatedBuffer a(int arg1);

    public abstract AllocatedBuffer b(int arg1);

    public static BufferAllocator c() {
        return BufferAllocator.a;
    }
}

