package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class StringVector extends BaseVector {
    private Utf8 e;

    public StringVector() {
        this.e = Utf8.d();
    }

    public StringVector f(int v, int v1, ByteBuffer byteBuffer0) {
        this.b(v, v1, byteBuffer0);
        return this;
    }

    public String g(int v) {
        return Table.i(this.a(v), this.d, this.e);
    }
}

