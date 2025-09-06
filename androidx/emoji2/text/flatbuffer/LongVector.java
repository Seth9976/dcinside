package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class LongVector extends BaseVector {
    public LongVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 8, byteBuffer0);
        return this;
    }

    public long g(int v) {
        return this.d.getLong(this.a(v));
    }
}

