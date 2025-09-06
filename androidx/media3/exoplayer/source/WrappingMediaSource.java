package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
public abstract class WrappingMediaSource extends CompositeMediaSource {
    protected final MediaSource k;
    private static final Void l;

    static {
    }

    protected WrappingMediaSource(MediaSource mediaSource0) {
        this.k = mediaSource0;
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void B0(Object object0, MediaSource mediaSource0, Timeline timeline0) {
        this.N0(((Void)object0), mediaSource0, timeline0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        return this.k.C(mediaSource$MediaPeriodId0, allocator0, v);
    }

    protected final void E0() {
        this.v0(WrappingMediaSource.l);
    }

    protected final void F0() {
        this.w0(WrappingMediaSource.l);
    }

    @Nullable
    protected MediaPeriodId G0(MediaPeriodId mediaSource$MediaPeriodId0) {
        return mediaSource$MediaPeriodId0;
    }

    @Nullable
    protected final MediaPeriodId H0(Void void0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.G0(mediaSource$MediaPeriodId0);
    }

    protected long I0(long v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) [...] // Inlined contents

    protected final long J0(Void void0, long v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return v;
    }

    protected int K0(int v) [...] // Inlined contents

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        this.k.L(mediaItem0);
    }

    protected final int L0(Void void0, int v) {
        return v;
    }

    protected void M0(Timeline timeline0) {
        this.p0(timeline0);
    }

    protected final void N0(Void void0, MediaSource mediaSource0, Timeline timeline0) {
        this.M0(timeline0);
    }

    protected final void O0() {
        this.C0(WrappingMediaSource.l, this.k);
    }

    protected void P0() {
        this.O0();
    }

    protected final void Q0() {
        this.D0(WrappingMediaSource.l);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean R() {
        return this.k.R();
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        return this.k.S(mediaItem0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        return this.k.d();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected final void o0(@Nullable TransferListener transferListener0) {
        super.o0(transferListener0);
        this.P0();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        this.k.r(mediaPeriod0);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    @Nullable
    public Timeline x() {
        return this.k.x();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    protected MediaPeriodId x0(Object object0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.H0(((Void)object0), mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected long y0(Object object0, long v, @Nullable MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.J0(((Void)object0), v, mediaSource$MediaPeriodId0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected int z0(Object object0, int v) {
        return this.L0(((Void)object0), v);
    }
}

