package androidx.media3.exoplayer.source;

import androidx.media3.common.Timeline;

public final class b implements MediaSourceCaller {
    public final CompositeMediaSource a;
    public final Object b;

    public b(CompositeMediaSource compositeMediaSource0, Object object0) {
        this.a = compositeMediaSource0;
        this.b = object0;
    }

    @Override  // androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller
    public final void H(MediaSource mediaSource0, Timeline timeline0) {
        this.a.A0(this.b, mediaSource0, timeline0);
    }
}

