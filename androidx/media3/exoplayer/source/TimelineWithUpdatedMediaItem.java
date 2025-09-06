package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem.LocalConfiguration;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline.Window;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {
    private final MediaItem f;

    public TimelineWithUpdatedMediaItem(Timeline timeline0, MediaItem mediaItem0) {
        super(timeline0);
        this.f = mediaItem0;
    }

    @Override  // androidx.media3.exoplayer.source.ForwardingTimeline
    public Window u(int v, Window timeline$Window0, long v1) {
        super.u(v, timeline$Window0, v1);
        timeline$Window0.c = this.f;
        LocalConfiguration mediaItem$LocalConfiguration0 = this.f.b;
        timeline$Window0.b = mediaItem$LocalConfiguration0 == null ? null : mediaItem$LocalConfiguration0.i;
        return timeline$Window0;
    }
}

