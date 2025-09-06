package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class NoOpCacheEvictor implements CacheEvictor {
    @Override  // androidx.media3.datasource.cache.CacheEvictor
    public boolean a() {
        return false;
    }

    @Override  // androidx.media3.datasource.cache.CacheEvictor
    public void b(Cache cache0, String s, long v, long v1) {
    }

    @Override  // androidx.media3.datasource.cache.CacheEvictor
    public void c() {
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void d(Cache cache0, CacheSpan cacheSpan0, CacheSpan cacheSpan1) {
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void e(Cache cache0, CacheSpan cacheSpan0) {
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void f(Cache cache0, CacheSpan cacheSpan0) {
    }
}

