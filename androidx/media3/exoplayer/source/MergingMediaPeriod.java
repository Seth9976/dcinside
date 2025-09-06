package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.chunk.Chunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.collect.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

final class MergingMediaPeriod implements Callback, MediaPeriod {
    static final class ForwardingTrackSelection implements ExoTrackSelection {
        private final ExoTrackSelection c;
        private final TrackGroup d;

        public ForwardingTrackSelection(ExoTrackSelection exoTrackSelection0, TrackGroup trackGroup0) {
            this.c = exoTrackSelection0;
            this.d = trackGroup0;
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public long a() {
            return this.c.a();
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean b(int v, long v1) {
            return this.c.b(v, v1);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void c() {
            this.c.c();
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int d() {
            return this.c.d();
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public int e(int v) {
            return this.c.e(v);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ForwardingTrackSelection ? this.c.equals(((ForwardingTrackSelection)object0).c) && this.d.equals(((ForwardingTrackSelection)object0).d) : false;
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean f(int v, long v1) {
            return this.c.f(v, v1);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void g() {
            this.c.g();
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public int getType() {
            return this.c.getType();
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public int h(int v) {
            return this.c.h(v);
        }

        @Override
        public int hashCode() {
            return (this.d.hashCode() + 0x20F) * 0x1F + this.c.hashCode();
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public TrackGroup i() {
            return this.d;
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public boolean j(long v, Chunk chunk0, List list0) {
            return this.c.j(v, chunk0, list0);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void k() {
            this.c.k();
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int l(long v, List list0) {
            return this.c.l(v, list0);
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public int length() {
            return this.c.length();
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int m() {
            return this.c.m();
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public Format n() {
            int v = this.c.m();
            return this.d.c(v);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void o() {
            this.c.o();
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public int p(Format format0) {
            int v = this.d.d(format0);
            return this.c.h(v);
        }

        @Override  // androidx.media3.exoplayer.trackselection.TrackSelection
        public Format q(int v) {
            int v1 = this.c.e(v);
            return this.d.c(v1);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void r(long v, long v1, long v2, List list0, MediaChunkIterator[] arr_mediaChunkIterator) {
            this.c.r(v, v1, v2, list0, arr_mediaChunkIterator);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void s(float f) {
            this.c.s(f);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        @Nullable
        public Object t() {
            return this.c.t();
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public void u(boolean z) {
            this.c.u(z);
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public int v() {
            return this.c.v();
        }
    }

    private final MediaPeriod[] a;
    private final IdentityHashMap b;
    private final CompositeSequenceableLoaderFactory c;
    private final ArrayList d;
    private final HashMap e;
    @Nullable
    private Callback f;
    @Nullable
    private TrackGroupArray g;
    private MediaPeriod[] h;
    private SequenceableLoader i;

    public MergingMediaPeriod(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory0, long[] arr_v, MediaPeriod[] arr_mediaPeriod) {
        this.c = compositeSequenceableLoaderFactory0;
        this.a = arr_mediaPeriod;
        this.d = new ArrayList();
        this.e = new HashMap();
        this.i = compositeSequenceableLoaderFactory0.empty();
        this.b = new IdentityHashMap();
        this.h = new MediaPeriod[0];
        for(int v = 0; v < arr_mediaPeriod.length; ++v) {
            long v1 = arr_v[v];
            if(v1 != 0L) {
                this.a[v] = new TimeOffsetMediaPeriod(arr_mediaPeriod[v], v1);
            }
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.i.a();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long c(long v, SeekParameters seekParameters0) {
        MediaPeriod[] arr_mediaPeriod = this.h;
        return arr_mediaPeriod.length <= 0 ? this.a[0].c(v, seekParameters0) : arr_mediaPeriod[0].c(v, seekParameters0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long d() {
        return this.i.d();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void e(long v) {
        this.i.e(v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean f(LoadingInfo loadingInfo0) {
        if(!this.d.isEmpty()) {
            int v = this.d.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((MediaPeriod)this.d.get(v1)).f(loadingInfo0);
            }
            return false;
        }
        return this.i.f(loadingInfo0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long g() {
        return this.i.g();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
    public void h(MediaPeriod mediaPeriod0) {
        this.d.remove(mediaPeriod0);
        if(!this.d.isEmpty()) {
            return;
        }
        MediaPeriod[] arr_mediaPeriod = this.a;
        int v1 = 0;
        for(int v = 0; v < arr_mediaPeriod.length; ++v) {
            v1 += arr_mediaPeriod[v].n().a;
        }
        TrackGroup[] arr_trackGroup = new TrackGroup[v1];
        for(int v2 = 0; true; ++v2) {
            MediaPeriod[] arr_mediaPeriod1 = this.a;
            if(v2 >= arr_mediaPeriod1.length) {
                break;
            }
            TrackGroupArray trackGroupArray0 = arr_mediaPeriod1[v2].n();
            int v4 = trackGroupArray0.a;
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                TrackGroup trackGroup0 = trackGroupArray0.c(v5);
                Format[] arr_format = new Format[trackGroup0.a];
                for(int v6 = 0; v6 < trackGroup0.a; ++v6) {
                    Format format0 = trackGroup0.c(v6);
                    arr_format[v6] = format0.a().a0(v2 + ":" + (format0.a == null ? "" : format0.a)).K();
                }
                TrackGroup trackGroup1 = new TrackGroup(v2 + ":" + trackGroup0.b, arr_format);
                this.e.put(trackGroup1, trackGroup0);
                arr_trackGroup[v3] = trackGroup1;
                ++v5;
            }
        }
        this.g = new TrackGroupArray(arr_trackGroup);
        ((Callback)Assertions.g(this.f)).h(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return t.a(this, list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        long v1 = this.h[0].j(v);
        for(int v2 = 1; true; ++v2) {
            MediaPeriod[] arr_mediaPeriod = this.h;
            if(v2 >= arr_mediaPeriod.length) {
                break;
            }
            if(arr_mediaPeriod[v2].j(v1) != v1) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v1;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        MediaPeriod[] arr_mediaPeriod = this.h;
        long v = 0x8000000000000001L;
        for(int v1 = 0; v1 < arr_mediaPeriod.length; ++v1) {
            MediaPeriod mediaPeriod0 = arr_mediaPeriod[v1];
            long v2 = mediaPeriod0.k();
            if(v2 != 0x8000000000000001L) {
                if(v == 0x8000000000000001L) {
                    MediaPeriod[] arr_mediaPeriod1 = this.h;
                    for(int v3 = 0; v3 < arr_mediaPeriod1.length; ++v3) {
                        MediaPeriod mediaPeriod1 = arr_mediaPeriod1[v3];
                        if(mediaPeriod1 == mediaPeriod0) {
                            break;
                        }
                        if(mediaPeriod1.j(v2) != v2) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    v = v2;
                }
                else if(v2 != v) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            }
            else if(v != 0x8000000000000001L && mediaPeriod0.j(v) != v) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
    public void l(SequenceableLoader sequenceableLoader0) {
        this.p(((MediaPeriod)sequenceableLoader0));
    }

    public MediaPeriod m(int v) {
        MediaPeriod mediaPeriod0 = this.a[v];
        return mediaPeriod0 instanceof TimeOffsetMediaPeriod ? ((TimeOffsetMediaPeriod)mediaPeriod0).b() : mediaPeriod0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return (TrackGroupArray)Assertions.g(this.g);
    }

    // 检测为 Lambda 实现
    private static List o(MediaPeriod mediaPeriod0) [...]

    public void p(MediaPeriod mediaPeriod0) {
        ((Callback)Assertions.g(this.f)).l(this);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        int[] arr_v = new int[arr_exoTrackSelection.length];
        int[] arr_v1 = new int[arr_exoTrackSelection.length];
        for(int v1 = 0; true; ++v1) {
            Integer integer0 = null;
            if(v1 >= arr_exoTrackSelection.length) {
                break;
            }
            SampleStream sampleStream0 = arr_sampleStream[v1];
            if(sampleStream0 != null) {
                integer0 = (Integer)this.b.get(sampleStream0);
            }
            arr_v[v1] = integer0 == null ? -1 : ((int)integer0);
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v1];
            if(exoTrackSelection0 == null) {
                arr_v1[v1] = -1;
            }
            else {
                TrackGroup trackGroup0 = exoTrackSelection0.i();
                arr_v1[v1] = Integer.parseInt(trackGroup0.b.substring(0, trackGroup0.b.indexOf(":")));
            }
        }
        this.b.clear();
        SampleStream[] arr_sampleStream1 = new SampleStream[arr_exoTrackSelection.length];
        SampleStream[] arr_sampleStream2 = new SampleStream[arr_exoTrackSelection.length];
        ExoTrackSelection[] arr_exoTrackSelection1 = new ExoTrackSelection[arr_exoTrackSelection.length];
        ArrayList arrayList0 = new ArrayList(this.a.length);
        long v2 = v;
        for(int v3 = 0; v3 < this.a.length; v3 = v5 + 1) {
            for(int v4 = 0; v4 < arr_exoTrackSelection.length; ++v4) {
                arr_sampleStream2[v4] = arr_v[v4] == v3 ? arr_sampleStream[v4] : null;
                if(arr_v1[v4] == v3) {
                    ExoTrackSelection exoTrackSelection1 = (ExoTrackSelection)Assertions.g(arr_exoTrackSelection[v4]);
                    TrackGroup trackGroup1 = exoTrackSelection1.i();
                    arr_exoTrackSelection1[v4] = new ForwardingTrackSelection(exoTrackSelection1, ((TrackGroup)Assertions.g(((TrackGroup)this.e.get(trackGroup1)))));
                }
                else {
                    arr_exoTrackSelection1[v4] = null;
                }
            }
            int v5 = v3;
            long v6 = this.a[v3].q(arr_exoTrackSelection1, arr_z, arr_sampleStream2, arr_z1, v2);
            if(v5 == 0) {
                v2 = v6;
            }
            else if(v6 != v2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for(int v7 = 0; true; ++v7) {
                boolean z1 = true;
                if(v7 >= arr_exoTrackSelection.length) {
                    break;
                }
                if(arr_v1[v7] == v5) {
                    SampleStream sampleStream1 = (SampleStream)Assertions.g(arr_sampleStream2[v7]);
                    arr_sampleStream1[v7] = arr_sampleStream2[v7];
                    this.b.put(sampleStream1, v5);
                    z = true;
                }
                else if(arr_v[v7] == v5) {
                    if(arr_sampleStream2[v7] != null) {
                        z1 = false;
                    }
                    Assertions.i(z1);
                }
            }
            if(z) {
                arrayList0.add(this.a[v5]);
            }
        }
        System.arraycopy(arr_sampleStream1, 0, arr_sampleStream, 0, arr_exoTrackSelection.length);
        this.h = (MediaPeriod[])arrayList0.toArray(new MediaPeriod[0]);
        List list0 = z3.D(arrayList0, (MediaPeriod mediaPeriod0) -> mediaPeriod0.n().d());
        this.i = this.c.b(arrayList0, list0);
        return v2;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        MediaPeriod[] arr_mediaPeriod = this.a;
        for(int v = 0; v < arr_mediaPeriod.length; ++v) {
            arr_mediaPeriod[v].s();
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(Callback mediaPeriod$Callback0, long v) {
        this.f = mediaPeriod$Callback0;
        Collections.addAll(this.d, this.a);
        MediaPeriod[] arr_mediaPeriod = this.a;
        for(int v1 = 0; v1 < arr_mediaPeriod.length; ++v1) {
            arr_mediaPeriod[v1].t(this, v);
        }
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        MediaPeriod[] arr_mediaPeriod = this.h;
        for(int v1 = 0; v1 < arr_mediaPeriod.length; ++v1) {
            arr_mediaPeriod[v1].v(v, z);
        }
    }
}

