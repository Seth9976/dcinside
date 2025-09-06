package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import java.util.List;

public final class d implements Factory {
    public final Parameters a;

    public d(Parameters defaultTrackSelector$Parameters0) {
        this.a = defaultTrackSelector$Parameters0;
    }

    @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo$Factory
    public final List a(int v, TrackGroup trackGroup0, int[] arr_v) {
        return DefaultTrackSelector.S(this.a, v, trackGroup0, arr_v);
    }
}

