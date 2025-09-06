package androidx.media3.exoplayer.source.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState.AdGroup;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem.AdsConfiguration;
import androidx.media3.common.MediaItem.DrmConfiguration;
import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.CompositeMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod.PrepareListener;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.Factory;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class AdsMediaSource extends CompositeMediaSource {
    public static final class AdLoadException extends IOException {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface Type {
        }

        public final int a;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;

        private AdLoadException(int v, Exception exception0) {
            super(exception0);
            this.a = v;
        }

        public static AdLoadException a(Exception exception0) {
            return new AdLoadException(0, exception0);
        }

        public static AdLoadException b(Exception exception0, int v) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + v, exception0));
        }

        public static AdLoadException c(Exception exception0) {
            return new AdLoadException(2, exception0);
        }

        public static AdLoadException d(RuntimeException runtimeException0) {
            return new AdLoadException(3, runtimeException0);
        }

        public RuntimeException e() {
            Assertions.i(this.a == 3);
            return (RuntimeException)Assertions.g(this.getCause());
        }
    }

    final class AdMediaSourceHolder {
        private final MediaPeriodId a;
        private final List b;
        private MediaItem c;
        private MediaSource d;
        private Timeline e;
        final AdsMediaSource f;

        public AdMediaSourceHolder(MediaPeriodId mediaSource$MediaPeriodId0) {
            this.a = mediaSource$MediaPeriodId0;
            this.b = new ArrayList();
        }

        public MediaPeriod a(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
            MediaPeriod mediaPeriod0 = new MaskingMediaPeriod(mediaSource$MediaPeriodId0, allocator0, v);
            this.b.add(mediaPeriod0);
            MediaSource mediaSource0 = this.d;
            if(mediaSource0 != null) {
                ((MaskingMediaPeriod)mediaPeriod0).x(mediaSource0);
                MediaItem mediaItem0 = (MediaItem)Assertions.g(this.c);
                ((MaskingMediaPeriod)mediaPeriod0).y(new AdPrepareListener(AdsMediaSource.this, mediaItem0));
            }
            Timeline timeline0 = this.e;
            if(timeline0 != null) {
                ((MaskingMediaPeriod)mediaPeriod0).b(new MediaPeriodId(timeline0.s(0), mediaSource$MediaPeriodId0.d));
            }
            return mediaPeriod0;
        }

        public long b() {
            return this.e == null ? 0x8000000000000001L : this.e.j(0, AdsMediaSource.this.s).n();
        }

        public void c(Timeline timeline0) {
            Assertions.a(timeline0.m() == 1);
            if(this.e == null) {
                Object object0 = timeline0.s(0);
                for(int v = 0; v < this.b.size(); ++v) {
                    MaskingMediaPeriod maskingMediaPeriod0 = (MaskingMediaPeriod)this.b.get(v);
                    maskingMediaPeriod0.b(new MediaPeriodId(object0, maskingMediaPeriod0.a.d));
                }
            }
            this.e = timeline0;
        }

        public boolean d() {
            return this.d != null;
        }

        public void e(MediaSource mediaSource0, MediaItem mediaItem0) {
            this.d = mediaSource0;
            this.c = mediaItem0;
            for(int v = 0; v < this.b.size(); ++v) {
                MaskingMediaPeriod maskingMediaPeriod0 = (MaskingMediaPeriod)this.b.get(v);
                maskingMediaPeriod0.x(mediaSource0);
                maskingMediaPeriod0.y(new AdPrepareListener(AdsMediaSource.this, mediaItem0));
            }
            AdsMediaSource.this.C0(this.a, mediaSource0);
        }

        public boolean f() {
            return this.b.isEmpty();
        }

        public void g() {
            if(this.d()) {
                AdsMediaSource.this.D0(this.a);
            }
        }

        public void h(MaskingMediaPeriod maskingMediaPeriod0) {
            this.b.remove(maskingMediaPeriod0);
            maskingMediaPeriod0.w();
        }
    }

    final class AdPrepareListener implements PrepareListener {
        private final MediaItem a;
        final AdsMediaSource b;

        public AdPrepareListener(MediaItem mediaItem0) {
            this.a = mediaItem0;
        }

        @Override  // androidx.media3.exoplayer.source.MaskingMediaPeriod$PrepareListener
        public void a(MediaPeriodId mediaSource$MediaPeriodId0) {
            AdsMediaSource.this.r.post(() -> AdsMediaSource.this.n.d(AdsMediaSource.this, mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c));
        }

        @Override  // androidx.media3.exoplayer.source.MaskingMediaPeriod$PrepareListener
        public void b(MediaPeriodId mediaSource$MediaPeriodId0, IOException iOException0) {
            AdsMediaSource.this.a0(mediaSource$MediaPeriodId0).w(new LoadEventInfo(LoadEventInfo.a(), new DataSpec(((LocalConfiguration)Assertions.g(this.a.b)).a), SystemClock.elapsedRealtime()), 6, AdLoadException.a(iOException0), true);
            d d0 = () -> AdsMediaSource.this.n.f(AdsMediaSource.this, mediaSource$MediaPeriodId0.b, mediaSource$MediaPeriodId0.c, iOException0);
            AdsMediaSource.this.r.post(d0);
        }

        // 检测为 Lambda 实现
        private void e(MediaPeriodId mediaSource$MediaPeriodId0) [...]

        // 检测为 Lambda 实现
        private void f(MediaPeriodId mediaSource$MediaPeriodId0, IOException iOException0) [...]
    }

    final class ComponentListener implements EventListener {
        private final Handler a;
        private volatile boolean b;
        final AdsMediaSource c;

        public ComponentListener() {
            this.a = Util.H();
        }

        @Override  // androidx.media3.exoplayer.source.ads.AdsLoader$EventListener
        public void a() {
        }

        @Override  // androidx.media3.exoplayer.source.ads.AdsLoader$EventListener
        public void b(AdPlaybackState adPlaybackState0) {
            if(this.b) {
                return;
            }
            f f0 = () -> {
                if(this.b) {
                    return;
                }
                AdsMediaSource.this.V0(adPlaybackState0);
            };
            this.a.post(f0);
        }

        @Override  // androidx.media3.exoplayer.source.ads.AdsLoader$EventListener
        public void c(AdLoadException adsMediaSource$AdLoadException0, DataSpec dataSpec0) {
            if(this.b) {
                return;
            }
            AdsMediaSource.this.a0(null).w(new LoadEventInfo(LoadEventInfo.a(), dataSpec0, SystemClock.elapsedRealtime()), 6, adsMediaSource$AdLoadException0, true);
        }

        // 检测为 Lambda 实现
        private void e(AdPlaybackState adPlaybackState0) [...]

        public void f() {
            this.b = true;
            this.a.removeCallbacksAndMessages(null);
        }

        @Override  // androidx.media3.exoplayer.source.ads.AdsLoader$EventListener
        public void onAdClicked() {
        }
    }

    private final MaskingMediaSource k;
    @Nullable
    final DrmConfiguration l;
    private final Factory m;
    private final AdsLoader n;
    private final AdViewProvider o;
    private final DataSpec p;
    private final Object q;
    private final Handler r;
    private final Period s;
    @Nullable
    private ComponentListener t;
    @Nullable
    private Timeline u;
    @Nullable
    private AdPlaybackState v;
    private AdMediaSourceHolder[][] w;
    private static final MediaPeriodId x;

    static {
        AdsMediaSource.x = new MediaPeriodId(new Object());
    }

    public AdsMediaSource(MediaSource mediaSource0, DataSpec dataSpec0, Object object0, Factory mediaSource$Factory0, AdsLoader adsLoader0, AdViewProvider adViewProvider0) {
        this.k = new MaskingMediaSource(mediaSource0, true);
        this.l = ((LocalConfiguration)Assertions.g(mediaSource0.d().b)).c;
        this.m = mediaSource$Factory0;
        this.n = adsLoader0;
        this.o = adViewProvider0;
        this.p = dataSpec0;
        this.q = object0;
        this.r = new Handler(Looper.getMainLooper());
        this.s = new Period();
        this.w = new AdMediaSourceHolder[0][];
        adsLoader0.c(mediaSource$Factory0.d());
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void B0(Object object0, MediaSource mediaSource0, Timeline timeline0) {
        this.W0(((MediaPeriodId)object0), mediaSource0, timeline0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        if(((AdPlaybackState)Assertions.g(this.v)).b > 0 && mediaSource$MediaPeriodId0.c()) {
            int v1 = mediaSource$MediaPeriodId0.b;
            int v2 = mediaSource$MediaPeriodId0.c;
            AdMediaSourceHolder[][] arr2_adsMediaSource$AdMediaSourceHolder = this.w;
            AdMediaSourceHolder[] arr_adsMediaSource$AdMediaSourceHolder = arr2_adsMediaSource$AdMediaSourceHolder[v1];
            if(arr_adsMediaSource$AdMediaSourceHolder.length <= v2) {
                arr2_adsMediaSource$AdMediaSourceHolder[v1] = (AdMediaSourceHolder[])Arrays.copyOf(arr_adsMediaSource$AdMediaSourceHolder, v2 + 1);
            }
            AdMediaSourceHolder adsMediaSource$AdMediaSourceHolder0 = this.w[v1][v2];
            if(adsMediaSource$AdMediaSourceHolder0 == null) {
                adsMediaSource$AdMediaSourceHolder0 = new AdMediaSourceHolder(this, mediaSource$MediaPeriodId0);
                this.w[v1][v2] = adsMediaSource$AdMediaSourceHolder0;
                this.T0();
            }
            return adsMediaSource$AdMediaSourceHolder0.a(mediaSource$MediaPeriodId0, allocator0, v);
        }
        MediaPeriod mediaPeriod0 = new MaskingMediaPeriod(mediaSource$MediaPeriodId0, allocator0, v);
        ((MaskingMediaPeriod)mediaPeriod0).x(this.k);
        ((MaskingMediaPeriod)mediaPeriod0).b(mediaSource$MediaPeriodId0);
        return mediaPeriod0;
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        this.k.L(mediaItem0);
    }

    private long[][] O0() {
        long[][] arr2_v = new long[this.w.length][];
        for(int v = 0; true; ++v) {
            AdMediaSourceHolder[][] arr2_adsMediaSource$AdMediaSourceHolder = this.w;
            if(v >= arr2_adsMediaSource$AdMediaSourceHolder.length) {
                break;
            }
            arr2_v[v] = new long[arr2_adsMediaSource$AdMediaSourceHolder[v].length];
            for(int v1 = 0; true; ++v1) {
                AdMediaSourceHolder[] arr_adsMediaSource$AdMediaSourceHolder = this.w[v];
                if(v1 >= arr_adsMediaSource$AdMediaSourceHolder.length) {
                    break;
                }
                AdMediaSourceHolder adsMediaSource$AdMediaSourceHolder0 = arr_adsMediaSource$AdMediaSourceHolder[v1];
                long[] arr_v = arr2_v[v];
                arr_v[v1] = adsMediaSource$AdMediaSourceHolder0 == null ? 0x8000000000000001L : adsMediaSource$AdMediaSourceHolder0.b();
            }
        }
        return arr2_v;
    }

    @Nullable
    private static AdsConfiguration P0(MediaItem mediaItem0) {
        return mediaItem0.b == null ? null : mediaItem0.b.d;
    }

    protected MediaPeriodId Q0(MediaPeriodId mediaSource$MediaPeriodId0, MediaPeriodId mediaSource$MediaPeriodId1) {
        return mediaSource$MediaPeriodId0.c() ? mediaSource$MediaPeriodId0 : mediaSource$MediaPeriodId1;
    }

    // 检测为 Lambda 实现
    private void R0(ComponentListener adsMediaSource$ComponentListener0) [...]

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        return Util.g(AdsMediaSource.P0(this.d()), AdsMediaSource.P0(mediaItem0)) && this.k.S(mediaItem0);
    }

    // 检测为 Lambda 实现
    private void S0(ComponentListener adsMediaSource$ComponentListener0) [...]

    private void T0() {
        AdPlaybackState adPlaybackState0 = this.v;
        if(adPlaybackState0 == null) {
            return;
        }
        for(int v = 0; v < this.w.length; ++v) {
            for(int v1 = 0; true; ++v1) {
                AdMediaSourceHolder[] arr_adsMediaSource$AdMediaSourceHolder = this.w[v];
                if(v1 >= arr_adsMediaSource$AdMediaSourceHolder.length) {
                    break;
                }
                AdMediaSourceHolder adsMediaSource$AdMediaSourceHolder0 = arr_adsMediaSource$AdMediaSourceHolder[v1];
                AdGroup adPlaybackState$AdGroup0 = adPlaybackState0.e(v);
                if(adsMediaSource$AdMediaSourceHolder0 != null && !adsMediaSource$AdMediaSourceHolder0.d()) {
                    MediaItem[] arr_mediaItem = adPlaybackState$AdGroup0.e;
                    if(v1 < arr_mediaItem.length) {
                        MediaItem mediaItem0 = arr_mediaItem[v1];
                        if(mediaItem0 != null) {
                            if(this.l != null) {
                                mediaItem0 = mediaItem0.a().m(this.l).a();
                            }
                            adsMediaSource$AdMediaSourceHolder0.e(this.m.g(mediaItem0), mediaItem0);
                        }
                    }
                }
            }
        }
    }

    private void U0() {
        Timeline timeline0 = this.u;
        AdPlaybackState adPlaybackState0 = this.v;
        if(adPlaybackState0 != null && timeline0 != null) {
            if(adPlaybackState0.b == 0) {
                this.p0(timeline0);
                return;
            }
            this.v = adPlaybackState0.n(this.O0());
            this.p0(new SinglePeriodAdTimeline(timeline0, this.v));
        }
    }

    private void V0(AdPlaybackState adPlaybackState0) {
        AdPlaybackState adPlaybackState1 = this.v;
        boolean z = false;
        if(adPlaybackState1 == null) {
            AdMediaSourceHolder[][] arr2_adsMediaSource$AdMediaSourceHolder = new AdMediaSourceHolder[adPlaybackState0.b][];
            this.w = arr2_adsMediaSource$AdMediaSourceHolder;
            Arrays.fill(arr2_adsMediaSource$AdMediaSourceHolder, new AdMediaSourceHolder[0]);
        }
        else {
            if(adPlaybackState0.b == adPlaybackState1.b) {
                z = true;
            }
            Assertions.i(z);
        }
        this.v = adPlaybackState0;
        this.T0();
        this.U0();
    }

    protected void W0(MediaPeriodId mediaSource$MediaPeriodId0, MediaSource mediaSource0, Timeline timeline0) {
        boolean z = true;
        if(mediaSource$MediaPeriodId0.c()) {
            ((AdMediaSourceHolder)Assertions.g(this.w[mediaSource$MediaPeriodId0.b][mediaSource$MediaPeriodId0.c])).c(timeline0);
        }
        else {
            if(timeline0.m() != 1) {
                z = false;
            }
            Assertions.a(z);
            this.u = timeline0;
        }
        this.U0();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        return this.k.d();
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        super.o0(transferListener0);
        ComponentListener adsMediaSource$ComponentListener0 = new ComponentListener(this);
        this.t = adsMediaSource$ComponentListener0;
        this.u = this.k.U0();
        this.C0(AdsMediaSource.x, this.k);
        b b0 = () -> this.n.a(this, this.p, this.q, this.o, adsMediaSource$ComponentListener0);
        this.r.post(b0);
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected void q0() {
        super.q0();
        ComponentListener adsMediaSource$ComponentListener0 = (ComponentListener)Assertions.g(this.t);
        this.t = null;
        adsMediaSource$ComponentListener0.f();
        this.u = null;
        this.v = null;
        this.w = new AdMediaSourceHolder[0][];
        c c0 = () -> this.n.b(this, adsMediaSource$ComponentListener0);
        this.r.post(c0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        MediaPeriodId mediaSource$MediaPeriodId0 = ((MaskingMediaPeriod)mediaPeriod0).a;
        if(mediaSource$MediaPeriodId0.c()) {
            AdMediaSourceHolder adsMediaSource$AdMediaSourceHolder0 = (AdMediaSourceHolder)Assertions.g(this.w[mediaSource$MediaPeriodId0.b][mediaSource$MediaPeriodId0.c]);
            adsMediaSource$AdMediaSourceHolder0.h(((MaskingMediaPeriod)mediaPeriod0));
            if(adsMediaSource$AdMediaSourceHolder0.f()) {
                adsMediaSource$AdMediaSourceHolder0.g();
                this.w[mediaSource$MediaPeriodId0.b][mediaSource$MediaPeriodId0.c] = null;
            }
        }
        else {
            ((MaskingMediaPeriod)mediaPeriod0).w();
        }
    }

    @Override  // androidx.media3.exoplayer.source.CompositeMediaSource
    protected MediaPeriodId x0(Object object0, MediaPeriodId mediaSource$MediaPeriodId0) {
        return this.Q0(((MediaPeriodId)object0), mediaSource$MediaPeriodId0);
    }
}

