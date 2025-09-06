package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class DoubleVector extends BaseVector {
    public DoubleVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 8, byteBuffer0);
        return this;
    }

    public double g(int v) {
        return this.d.getDouble(this.a(v));
    }
}

