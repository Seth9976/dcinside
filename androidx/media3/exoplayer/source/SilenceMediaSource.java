package androidx.media3.exoplayer.source;

import O1.a;
import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
public final class SilenceMediaSource extends BaseMediaSource {
    public static final class Factory {
        private long a;
        @Nullable
        private Object b;

        public SilenceMediaSource a() {
            Assertions.i(this.a > 0L);
            return new SilenceMediaSource(this.a, SilenceMediaSource.o.a().L(this.b).a(), null);
        }

        @a
        public Factory b(@IntRange(from = 1L) long v) {
            this.a = v;
            return this;
        }

        @a
        public Factory c(@Nullable Object object0) {
            this.b = object0;
            return this;
        }
    }

    static final class SilenceMediaPeriod implements MediaPeriod {
        private final long a;
        private final ArrayList b;
        private static final TrackGroupArray c;

        static {
            SilenceMediaPeriod.c = new TrackGroupArray(new TrackGroup[]{new TrackGroup(new Format[]{SilenceMediaSource.n})});
        }

        public SilenceMediaPeriod(long v) {
            this.a = v;
            this.b = new ArrayList();
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public boolean a() {
            return false;
        }

        private long b(long v) {
            return Util.x(v, 0L, this.a);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long c(long v, SeekParameters seekParameters0) {
            return this.b(v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long d() {
            return 0x8000000000000000L;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void e(long v) {
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public boolean f(LoadingInfo loadingInfo0) {
            return false;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long g() {
            return 0x8000000000000000L;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public List i(List list0) {
            return t.a(this, list0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long j(long v) {
            long v1 = this.b(v);
            for(int v2 = 0; v2 < this.b.size(); ++v2) {
                ((SilenceSampleStream)this.b.get(v2)).a(v1);
            }
            return v1;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long k() {
            return 0x8000000000000001L;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray n() {
            return SilenceMediaPeriod.c;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
            long v1 = this.b(v);
            for(int v2 = 0; v2 < arr_exoTrackSelection.length; ++v2) {
                SampleStream sampleStream0 = arr_sampleStream[v2];
                if(sampleStream0 != null && (arr_exoTrackSelection[v2] == null || !arr_z[v2])) {
                    this.b.remove(sampleStream0);
                    arr_sampleStream[v2] = null;
                }
                if(arr_sampleStream[v2] == null && arr_exoTrackSelection[v2] != null) {
                    SilenceSampleStream silenceMediaSource$SilenceSampleStream0 = new SilenceSampleStream(this.a);
                    silenceMediaSource$SilenceSampleStream0.a(v1);
                    this.b.add(silenceMediaSource$SilenceSampleStream0);
                    arr_sampleStream[v2] = silenceMediaSource$SilenceSampleStream0;
                    arr_z1[v2] = true;
                }
            }
            return v1;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void s() {
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void t(Callback mediaPeriod$Callback0, long v) {
            mediaPeriod$Callback0.h(this);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void v(long v, boolean z) {
        }
    }

    static final class SilenceSampleStream implements SampleStream {
        private final long a;
        private boolean b;
        private long c;

        public SilenceSampleStream(long v) {
            this.a = SilenceMediaSource.z0(v);
            this.a(0L);
        }

        public void a(long v) {
            this.c = Util.x(SilenceMediaSource.z0(v), 0L, this.a);
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() {
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return true;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            if(this.b && (v & 2) == 0) {
                long v1 = this.c;
                long v2 = this.a - v1;
                if(v2 == 0L) {
                    decoderInputBuffer0.e(4);
                    return -4;
                }
                decoderInputBuffer0.f = SilenceMediaSource.A0(v1);
                decoderInputBuffer0.e(1);
                int v3 = (int)Math.min(SilenceMediaSource.p.length, v2);
                if((v & 4) == 0) {
                    decoderInputBuffer0.r(v3);
                    decoderInputBuffer0.d.put(SilenceMediaSource.p, 0, v3);
                }
                if((v & 1) == 0) {
                    this.c += (long)v3;
                }
                return -4;
            }
            formatHolder0.b = SilenceMediaSource.n;
            this.b = true;
            return -5;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            long v1 = this.c;
            this.a(v);
            return (int)((this.c - v1) / ((long)SilenceMediaSource.p.length));
        }
    }

    private final long h;
    @GuardedBy("this")
    private MediaItem i;
    public static final String j = "SilenceMediaSource";
    private static final int k = 44100;
    private static final int l = 2;
    private static final int m = 2;
    private static final Format n;
    private static final MediaItem o;
    private static final byte[] p;

    static {
        SilenceMediaSource.n = new Builder().o0("audio/raw").N(2).p0(44100).i0(2).K();
        SilenceMediaSource.o = new androidx.media3.common.MediaItem.Builder().E("SilenceMediaSource").M(Uri.EMPTY).G("audio/raw").a();
        SilenceMediaSource.p = new byte[Util.C0(2, 2) * 0x400];
    }

    public SilenceMediaSource(long v) {
        this(v, SilenceMediaSource.o);
    }

    private SilenceMediaSource(long v, MediaItem mediaItem0) {
        Assertions.a(v >= 0L);
        this.h = v;
        this.i = mediaItem0;
    }

    SilenceMediaSource(long v, MediaItem mediaItem0, androidx.media3.exoplayer.source.SilenceMediaSource.1 silenceMediaSource$10) {
        this(v, mediaItem0);
    }

    private static long A0(long v) {
        return v / ((long)Util.C0(2, 2)) * 1000000L / 44100L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        return new SilenceMediaPeriod(this.h);
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public void L(MediaItem mediaItem0) {
        synchronized(this) {
            this.i = mediaItem0;
        }
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    public boolean S(MediaItem mediaItem0) {
        return true;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public MediaItem d() {
        synchronized(this) {
        }
        return this.i;
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void o0(@Nullable TransferListener transferListener0) {
        MediaItem mediaItem0 = this.d();
        this.p0(new SinglePeriodTimeline(this.h, true, false, false, null, mediaItem0));
    }

    @Override  // androidx.media3.exoplayer.source.BaseMediaSource
    protected void q0() {
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void r(MediaPeriod mediaPeriod0) {
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource
    public void w() {
    }

    private static long z0(long v) {
        return ((long)Util.C0(2, 2)) * (v * 44100L / 1000000L);
    }

    class androidx.media3.exoplayer.source.SilenceMediaSource.1 {
    }

}

