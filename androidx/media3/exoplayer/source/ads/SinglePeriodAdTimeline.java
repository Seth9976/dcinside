package androidx.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline.Period;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ForwardingTimeline;

@VisibleForTesting(otherwise = 3)
@UnstableApi
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState f;

    public SinglePeriodAdTimeline(Timeline timeline0, AdPlaybackState adPlaybackState0) {
        super(timeline0);
        boolean z = false;
        Assertions.i(timeline0.m() == 1);
        if(timeline0.v() == 1) {
            z = true;
        }
        Assertions.i(z);
        this.f = adPlaybackState0;
    }

    @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
    public Period k(int v, Period timeline$Period0, boolean z) {
        this.e.k(v, timeline$Period0, z);
        timeline$Period0.x(timeline$Period0.a, timeline$Period0.b, timeline$Period0.c, (timeline$Period0.d == 0x8000000000000001L ? this.f.d : timeline$Period0.d), timeline$Period0.r(), this.f, timeline$Period0.f);
        return timeline$Period0;
    }
}

