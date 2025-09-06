package androidx.media3.extractor;

import O1.a;
import android.net.Uri;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import java.util.Map;

public final class f {
    static {
    }

    public static Extractor[] a(ExtractorsFactory extractorsFactory0, Uri uri0, Map map0) {
        return extractorsFactory0.d();
    }

    @a
    @Deprecated
    public static ExtractorsFactory b(ExtractorsFactory extractorsFactory0, boolean z) [...] // Inlined contents

    public static ExtractorsFactory c(ExtractorsFactory extractorsFactory0, Factory subtitleParser$Factory0) [...] // Inlined contents

    public static Extractor[] d() {
        return new Extractor[0];
    }
}

