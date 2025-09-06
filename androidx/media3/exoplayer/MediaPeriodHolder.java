package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.source.ClippingMediaPeriod;
import androidx.media3.exoplayer.source.EmptySampleStream;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

final class MediaPeriodHolder {
    interface Factory {
        MediaPeriodHolder a(MediaPeriodInfo arg1, long arg2);
    }

    public final MediaPeriod a;
    public final Object b;
    public final SampleStream[] c;
    public boolean d;
    public boolean e;
    public MediaPeriodInfo f;
    public boolean g;
    private final boolean[] h;
    private final RendererCapabilities[] i;
    private final TrackSelector j;
    private final MediaSourceList k;
    @Nullable
    private MediaPeriodHolder l;
    private TrackGroupArray m;
    private TrackSelectorResult n;
    private long o;
    private static final String p = "MediaPeriodHolder";

    public MediaPeriodHolder(RendererCapabilities[] arr_rendererCapabilities, long v, TrackSelector trackSelector0, Allocator allocator0, MediaSourceList mediaSourceList0, MediaPeriodInfo mediaPeriodInfo0, TrackSelectorResult trackSelectorResult0) {
        this.i = arr_rendererCapabilities;
        this.o = v;
        this.j = trackSelector0;
        this.k = mediaSourceList0;
        this.b = mediaPeriodInfo0.a.a;
        this.f = mediaPeriodInfo0;
        this.m = TrackGroupArray.e;
        this.n = trackSelectorResult0;
        this.c = new SampleStream[arr_rendererCapabilities.length];
        this.h = new boolean[arr_rendererCapabilities.length];
        this.a = MediaPeriodHolder.f(mediaPeriodInfo0.a, mediaSourceList0, allocator0, mediaPeriodInfo0.b, mediaPeriodInfo0.d);
    }

    public long A(long v) {
        return v - this.m();
    }

    public long B(long v) {
        return v + this.m();
    }

    public void C() {
        MediaPeriod mediaPeriod0 = this.a;
        if(mediaPeriod0 instanceof ClippingMediaPeriod) {
            ((ClippingMediaPeriod)mediaPeriod0).u(0L, (this.f.d == 0x8000000000000001L ? 0x8000000000000000L : this.f.d));
        }
    }

    public long a(TrackSelectorResult trackSelectorResult0, long v, boolean z) {
        return this.b(trackSelectorResult0, v, z, new boolean[this.i.length]);
    }

    public long b(TrackSelectorResult trackSelectorResult0, long v, boolean z, boolean[] arr_z) {
        for(int v1 = 0; true; ++v1) {
            boolean z1 = true;
            if(v1 >= trackSelectorResult0.a) {
                break;
            }
            boolean[] arr_z1 = this.h;
            if(z || !trackSelectorResult0.b(this.n, v1)) {
                z1 = false;
            }
            arr_z1[v1] = z1;
        }
        this.h(this.c);
        this.g();
        this.n = trackSelectorResult0;
        this.i();
        long v2 = this.a.q(trackSelectorResult0.c, this.h, this.c, arr_z, v);
        this.c(this.c);
        this.e = false;
        for(int v3 = 0; true; ++v3) {
            SampleStream[] arr_sampleStream = this.c;
            if(v3 >= arr_sampleStream.length) {
                break;
            }
            if(arr_sampleStream[v3] == null) {
                Assertions.i(trackSelectorResult0.c[v3] == null);
            }
            else {
                Assertions.i(trackSelectorResult0.c(v3));
                if(this.i[v3].g() != -2) {
                    this.e = true;
                }
            }
        }
        return v2;
    }

    private void c(SampleStream[] arr_sampleStream) {
        for(int v = 0; true; ++v) {
            RendererCapabilities[] arr_rendererCapabilities = this.i;
            if(v >= arr_rendererCapabilities.length) {
                break;
            }
            if(arr_rendererCapabilities[v].g() == -2 && this.n.c(v)) {
                arr_sampleStream[v] = new EmptySampleStream();
            }
        }
    }

    // 去混淆评级： 低(20)
    public boolean d(MediaPeriodInfo mediaPeriodInfo0) {
        return MediaPeriodQueue.d(this.f.e, mediaPeriodInfo0.e) && (this.f.b == mediaPeriodInfo0.b && this.f.a.equals(mediaPeriodInfo0.a));
    }

    public void e(long v, float f, long v1) {
        Assertions.i(this.t());
        long v2 = this.A(v);
        LoadingInfo loadingInfo0 = new Builder().f(v2).g(f).e(v1).d();
        this.a.f(loadingInfo0);
    }

    private static MediaPeriod f(MediaPeriodId mediaSource$MediaPeriodId0, MediaSourceList mediaSourceList0, Allocator allocator0, long v, long v1) {
        MediaPeriod mediaPeriod0 = mediaSourceList0.i(mediaSource$MediaPeriodId0, allocator0, v);
        return v1 != 0x8000000000000001L ? new ClippingMediaPeriod(mediaPeriod0, true, 0L, v1) : mediaPeriod0;
    }

