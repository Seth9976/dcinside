package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class DecoderCounters {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public void a(long v) {
        this.b(v, 1);
    }

    private void b(long v, int v1) {
        this.k += v;
        this.l += v1;
    }

    public void c() {
        synchronized(this) {
        }
    }

    public void d(DecoderCounters decoderCounters0) {
        this.a += decoderCounters0.a;
        this.b += decoderCounters0.b;
        this.c += decoderCounters0.c;
        this.d += decoderCounters0.d;
        this.e += decoderCounters0.e;
        this.f += decoderCounters0.f;
        this.g += decoderCounters0.g;
        this.h += decoderCounters0.h;
        this.i = Math.max(this.i, decoderCounters0.i);
        this.j += decoderCounters0.j;
        this.b(decoderCounters0.k, decoderCounters0.l);
    }

    @Override
    public String toString() {
        return Util.S("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l});
    }
}

