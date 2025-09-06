package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class MaskingMediaPeriod implements Callback, MediaPeriod {
    public interface PrepareListener {
        void a(MediaPeriodId arg1);

        void b(MediaPeriodId arg1, IOException arg2);
    }

    public final MediaPeriodId a;
    private final long b;
    private final Allocator c;
    private MediaSource d;
    private MediaPeriod e;
    @Nullable
    private Callback f;
    @Nullable
    private PrepareListener g;
    private boolean h;
    private long i;

    public MaskingMediaPeriod(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        this.a = mediaSource$MediaPeriodId0;
        this.c = allocator0;
        this.b = v;
        this.i = 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.e != null && this.e.a();
    }

    public void b(MediaPeriodId mediaSource$MediaPeriodId0) {
        long v = this.p(this.b);
        MediaPeriod mediaPeriod0 = ((MediaSource)Assertions.g(this.d)).C(mediaSource$MediaPeriodId0, this.c, v);
        this.e = mediaPeriod0;
        if(this.f != null) {
            mediaPeriod0.t(this, v);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        return this.e.c(v, seekParameters0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        return this.e.d();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
        this.e.e(v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        return this.e != null && this.e.f(loadingInfo0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        return this.e.g();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
    public void h(MediaPeriod mediaPeriod0) {
        ((Callback)Util.o(this.f)).h(this);
        PrepareListener maskingMediaPeriod$PrepareListener0 = this.g;
        if(maskingMediaPeriod$PrepareListener0 != null) {
            maskingMediaPeriod$PrepareListener0.a(this.a);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return t.a(this, list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        return this.e.j(v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        return this.e.k();
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
    public void l(SequenceableLoader sequenceableLoader0) {
        this.r(((MediaPeriod)sequenceableLoader0));
    }

    public long m() {
        return this.i;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.e.n();
    }

    public long o() {
        return this.b;
    }

    private long p(long v) {
        return this.i == 0x8000000000000001L ? v : this.i;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        long v1 = this.i == 0x8000000000000001L || v != this.b ? v : this.i;
        this.i = 0x8000000000000001L;
        return this.e.q(arr_exoTrackSelection, arr_z, arr_sampleStream, arr_z1, v1);
    }

    public void r(MediaPeriod mediaPeriod0) {
        this.f.l(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        try {
            MediaPeriod mediaPeriod0 = this.e;
            if(mediaPeriod0 != null) {
                mediaPeriod0.s();
                return;
            }
            MediaSource mediaSource0 = this.d;
            if(mediaSource0 != null) {
                mediaSource0.w();
            }
        }
        catch(IOException iOException0) {
            PrepareListener maskingMediaPeriod$PrepareListener0 = this.g;
            if(maskingMediaPeriod$PrepareListener0 == null) {
                throw iOException0;
            }
            if(!this.h) {
                this.h = true;
                maskingMediaPeriod$PrepareListener0.b(this.a, iOException0);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(Callback mediaPeriod$Callback0, long v) {
        this.f = mediaPeriod$Callback0;
        MediaPeriod mediaPeriod0 = this.e;
        if(mediaPeriod0 != null) {
            mediaPeriod0.t(this, this.p(this.b));
        }
    }

    public void u(long v) {
        this.i = v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        this.e.v(v, z);
    }

    public void w() {
        if(this.e != null) {
            ((MediaSource)Assertions.g(this.d)).r(this.e);
        }
    }

    public void x(MediaSource mediaSource0) {
        Assertions.i(this.d == null);
        this.d = mediaSource0;
    }

    public void y(PrepareListener maskingMediaPeriod$PrepareListener0) {
        this.g = maskingMediaPeriod$PrepareListener0;
    }
}

