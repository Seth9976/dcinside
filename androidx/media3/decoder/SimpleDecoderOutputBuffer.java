package androidx.media3.decoder;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
public class SimpleDecoderOutputBuffer extends DecoderOutputBuffer {
    private final Owner e;
    @Nullable
    public ByteBuffer f;

    public SimpleDecoderOutputBuffer(Owner decoderOutputBuffer$Owner0) {
        this.e = decoderOutputBuffer$Owner0;
    }

    @Override  // androidx.media3.decoder.DecoderOutputBuffer
    public void f() {
        super.f();
        ByteBuffer byteBuffer0 = this.f;
        if(byteBuffer0 != null) {
            byteBuffer0.clear();
        }
    }

    @Override  // androidx.media3.decoder.DecoderOutputBuffer
    public void p() {
        this.e.a(this);
    }

    public ByteBuffer r(int v) {
        ByteBuffer byteBuffer0 = (ByteBuffer)Assertions.g(this.f);
        Assertions.a(v >= byteBuffer0.limit());
        ByteBuffer byteBuffer1 = ByteBuffer.allocateDirect(v).order(ByteOrder.nativeOrder());
        byteBuffer0.position(0);
        byteBuffer1.put(byteBuffer0);
        byteBuffer1.position(byteBuffer0.position());
        byteBuffer1.limit(v);
        this.f = byteBuffer1;
        return byteBuffer1;
    }

    public ByteBuffer s(long v, int v1) {
        this.b = v;
        if(this.f == null || this.f.capacity() < v1) {
            this.f = ByteBuffer.allocateDirect(v1).order(ByteOrder.nativeOrder());
        }
        this.f.position(0);
        this.f.limit(v1);
        return this.f;
    }
}

