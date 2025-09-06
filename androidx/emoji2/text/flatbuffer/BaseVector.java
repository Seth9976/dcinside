package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class BaseVector {
    private int a;
    private int b;
    private int c;
    protected ByteBuffer d;

    protected int a(int v) {
        return this.a + v * this.c;
    }

    protected void b(int v, int v1, ByteBuffer byteBuffer0) {
        this.d = byteBuffer0;
        if(byteBuffer0 != null) {
            this.a = v;
            this.b = byteBuffer0.getInt(v - 4);
            this.c = v1;
            return;
        }
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    protected int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public void e() {
        this.b(0, 0, null);
    }
}

