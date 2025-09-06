package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class FloatVector extends BaseVector {
    public FloatVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 4, byteBuffer0);
        return this;
    }

    public float g(int v) {
        return this.d.getFloat(this.a(v));
    }
}

