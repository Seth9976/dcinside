package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import java.util.List;

public final class h implements Factory {
    public final Parameters a;
    public final int[] b;

    public h(Parameters defaultTrackSelector$Parameters0, int[] arr_v) {
        this.a = defaultTrackSelector$Parameters0;
        this.b = arr_v;
    }

    @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo$Factory
    public final List a(int v, TrackGroup trackGroup0, int[] arr_v) {
        return DefaultTrackSelector.U(this.a, this.b, v, trackGroup0, arr_v);
    }
}

