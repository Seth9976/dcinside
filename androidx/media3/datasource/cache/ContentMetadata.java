package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface ContentMetadata {
    public static final String a = "custom_";
    public static final String b = "exo_redir";
    public static final String c = "exo_len";

    long a(String arg1, long arg2);

    @Nullable
    String b(String arg1, @Nullable String arg2);

    @Nullable
    byte[] c(String arg1, @Nullable byte[] arg2);

    boolean contains(String arg1);
}

