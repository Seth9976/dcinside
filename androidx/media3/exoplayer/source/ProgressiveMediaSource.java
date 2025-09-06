package androidx.media3.exoplayer.source;

import O1.a;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.ExtractorsFactory;

@UnstableApi
public final class ProgressiveMediaSource extends BaseMediaSource implements Listener {
    public static final class Factory implements MediaSourceFactory {
        private final androidx.media3.datasource.DataSource.Factory c;
        private androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory d;
        private DrmSessionManagerProvider e;
        private LoadErrorHandlingPolicy f;
        private int g;

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this(dataSource$Factory0, new DefaultExtractorsFactory());
        }

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractor$Factory0) {
            this(dataSource$Factory0, progressiveMediaExtractor$Factory0, new DefaultDrmSessionManagerProvider(), new DefaultLoadErrorHandlingPolicy(), 0x100000);
        }

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractor$Factory0, DrmSessionManagerProvider drmSessionManagerProvider0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, int v) {
            this.c = dataSource$Factory0;
            this.d = progressiveMediaExtractor$Factory0;
            this.e = drmSessionManagerProvider0;
            this.f = loadErrorHandlingPolicy0;
            this.g = v;
        }

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0, ExtractorsFactory extractorsFactory0) {
            this(dataSource$Factory0, (PlayerId playerId0) -> new BundledExtractorsAdapter(extractorsFactory0));
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
        @a
        public androidx.media3.exoplayer.source.MediaSource.Factory c(DrmSessionManagerProvider drmSessionManagerProvider0) {
            return this.l(drmSessionManagerProvider0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public int[] d() {
            return new int[]{4};
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        @a
        public androidx.media3.exoplayer.source.MediaSource.Factory e(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            return this.m(loadErrorHandlingPolicy0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            return this;
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public MediaSource g(MediaItem mediaItem0) {
            return this.i(mediaItem0);
        }

        public ProgressiveMediaSource i(MediaItem mediaItem0) {
            Assertions.g(mediaItem0.b);
            androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractor$Factory0 = this.d;
            DrmSessionManager drmSessionManager0 = this.e.a(mediaItem0);
            return new ProgressiveMediaSource(mediaItem0, this.c, progressiveMediaExtractor$Factory0, drmSessionManager0, this.f, this.g, null);
        }

        // 检测为 Lambda 实现
        private static ProgressiveMediaExtractor j(ExtractorsFactory extractorsFactory0, PlayerId playerId0) [...]

        @a
        public Factory k(int v) {
            this.g = v;
            return this;
        }

        @a
        public Factory l(DrmSessionManagerProvider drmSessionManagerProvider0) {
            this.e = (DrmSessionManagerProvider)Assertions.h(drmSessionManagerProvider0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @a
        public Factory m(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            this.f = (LoadErrorHandlingPolicy)Assertions.h(loadErrorHandlingPolicy0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }
    }

    private final androidx.media3.datasource.DataSource.Factory h;
    private final androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory i;
    private final DrmSessionManager j;
    private final LoadErrorHandlingPolicy k;
    private final int l;
    private boolean m;
    private long n;
    private boolean o;
    private boolean p;
    @Nullable
    private TransferListener q;
    @GuardedBy("this")
    private MediaItem r;
    public static final int s = 0x100000;

    private ProgressiveMediaSource(MediaItem mediaItem0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractor$Factory0, DrmSessionManager drmSessionManager0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, int v) {
        this.r = mediaItem0;
        this.h = dataSource$Factory0;
        this.i = progressiveMediaExtractor$Factory0;
        this.j = drmSessionManager0;
        this.k = loadErrorHandlingPolicy0;
        this.l = v;
        this.m = true;
        this.n = 0x8000000000000001L;
    }

    ProgressiveMediaSource(MediaItem mediaItem0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory progressiveMediaExtractor$Factory0, DrmSessionManager drmSessionManager0, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, int v, androidx.media3.exoplayer.source.ProgressiveMediaSource.1 progressiveMediaSource$10) {
        this(mediaItem0, dataSource$Factory0, progressiveMediaExtractor$Factory0, drmSessionManager0, loadErrorHandlingPolicy0, v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        DataSource dataSource0 = this.h.a();
        TransferListener transferListener0 = this.q;
        if(transferListener0 != null) {
            dataSource0.l(transferListener0);
        }
        LocalConfiguration mediaItem$LocalConfiguration0 = this.u0();
        PlayerId playerId0 = this.h0();
        ProgressiveMediaExtractor progressiveMediaExtractor0 = this.i.a(playerId0);
        EventDispatcher drmSessionEventListener$EventDispatcher0 = this.V(mediaSource$MediaPeriodId0);
        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventListener$EventDispatcher0 = this.a0(mediaSource$MediaPeriodId0);
        return new ProgressiveMediaPeriod(mediaItem$LocalConfiguration0.a, dataSource0, progressiveMediaExtractor0, this.j, drmSessionEventListener$EventDispatcher0, this.k, mediaSourceEventListener$EventDispatcher0, this, allocator0, mediaItem$LocalConfiguration0.f, this.l, Util.F1(mediaItem$LocalConfiguration0.j));
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        synchronized(this) {
            this.r = mediaItem0;
        }
    }

    @Override  // androidx.media3.exoplayer.source.ProgressiveMediaPeriod$Listener
    public void Q(long v, boolean z, boolean z1) {
        if(v == 0x8000000000000001L) {
            v = this.n;
        }
        if(!this.m && this.n == v && this.o == z && this.p == z1) {
            return;
        }
        this.n = v;
        this.o = z;
        this.p = z1;
        this.m = false;
        this.v0();
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        LocalConfiguration mediaItem$LocalConfiguration0 = this.u0();
        return mediaItem0.b != null && mediaItem0.b.a.equals(mediaItem$LocalConfiguration0.a) && mediaItem0.b.j == mediaItem$LocalConfiguration0.j && Util.g(mediaItem0.b.f, mediaItem$LocalConfiguration0.f);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        synchronized(this) {
        }
        return this.r;
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        this.q = transferListener0;
        Looper looper0 = (Looper)Assertions.g(Looper.myLooper());
        PlayerId playerId0 = this.h0();
        this.j.b(looper0, playerId0);
        this.j.n();
        this.v0();
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void q0() {
        this.j.release();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        ((ProgressiveMediaPeriod)mediaPeriod0).h0();
    }

    private LocalConfiguration u0() {
        return (LocalConfiguration)Assertions.g(this.d().b);
    }

    private void v0() {
        SinglePeriodTimeline singlePeriodTimeline0 = new SinglePeriodTimeline(this.n, this.o, false, this.p, null, this.d());
        if(this.m) {
            singlePeriodTimeline0 = new ForwardingTimeline(singlePeriodTimeline0) {
                final ProgressiveMediaSource f;

                @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
                public Period k(int v, Period timeline$Period0, boolean z) {
                    super.k(v, timeline$Period0, z);
                    timeline$Period0.f = true;
                    return timeline$Period0;
                }

                @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
                public Window u(int v, Window timeline$Window0, long v1) {
                    super.u(v, timeline$Window0, v1);
                    timeline$Window0.k = true;
                    return timeline$Window0;
                }
            };
        }
        this.p0(singlePeriodTimeline0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void w() {
    }
}

