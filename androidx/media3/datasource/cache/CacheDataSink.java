package androidx.media3.datasource.cache;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSink;
import androidx.media3.datasource.DataSpec;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@UnstableApi
public final class CacheDataSink implements DataSink {
    public static final class CacheDataSinkException extends CacheException {
        public CacheDataSinkException(IOException iOException0) {
            super(iOException0);
        }
    }

    public static final class Factory implements androidx.media3.datasource.DataSink.Factory {
        private Cache a;
        private long b;
        private int c;

        public Factory() {
            this.b = 0x500000L;
            this.c = 0x5000;
        }

        @Override  // androidx.media3.datasource.DataSink$Factory
        public DataSink a() {
            return new CacheDataSink(((Cache)Assertions.g(this.a)), this.b, this.c);
        }

        @a
        public Factory b(int v) {
            this.c = v;
            return this;
        }

        @a
        public Factory c(Cache cache0) {
            this.a = cache0;
            return this;
        }

        @a
        public Factory d(long v) {
            this.b = v;
            return this;
        }
    }

    private final Cache a;
    private final long b;
    private final int c;
    @Nullable
    private DataSpec d;
    private long e;
    @Nullable
    private File f;
    @Nullable
    private OutputStream g;
    private long h;
    private long i;
    private ReusableBufferedOutputStream j;
    public static final long k = 0x500000L;
    public static final int l = 0x5000;
    private static final long m = 0x200000L;
    private static final String n = "CacheDataSink";

    public CacheDataSink(Cache cache0, long v) {
        this(cache0, v, 0x5000);
    }

    public CacheDataSink(Cache cache0, long v, int v1) {
        Assertions.j(v > 0L || v == -1L, "fragmentSize must be positive or C.LENGTH_UNSET.");
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v < 0x200000L) {
            Log.n("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.a = (Cache)Assertions.g(cache0);
        if(v2 == 0) {
            v = 0x7FFFFFFFFFFFFFFFL;
        }
        this.b = v;
        this.c = v1;
    }

    @Override  // androidx.media3.datasource.DataSink
    public void a(DataSpec dataSpec0) throws CacheDataSinkException {
        Assertions.g(dataSpec0.i);
        if(dataSpec0.h == -1L && dataSpec0.d(2)) {
            this.d = null;
            return;
        }
        this.d = dataSpec0;
        long v = dataSpec0.d(4) ? this.b : 0x7FFFFFFFFFFFFFFFL;
        try {
            this.e = v;
            this.i = 0L;
            this.c(dataSpec0);
        }
        catch(IOException iOException0) {
            throw new CacheDataSinkException(iOException0);
        }
    }

    private void b() throws IOException {
        OutputStream outputStream0 = this.g;
        if(outputStream0 == null) {
            return;
        }
        try {
            outputStream0.flush();
        }
        catch(Throwable throwable0) {
            Util.t(this.g);
            this.g = null;
            File file0 = this.f;
            this.f = null;
            file0.delete();
            throw throwable0;
        }
        Util.t(this.g);
        this.g = null;
        File file1 = this.f;
        this.f = null;
        this.a.o(file1, this.h);
    }

    private void c(DataSpec dataSpec0) throws IOException {
        this.f = this.a.h(dataSpec0.i, dataSpec0.g + this.i, (dataSpec0.h == -1L ? -1L : Math.min(dataSpec0.h - this.i, this.e)));
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.f);
        if(this.c > 0) {
            ReusableBufferedOutputStream reusableBufferedOutputStream0 = this.j;
            if(reusableBufferedOutputStream0 == null) {
                this.j = new ReusableBufferedOutputStream(fileOutputStream0, this.c);
            }
            else {
                reusableBufferedOutputStream0.a(fileOutputStream0);
            }
            this.g = this.j;
        }
        else {
            this.g = fileOutputStream0;
        }
        this.h = 0L;
    }

    @Override  // androidx.media3.datasource.DataSink
    public void close() throws CacheDataSinkException {
        if(this.d == null) {
            return;
        }
        try {
            this.b();
        }
        catch(IOException iOException0) {
            throw new CacheDataSinkException(iOException0);
        }
    }

    @Override  // androidx.media3.datasource.DataSink
    public void write(byte[] arr_b, int v, int v1) throws CacheDataSinkException {
        DataSpec dataSpec0 = this.d;
        if(dataSpec0 == null) {
            return;
        }
        int v2 = 0;
        while(v2 < v1) {
            try {
                if(this.h == this.e) {
                    this.b();
                    this.c(dataSpec0);
                }
                int v3 = (int)Math.min(v1 - v2, this.e - this.h);
                this.g.write(arr_b, v + v2, v3);
                v2 += v3;
                this.h += (long)v3;
                this.i += (long)v3;
                continue;
            }
            catch(IOException iOException0) {
            }
            throw new CacheDataSinkException(iOException0);
        }
    }
}

