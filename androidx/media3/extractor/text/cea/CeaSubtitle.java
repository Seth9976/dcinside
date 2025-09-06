package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

final class CeaSubtitle implements Subtitle {
    private final List a;

    public CeaSubtitle(List list0) {
        this.a = list0;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public long a(int v) {
        Assertions.a(v == 0);
        return 0L;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int b() {
        return 1;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public int c(long v) {
        return v >= 0L ? -1 : 0;
    }

    @Override  // androidx.media3.extractor.text.Subtitle
    public List d(long v) {
        return v < 0L ? Collections.emptyList() : this.a;
    }
}

