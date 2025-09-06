package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;

public final class c implements Consumer {
    public final SubtitleExtractor a;

    public c(SubtitleExtractor subtitleExtractor0) {
        this.a = subtitleExtractor0;
    }

    @Override  // androidx.media3.common.util.Consumer
    public final void accept(Object object0) {
        this.a.f(((CuesWithTiming)object0));
    }
}

