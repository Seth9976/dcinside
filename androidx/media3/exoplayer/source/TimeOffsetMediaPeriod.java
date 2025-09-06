package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.io.IOException;
import java.util.List;

final class TimeOffsetMediaPeriod implements Callback, MediaPeriod {
    static final class TimeOffsetSampleStream implements SampleStream {
        private final SampleStream a;
        private final long b;

        public TimeOffsetSampleStream(SampleStream sampleStream0, long v) {
            this.a = sampleStream0;
            this.b = v;
        }

        public SampleStream a() {
            return this.a;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public void b() throws IOException {
            this.a.b();
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public boolean isReady() {
            return this.a.isReady();
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
            int v1 = this.a.m(formatHolder0, decoderInputBuffer0, v);
            if(v1 == -4) {
                decoderInputBuffer0.f += this.b;
            }
            return v1;
        }

        @Override  // androidx.media3.exoplayer.source.SampleStream
        public int p(long v) {
            return this.a.p(v - this.b);
        }
    }

    private final MediaPeriod a;
    private final long b;
    private Callback c;

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod0, long v) {
        this.a = mediaPeriod0;
        this.b = v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.a.a();
    }

    public MediaPeriod b() {
        return this.a;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        return this.a.c(v - this.b, seekParameters0) + this.b;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        long v = this.a.d();
        return v == 0x8000000000000000L ? 0x8000000000000000L : this.b + v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
        this.a.e(v - this.b);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        LoadingInfo loadingInfo1 = loadingInfo0.a().f(loadingInfo0.a - this.b).d();
        return this.a.f(loadingInfo1);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        long v = this.a.g();
        return v == 0x8000000000000000L ? 0x8000000000000000L : this.b + v;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
    public void h(MediaPeriod mediaPeriod0) {
        ((Callback)Assertions.g(this.c)).h(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return this.a.i(list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        return this.a.j(v - this.b) + this.b;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        long v = this.a.k();
        return v == 0x8000000000000001L ? 0x8000000000000001L : this.b + v;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
    public void l(SequenceableLoader sequenceableLoader0) {
        this.m(((MediaPeriod)sequenceableLoader0));
    }

    public void m(MediaPeriod mediaPeriod0) {
        ((Callback)Assertions.g(this.c)).l(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.a.n();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        SampleStream[] arr_sampleStream1 = new SampleStream[arr_sampleStream.length];
        for(int v2 = 0; true; ++v2) {
            SampleStream sampleStream0 = null;
            if(v2 >= arr_sampleStream.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetMediaPeriod$TimeOffsetSampleStream0 = (TimeOffsetSampleStream)arr_sampleStream[v2];
            if(timeOffsetMediaPeriod$TimeOffsetSampleStream0 != null) {
                sampleStream0 = timeOffsetMediaPeriod$TimeOffsetSampleStream0.a();
            }
            arr_sampleStream1[v2] = sampleStream0;
        }
        long v3 = this.a.q(arr_exoTrackSelection, arr_z, arr_sampleStream1, arr_z1, v - this.b);
        for(int v1 = 0; v1 < arr_sampleStream.length; ++v1) {
            SampleStream sampleStream1 = arr_sampleStream1[v1];
            if(sampleStream1 == null) {
                arr_sampleStream[v1] = null;
            }
            else {
                SampleStream sampleStream2 = arr_sampleStream[v1];
                if(sampleStream2 == null || ((TimeOffsetSampleStream)sampleStream2).a() != sampleStream1) {
                    arr_sampleStream[v1] = new TimeOffsetSampleStream(sampleStream1, this.b);
                }
            }
        }
        return v3 + this.b;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        this.a.s();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(Callback mediaPeriod$Callback0, long v) {
        this.c = mediaPeriod$Callback0;
        this.a.t(this, v - this.b);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        this.a.v(v - this.b, z);
    }
}

