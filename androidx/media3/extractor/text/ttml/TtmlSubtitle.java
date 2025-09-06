package androidx.media3.extractor.text.ttml;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class TtmlSubtitle implements Subtitle {
    private final TtmlNode a;
    private final long[] b;
    private final Map c;
    private final Map d;
    private final Map e;

    public TtmlSubtitle(TtmlNode ttmlNode0, Map map0, Map map1, Map map2) {
        this.a = ttmlNode0;
        this.d = map1;
        this.e = map2;
        this.c = map0 == null ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(map0);
        this.b = ttmlNode0.j();
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public long a(int v) {
        return this.b[v];
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int b() {
        return this.b.length;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int c(long v) {
        int v1 = Util.j(this.b, v, false, false);
        return v1 < this.b.length ? v1 : -1;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public List d(long v) {
        return this.a.h(v, this.c, this.d, this.e);
    }

    @VisibleForTesting
    Map e() {
        return this.c;
    }

    @VisibleForTesting
    TtmlNode f() {
        return this.a;
    }
}

