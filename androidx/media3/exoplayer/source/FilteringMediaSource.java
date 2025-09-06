package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.a3;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@UnstableApi
public class FilteringMediaSource extends WrappingMediaSource {
    static final class FilteringMediaPeriod implements Callback, MediaPeriod {
        public final MediaPeriod a;
        private final a3 b;
        @Nullable
        private Callback c;
        @Nullable
        private TrackGroupArray d;

        public FilteringMediaPeriod(MediaPeriod mediaPeriod0, a3 a30) {
            this.a = mediaPeriod0;
            this.b = a30;
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public boolean a() {
            return this.a.a();
        }

        public void b(MediaPeriod mediaPeriod0) {
            ((Callback)Assertions.g(this.c)).l(this);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long c(long v, SeekParameters seekParameters0) {
            return this.a.c(v, seekParameters0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long d() {
            return this.a.d();
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
            return this.a.g();
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
        public void h(MediaPeriod mediaPeriod0) {
            TrackGroupArray trackGroupArray0 = mediaPeriod0.n();
            a o2$a0 = O2.n();
            for(int v = 0; v < trackGroupArray0.a; ++v) {
                TrackGroup trackGroup0 = trackGroupArray0.c(v);
                if(this.b.contains(trackGroup0.c)) {
                    o2$a0.j(trackGroup0);
                }
            }
            this.d = new TrackGroupArray(((TrackGroup[])o2$a0.n().toArray(new TrackGroup[0])));
            ((Callback)Assertions.g(this.c)).h(this);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public List i(List list0) {
            return this.a.i(list0);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long j(long v) {
            return this.a.j(v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long k() {
            return this.a.k();
        }

        @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
        public void l(SequenceableLoader sequenceableLoader0) {
            this.b(((MediaPeriod)sequenceableLoader0));
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public TrackGroupArray n() {
            return (TrackGroupArray)Assertions.g(this.d);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
            return this.a.q(arr_exoTrackSelection, arr_z, arr_sampleStream, arr_z1, v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void s() throws IOException {
            this.a.s();
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void t(Callback mediaPeriod$Callback0, long v) {
            this.c = mediaPeriod$Callback0;
            this.a.t(this, v);
        }

        @Override  // androidx.media3.exoplayer.source.MediaPeriod
        public void v(long v, boolean z) {
            this.a.v(v, z);
        }
    }

    private final a3 m;

    public FilteringMediaSource(MediaSource mediaSource0, int v) {
        this(mediaSource0, a3.C(v));
    }

    public FilteringMediaSource(MediaSource mediaSource0, Set set0) {
        super(mediaSource0);
        this.m = a3.u(set0);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public MediaPeriod C(MediaPeriodId mediaSource$MediaPeriodId0, Allocator allocator0, long v) {
        return new FilteringMediaPeriod(super.C(mediaSource$MediaPeriodId0, allocator0, v), this.m);
    }

    @Override  // androidx.media3.exoplayer.source.WrappingMediaSource
    public void r(MediaPeriod mediaPeriod0) {
        super.r(((FilteringMediaPeriod)mediaPeriod0).a);
    }
}

