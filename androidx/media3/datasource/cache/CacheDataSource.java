package androidx.media3.datasource.cache;

import O1.a;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.PlaceholderDataSource;
import androidx.media3.datasource.PriorityDataSource;
import androidx.media3.datasource.TeeDataSource;
import androidx.media3.datasource.TransferListener;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.Map;

@UnstableApi
public final class CacheDataSource implements DataSource {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        void a(int arg1);

        void b(long arg1, long arg2);
    }

    public static final class Factory implements androidx.media3.datasource.DataSource.Factory {
        private Cache a;
        private androidx.media3.datasource.DataSource.Factory b;
        @Nullable
        private androidx.media3.datasource.DataSink.Factory c;
        private CacheKeyFactory d;
        private boolean e;
        @Nullable
        private androidx.media3.datasource.DataSource.Factory f;
        @Nullable
        private PriorityTaskManager g;
        private int h;
        private int i;
        @Nullable
        private EventListener j;

        public Factory() {
            this.b = new androidx.media3.datasource.FileDataSource.Factory();
            this.d = CacheKeyFactory.a;
        }

        @Override  // androidx.media3.datasource.DataSource$Factory
        public DataSource a() {
            return this.c();
        }

        public CacheDataSource c() {
            androidx.media3.datasource.DataSource.Factory dataSource$Factory0 = this.f;
            return dataSource$Factory0 == null ? this.f(null, this.i, this.h) : this.f(dataSource$Factory0.a(), this.i, this.h);
        }

        public CacheDataSource d() {
            androidx.media3.datasource.DataSource.Factory dataSource$Factory0 = this.f;
            return dataSource$Factory0 == null ? this.f(null, this.i | 1, -4000) : this.f(dataSource$Factory0.a(), this.i | 1, -4000);
        }

        public CacheDataSource e() {
            return this.f(null, this.i | 1, -4000);
        }

        private CacheDataSource f(@Nullable DataSource dataSource0, int v, int v1) {
            DataSink dataSink0;
            Object object0 = Assertions.g(this.a);
            if(!this.e && dataSource0 != null) {
                androidx.media3.datasource.DataSink.Factory dataSink$Factory0 = this.c;
                if(dataSink$Factory0 != null) {
                    dataSink0 = dataSink$Factory0.a();
                    return new CacheDataSource(((Cache)object0), dataSource0, this.b.a(), dataSink0, this.d, v, this.g, v1, this.j, null);
                }
                dataSink0 = new androidx.media3.datasource.cache.CacheDataSink.Factory().c(((Cache)object0)).a();
                return new CacheDataSource(((Cache)object0), dataSource0, this.b.a(), dataSink0, this.d, v, this.g, v1, this.j, null);
            }
            return new CacheDataSource(((Cache)object0), dataSource0, this.b.a(), null, this.d, v, this.g, v1, this.j, null);
        }

        @Nullable
        public Cache g() {
            return this.a;
        }

        public CacheKeyFactory h() {
            return this.d;
        }

        @Nullable
        public PriorityTaskManager i() {
            return this.g;
        }

        @a
        public Factory j(Cache cache0) {
            this.a = cache0;
            return this;
        }

        @a
        public Factory k(CacheKeyFactory cacheKeyFactory0) {
            this.d = cacheKeyFactory0;
            return this;
        }

        @a
        public Factory l(androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this.b = dataSource$Factory0;
            return this;
        }

        @a
        public Factory m(@Nullable androidx.media3.datasource.DataSink.Factory dataSink$Factory0) {
            this.c = dataSink$Factory0;
            this.e = dataSink$Factory0 == null;
            return this;
        }

        @a
        public Factory n(@Nullable EventListener cacheDataSource$EventListener0) {
            this.j = cacheDataSource$EventListener0;
            return this;
        }

        @a
        public Factory o(int v) {
            this.i = v;
            return this;
        }

        @a
        public Factory p(@Nullable androidx.media3.datasource.DataSource.Factory dataSource$Factory0) {
            this.f = dataSource$Factory0;
            return this;
        }

        @a
        public Factory q(int v) {
            this.h = v;
            return this;
        }

        @a
        public Factory r(@Nullable PriorityTaskManager priorityTaskManager0) {
            this.g = priorityTaskManager0;
            return this;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    public static final int A = 0;
    public static final int B = 1;
    private static final long C = 0x19000L;
    private final Cache b;
    private final DataSource c;
    @Nullable
    private final DataSource d;
    private final DataSource e;
    private final CacheKeyFactory f;
    @Nullable
    private final EventListener g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    @Nullable
    private Uri k;
    @Nullable
    private DataSpec l;
    @Nullable
    private DataSpec m;
    @Nullable
    private DataSource n;
    private long o;
    private long p;
    private long q;
    @Nullable
    private CacheSpan r;
    private boolean s;
    private boolean t;
    private long u;
    private long v;
    public static final int w = 1;
    public static final int x = 2;
    public static final int y = 4;
    private static final int z = -1;

    public CacheDataSource(Cache cache0, @Nullable DataSource dataSource0) {
        this(cache0, dataSource0, 0);
    }

    public CacheDataSource(Cache cache0, @Nullable DataSource dataSource0, int v) {
        this(cache0, dataSource0, new FileDataSource(), new CacheDataSink(cache0, 0x500000L), v, null);
    }

    public CacheDataSource(Cache cache0, @Nullable DataSource dataSource0, DataSource dataSource1, @Nullable DataSink dataSink0, int v, @Nullable EventListener cacheDataSource$EventListener0) {
        this(cache0, dataSource0, dataSource1, dataSink0, v, cacheDataSource$EventListener0, null);
    }

    public CacheDataSource(Cache cache0, @Nullable DataSource dataSource0, DataSource dataSource1, @Nullable DataSink dataSink0, int v, @Nullable EventListener cacheDataSource$EventListener0, @Nullable CacheKeyFactory cacheKeyFactory0) {
        this(cache0, dataSource0, dataSource1, dataSink0, cacheKeyFactory0, v, null, -1000, cacheDataSource$EventListener0);
    }

    private CacheDataSource(Cache cache0, @Nullable DataSource dataSource0, DataSource dataSource1, @Nullable DataSink dataSink0, @Nullable CacheKeyFactory cacheKeyFactory0, int v, @Nullable PriorityTaskManager priorityTaskManager0, int v1, @Nullable EventListener cacheDataSource$EventListener0) {
        this.b = cache0;
        this.c = dataSource1;
        if(cacheKeyFactory0 == null) {
            cacheKeyFactory0 = CacheKeyFactory.a;
        }
        this.f = cacheKeyFactory0;
        boolean z = false;
        this.h = (v & 1) != 0;
        this.i = (v & 2) != 0;
        if((v & 4) != 0) {
            z = true;
        }
        this.j = z;
        TeeDataSource teeDataSource0 = null;
        if(dataSource0 == null) {
            this.e = PlaceholderDataSource.b;
            this.d = null;
        }
        else {
            if(priorityTaskManager0 != null) {
                dataSource0 = new PriorityDataSource(dataSource0, priorityTaskManager0, v1);
            }
            this.e = dataSource0;
            if(dataSink0 != null) {
                teeDataSource0 = new TeeDataSource(dataSource0, dataSink0);
            }
            this.d = teeDataSource0;
        }
        this.g = cacheDataSource$EventListener0;
    }

    CacheDataSource(Cache cache0, DataSource dataSource0, DataSource dataSource1, DataSink dataSink0, CacheKeyFactory cacheKeyFactory0, int v, PriorityTaskManager priorityTaskManager0, int v1, EventListener cacheDataSource$EventListener0, androidx.media3.datasource.cache.CacheDataSource.1 cacheDataSource$10) {
        this(cache0, dataSource0, dataSource1, dataSink0, cacheKeyFactory0, v, priorityTaskManager0, v1, cacheDataSource$EventListener0);
    }

    private boolean A() {
        return this.n == this.c;
    }

    private boolean B() {
        return !this.A();
    }

    private boolean C() {
        return this.n == this.d;
    }

    private void D() {
        EventListener cacheDataSource$EventListener0 = this.g;
        if(cacheDataSource$EventListener0 != null && this.u > 0L) {
            cacheDataSource$EventListener0.b(this.b.m(), this.u);
            this.u = 0L;
        }
    }

    private void E(int v) {
        EventListener cacheDataSource$EventListener0 = this.g;
        if(cacheDataSource$EventListener0 != null) {
            cacheDataSource$EventListener0.a(v);
        }
    }

    private void F(DataSpec dataSpec0, boolean z) throws IOException {
        long v4;
        DataSpec dataSpec1;
        DataSource dataSource0;
        CacheSpan cacheSpan0;
        String s = dataSpec0.i;
        Uri uri0 = null;
        if(this.t) {
            cacheSpan0 = null;
        }
        else if(this.h) {
            try {
                cacheSpan0 = this.b.e(s, this.p, this.q);
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        }
        else {
            cacheSpan0 = this.b.k(s, this.p, this.q);
        }
        if(cacheSpan0 == null) {
            dataSource0 = this.e;
            dataSpec1 = dataSpec0.a().i(this.p).h(this.q).a();
        }
        else if(cacheSpan0.d) {
            Uri uri1 = Uri.fromFile(cacheSpan0.e);
            long v = cacheSpan0.b;
            long v1 = this.p - v;
            long v2 = cacheSpan0.c - v1;
            long v3 = this.q;
            if(v3 != -1L) {
                v2 = Math.min(v2, v3);
            }
            dataSpec1 = dataSpec0.a().j(uri1).l(v).i(v1).h(v2).a();
            dataSource0 = this.c;
        }
        else {
            if(cacheSpan0.c()) {
                v4 = this.q;
            }
            else {
                v4 = cacheSpan0.c;
                long v5 = this.q;
                if(v5 != -1L) {
                    v4 = Math.min(v4, v5);
                }
            }
            dataSpec1 = dataSpec0.a().i(this.p).h(v4).a();
            dataSource0 = this.d;
            if(dataSource0 == null) {
                dataSource0 = this.e;
                this.b.n(cacheSpan0);
                cacheSpan0 = null;
            }
        }
        this.v = this.t || dataSource0 != this.e ? 0x7FFFFFFFFFFFFFFFL : this.p + 0x19000L;
        if(z) {
            Assertions.i(this.z());
            if(dataSource0 == this.e) {
                return;
            }
            try {
                this.u();
            }
            catch(Throwable throwable0) {
                if(cacheSpan0.b()) {
                    this.b.n(cacheSpan0);
                }
                throw throwable0;
            }
        }
        if(cacheSpan0 != null && cacheSpan0.b()) {
            this.r = cacheSpan0;
        }
        this.n = dataSource0;
        this.m = dataSpec1;
        this.o = 0L;
        long v6 = dataSource0.a(dataSpec1);
        ContentMetadataMutations contentMetadataMutations0 = new ContentMetadataMutations();
        if(dataSpec1.h == -1L && v6 != -1L) {
            this.q = v6;
            ContentMetadataMutations.h(contentMetadataMutations0, this.p + v6);
        }
        if(this.B()) {
            Uri uri2 = dataSource0.c();
            this.k = uri2;
            if(!dataSpec0.a.equals(uri2)) {
                uri0 = this.k;
            }
            ContentMetadataMutations.i(contentMetadataMutations0, uri0);
        }
        if(this.C()) {
            this.b.p(s, contentMetadataMutations0);
        }
    }

    private void G(String s) throws IOException {
        this.q = 0L;
        if(this.C()) {
            ContentMetadataMutations contentMetadataMutations0 = new ContentMetadataMutations();
            ContentMetadataMutations.h(contentMetadataMutations0, this.p);
            this.b.p(s, contentMetadataMutations0);
        }
    }

    private int H(DataSpec dataSpec0) {
        if(this.i && this.s) {
            return 0;
        }
        return !this.j || dataSpec0.h != -1L ? -1 : 1;
    }

    @Override  // androidx.media3.datasource.DataSource
    public long a(DataSpec dataSpec0) throws IOException {
        try {
            String s = this.f.a(dataSpec0);
            DataSpec dataSpec1 = dataSpec0.a().g(s).a();
            this.l = dataSpec1;
            this.k = CacheDataSource.x(this.b, s, dataSpec1.a);
            this.p = dataSpec0.g;
            int v = this.H(dataSpec0);
            this.t = v != -1;
            if(v != -1) {
                this.E(v);
            }
            if(this.t) {
                this.q = -1L;
            }
            else {
                long v1 = c.a(this.b.b(s));
                this.q = v1;
                if(v1 != -1L) {
                    long v2 = v1 - dataSpec0.g;
                    this.q = v2;
                    if(v2 < 0L) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long v3 = dataSpec0.h;
            if(v3 != -1L) {
                long v4 = this.q;
                if(v4 != -1L) {
                    v3 = Math.min(v4, v3);
                }
                this.q = v3;
            }
            if(this.q > 0L || this.q == -1L) {
                this.F(dataSpec1, false);
            }
            return dataSpec0.h == -1L ? this.q : dataSpec0.h;
        }
        catch(Throwable throwable0) {
        }
        this.y(throwable0);
        throw throwable0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.datasource.DataSource
    public Map b() {
        return this.B() ? this.e.b() : Collections.emptyMap();
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    public Uri c() {
        return this.k;
    }

    @Override  // androidx.media3.datasource.DataSource
    public void close() throws IOException {
        this.l = null;
        this.k = null;
        this.p = 0L;
        this.D();
        try {
            this.u();
        }
        catch(Throwable throwable0) {
            this.y(throwable0);
            throw throwable0;
        }
    }

    @Override  // androidx.media3.datasource.DataSource
    public void l(TransferListener transferListener0) {
        Assertions.g(transferListener0);
        this.c.l(transferListener0);
        this.e.l(transferListener0);
    }

    @Override  // androidx.media3.common.DataReader
    public int read(byte[] arr_b, int v, int v1) throws IOException {
        if(v1 == 0) {
            return 0;
        }
        if(this.q == 0L) {
            return -1;
        }
        DataSpec dataSpec0 = (DataSpec)Assertions.g(this.l);
        DataSpec dataSpec1 = (DataSpec)Assertions.g(this.m);
        try {
            if(this.p >= this.v) {
                this.F(dataSpec0, true);
            }
            int v2 = ((DataSource)Assertions.g(this.n)).read(arr_b, v, v1);
            if(v2 != -1) {
                if(this.A()) {
                    this.u += (long)v2;
                }
                this.p += (long)v2;
                this.o += (long)v2;
                long v3 = this.q;
                if(v3 == -1L) {
                    return v2;
                }
                this.q = v3 - ((long)v2);
                return v2;
            }
            if(this.B() && (dataSpec1.h == -1L || this.o < dataSpec1.h)) {
                this.G(dataSpec0.i);
                return -1;
            }
            if(this.q <= 0L && this.q != -1L) {
                return v2;
            }
            this.u();
            this.F(dataSpec0, false);
            return this.read(arr_b, v, v1);
        }
        catch(Throwable throwable0) {
        }
        this.y(throwable0);
        throw throwable0;
    }

    private void u() throws IOException {
        CacheSpan cacheSpan0;
        DataSource dataSource0 = this.n;
        if(dataSource0 == null) {
            return;
        }
        try {
            dataSource0.close();
            this.m = null;
            this.n = null;
            cacheSpan0 = this.r;
        }
        catch(Throwable throwable0) {
            this.m = null;
            this.n = null;
            CacheSpan cacheSpan1 = this.r;
            if(cacheSpan1 != null) {
                this.b.n(cacheSpan1);
                this.r = null;
            }
            throw throwable0;
        }
        if(cacheSpan0 != null) {
            this.b.n(cacheSpan0);
            this.r = null;
        }
    }

    public Cache v() {
        return this.b;
    }

    public CacheKeyFactory w() {
        return this.f;
    }

    private static Uri x(Cache cache0, String s, Uri uri0) {
        Uri uri1 = c.b(cache0.b(s));
        return uri1 == null ? uri0 : uri1;
    }

    private void y(Throwable throwable0) {
        if(this.A() || throwable0 instanceof CacheException) {
            this.s = true;
        }
    }

    private boolean z() {
        return this.n == this.e;
    }

    class androidx.media3.datasource.cache.CacheDataSource.1 {
    }

}

