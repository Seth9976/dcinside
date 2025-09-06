package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class IntVector extends BaseVector {
    public IntVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 4, byteBuffer0);
        return this;
    }

    public int g(int v) {
        return this.d.getInt(this.a(v));
    }

    public long h(int v) {
        return ((long)this.g(v)) & 0xFFFFFFFFL;
    }
}

