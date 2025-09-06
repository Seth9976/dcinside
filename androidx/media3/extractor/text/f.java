package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;

public final class f implements Consumer {
    public final SubtitleTranscodingTrackOutput a;
    public final long b;
    public final int c;

    public f(SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput0, long v, int v1) {
        this.a = subtitleTranscodingTrackOutput0;
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.media3.common.util.Consumer
    public final void accept(Object object0) {
        this.a.i(this.b, this.c, ((CuesWithTiming)object0));
    }
}