    private void g() {
        if(!this.t()) {
            return;
        }
        for(int v = 0; true; ++v) {
            TrackSelectorResult trackSelectorResult0 = this.n;
            if(v >= trackSelectorResult0.a) {
                break;
            }
            boolean z = trackSelectorResult0.c(v);
            ExoTrackSelection exoTrackSelection0 = this.n.c[v];
            if(z && exoTrackSelection0 != null) {
                exoTrackSelection0.c();
            }
        }
    }

    private void h(SampleStream[] arr_sampleStream) {
        for(int v = 0; true; ++v) {
            RendererCapabilities[] arr_rendererCapabilities = this.i;
            if(v >= arr_rendererCapabilities.length) {
                break;
            }
            if(arr_rendererCapabilities[v].g() == -2) {
                arr_sampleStream[v] = null;
            }
        }
    }

    private void i() {
        if(!this.t()) {
            return;
        }
        for(int v = 0; true; ++v) {
            TrackSelectorResult trackSelectorResult0 = this.n;
            if(v >= trackSelectorResult0.a) {
                break;
            }
            boolean z = trackSelectorResult0.c(v);
            ExoTrackSelection exoTrackSelection0 = this.n.c[v];
            if(z && exoTrackSelection0 != null) {
                exoTrackSelection0.k();
            }
        }
    }

    public long j() {
        if(!this.d) {
            return this.f.b;
        }
        long v = this.e ? this.a.d() : 0x8000000000000000L;
        return v == 0x8000000000000000L ? this.f.e : v;
    }

    @Nullable
    public MediaPeriodHolder k() {
        return this.l;
    }

    public long l() {
        return this.d ? this.a.g() : 0L;
    }

    public long m() {
        return this.o;
    }

    public long n() {
        return this.f.b + this.o;
    }

    public TrackGroupArray o() {
        return this.m;
    }

    public TrackSelectorResult p() {
        return this.n;
    }

    public void q(float f, Timeline timeline0) throws ExoPlaybackException {
        this.d = true;
        this.m = this.a.n();
        TrackSelectorResult trackSelectorResult0 = this.x(f, timeline0);
        long v = this.f.b;
        long v1 = this.f.e;
        if(v1 != 0x8000000000000001L && v >= v1) {
            v = Math.max(0L, v1 - 1L);
        }
        long v2 = this.a(trackSelectorResult0, v, false);
        this.o += this.f.b - v2;
        this.f = this.f.b(v2);
    }

    public boolean r() {
        try {
            if(!this.d) {
                this.a.s();
                return false;
            }
            SampleStream[] arr_sampleStream = this.c;
            for(int v = 0; v < arr_sampleStream.length; ++v) {
                SampleStream sampleStream0 = arr_sampleStream[v];
                if(sampleStream0 != null) {
                    sampleStream0.b();
                }
            }
            return false;
        }
        catch(IOException unused_ex) {
            return true;
        }
    }

    // 去混淆评级： 低(20)
    public boolean s() {
        return this.d && (!this.e || this.a.d() == 0x8000000000000000L);
    }

    private boolean t() {
        return this.l == null;
    }

    public void u(long v) {
        Assertions.i(this.t());
        if(this.d) {
            long v1 = this.A(v);
            this.a.e(v1);
        }
    }

    public void v() {
        this.g();
        MediaPeriodHolder.w(this.k, this.a);
    }

    private static void w(MediaSourceList mediaSourceList0, MediaPeriod mediaPeriod0) {
        try {
            if(mediaPeriod0 instanceof ClippingMediaPeriod) {
                mediaSourceList0.C(((ClippingMediaPeriod)mediaPeriod0).a);
                return;
            }
            mediaSourceList0.C(mediaPeriod0);
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        Log.e("MediaPeriodHolder", "Period release failed.", runtimeException0);
    }

    public TrackSelectorResult x(float f, Timeline timeline0) throws ExoPlaybackException {
        TrackSelectorResult trackSelectorResult0 = this.j.k(this.i, this.o(), this.f.a, timeline0);
        for(int v1 = 0; true; ++v1) {
            boolean z = true;
            if(v1 >= trackSelectorResult0.a) {
                break;
            }
            if(trackSelectorResult0.c(v1)) {
                if(trackSelectorResult0.c[v1] == null && this.i[v1].g() != -2) {
                    z = false;
                }
            }
            else if(trackSelectorResult0.c[v1] != null) {
                z = false;
            }
            Assertions.i(z);
        }
        ExoTrackSelection[] arr_exoTrackSelection = trackSelectorResult0.c;
        for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
            if(exoTrackSelection0 != null) {
                exoTrackSelection0.s(f);
            }
        }
        return trackSelectorResult0;
    }

    public void y(@Nullable MediaPeriodHolder mediaPeriodHolder0) {
        if(mediaPeriodHolder0 == this.l) {
            return;
        }
        this.g();
        this.l = mediaPeriodHolder0;
        this.i();
    }

    public void z(long v) {
        this.o = v;
    }
}

