package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class UtcTimingElement {
    public final String a;
    public final String b;

    public UtcTimingElement(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public String toString() {
        return this.a + ", " + this.b;
    }
}

