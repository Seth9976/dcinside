package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.io.InterruptedIOException;

@UnstableApi
public final class CacheWriter {
    public interface ProgressListener {
        void a(long arg1, long arg2, long arg3);
    }

    private final CacheDataSource a;
    private final Cache b;
    private final DataSpec c;
    private final String d;
    private final byte[] e;
    @Nullable
    private final ProgressListener f;
    private long g;
    private long h;
    private long i;
    private volatile boolean j;
    public static final int k = 0x20000;

    public CacheWriter(CacheDataSource cacheDataSource0, DataSpec dataSpec0, @Nullable byte[] arr_b, @Nullable ProgressListener cacheWriter$ProgressListener0) {
        this.a = cacheDataSource0;
        this.b = cacheDataSource0.v();
        this.c = dataSpec0;
        if(arr_b == null) {
            arr_b = new byte[0x20000];
        }
        this.e = arr_b;
        this.f = cacheWriter$ProgressListener0;
        this.d = cacheDataSource0.w().a(dataSpec0);
        this.g = dataSpec0.g;
    }

    @WorkerThread
    public void a() throws IOException {
        this.g();
        this.i = this.b.i(this.d, this.c.g, this.c.h);
        DataSpec dataSpec0 = this.c;
        long v = dataSpec0.h;
        if(v == -1L) {
            long v1 = c.a(this.b.b(this.d));
            if(v1 == -1L) {
                v1 = -1L;
            }
            this.h = v1;
        }
        else {
            this.h = dataSpec0.g + v;
        }
        ProgressListener cacheWriter$ProgressListener0 = this.f;
        if(cacheWriter$ProgressListener0 != null) {
            cacheWriter$ProgressListener0.a(this.c(), this.i, 0L);
        }
        while(this.h == -1L || this.g < this.h) {
            this.g();
            long v2 = this.b.l(this.d, this.g, (this.h == -1L ? 0x7FFFFFFFFFFFFFFFL : this.h - this.g));
            this.g += (v2 > 0L ? v2 : this.f(this.g, (-v2 == 0x7FFFFFFFFFFFFFFFL ? -1L : -v2)));
        }
    }

    public void b() {
        this.j = true;
    }

    private long c() {
        return this.h == -1L ? -1L : this.h - this.c.g;
    }

    private void d(long v) {
        this.i += v;
        ProgressListener cacheWriter$ProgressListener0 = this.f;
        if(cacheWriter$ProgressListener0 != null) {
            cacheWriter$ProgressListener0.a(this.c(), this.i, v);
        }
    }

    private void e(long v) {
        if(this.h == v) {
            return;
        }
        this.h = v;
        ProgressListener cacheWriter$ProgressListener0 = this.f;
        if(cacheWriter$ProgressListener0 != null) {
            cacheWriter$ProgressListener0.a(this.c(), this.i, 0L);
        }
    }

    private long f(long v, long v1) throws IOException {
        int v3;
        long v2;
        boolean z = true;
        boolean z1 = v + v1 == this.h || v1 == -1L;
        if(v1 == -1L) {
            v2 = -1L;
            z = false;
        }
        else {
            DataSpec dataSpec0 = this.c.a().i(v).h(v1).a();
            try {
                v2 = this.a.a(dataSpec0);
            }
            catch(IOException unused_ex) {
                DataSourceUtil.a(this.a);
                v2 = -1L;
                z = false;
            }
        }
        if(!z) {
            this.g();
            DataSpec dataSpec1 = this.c.a().i(v).h(-1L).a();
            try {
                v2 = this.a.a(dataSpec1);
            }
            catch(IOException iOException0) {
                DataSourceUtil.a(this.a);
                throw iOException0;
            }
        }
        try {
            if(z1 && v2 != -1L) {
                this.e(v2 + v);
            }
            v3 = 0;
            int v4 = 0;
            while(v4 != -1) {
                this.g();
                v4 = this.a.read(this.e, 0, this.e.length);
                if(v4 != -1) {
                    this.d(((long)v4));
                    v3 += v4;
                }
            }
            if(z1) {
                this.e(v + ((long)v3));
            }
        }
        catch(IOException iOException1) {
            DataSourceUtil.a(this.a);
            throw iOException1;
        }
        this.a.close();
        return (long)v3;
    }

    private void g() throws InterruptedIOException {
        if(this.j) {
            throw new InterruptedIOException();
        }
    }
}

