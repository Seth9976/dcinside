package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

final class CachedContent {
    static final class Range {
        public final long a;
        public final long b;

        public Range(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public boolean a(long v, long v1) {
            long v2 = this.b;
            if(v2 == -1L) {
                return v >= this.a;
            }
            return v1 == -1L ? false : this.a <= v && v + v1 <= this.a + v2;
        }

        public boolean b(long v, long v1) {
            return this.a > v ? v1 == -1L || v + v1 > this.a : this.b == -1L || this.a + this.b > v;
        }
    }

    public final int a;
    public final String b;
    private final TreeSet c;
    private final ArrayList d;
    private DefaultContentMetadata e;
    private static final String f = "CachedContent";

    public CachedContent(int v, String s) {
        this(v, s, DefaultContentMetadata.f);
    }

    public CachedContent(int v, String s, DefaultContentMetadata defaultContentMetadata0) {
        this.a = v;
        this.b = s;
        this.e = defaultContentMetadata0;
        this.c = new TreeSet();
        this.d = new ArrayList();
    }

    public void a(SimpleCacheSpan simpleCacheSpan0) {
        this.c.add(simpleCacheSpan0);
    }

    public boolean b(ContentMetadataMutations contentMetadataMutations0) {
        DefaultContentMetadata defaultContentMetadata0 = this.e;
        DefaultContentMetadata defaultContentMetadata1 = defaultContentMetadata0.f(contentMetadataMutations0);
        this.e = defaultContentMetadata1;
        return !defaultContentMetadata1.equals(defaultContentMetadata0);
    }

    public long c(long v, long v1) {
        boolean z = true;
        Assertions.a(v >= 0L);
        if(v1 < 0L) {
            z = false;
        }
        Assertions.a(z);
        SimpleCacheSpan simpleCacheSpan0 = this.e(v, v1);
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        if(simpleCacheSpan0.b()) {
            if(!simpleCacheSpan0.c()) {
                v2 = simpleCacheSpan0.c;
            }
            return -Math.min(v2, v1);
        }
        long v3 = v + v1;
        if(v3 >= 0L) {
            v2 = v3;
        }
        long v4 = simpleCacheSpan0.b + simpleCacheSpan0.c;
        if(v4 < v2) {
            for(Object object0: this.c.tailSet(simpleCacheSpan0, false)) {
                long v5 = ((SimpleCacheSpan)object0).b;
                if(v5 > v4) {
                    break;
                }
                v4 = Math.max(v4, v5 + ((SimpleCacheSpan)object0).c);
                if(v4 >= v2) {
                    break;
                }
            }
        }
        return Math.min(v4 - v, v1);
    }

    public DefaultContentMetadata d() {
        return this.e;
    }

    public SimpleCacheSpan e(long v, long v1) {
        SimpleCacheSpan simpleCacheSpan0 = SimpleCacheSpan.h(this.b, v);
        SimpleCacheSpan simpleCacheSpan1 = (SimpleCacheSpan)this.c.floor(simpleCacheSpan0);
        if(simpleCacheSpan1 != null && simpleCacheSpan1.b + simpleCacheSpan1.c > v) {
            return simpleCacheSpan1;
        }
        SimpleCacheSpan simpleCacheSpan2 = (SimpleCacheSpan)this.c.ceiling(simpleCacheSpan0);
        if(simpleCacheSpan2 != null) {
            long v2 = simpleCacheSpan2.b - v;
            if(v1 == -1L) {
                return SimpleCacheSpan.g(this.b, v, v2);
            }
            v1 = Math.min(v2, v1);
        }
        return SimpleCacheSpan.g(this.b, v, v1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return CachedContent.class == class0 && (this.a == ((CachedContent)object0).a && this.b.equals(((CachedContent)object0).b) && this.c.equals(((CachedContent)object0).c) && this.e.equals(((CachedContent)object0).e));
        }
        return false;
    }

    public TreeSet f() {
        return this.c;
    }

    public boolean g() {
        return this.c.isEmpty();
    }

    public boolean h(long v, long v1) {
        for(int v2 = 0; v2 < this.d.size(); ++v2) {
            if(((Range)this.d.get(v2)).a(v, v1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + this.b.hashCode()) * 0x1F + this.e.hashCode();
    }

    public boolean i() {
        return this.d.isEmpty();
    }

    public boolean j(long v, long v1) {
        for(int v2 = 0; v2 < this.d.size(); ++v2) {
            if(((Range)this.d.get(v2)).b(v, v1)) {
                return false;
            }
        }
        Range cachedContent$Range0 = new Range(v, v1);
        this.d.add(cachedContent$Range0);
        return true;
    }

    public boolean k(CacheSpan cacheSpan0) {
        if(this.c.remove(cacheSpan0)) {
            File file0 = cacheSpan0.e;
            if(file0 != null) {
                file0.delete();
            }
            return true;
        }
        return false;
    }

    public SimpleCacheSpan l(SimpleCacheSpan simpleCacheSpan0, long v, boolean z) {
        Assertions.i(this.c.remove(simpleCacheSpan0));
        File file0 = (File)Assertions.g(simpleCacheSpan0.e);
        if(z) {
            File file1 = SimpleCacheSpan.i(((File)Assertions.g(file0.getParentFile())), this.a, simpleCacheSpan0.b, v);
            if(file0.renameTo(file1)) {
                file0 = file1;
            }
            else {
                Log.n("CachedContent", "Failed to rename " + file0 + " to " + file1);
            }
        }
        SimpleCacheSpan simpleCacheSpan1 = simpleCacheSpan0.d(file0, v);
        this.c.add(simpleCacheSpan1);
        return simpleCacheSpan1;
    }

    public void m(long v) {
        for(int v1 = 0; v1 < this.d.size(); ++v1) {
            if(((Range)this.d.get(v1)).a == v) {
                this.d.remove(v1);
                return;
            }
        }
        throw new IllegalStateException();
    }
}

