package androidx.media3.exoplayer.source.preload;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.LoadingInfo.Builder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.source.MediaPeriod.Callback;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.util.Arrays;

@UnstableApi
public final class PreloadMediaSource extends WrappingMediaSource {
    public static final class Factory implements androidx.media3.exoplayer.source.MediaSource.Factory {
        private final androidx.media3.exoplayer.source.MediaSource.Factory c;
        private final Looper d;
        private final Allocator e;
        private final TrackSelector f;
        private final BandwidthMeter g;
        private final RendererCapabilities[] h;
        private final PreloadControl i;

        public Factory(androidx.media3.exoplayer.source.MediaSource.Factory mediaSource$Factory0, PreloadControl preloadMediaSource$PreloadControl0, TrackSelector trackSelector0, BandwidthMeter bandwidthMeter0, RendererCapabilities[] arr_rendererCapabilities, Allocator allocator0, Looper looper0) {
            this.c = mediaSource$Factory0;
            this.i = preloadMediaSource$PreloadControl0;
            this.f = trackSelector0;
            this.g = bandwidthMeter0;
            this.h = (RendererCapabilities[])Arrays.copyOf(arr_rendererCapabilities, arr_rendererCapabilities.length);
            this.e = allocator0;
            this.d = looper0;
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
            return this.k(drmSessionManagerProvider0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public int[] d() {
            return this.c.d();
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory e(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            return this.l(loadErrorHandlingPolicy0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public androidx.media3.exoplayer.source.MediaSource.Factory f(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            return this.j(cmcdConfiguration$Factory0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaSource$Factory
        public MediaSource g(MediaItem mediaItem0) {
            return this.h(mediaItem0);
        }

        public PreloadMediaSource h(MediaItem mediaItem0) {
            return new PreloadMediaSource(this.c.g(mediaItem0), this.i, this.f, this.g, this.h, this.e, this.d, null);
        }

        public PreloadMediaSource i(MediaSource mediaSource0) {
            return new PreloadMediaSource(mediaSource0, this.i, this.f, this.g, this.h, this.e, this.d, null);
        }

        public Factory j(androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory cmcdConfiguration$Factory0) {
            this.c.f(cmcdConfiguration$Factory0);
            return this;
        }

        public Factory k(DrmSessionManagerProvider drmSessionManagerProvider0) {
            this.c.c(drmSessionManagerProvider0);
            return this;
        }

        public Factory l(LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            this.c.e(loadErrorHandlingPolicy0);
            return this;
        }
    }

    static class MediaPeriodKey {
        public final MediaPeriodId a;
        private final Long b;

        public MediaPeriodKey(MediaPeriodId mediaSource$MediaPeriodId0, long v) {
            this.a = mediaSource$MediaPeriodId0;
            this.b = v;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof MediaPeriodKey ? PreloadMediaSource.k1(this.a, ((MediaPeriodKey)object0).a) && this.b.equals(((MediaPeriodKey)object0).b) : false;
        }

        @Override
        public int hashCode() {
            return ((((this.a.a.hashCode() + 0x20F) * 0x1F + this.a.b) * 0x1F + this.a.c) * 0x1F + this.a.e) * 0x1F + this.b.intValue();
        }
    }

    public interface PreloadControl {
        void a(PreloadMediaSource arg1);

        boolean b(PreloadMediaSource arg1);

        void c(PreloadMediaSource arg1);

        boolean d(PreloadMediaSource arg1, long arg2);

        boolean e(PreloadMediaSource arg1);
    }

    class PreloadMediaPeriodCallback implements Callback {
        private final long a;
        private boolean b;
        final PreloadMediaSource c;

        public PreloadMediaPeriodCallback(long v) {
            this.a = v;
        }

        // 检测为 Lambda 实现
        private void c(MediaPeriod mediaPeriod0) [...]

        // 检测为 Lambda 实现
        private void d(MediaPeriod mediaPeriod0) [...]

        public void e(MediaPeriod mediaPeriod0) {
            PreloadMediaSource.this.r.post(() -> {
                if(PreloadMediaSource.this.f1()) {
                    return;
                }
                if(this.b && mediaPeriod0.d() == 0x8000000000000000L) {
                    PreloadMediaSource.this.m.a(PreloadMediaSource.this);
                    return;
                }
                if(this.b) {
                    long v = ((PreloadMediaPeriod)mediaPeriod0).d();
                    if(PreloadMediaSource.this.m.d(PreloadMediaSource.this, v)) {
                        ((PreloadMediaPeriod)mediaPeriod0).f(new Builder().f(this.a).d());
                    }
                }
                else {
                    ((PreloadMediaPeriod)mediaPeriod0).f(new Builder().f(this.a).d());
                }
            });
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
        public void h(MediaPeriod mediaPeriod0) {
            this.b = true;
            j j0 = () -> {
                TrackSelectorResult trackSelectorResult0;
                if(PreloadMediaSource.this.f1()) {
                    return;
                }
                TrackGroupArray trackGroupArray0 = ((PreloadMediaPeriod)mediaPeriod0).n();
                MediaPeriodKey preloadMediaSource$MediaPeriodKey0 = (MediaPeriodKey)((Pair)Assertions.g(PreloadMediaSource.this.w)).second;
                try {
                    Timeline timeline0 = (Timeline)Assertions.g(PreloadMediaSource.this.v);
                    trackSelectorResult0 = PreloadMediaSource.this.n.k(PreloadMediaSource.this.p, trackGroupArray0, preloadMediaSource$MediaPeriodKey0.a, timeline0);
                }
                catch(ExoPlaybackException exoPlaybackException0) {
                    Log.e("PreloadMediaSource", "Failed to select tracks", exoPlaybackException0);
                    trackSelectorResult0 = null;
                }
                if(trackSelectorResult0 != null) {
                    ((PreloadMediaPeriod)mediaPeriod0).r(trackSelectorResult0.c, this.a);
                    if(PreloadMediaSource.this.m.b(PreloadMediaSource.this)) {
                        ((PreloadMediaPeriod)mediaPeriod0).f(new Builder().f(this.a).d());
                    }
                }
            };
            PreloadMediaSource.this.r.post(j0);
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
        public void l(SequenceableLoader sequenceableLoader0) {
            this.e(((MediaPeriod)sequenceableLoader0));
        }
    }

    private static final String A = "PreloadMediaSource";
    private final PreloadControl m;
    private final TrackSelector n;
    private final BandwidthMeter o;
    private final RendererCapabilities[] p;
    private final Allocator q;
    private final Handler r;
    private boolean s;
    private boolean t;
    private long u;
    @Nullable
    private Timeline v;
    @Nullable
    private Pair w;
    @Nullable
    private Pair x;
    private boolean y;
    private boolean z;

    private PreloadMediaSource(MediaSource mediaSource0, PreloadControl preloadMediaSource$PreloadControl0, TrackSelector trackSelector0, BandwidthMeter bandwidthMeter0, RendererCapabilities[] arr_rendererCapabilities, Allocator allocator0, Looper looper0) {
        super(mediaSource0);
        this.m = preloadMediaSource$PreloadControl0;
        this.n = trackSelector0;
        this.o = bandwidthMeter0;
        this.p = arr_rendererCapabilities;
        this.q = allocator0;
        this.r = Util.G(looper0, null);
        this.u = 0x8000000000000001L;
    }

    PreloadMediaSource(MediaSource mediaSource0, PreloadControl preloadMediaSource$PreloadControl0, TrackSelector trackSelector0, BandwidthMeter bandwidthMeter0, RendererCapabilities[] arr_rendererCapabilities, Allocator allocator0, Looper looper0, androidx.media3.exoplayer.source.preload.PreloadMediaSource.1 preloadMediaSource$10) {
        this(mediaSource0, preloadMediaSource$PreloadControl0, trackSelector0, bandwidthMeter0, arr_rendererCapabilities, allocator0, looper0);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        return this.e1(mediaSource$MediaPeriodId0, allocator0, v);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    protected MediaPeriodId G0(MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.x == null || !PreloadMediaSource.k1(mediaSource$MediaPeriodId0, ((MediaPeriodId)((Pair)Assertions.g(this.x)).second)) ? mediaSource$MediaPeriodId0 : ((MediaPeriodId)((Pair)Assertions.g(this.x)).second);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void M0(Timeline timeline0) {
        this.v = timeline0;
        this.p0(timeline0);
        h h0 = () -> if(!this.f1() && !this.y) {
            this.y = true;
            if(!this.m.e(this)) {
                return;
            }
            Pair pair0 = timeline0.p(new Window(), new Period(), 0, this.u);
            this.e1(new MediaPeriodId(pair0.first), this.q, ((long)(((Long)pair0.second)))).o(new PreloadMediaPeriodCallback(this, ((long)(((Long)pair0.second)))), ((long)(((Long)pair0.second))));
        };
        this.r.post(h0);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void P0() {
        if(this.f1() && !this.z) {
            this.l1();
        }
        Timeline timeline0 = this.v;
        if(timeline0 != null) {
            this.M0(timeline0);
            return;
        }
        if(!this.t) {
            this.t = true;
            this.O0();
        }
    }

    public void d1() {
        f f0 = () -> {
            Pair pair0 = this.w;
            if(pair0 != null) {
                this.k.r(((PreloadMediaPeriod)pair0.first).a);
                this.w = null;
            }
        };
        this.r.post(f0);
    }

    public PreloadMediaPeriod e1(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        MediaPeriodKey preloadMediaSource$MediaPeriodKey0 = new MediaPeriodKey(mediaSource$MediaPeriodId0, v);
        if(this.w != null && preloadMediaSource$MediaPeriodKey0.equals(this.w.second)) {
            PreloadMediaPeriod preloadMediaPeriod0 = (PreloadMediaPeriod)((Pair)Assertions.g(this.w)).first;
            if(this.f1()) {
                this.w = null;
                this.x = new Pair(preloadMediaPeriod0, mediaSource$MediaPeriodId0);
            }
            return preloadMediaPeriod0;
        }
        Pair pair0 = this.w;
        if(pair0 != null) {
            MediaPeriod mediaPeriod0 = ((PreloadMediaPeriod)((Pair)Assertions.g(pair0)).first).a;
            this.k.r(mediaPeriod0);
            this.w = null;
        }
        PreloadMediaPeriod preloadMediaPeriod1 = new PreloadMediaPeriod(this.k.C(mediaSource$MediaPeriodId0, allocator0, v));
        if(!this.f1()) {
            this.w = new Pair(preloadMediaPeriod1, preloadMediaSource$MediaPeriodKey0);
        }
        return preloadMediaPeriod1;
    }

    private boolean f1() {
        return this.l0();
    }

    // 检测为 Lambda 实现
    private void g1() [...]

    // 检测为 Lambda 实现
    private void h1(Timeline timeline0) [...]

    // 检测为 Lambda 实现
    private void i1(long v) [...]

    // 检测为 Lambda 实现
    private void j1() [...]

    private static boolean k1(MediaPeriodId mediaSource$MediaPeriodId0, MediaPeriodId mediaSource$MediaPeriodId1) {
        return mediaSource$MediaPeriodId0.a.equals(mediaSource$MediaPeriodId1.a) && mediaSource$MediaPeriodId0.b == mediaSource$MediaPeriodId1.b && mediaSource$MediaPeriodId0.c == mediaSource$MediaPeriodId1.c && mediaSource$MediaPeriodId0.e == mediaSource$MediaPeriodId1.e;
    }

    private void l1() {
        this.m.c(this);
        this.z = true;
    }

    public void m1(long v) {
        g g0 = () -> {
            this.s = true;
            this.u = v;
            this.y = false;
            if(this.f1()) {
                this.l1();
                return;
            }
            this.r0(PlayerId.d);
            this.o0(this.o.g());
        };
        this.r.post(g0);
    }

    public void n1() {
        e e0 = () -> {
            this.s = false;
            this.u = 0x8000000000000001L;
            this.y = false;
            Pair pair0 = this.w;
            if(pair0 != null) {
                this.k.r(((PreloadMediaPeriod)pair0.first).a);
                this.w = null;
            }
            this.q0();
            this.r.removeCallbacksAndMessages(null);
        };
        this.r.post(e0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void q0() {
        if(!this.f1()) {
            this.z = false;
            if(!this.s) {
                this.v = null;
                this.t = false;
                super.q0();
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void r(MediaPeriod mediaPeriod0) {
        if(this.w != null && ((PreloadMediaPeriod)mediaPeriod0) == ((Pair)Assertions.g(this.w)).first) {
            this.w = null;
        }
        else if(this.x != null && ((PreloadMediaPeriod)mediaPeriod0) == ((Pair)Assertions.g(this.x)).first) {
            this.x = null;
        }
        this.k.r(((PreloadMediaPeriod)mediaPeriod0).a);
    }

    class androidx.media3.exoplayer.source.preload.PreloadMediaSource.1 {
    }

}

