package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class Struct {
    protected int a;
    protected ByteBuffer b;

    public void a() {
        this.b(0, null);
    }

    protected void b(int v, ByteBuffer byteBuffer0) {
        this.b = byteBuffer0;
        if(byteBuffer0 != null) {
            this.a = v;
            return;
        }
        this.a = 0;
    }
}

