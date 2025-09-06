package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

@UnstableApi
public interface CacheKeyFactory {
    public static final CacheKeyFactory a;

    static {
        CacheKeyFactory.a = new a();
    }

    String a(DataSpec arg1);
}

