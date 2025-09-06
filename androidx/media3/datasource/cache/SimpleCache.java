package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.database.DatabaseProvider;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import jeb.synthetic.FIN;

@UnstableApi
public final class SimpleCache implements Cache {
    private final File b;
    private final CacheEvictor c;
    private final CachedContentIndex d;
    @Nullable
    private final CacheFileMetadataIndex e;
    private final HashMap f;
    private final Random g;
    private final boolean h;
    private long i;
    private long j;
    private boolean k;
    private CacheException l;
    private static final String m = "SimpleCache";
    private static final int n = 10;
    private static final String o = ".uid";
    private static final HashSet p;

    static {
        SimpleCache.p = new HashSet();
    }

    @Deprecated
    public SimpleCache(File file0, CacheEvictor cacheEvictor0) {
        this(file0, cacheEvictor0, null, null, false, true);
    }

    public SimpleCache(File file0, CacheEvictor cacheEvictor0, DatabaseProvider databaseProvider0) {
        this(file0, cacheEvictor0, databaseProvider0, null, false, false);
    }

    public SimpleCache(File file0, CacheEvictor cacheEvictor0, @Nullable DatabaseProvider databaseProvider0, @Nullable byte[] arr_b, boolean z, boolean z1) {
        this(file0, cacheEvictor0, new CachedContentIndex(databaseProvider0, file0, arr_b, z, z1), (databaseProvider0 == null || z1 ? null : new CacheFileMetadataIndex(databaseProvider0)));
    }

