package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.common.util.UnstableApi;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

@UnstableApi
public interface Cache {
    public static class CacheException extends IOException {
        public CacheException(String s) {
            super(s);
        }

        public CacheException(String s, Throwable throwable0) {
            super(s, throwable0);
        }

        public CacheException(Throwable throwable0) {
            super(throwable0);
        }
    }

    public interface Listener {
        void d(Cache arg1, CacheSpan arg2, CacheSpan arg3);

        void e(Cache arg1, CacheSpan arg2);

        void f(Cache arg1, CacheSpan arg2);
    }

    public static final long a = -1L;

    Set R();

    long a();

    ContentMetadata b(String arg1);

    @WorkerThread
    void c(CacheSpan arg1);

    NavigableSet d(String arg1, Listener arg2);

    @WorkerThread
    CacheSpan e(String arg1, long arg2, long arg3) throws InterruptedException, CacheException;

    @WorkerThread
    void f(String arg1);

    boolean g(String arg1, long arg2, long arg3);

    @WorkerThread
    File h(String arg1, long arg2, long arg3) throws CacheException;

    long i(String arg1, long arg2, long arg3);

    void j(String arg1, Listener arg2);

    @Nullable
    @WorkerThread
    CacheSpan k(String arg1, long arg2, long arg3) throws CacheException;

    long l(String arg1, long arg2, long arg3);

    long m();

    void n(CacheSpan arg1);

    @WorkerThread
    void o(File arg1, long arg2) throws CacheException;

    @WorkerThread
    void p(String arg1, ContentMetadataMutations arg2) throws CacheException;

    NavigableSet q(String arg1);

    @WorkerThread
    void release();
}

