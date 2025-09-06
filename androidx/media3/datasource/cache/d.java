package androidx.media3.datasource.cache;

import java.util.Comparator;

public final class d implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return LeastRecentlyUsedCacheEvictor.h(((CacheSpan)object0), ((CacheSpan)object1));
    }
}

