package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class BooleanVector extends BaseVector {
    public BooleanVector f(int v, ByteBuffer byteBuffer0) {
        this.b(v, 1, byteBuffer0);
        return this;
    }

    public boolean g(int v) {
        return this.d.get(this.a(v)) != 0;
    }
}

