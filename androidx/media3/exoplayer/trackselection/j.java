package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.TrackGroup;
import java.util.List;

public final class j implements Factory {
    public final Parameters a;
    public final String b;

    public j(Parameters defaultTrackSelector$Parameters0, String s) {
        this.a = defaultTrackSelector$Parameters0;
        this.b = s;
    }

    @Override  // androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo$Factory
    public final List a(int v, TrackGroup trackGroup0, int[] arr_v) {
        return DefaultTrackSelector.T(this.a, this.b, v, trackGroup0, arr_v);
    }
}