    SimpleCache(File file0, CacheEvictor cacheEvictor0, CachedContentIndex cachedContentIndex0, @Nullable CacheFileMetadataIndex cacheFileMetadataIndex0) {
        if(!SimpleCache.D(file0)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file0);
        }
        this.b = file0;
        this.c = cacheEvictor0;
        this.d = cachedContentIndex0;
        this.e = cacheFileMetadataIndex0;
        this.f = new HashMap();
        this.g = new Random();
        this.h = cacheEvictor0.a();
        this.i = -1L;
        ConditionVariable conditionVariable0 = new ConditionVariable();
        new Thread("ExoPlayer:SimpleCacheInit") {
            final SimpleCache b;

            @Override
            public void run() {
                synchronized(SimpleCache.this) {
                    conditionVariable0.open();
                    SimpleCache.this.z();
                    SimpleCache.this.c.c();
                }
            }
        }.start();
        conditionVariable0.block();
    }

    public static boolean A(File file0) {
        synchronized(SimpleCache.class) {
            File file1 = file0.getAbsoluteFile();
            return SimpleCache.p.contains(file1);
        }
    }

    private void B(File file0, boolean z, @Nullable File[] arr_file, @Nullable Map map0) {
        long v2;
        long v1;
        if(arr_file != null && arr_file.length != 0) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                String s = file1.getName();
                if(z && s.indexOf(46) == -1) {
                    this.B(file1, false, file1.listFiles(), map0);
                }
                else if(!z || !CachedContentIndex.o(s) && !s.endsWith(".uid")) {
                    CacheFileMetadata cacheFileMetadata0 = map0 == null ? null : ((CacheFileMetadata)map0.remove(s));
                    if(cacheFileMetadata0 == null) {
                        v2 = 0x8000000000000001L;
                        v1 = -1L;
                    }
                    else {
                        v1 = cacheFileMetadata0.a;
                        v2 = cacheFileMetadata0.b;
                    }
                    SimpleCacheSpan simpleCacheSpan0 = SimpleCacheSpan.e(file1, v1, v2, this.d);
                    if(simpleCacheSpan0 == null) {
                        file1.delete();
                    }
                    else {
                        this.t(simpleCacheSpan0);
                    }
                }
            }
            return;
        }
        if(!z) {
            file0.delete();
        }
    }

    private static long C(File[] arr_file) {
        for(int v = 0; v < arr_file.length; ++v) {
            File file0 = arr_file[v];
            String s = file0.getName();
            if(s.endsWith(".uid")) {
                try {
                    return SimpleCache.H(s);
                }
                catch(NumberFormatException unused_ex) {
                    Log.d("SimpleCache", "Malformed UID file: " + file0);
                    file0.delete();
                }
            }
        }
        return -1L;
    }

    private static boolean D(File file0) {
        synchronized(SimpleCache.class) {
            File file1 = file0.getAbsoluteFile();
            return SimpleCache.p.add(file1);
        }
    }

    private void E(SimpleCacheSpan simpleCacheSpan0) {
        ArrayList arrayList0 = (ArrayList)this.f.get(simpleCacheSpan0.a);
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((Listener)arrayList0.get(v)).e(this, simpleCacheSpan0);
            }
        }
        this.c.e(this, simpleCacheSpan0);
    }

    private void F(CacheSpan cacheSpan0) {
        ArrayList arrayList0 = (ArrayList)this.f.get(cacheSpan0.a);
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((Listener)arrayList0.get(v)).f(this, cacheSpan0);
            }
        }
        this.c.f(this, cacheSpan0);
    }

    private void G(SimpleCacheSpan simpleCacheSpan0, CacheSpan cacheSpan0) {
        ArrayList arrayList0 = (ArrayList)this.f.get(simpleCacheSpan0.a);
        if(arrayList0 != null) {
            for(int v = arrayList0.size() - 1; v >= 0; --v) {
                ((Listener)arrayList0.get(v)).d(this, simpleCacheSpan0, cacheSpan0);
            }
        }
        this.c.d(this, simpleCacheSpan0, cacheSpan0);
    }

    private static long H(String s) {
        return Long.parseLong(s.substring(0, s.indexOf(46)), 16);
    }

    private void I(CacheSpan cacheSpan0) {
        CachedContent cachedContent0 = this.d.g(cacheSpan0.a);
        if(cachedContent0 != null && cachedContent0.k(cacheSpan0)) {
            this.j -= cacheSpan0.c;
            if(this.e != null) {
                String s = ((File)Assertions.g(cacheSpan0.e)).getName();
                try {
                    this.e.g(s);
                }
                catch(IOException unused_ex) {
                    Log.n("SimpleCache", "Failed to remove file index entry for: " + s);
                }
            }
            this.d.p(cachedContent0.b);
            this.F(cacheSpan0);
        }
    }

    private void J() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.d.h()) {
            for(Object object1: ((CachedContent)object0).f()) {
                CacheSpan cacheSpan0 = (CacheSpan)object1;
                if(((File)Assertions.g(cacheSpan0.e)).length() != cacheSpan0.c) {
                    arrayList0.add(cacheSpan0);
                }
            }
        }
        for(int v = 0; v < arrayList0.size(); ++v) {
            this.I(((CacheSpan)arrayList0.get(v)));
        }
    }

    private SimpleCacheSpan K(String s, SimpleCacheSpan simpleCacheSpan0) {
        boolean z;
        if(!this.h) {
            return simpleCacheSpan0;
        }
        String s1 = ((File)Assertions.g(simpleCacheSpan0.e)).getName();
        long v = simpleCacheSpan0.c;
        long v1 = System.currentTimeMillis();
        CacheFileMetadataIndex cacheFileMetadataIndex0 = this.e;
        if(cacheFileMetadataIndex0 == null) {
            z = true;
        }
        else {
            try {
                cacheFileMetadataIndex0.i(s1, v, v1);
            }
            catch(IOException unused_ex) {
                Log.n("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        }
        SimpleCacheSpan simpleCacheSpan1 = ((CachedContent)Assertions.g(this.d.g(s))).l(simpleCacheSpan0, v1, z);
        this.G(simpleCacheSpan0, simpleCacheSpan1);
        return simpleCacheSpan1;
    }

    private static void L(File file0) {
        synchronized(SimpleCache.class) {
            File file1 = file0.getAbsoluteFile();
            SimpleCache.p.remove(file1);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public Set R() {
        synchronized(this) {
            Assertions.i(!this.k);
            return new HashSet(this.d.k());
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public long a() {
        synchronized(this) {
        }
        return this.i;
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public ContentMetadata b(String s) {
        synchronized(this) {
            Assertions.i(!this.k);
            return this.d.i(s);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void c(CacheSpan cacheSpan0) {
        synchronized(this) {
            Assertions.i(!this.k);
            this.I(cacheSpan0);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public NavigableSet d(String s, Listener cache$Listener0) {
        synchronized(this) {
            Assertions.i(!this.k);
            Assertions.g(s);
            Assertions.g(cache$Listener0);
            ArrayList arrayList0 = (ArrayList)this.f.get(s);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                this.f.put(s, arrayList0);
            }
            arrayList0.add(cache$Listener0);
            return this.q(s);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public CacheSpan e(String s, long v, long v1) throws InterruptedException, CacheException {
        synchronized(this) {
            Assertions.i(!this.k);
            this.u();
            CacheSpan cacheSpan0;
            while((cacheSpan0 = this.k(s, v, v1)) == null) {
                this.wait();
            }
            return cacheSpan0;
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void f(String s) {
        synchronized(this) {
            Assertions.i(!this.k);
            for(Object object0: this.q(s)) {
                this.I(((CacheSpan)object0));
            }
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public boolean g(String s, long v, long v1) {
        synchronized(this) {
            boolean z = false;
            Assertions.i(!this.k);
            CachedContent cachedContent0 = this.d.g(s);
            if(cachedContent0 != null && cachedContent0.c(v, v1) >= v1) {
                z = true;
            }
            return z;
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public File h(String s, long v, long v1) throws CacheException {
        synchronized(this) {
            Assertions.i(!this.k);
            this.u();
            CachedContent cachedContent0 = this.d.g(s);
            Assertions.g(cachedContent0);
            Assertions.i(cachedContent0.h(v, v1));
            if(!this.b.exists()) {
                SimpleCache.v(this.b);
                this.J();
            }
            this.c.b(this, s, v, v1);
            String s1 = Integer.toString(this.g.nextInt(10));
            File file0 = new File(this.b, s1);
            if(!file0.exists()) {
                SimpleCache.v(file0);
            }
            return SimpleCacheSpan.i(file0, cachedContent0.a, v, System.currentTimeMillis());
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public long i(String s, long v, long v1) {
        __monitor_enter(this);
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        long v3 = v1 == -1L ? 0x7FFFFFFFFFFFFFFFL : v1 + v;
        if(v3 >= 0L) {
            v2 = v3;
        }
        long v4 = 0L;
        try {
            while(v < v2) {
                long v6 = this.l(s, v, v2 - v);
                if(v6 > 0L) {
                    v4 += v6;
                }
                else {
                    v6 = -v6;
                }
                v += v6;
            }
            return v4;
        }
        finally {
            __monitor_exit(this);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void j(String s, Listener cache$Listener0) {
        synchronized(this) {
            if(this.k) {
                return;
            }
            ArrayList arrayList0 = (ArrayList)this.f.get(s);
            if(arrayList0 != null) {
                arrayList0.remove(cache$Listener0);
                if(arrayList0.isEmpty()) {
                    this.f.remove(s);
                }
            }
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    @Nullable
    public CacheSpan k(String s, long v, long v1) throws CacheException {
        synchronized(this) {
            Assertions.i(!this.k);
            this.u();
            CacheSpan cacheSpan0 = this.y(s, v, v1);
            if(cacheSpan0.d) {
                return this.K(s, ((SimpleCacheSpan)cacheSpan0));
            }
            return this.d.m(s).j(v, cacheSpan0.c) ? cacheSpan0 : null;
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public long l(String s, long v, long v1) {
        synchronized(this) {
            Assertions.i(!this.k);
            if(v1 == -1L) {
                v1 = 0x7FFFFFFFFFFFFFFFL;
            }
            CachedContent cachedContent0 = this.d.g(s);
            return cachedContent0 == null ? -v1 : cachedContent0.c(v, v1);
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public long m() {
        synchronized(this) {
            Assertions.i(!this.k);
            return this.j;
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void n(CacheSpan cacheSpan0) {
        synchronized(this) {
            Assertions.i(!this.k);
            CachedContent cachedContent0 = (CachedContent)Assertions.g(this.d.g(cacheSpan0.a));
            cachedContent0.m(cacheSpan0.b);
            this.d.p(cachedContent0.b);
            this.notifyAll();
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void o(File file0, long v) throws CacheException {
        synchronized(this) {
            boolean z = false;
            Assertions.i(!this.k);
            if(!file0.exists()) {
                return;
            }
            if(v == 0L) {
                file0.delete();
                return;
            }
            SimpleCacheSpan simpleCacheSpan0 = (SimpleCacheSpan)Assertions.g(SimpleCacheSpan.f(file0, v, this.d));
            CachedContent cachedContent0 = (CachedContent)Assertions.g(this.d.g(simpleCacheSpan0.a));
            Assertions.i(cachedContent0.h(simpleCacheSpan0.b, simpleCacheSpan0.c));
            long v2 = c.a(cachedContent0.d());
            if(v2 != -1L) {
                if(simpleCacheSpan0.b + simpleCacheSpan0.c <= v2) {
                    z = true;
                }
                Assertions.i(z);
            }
            if(this.e != null) {
                String s = file0.getName();
                try {
                    this.e.i(s, simpleCacheSpan0.c, simpleCacheSpan0.f);
                }
                catch(IOException iOException0) {
                    throw new CacheException(iOException0);
                }
            }
            this.t(simpleCacheSpan0);
            try {
                this.d.s();
            }
            catch(IOException iOException1) {
                throw new CacheException(iOException1);
            }
            this.notifyAll();
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void p(String s, ContentMetadataMutations contentMetadataMutations0) throws CacheException {
        synchronized(this) {
            Assertions.i(!this.k);
            this.u();
            this.d.d(s, contentMetadataMutations0);
            try {
                this.d.s();
            }
            catch(IOException iOException0) {
                throw new CacheException(iOException0);
            }
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public NavigableSet q(String s) {
        synchronized(this) {
            Assertions.i(!this.k);
            CachedContent cachedContent0 = this.d.g(s);
            return cachedContent0 == null || cachedContent0.g() ? new TreeSet() : new TreeSet(cachedContent0.f());
        }
    }

    @Override  // androidx.media3.datasource.cache.Cache
    public void release() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.k) {
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(this);
            FIN.finallyCodeEnd$NT(v);
            return;
        }
        this.f.clear();
        this.J();
        try {
            this.d.s();
        }
        catch(IOException iOException0) {
            Log.e("SimpleCache", "Storing index file failed", iOException0);
        }
        finally {
            SimpleCache.L(this.b);
            this.k = true;
            FIN.finallyExec$NT(v);
        }
    }

    private void t(SimpleCacheSpan simpleCacheSpan0) {
        this.d.m(simpleCacheSpan0.a).a(simpleCacheSpan0);
        this.j += simpleCacheSpan0.c;
        this.E(simpleCacheSpan0);
    }

    public void u() throws CacheException {
        CacheException cache$CacheException0;
        synchronized(this) {
            cache$CacheException0 = this.l;
            if(cache$CacheException0 == null) {
                return;
            }
        }
        throw cache$CacheException0;
    }

    private static void v(File file0) throws CacheException {
        if(!file0.mkdirs() && !file0.isDirectory()) {
            Log.d("SimpleCache", "Failed to create cache directory: " + file0);
            throw new CacheException("Failed to create cache directory: " + file0);
        }
    }

    private static long w(File file0) throws IOException {
        long v = new SecureRandom().nextLong();
        long v1 = v == 0x8000000000000000L ? 0L : Math.abs(v);
        File file1 = new File(file0, Long.toString(v1, 16) + ".uid");
        if(!file1.createNewFile()) {
            throw new IOException("Failed to create UID file: " + file1);
        }
        return v1;
    }

    @WorkerThread
    public static void x(File file0, @Nullable DatabaseProvider databaseProvider0) {
        if(!file0.exists()) {
            return;
        }
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            file0.delete();
            return;
        }
        if(databaseProvider0 != null) {
            long v = SimpleCache.C(arr_file);
            if(v != -1L) {
                try {
                    CacheFileMetadataIndex.a(databaseProvider0, v);
                }
                catch(DatabaseIOException unused_ex) {
                    Log.n("SimpleCache", "Failed to delete file metadata: " + v);
                }
                try {
                    CachedContentIndex.f(databaseProvider0, v);
                }
                catch(DatabaseIOException unused_ex) {
                    Log.n("SimpleCache", "Failed to delete file metadata: " + v);
                }
            }
        }
        Util.T1(file0);
    }

    private SimpleCacheSpan y(String s, long v, long v1) {
        SimpleCacheSpan simpleCacheSpan0;
        CachedContent cachedContent0 = this.d.g(s);
        if(cachedContent0 == null) {
            return SimpleCacheSpan.g(s, v, v1);
        }
        while(true) {
            simpleCacheSpan0 = cachedContent0.e(v, v1);
            if(!simpleCacheSpan0.d || ((File)Assertions.g(simpleCacheSpan0.e)).length() == simpleCacheSpan0.c) {
                break;
            }
            this.J();
        }
        return simpleCacheSpan0;
    }

    private void z() {
        if(!this.b.exists()) {
            try {
                SimpleCache.v(this.b);
            }
            catch(CacheException cache$CacheException0) {
                this.l = cache$CacheException0;
                return;
            }
        }
        File[] arr_file = this.b.listFiles();
        if(arr_file == null) {
            Log.d("SimpleCache", "Failed to list cache directory files: " + this.b);
            this.l = new CacheException("Failed to list cache directory files: " + this.b);
            return;
        }
        long v = SimpleCache.C(arr_file);
        this.i = v;
        if(v == -1L) {
            try {
                this.i = SimpleCache.w(this.b);
            }
            catch(IOException iOException0) {
                Log.e("SimpleCache", "Failed to create cache UID: " + this.b, iOException0);
                this.l = new CacheException("Failed to create cache UID: " + this.b, iOException0);
                return;
            }
        }
        try {
            this.d.n(this.i);
            CacheFileMetadataIndex cacheFileMetadataIndex0 = this.e;
            if(cacheFileMetadataIndex0 == null) {
                this.B(this.b, true, arr_file, null);
            }
            else {
                cacheFileMetadataIndex0.f(this.i);
                Map map0 = this.e.c();
                this.B(this.b, true, arr_file, map0);
                Set set0 = map0.keySet();
                this.e.h(set0);
            }
        }
        catch(IOException iOException1) {
            Log.e("SimpleCache", "Failed to initialize cache indices: " + this.b, iOException1);
            this.l = new CacheException("Failed to initialize cache indices: " + this.b, iOException1);
            return;
        }
        this.d.r();
        try {
            this.d.s();
        }
        catch(IOException iOException2) {
            Log.e("SimpleCache", "Storing index file failed", iOException2);
        }
    }
}

