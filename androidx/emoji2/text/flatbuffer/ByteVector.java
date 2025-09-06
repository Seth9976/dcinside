package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ByteVector extends BaseVector {
    public ByteVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 1, byteBuffer0);
        return this;
    }

    public byte g(int v) {
        return this.d.get(this.a(v));
    }

    public int h(int v) {
        return this.g(v) & 0xFF;
    }
}

