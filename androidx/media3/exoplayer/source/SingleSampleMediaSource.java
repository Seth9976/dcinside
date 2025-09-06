package androidx.media3.exoplayer.source;

import O1.a;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem.Builder;
import androidx.media3.common.MediaItem.SubtitleConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import com.google.common.base.z;
import com.google.common.collect.O2;

@UnstableApi
public final class SingleSampleMediaSource extends BaseMediaSource {
    public static final class Factory {
        private final androidx.media3.datasource.DataSource.Factory a;
        private LoadErrorHandlingPolicy b;
        private boolean c;
        @Nullable
        private Object d;
        @Nullable
        private String e;

        public Factory(androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this.a = (androidx.media3.datasource.DataSource.Factory)Assertions.g(dataSource$Factory0);
            this.b = new DefaultLoadErrorHandlingPolicy();
            this.c = true;
        }

        public SingleSampleMediaSource a(SubtitleConfiguration mediaItem$SubtitleConfiguration0, long v) {
            return new SingleSampleMediaSource(this.e, mediaItem$SubtitleConfiguration0, this.a, v, this.b, this.c, this.d, null);
        }

        @a
        public Factory b(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy0) {
            if(loadErrorHandlingPolicy0 == null) {
                loadErrorHandlingPolicy0 = new DefaultLoadErrorHandlingPolicy();
            }
            this.b = loadErrorHandlingPolicy0;
            return this;
        }

        @a
        public Factory c(@Nullable Object object0) {
            this.d = object0;
            return this;
        }

        @a
        @Deprecated
        public Factory d(@Nullable String s) {
            this.e = s;
            return this;
        }

        @a
        public Factory e(boolean z) {
            this.c = z;
            return this;
        }
    }

    private final DataSpec h;
    private final androidx.media3.datasource.DataSource.Factory i;
    private final Format j;
    private final long k;
    private final LoadErrorHandlingPolicy l;
    private final boolean m;
    private final Timeline n;
    private final MediaItem o;
    @Nullable
    private TransferListener p;

    private SingleSampleMediaSource(@Nullable String s, SubtitleConfiguration mediaItem$SubtitleConfiguration0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, long v, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, boolean z, @Nullable Object object0) {
        this.i = dataSource$Factory0;
        this.k = v;
        this.l = loadErrorHandlingPolicy0;
        this.m = z;
        MediaItem mediaItem0 = new Builder().M(Uri.EMPTY).E(mediaItem$SubtitleConfiguration0.a.toString()).J(O2.B(mediaItem$SubtitleConfiguration0)).L(object0).a();
        this.o = mediaItem0;
        this.j = new androidx.media3.common.Format.Builder().o0(((String)z.a(mediaItem$SubtitleConfiguration0.b, "text/x-unknown"))).e0(mediaItem$SubtitleConfiguration0.c).q0(mediaItem$SubtitleConfiguration0.d).m0(mediaItem$SubtitleConfiguration0.e).c0(mediaItem$SubtitleConfiguration0.f).a0((mediaItem$SubtitleConfiguration0.g == null ? s : mediaItem$SubtitleConfiguration0.g)).K();
        this.h = new androidx.media3.datasource.DataSpec.Builder().j(mediaItem$SubtitleConfiguration0.a).c(1).a();
        this.n = new SinglePeriodTimeline(v, true, false, false, null, mediaItem0);
    }

    SingleSampleMediaSource(String s, SubtitleConfiguration mediaItem$SubtitleConfiguration0, androidx.media3.datasource.DataSource.Factory dataSource$Factory0, long v, LoadErrorHandlingPolicy loadErrorHandlingPolicy0, boolean z, Object object0, androidx.media3.exoplayer.source.SingleSampleMediaSource.1 singleSampleMediaSource$10) {
        this(s, mediaItem$SubtitleConfiguration0, dataSource$Factory0, v, loadErrorHandlingPolicy0, z, object0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        TransferListener transferListener0 = this.p;
        EventDispatcher mediaSourceEventListener$EventDispatcher0 = this.a0(mediaSource$MediaPeriodId0);
        return new SingleSampleMediaPeriod(this.h, this.i, transferListener0, this.j, this.k, this.l, mediaSourceEventListener$EventDispatcher0, this.m);
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        return this.o;
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        this.p = transferListener0;
        this.p0(this.n);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void q0() {
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
        ((SingleSampleMediaPeriod)mediaPeriod0).r();
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void w() {
    }

    class androidx.media3.exoplayer.source.SingleSampleMediaSource.1 {
    }

}

