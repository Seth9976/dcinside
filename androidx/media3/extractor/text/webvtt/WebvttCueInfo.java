package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class WebvttCueInfo {
    public final Cue a;
    public final long b;
    public final long c;

    public WebvttCueInfo(Cue cue0, long v, long v1) {
        this.a = cue0;
        this.b = v;
        this.c = v1;
    }
}

