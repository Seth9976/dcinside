package androidx.media3.exoplayer.trackselection;

import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import java.util.List;

@UnstableApi
public final class FixedTrackSelection extends BaseTrackSelection {
    private final int j;
    @Nullable
    private final Object k;

    public FixedTrackSelection(TrackGroup trackGroup0, int v) {
        this(trackGroup0, v, 0);
    }

    public FixedTrackSelection(TrackGroup trackGroup0, int v, int v1) {
        this(trackGroup0, v, v1, 0, null);
    }

    public FixedTrackSelection(TrackGroup trackGroup0, int v, int v1, int v2, @Nullable Object object0) {
        super(trackGroup0, new int[]{v}, v1);
        this.j = v2;
        this.k = object0;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int d() {
        return 0;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void r(long v, long v1, long v2, List list0, MediaChunkIterator[] arr_mediaChunkIterator) {
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object t() {
        return this.k;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int v() {
        return this.j;
    }
}

