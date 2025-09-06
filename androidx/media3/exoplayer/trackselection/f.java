package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import java.util.List;

public final class f implements Factory {
    public final DefaultTrackSelector a;
    public final Parameters b;
    public final boolean c;
    public final int[] d;

    public f(DefaultTrackSelector defaultTrackSelector0, Parameters defaultTrackSelector$Parameters0, boolean z, int[] arr_v) {
        this.a = defaultTrackSelector0;
        this.b = defaultTrackSelector$Parameters0;
        this.c = z;
        this.d = arr_v;
    }

    @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo$Factory
    public final List a(int v, TrackGroup trackGroup0, int[] arr_v) {
        return this.a.R(this.b, this.c, this.d, v, trackGroup0, arr_v);
    }
}

