package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.File;

@UnstableApi
public class CacheSpan implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    @Nullable
    public final File e;
    public final long f;

    public CacheSpan(String s, long v, long v1) {
        this(s, v, v1, 0x8000000000000001L, null);
    }

    public CacheSpan(String s, long v, long v1, long v2, @Nullable File file0) {
        this.a = s;
        this.b = v;
        this.c = v1;
        this.d = file0 != null;
        this.e = file0;
        this.f = v2;
    }

    public int a(CacheSpan cacheSpan0) {
        if(!this.a.equals(cacheSpan0.a)) {
            return this.a.compareTo(cacheSpan0.a);
        }
        int v = Long.compare(this.b - cacheSpan0.b, 0L);
        if(v == 0) {
            return 0;
        }
        return v >= 0 ? 1 : -1;
    }

    public boolean b() {
        return !this.d;
    }

    public boolean c() {
        return this.c == -1L;
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((CacheSpan)object0));
    }

    @Override
    public String toString() {
        return "[" + this.b + ", " + this.c + "]";
    }
}

