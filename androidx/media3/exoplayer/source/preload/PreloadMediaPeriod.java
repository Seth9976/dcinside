package androidx.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod.Callback;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import j..util.Objects;
import java.io.IOException;
import java.util.List;

final class PreloadMediaPeriod implements MediaPeriod {
    static class PreloadTrackSelectionHolder {
        public final ExoTrackSelection[] a;
        public final boolean[] b;
        public final SampleStream[] c;
        public final boolean[] d;
        public final long e;

        public PreloadTrackSelectionHolder(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
            this.a = arr_exoTrackSelection;
            this.b = arr_z;
            this.c = arr_sampleStream;
            this.d = arr_z1;
            this.e = v;
        }
    }

    public final MediaPeriod a;
    private boolean b;
    private boolean c;
    @Nullable
    private Callback d;
    @Nullable
    private PreloadTrackSelectionHolder e;

    public PreloadMediaPeriod(MediaPeriod mediaPeriod0) {
        this.a = mediaPeriod0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public boolean a() {
        return this.a.a();
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

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public List i(List list0) {
        return t.a(this, list0);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long j(long v) {
        return this.a.j(v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long k() {
        return this.a.k();
    }

    private static boolean l(ExoTrackSelection exoTrackSelection0, ExoTrackSelection exoTrackSelection1) {
        if(Objects.equals(exoTrackSelection0.i(), exoTrackSelection1.i()) && exoTrackSelection0.length() == exoTrackSelection1.length()) {
            for(int v = 0; v < exoTrackSelection0.length(); ++v) {
                if(exoTrackSelection0.e(v) != exoTrackSelection1.e(v)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean m(ExoTrackSelection[] arr_exoTrackSelection, PreloadTrackSelectionHolder preloadMediaPeriod$PreloadTrackSelectionHolder0) {
        ExoTrackSelection[] arr_exoTrackSelection1 = ((PreloadTrackSelectionHolder)Assertions.g(preloadMediaPeriod$PreloadTrackSelectionHolder0)).a;
        boolean z = false;
        for(int v = 0; v < arr_exoTrackSelection.length; ++v) {
            ExoTrackSelection exoTrackSelection0 = arr_exoTrackSelection[v];
            ExoTrackSelection exoTrackSelection1 = arr_exoTrackSelection1[v];
            if(exoTrackSelection0 != null || exoTrackSelection1 != null) {
                preloadMediaPeriod$PreloadTrackSelectionHolder0.b[v] = false;
                if(exoTrackSelection0 == null) {
                    preloadMediaPeriod$PreloadTrackSelectionHolder0.a[v] = null;
                    z = true;
                }
                else if(exoTrackSelection1 == null) {
                    preloadMediaPeriod$PreloadTrackSelectionHolder0.a[v] = exoTrackSelection0;
                    z = true;
                }
                else if(PreloadMediaPeriod.l(exoTrackSelection0, exoTrackSelection1)) {
                    switch(exoTrackSelection0.i().c) {
                        case 1: 
                        case 2: {
                            break;
                        }
                        default: {
                            if(exoTrackSelection0.m() != exoTrackSelection1.m()) {
                                preloadMediaPeriod$PreloadTrackSelectionHolder0.a[v] = exoTrackSelection0;
                                z = true;
                                continue;
                            }
                        }
                    }
                    preloadMediaPeriod$PreloadTrackSelectionHolder0.b[v] = true;
                }
                else {
                    preloadMediaPeriod$PreloadTrackSelectionHolder0.a[v] = exoTrackSelection0;
                    z = true;
                }
            }
        }
        return z;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public TrackGroupArray n() {
        return this.a.n();
    }

    void o(Callback mediaPeriod$Callback0, long v) {
        this.d = mediaPeriod$Callback0;
        if(this.c) {
            mediaPeriod$Callback0.h(this);
        }
        if(!this.b) {
            this.p(v);
        }
    }

    private void p(long v) {
        this.b = true;
        androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.1 preloadMediaPeriod$10 = new Callback() {
            final PreloadMediaPeriod a;

            public void a(MediaPeriod mediaPeriod0) {
                ((Callback)Assertions.g(PreloadMediaPeriod.this.d)).l(PreloadMediaPeriod.this);
            }

            @Override  // androidx.media3.exoplayer.source.MediaPeriod$Callback
            public void h(MediaPeriod mediaPeriod0) {
                PreloadMediaPeriod.this.c = true;
                ((Callback)Assertions.g(PreloadMediaPeriod.this.d)).h(PreloadMediaPeriod.this);
            }

            @Override  // androidx.media3.exoplayer.source.SequenceableLoader$Callback
            public void l(SequenceableLoader sequenceableLoader0) {
                this.a(((MediaPeriod)sequenceableLoader0));
            }
        };
        this.a.t(preloadMediaPeriod$10, v);
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public long q(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        return this.u(arr_exoTrackSelection, arr_z, arr_sampleStream, arr_z1, v);
    }

    long r(ExoTrackSelection[] arr_exoTrackSelection, long v) {
        SampleStream[] arr_sampleStream = new SampleStream[arr_exoTrackSelection.length];
        boolean[] arr_z = new boolean[arr_exoTrackSelection.length];
        boolean[] arr_z1 = new boolean[arr_exoTrackSelection.length];
        long v1 = this.u(arr_exoTrackSelection, arr_z1, arr_sampleStream, arr_z, v);
        this.e = new PreloadTrackSelectionHolder(arr_exoTrackSelection, arr_z1, arr_sampleStream, arr_z, v1);
        return v1;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void s() throws IOException {
        this.a.s();
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void t(Callback mediaPeriod$Callback0, long v) {
        this.d = mediaPeriod$Callback0;
        if(this.c) {
            mediaPeriod$Callback0.h(this);
            return;
        }
        if(!this.b) {
            this.p(v);
        }
    }

    private long u(ExoTrackSelection[] arr_exoTrackSelection, boolean[] arr_z, SampleStream[] arr_sampleStream, boolean[] arr_z1, long v) {
        PreloadTrackSelectionHolder preloadMediaPeriod$PreloadTrackSelectionHolder0 = this.e;
        if(preloadMediaPeriod$PreloadTrackSelectionHolder0 == null) {
            return this.a.q(arr_exoTrackSelection, arr_z, arr_sampleStream, arr_z1, v);
        }
        Assertions.i(arr_sampleStream.length == preloadMediaPeriod$PreloadTrackSelectionHolder0.c.length);
        PreloadTrackSelectionHolder preloadMediaPeriod$PreloadTrackSelectionHolder1 = this.e;
        if(v != preloadMediaPeriod$PreloadTrackSelectionHolder1.e) {
            for(int v1 = 0; true; ++v1) {
                SampleStream[] arr_sampleStream1 = this.e.c;
                if(v1 >= arr_sampleStream1.length) {
                    break;
                }
                SampleStream sampleStream0 = arr_sampleStream1[v1];
                if(sampleStream0 != null) {
                    arr_sampleStream[v1] = sampleStream0;
                    arr_z[v1] = false;
                }
            }
            this.e = null;
            return this.a.q(arr_exoTrackSelection, arr_z, arr_sampleStream, arr_z1, v);
        }
        PreloadTrackSelectionHolder preloadMediaPeriod$PreloadTrackSelectionHolder2 = (PreloadTrackSelectionHolder)Assertions.g(preloadMediaPeriod$PreloadTrackSelectionHolder1);
        long v2 = preloadMediaPeriod$PreloadTrackSelectionHolder2.e;
        boolean[] arr_z2 = preloadMediaPeriod$PreloadTrackSelectionHolder2.d;
        if(PreloadMediaPeriod.m(arr_exoTrackSelection, preloadMediaPeriod$PreloadTrackSelectionHolder2)) {
            boolean[] arr_z3 = new boolean[arr_z2.length];
            long v3 = this.a.q(preloadMediaPeriod$PreloadTrackSelectionHolder2.a, preloadMediaPeriod$PreloadTrackSelectionHolder2.b, preloadMediaPeriod$PreloadTrackSelectionHolder2.c, arr_z3, preloadMediaPeriod$PreloadTrackSelectionHolder2.e);
            for(int v4 = 0; true; ++v4) {
                boolean[] arr_z4 = preloadMediaPeriod$PreloadTrackSelectionHolder2.b;
                if(v4 >= arr_z4.length) {
                    break;
                }
                if(arr_z4[v4]) {
                    arr_z3[v4] = true;
                }
            }
            arr_z2 = arr_z3;
            v2 = v3;
        }
        System.arraycopy(preloadMediaPeriod$PreloadTrackSelectionHolder2.c, 0, arr_sampleStream, 0, preloadMediaPeriod$PreloadTrackSelectionHolder2.c.length);
        System.arraycopy(arr_z2, 0, arr_z1, 0, arr_z2.length);
        this.e = null;
        return v2;
    }

    @Override  // androidx.media3.exoplayer.source.MediaPeriod
    public void v(long v, boolean z) {
        this.a.v(v, z);
    }
}

