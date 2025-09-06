package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class UnionVector extends BaseVector {
    public UnionVector f(int v, int v1, ByteBuffer byteBuffer0) {
        this.b(v, v1, byteBuffer0);
        return this;
    }

    public Table g(Table table0, int v) {
        return Table.k(table0, this.a(v), this.d);
    }
}

