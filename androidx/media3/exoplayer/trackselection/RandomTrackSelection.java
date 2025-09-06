package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

@UnstableApi
public final class RandomTrackSelection extends BaseTrackSelection {
    public static final class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
        private final Random a;

        public Factory() {
            this.a = new Random();
        }

        public Factory(int v) {
            this.a = new Random(((long)v));
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection$Factory
        public ExoTrackSelection[] a(Definition[] arr_exoTrackSelection$Definition, BandwidthMeter bandwidthMeter0, MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline0) {
            return TrackSelectionUtil.d(arr_exoTrackSelection$Definition, (Definition exoTrackSelection$Definition0) -> new RandomTrackSelection(exoTrackSelection$Definition0.a, exoTrackSelection$Definition0.b, exoTrackSelection$Definition0.c, this.a));
        }

        // 检测为 Lambda 实现
        private ExoTrackSelection c(Definition exoTrackSelection$Definition0) [...]
    }

    private final Random j;
    private int k;

    public RandomTrackSelection(TrackGroup trackGroup0, int[] arr_v, int v, Random random0) {
        super(trackGroup0, arr_v, v);
        this.j = random0;
        this.k = random0.nextInt(this.d);
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int d() {
        return this.k;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void r(long v, long v1, long v2, List list0, MediaChunkIterator[] arr_mediaChunkIterator) {
        long v3 = SystemClock.elapsedRealtime();
        int v6 = 0;
        for(int v5 = 0; v5 < this.d; ++v5) {
            if(!this.b(v5, v3)) {
                ++v6;
            }
        }
        this.k = this.j.nextInt(v6);
        if(v6 != this.d) {
            int v7 = 0;
            for(int v4 = 0; v4 < this.d; ++v4) {
                if(!this.b(v4, v3)) {
                    if(this.k == v7) {
                        this.k = v4;
                        return;
                    }
                    ++v7;
                }
            }
        }
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object t() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int v() {
        return 3;
    }
}

