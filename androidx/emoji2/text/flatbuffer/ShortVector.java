package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class ShortVector extends BaseVector {
    public ShortVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 2, byteBuffer0);
        return this;
    }

    public short g(int v) {
        return this.d.getShort(this.a(v));
    }

    public int h(int v) {
        return this.g(v) & 0xFFFF;
    }
}

