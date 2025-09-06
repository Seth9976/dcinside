package androidx.media3.exoplayer.upstream;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.cache.Cache.Listener;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.extractor.ChunkIndex;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

@UnstableApi
public final class CachedRegionTracker implements Listener {
    static class Region implements Comparable {
        public long a;
        public long b;
        public int c;

        public Region(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public int a(Region cachedRegionTracker$Region0) {
            return Util.u(this.a, cachedRegionTracker$Region0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((Region)object0));
        }
    }

    private final Cache a;
    private final String b;
    private final ChunkIndex c;
    private final TreeSet d;
    private final Region e;
    private static final String f = "CachedRegionTracker";
    public static final int g = -1;
    public static final int h = -2;

    public CachedRegionTracker(Cache cache0, String s, ChunkIndex chunkIndex0) {
        this.a = cache0;
        this.b = s;
        this.c = chunkIndex0;
        this.d = new TreeSet();
        this.e = new Region(0L, 0L);
        synchronized(this) {
            Iterator iterator0 = cache0.d(s, this).descendingIterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                this.h(((CacheSpan)object0));
            }
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void d(Cache cache0, CacheSpan cacheSpan0, CacheSpan cacheSpan1) {
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void e(Cache cache0, CacheSpan cacheSpan0) {
        synchronized(this) {
            this.h(cacheSpan0);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache$Listener
    public void f(Cache cache0, CacheSpan cacheSpan0) {
        synchronized(this) {
            Region cachedRegionTracker$Region0 = new Region(cacheSpan0.b, cacheSpan0.c + cacheSpan0.b);
            Region cachedRegionTracker$Region1 = (Region)this.d.floor(cachedRegionTracker$Region0);
            if(cachedRegionTracker$Region1 == null) {
                Log.d("CachedRegionTracker", "Removed a span we were not aware of");
                return;
            }
            this.d.remove(cachedRegionTracker$Region1);
            long v1 = cachedRegionTracker$Region1.a;
            long v2 = cachedRegionTracker$Region0.a;
            if(v1 < v2) {
                Region cachedRegionTracker$Region2 = new Region(v1, v2);
                int v3 = Arrays.binarySearch(this.c.f, cachedRegionTracker$Region2.b);
                if(v3 < 0) {
                    v3 = -v3 - 2;
                }
                cachedRegionTracker$Region2.c = v3;
                this.d.add(cachedRegionTracker$Region2);
            }
            long v4 = cachedRegionTracker$Region1.b;
            long v5 = cachedRegionTracker$Region0.b;
            if(v4 > v5) {
                Region cachedRegionTracker$Region3 = new Region(v5 + 1L, v4);
                cachedRegionTracker$Region3.c = cachedRegionTracker$Region1.c;
                this.d.add(cachedRegionTracker$Region3);
            }
        }
    }

    public int g(long v) {
        synchronized(this) {
            this.e.a = v;
            Region cachedRegionTracker$Region0 = (Region)this.d.floor(this.e);
            if(cachedRegionTracker$Region0 != null) {
                long v2 = cachedRegionTracker$Region0.b;
                if(v <= v2) {
                    int v3 = cachedRegionTracker$Region0.c;
                    if(v3 != -1) {
                        ChunkIndex chunkIndex0 = this.c;
                        return v3 == chunkIndex0.d - 1 && v2 == chunkIndex0.f[v3] + ((long)chunkIndex0.e[v3]) ? -2 : (chunkIndex0.h[v3] + chunkIndex0.g[v3] * (v2 - chunkIndex0.f[v3]) / ((long)chunkIndex0.e[v3])) / 1000L;
                    }
                }
            }
            return -1;
        }
    }

    private void h(CacheSpan cacheSpan0) {
        Region cachedRegionTracker$Region0 = new Region(cacheSpan0.b, cacheSpan0.c + cacheSpan0.b);
        Region cachedRegionTracker$Region1 = (Region)this.d.floor(cachedRegionTracker$Region0);
        Region cachedRegionTracker$Region2 = (Region)this.d.ceiling(cachedRegionTracker$Region0);
        boolean z = this.i(cachedRegionTracker$Region1, cachedRegionTracker$Region0);
        if(this.i(cachedRegionTracker$Region0, cachedRegionTracker$Region2)) {
            if(z) {
                cachedRegionTracker$Region1.b = cachedRegionTracker$Region2.b;
                cachedRegionTracker$Region1.c = cachedRegionTracker$Region2.c;
            }
            else {
                cachedRegionTracker$Region0.b = cachedRegionTracker$Region2.b;
                cachedRegionTracker$Region0.c = cachedRegionTracker$Region2.c;
                this.d.add(cachedRegionTracker$Region0);
            }
            this.d.remove(cachedRegionTracker$Region2);
            return;
        }
        if(z) {
            cachedRegionTracker$Region1.b = cachedRegionTracker$Region0.b;
            int v;
            for(v = cachedRegionTracker$Region1.c; v < this.c.d - 1 && this.c.f[v + 1] <= cachedRegionTracker$Region1.b; ++v) {
            }
            cachedRegionTracker$Region1.c = v;
            return;
        }
        int v1 = Arrays.binarySearch(this.c.f, cachedRegionTracker$Region0.b);
        if(v1 < 0) {
            v1 = -v1 - 2;
        }
        cachedRegionTracker$Region0.c = v1;
        this.d.add(cachedRegionTracker$Region0);
    }

    private boolean i(@Nullable Region cachedRegionTracker$Region0, @Nullable Region cachedRegionTracker$Region1) {
        return cachedRegionTracker$Region0 != null && cachedRegionTracker$Region1 != null && cachedRegionTracker$Region0.b == cachedRegionTracker$Region1.a;
    }

    public void j() {
        this.a.j(this.b, this);
    }
}

