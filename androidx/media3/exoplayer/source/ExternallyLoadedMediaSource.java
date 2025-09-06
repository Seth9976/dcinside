package androidx.media3.exoplayer.source;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import j..util.Objects;

@UnstableApi
public final class ExternallyLoadedMediaSource extends BaseMediaSource {
    public static final class Factory implements androidx.media3.exoplayer.source.MediaSource.Factory {
        private final long c;
        private final ExternalLoader d;

        public Factory(long v, ExternalLoader externalLoader0) {
            this.c = v;
            this.d = externalLoader0;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory a(androidx.media3.extractor.text.SubtitleParser.Factory subtitleParser$Factory0) {
            return this;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory b(boolean z) {
            return this;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory c(DrmSessionManagerProvider drmSessionManagerProvider0) {
            return this;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public int[] d() {
            return new int[]{4};
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory e(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            return this;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            return this;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public MediaSource g(MediaItem mediaItem0) {
            return this.h(mediaItem0);
        }

        public ExternallyLoadedMediaSource h(MediaItem mediaItem0) {
            return new ExternallyLoadedMediaSource(mediaItem0, this.c, this.d, null);
        }
    }

    private final ExternalLoader h;
    private final long i;
    @GuardedBy("this")
    private MediaItem j;

    private ExternallyLoadedMediaSource(MediaItem mediaItem0, long v, ExternalLoader externalLoader0) {
        this.j = mediaItem0;
        this.i = v;
        this.h = externalLoader0;
    }

    ExternallyLoadedMediaSource(MediaItem mediaItem0, long v, ExternalLoader externalLoader0, androidx.media3.exoplayer.source.ExternallyLoadedMediaSource.1 externallyLoadedMediaSource$10) {
        this(mediaItem0, v, externalLoader0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        MediaItem mediaItem0 = this.d();
        Assertions.g(mediaItem0.b);
        Assertions.h(mediaItem0.b.b, "Externally loaded mediaItems require a MIME type.");
        return new ExternallyLoadedMediaPeriod(mediaItem0.b.a, mediaItem0.b.b, this.h);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        synchronized(this) {
            this.j = mediaItem0;
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        LocalConfiguration mediaItem$LocalConfiguration0 = (LocalConfiguration)Assertions.g(this.d().b);
        return mediaItem0.b != null && mediaItem0.b.a.equals(mediaItem$LocalConfiguration0.a) && Objects.equals(mediaItem0.b.b, mediaItem$LocalConfiguration0.b) && (mediaItem0.b.j == 0x8000000000000001L || Util.F1(mediaItem0.b.j) == this.i);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        synchronized(this) {
        }
        return this.j;
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        MediaItem mediaItem0 = this.d();
        this.p0(new SinglePeriodTimeline(this.i, true, false, false, null, mediaItem0));
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void q0() {
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        ((ExternallyLoadedMediaPeriod)mediaPeriod0).o();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void w() {
    }

    class androidx.media3.exoplayer.source.ExternallyLoadedMediaSource.1 {
    }

}

