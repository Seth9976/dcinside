package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class ClippingMediaPeriod implements Callback, MediaPeriod {
    final class ClippingSampleStream implements SampleStream {
        public final SampleStream a;
        private boolean b;
        final ClippingMediaPeriod c;

        public ClippingSampleStream(SampleStream sampleStream0) {
            this.a = sampleStream0;
        }

        public void a() {
            this.b = false;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() throws IOException {
            this.a.b();
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return !ClippingMediaPeriod.this.m() && this.a.isReady();
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            if(ClippingMediaPeriod.this.m()) {
                return -3;
            }
            if(this.b) {
                decoderInputBuffer0.n(4);
                return -4;
            }
            long v1 = ClippingMediaPeriod.this.d();
            int v2 = this.a.m(formatHolder0, decoderInputBuffer0, v);
            if(v2 == -5) {
                Format format0 = (Format)Assertions.g(formatHolder0.b);
                int v3 = format0.E;
                if(v3 != 0 || format0.F != 0) {
                    ClippingMediaPeriod clippingMediaPeriod0 = ClippingMediaPeriod.this;
                    int v4 = 0;
                    if(clippingMediaPeriod0.e != 0L) {
                        v3 = 0;
                    }
                    if(clippingMediaPeriod0.f == 0x8000000000000000L) {
                        v4 = format0.F;
                    }
                    formatHolder0.b = format0.a().V(v3).W(v4).K();
                }
                return -5;
            }
            long v5 = ClippingMediaPeriod.this.f;
            if(v5 != 0x8000000000000000L && (v2 == -4 && decoderInputBuffer0.f >= v5 || v2 == -3 && v1 == 0x8000000000000000L && !decoderInputBuffer0.e)) {
                decoderInputBuffer0.f();
                decoderInputBuffer0.n(4);
                this.b = true;
                return -4;
            }
            return v2;
        }

        // 去混淆评级： 低(20)
        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            return ClippingMediaPeriod.this.m() ? -3 : this.a.p(v);
        }
    }

    public final MediaPeriod a;
    @Nullable
    private Callback b;
    private ClippingSampleStream[] c;
    private long d;
    long e;
    long f;
    @Nullable
    private IllegalClippingException g;

    public ClippingMediaPeriod(MediaPeriod mediaPeriod0, boolean z, long v, long v1) {
        this.a = mediaPeriod0;
        this.c = new ClippingSampleStream[0];
        this.d = z ? v : 0x8000000000000001L;
        this.e = v;
        this.f = v1;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.a.a();
    }

    private SeekParameters b(long v, SeekParameters seekParameters0) {
        long v1 = Util.x(seekParameters0.a, 0L, v - this.e);
        long v2 = Util.x(seekParameters0.b, 0L, (this.f == 0x8000000000000000L ? 0x7FFFFFFFFFFFFFFFL : this.f - v));
        return v1 != seekParameters0.a || v2 != seekParameters0.b ? new SeekParameters(v1, v2) : seekParameters0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        long v1 = this.e;
        if(v == v1) {
            return v1;
        }
        SeekParameters seekParameters1 = this.b(v, seekParameters0);
        return this.a.c(v, seekParameters1);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        long v = this.a.d();
        return v == 0x8000000000000000L || this.f != 0x8000000000000000L && v >= this.f ? 0x8000000000000000L : v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
        this.a.e(v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        return this.a.f(loadingInfo0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        long v = this.a.g();
        return v == 0x8000000000000000L || this.f != 0x8000000000000000L && v >= this.f ? 0x8000000000000000L : v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
    public void h(MediaPeriod mediaPeriod0) {
        if(this.g != null) {
            return;
        }
        ((Callback)Assertions.g(this.b)).h(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return this.a.i(list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        this.d = 0x8000000000000001L;
        ClippingSampleStream[] arr_clippingMediaPeriod$ClippingSampleStream = this.c;
        boolean z = false;
        for(int v1 = 0; v1 < arr_clippingMediaPeriod$ClippingSampleStream.length; ++v1) {
            ClippingSampleStream clippingMediaPeriod$ClippingSampleStream0 = arr_clippingMediaPeriod$ClippingSampleStream[v1];
            if(clippingMediaPeriod$ClippingSampleStream0 != null) {
                clippingMediaPeriod$ClippingSampleStream0.a();
            }
        }
        long v2 = this.a.j(v);
        if(v2 == v || v2 >= this.e && (this.f == 0x8000000000000000L || v2 <= this.f)) {
            z = true;
        }
        Assertions.i(z);
        return v2;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        if(this.m()) {
            long v = this.d;
            this.d = 0x8000000000000001L;
            long v1 = this.k();
            return v1 == 0x8000000000000001L ? v : v1;
        }
        boolean z = false;
        long v2 = this.a.k();
        if(v2 == 0x8000000000000001L) {
            return 0x8000000000000001L;
        }
        Assertions.i(v2 >= this.e);
        if(this.f == 0x8000000000000000L || v2 <= this.f) {
            z = true;
        }
        Assertions.i(z);
        return v2;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
    public void l(SequenceableLoader sequenceableLoader0) {
        this.o(((MediaPeriod)sequenceableLoader0));
    }

    boolean m() {
        return this.d != 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.a.n();
    }

    public void o(MediaPeriod mediaPeriod0) {
        ((Callback)Assertions.g(this.b)).l(this);
    }

    public void p(IllegalClippingException clippingMediaSource$IllegalClippingException0) {
        this.g = clippingMediaSource$IllegalClippingException0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        this.c = new ClippingSampleStream[arr_sampleStream.length];
        SampleStream[] arr_sampleStream1 = new SampleStream[arr_sampleStream.length];
        for(int v2 = 0; true; ++v2) {
            SampleStream sampleStream0 = null;
            if(v2 >= arr_sampleStream.length) {
                break;
            }
            ClippingSampleStream[] arr_clippingMediaPeriod$ClippingSampleStream = this.c;
            ClippingSampleStream clippingMediaPeriod$ClippingSampleStream0 = (ClippingSampleStream)arr_sampleStream[v2];
            arr_clippingMediaPeriod$ClippingSampleStream[v2] = clippingMediaPeriod$ClippingSampleStream0;
            if(clippingMediaPeriod$ClippingSampleStream0 != null) {
                sampleStream0 = clippingMediaPeriod$ClippingSampleStream0.a;
            }
            arr_sampleStream1[v2] = sampleStream0;
        }
        long v3 = this.a.q(arr_exoTrackSelection, arr_z, arr_sampleStream1, arr_z1, v);
        this.d = !this.m() || (v != this.e || !ClippingMediaPeriod.r(this.e, arr_exoTrackSelection)) ? 0x8000000000000001L : v3;
        Assertions.i(v3 == v || v3 >= this.e && (this.f == 0x8000000000000000L || v3 <= this.f));
        for(int v1 = 0; v1 < arr_sampleStream.length; ++v1) {
            SampleStream sampleStream1 = arr_sampleStream1[v1];
            if(sampleStream1 == null) {
                this.c[v1] = null;
            }
            else {
                ClippingSampleStream[] arr_clippingMediaPeriod$ClippingSampleStream1 = this.c;
                ClippingSampleStream clippingMediaPeriod$ClippingSampleStream1 = arr_clippingMediaPeriod$ClippingSampleStream1[v1];
                if(clippingMediaPeriod$ClippingSampleStream1 == null || clippingMediaPeriod$ClippingSampleStream1.a != sampleStream1) {
                    arr_clippingMediaPeriod$ClippingSampleStream1[v1] = new ClippingSampleStream(this, sampleStream1);
                }
            }
            arr_sampleStream[v1] = this.c[v1];
        }
        return v3;
    }

    private static boolean r(long v, ExoTrackSelection[] arr_exoTrackSelection) {
        if(v != 0L) {
            for(int v1 = 0; v1 < arr_exoTrackSelection.length; ++v1) {
                ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v1];
                if(exoTrackSelection0 != null) {
                    Format format0 = exoTrackSelection0.n();
                    if(!MimeTypes.a(format0.n, format0.j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        IllegalClippingException clippingMediaSource$IllegalClippingException0 = this.g;
        if(clippingMediaSource$IllegalClippingException0 != null) {
            throw clippingMediaSource$IllegalClippingException0;
        }
        this.a.s();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(Callback mediaPeriod$Callback0, long v) {
        this.b = mediaPeriod$Callback0;
        this.a.t(this, v);
    }

    public void u(long v, long v1) {
        this.e = v;
        this.f = v1;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        this.a.v(v, z);
    }
}

