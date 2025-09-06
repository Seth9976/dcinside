package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.TreeSet;

@UnstableApi
public final class LeastRecentlyUsedCacheEvictor implements CacheEvictor {
    private final long a;
    private final TreeSet b;
    private long c;

    public LeastRecentlyUsedCacheEvictor(long v) {
        this.a = v;
        this.b = new TreeSet((CacheSpan cacheSpan0, CacheSpan cacheSpan1) -> {
            long v = cacheSpan0.f;
            long v1 = cacheSpan1.f;
            if(v - v1 == 0L) {
                return cacheSpan0.a(cacheSpan1);
            }
            return v >= v1 ? 1 : -1;
        });
    }

    @Override  // androidx.media3.datasource.cache.CacheEvictor
    public boolean a() {
        return true;
    }

    @Override  // androidx.media3.datasource.cache.CacheEvictor
    public void b(Cache cache0, String s, long v, long v1) {
        if(v1 != -1L) {
            this.i(cache0, v1);
        }
    }

    @Override  // androidx.media3.datasource.cache.CacheEvictor
    public void c() {
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void d(Cache cache0, CacheSpan cacheSpan0, CacheSpan cacheSpan1) {
        this.f(cache0, cacheSpan0);
        this.e(cache0, cacheSpan1);
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void e(Cache cache0, CacheSpan cacheSpan0) {
        this.b.add(cacheSpan0);
        this.c += cacheSpan0.c;
        this.i(cache0, 0L);
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void f(Cache cache0, CacheSpan cacheSpan0) {
        this.b.remove(cacheSpan0);
        this.c -= cacheSpan0.c;
    }

    // 检测为 Lambda 实现
    private static int h(CacheSpan cacheSpan0, CacheSpan cacheSpan1) [...]

    private void i(Cache cache0, long v) {
        while(this.c + v > this.a && !this.b.isEmpty()) {
            cache0.c(((CacheSpan)this.b.first()));
        }
    }
}

