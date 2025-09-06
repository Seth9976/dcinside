package androidx.media3.exoplayer.dash;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.extractor.ChunkIndex;

@UnstableApi
public final class DashWrappingSegmentIndex implements DashSegmentIndex {
    private final ChunkIndex b;
    private final long c;

    public DashWrappingSegmentIndex(ChunkIndex chunkIndex0, long v) {
        this.b = chunkIndex0;
        this.c = v;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long b(long v) {
        return this.b.h[((int)v)] - this.c;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long c(long v, long v1) {
        return this.b.g[((int)v)];
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long d(long v, long v1) {
        return 0L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long e(long v, long v1) {
        return 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long f(long v, long v1) {
        return (long)this.b.a(v + this.c);
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long g(long v) {
        return (long)this.b.d;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long h() {
        return 0L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri i(long v) {
        return new RangedUri(null, this.b.f[((int)v)], ((long)this.b.e[((int)v)]));
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean j() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long k(long v, long v1) {
        return (long)this.b.d;
    }
}

