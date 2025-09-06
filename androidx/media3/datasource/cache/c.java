package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;

public final class c {
    public static long a(ContentMetadata contentMetadata0) {
        return contentMetadata0.a("exo_len", -1L);
    }

    @Nullable
    public static Uri b(ContentMetadata contentMetadata0) {
        String s = contentMetadata0.b("exo_redir", null);
        return s == null ? null : Uri.parse(s);
    }
}

