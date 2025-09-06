package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.exoplayer.dash.DashSegmentIndex;

final class SingleSegmentIndex implements DashSegmentIndex {
    private final RangedUri b;

    public SingleSegmentIndex(RangedUri rangedUri0) {
        this.b = rangedUri0;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long b(long v) {
        return 0L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long c(long v, long v1) {
        return v1;
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
        return 0L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long g(long v) {
        return 1L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long h() {
        return 0L;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public RangedUri i(long v) {
        return this.b;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public boolean j() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.dash.DashSegmentIndex
    public long k(long v, long v1) {
        return 1L;
    }
}

