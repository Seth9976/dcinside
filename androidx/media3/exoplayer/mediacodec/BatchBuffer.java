package androidx.media3.exoplayer.mediacodec;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

final class BatchBuffer extends DecoderInputBuffer {
    private long m;
    private int n;
    private int o;
    public static final int p = 0x20;
    @VisibleForTesting
    static final int q = 3072000;

    public BatchBuffer() {
        super(2);
        this.o = 0x20;
    }

    public long A() {
        return this.m;
    }

    public int B() {
        return this.n;
    }

    public boolean C() {
        return this.n > 0;
    }

    public void D(@IntRange(from = 1L) int v) {
        Assertions.a(v > 0);
        this.o = v;
    }

    @Override  // androidx.media3.decoder.DecoderInputBuffer
    public void f() {
        super.f();
        this.n = 0;
    }

    public boolean w(DecoderInputBuffer decoderInputBuffer0) {
        Assertions.a(!decoderInputBuffer0.t());
        Assertions.a(!decoderInputBuffer0.i());
        Assertions.a(!decoderInputBuffer0.j());
        if(!this.y(decoderInputBuffer0)) {
            return false;
        }
        int v = this.n;
        this.n = v + 1;
        if(v == 0) {
            this.f = decoderInputBuffer0.f;
            if(decoderInputBuffer0.l()) {
                this.n(1);
            }
        }
        ByteBuffer byteBuffer0 = decoderInputBuffer0.d;
        if(byteBuffer0 != null) {
            this.r(byteBuffer0.remaining());
            this.d.put(byteBuffer0);
        }
        this.m = decoderInputBuffer0.f;
        return true;
    }

    private boolean y(DecoderInputBuffer decoderInputBuffer0) {
        if(!this.C()) {
            return true;
        }
        return this.n < this.o ? decoderInputBuffer0.d == null || (this.d == null || this.d.position() + decoderInputBuffer0.d.remaining() <= 3072000) : false;
    }

    public long z() {
        return this.f;
    }
}

