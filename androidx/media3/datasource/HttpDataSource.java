package androidx.media3.datasource;

import O1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.base.I;
import com.google.common.base.c;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

public interface HttpDataSource extends DataSource {
    @UnstableApi
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties a;

        public BaseFactory() {
            this.a = new RequestProperties();
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        public DataSource a() {
            return this.a();
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        public final HttpDataSource a() {
            return this.c(this.a);
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @a
        public final Factory b(Map map0) {
            this.a.b(map0);
            return this;
        }

        protected abstract HttpDataSource c(RequestProperties arg1);
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        @UnstableApi
        public CleartextNotPermittedException(IOException iOException0, DataSpec dataSpec0) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException0, dataSpec0, 2007, 1);
        }
    }

    public interface Factory extends androidx.media3.datasource.DataSource.Factory {
        @Override  // androidx.media3.datasource.DataSource$Factory
        @UnstableApi
        DataSource a();

        @UnstableApi
        HttpDataSource a();

        @UnstableApi
        Factory b(Map arg1);
    }

    public static class HttpDataSourceException extends DataSourceException {
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @Target({ElementType.TYPE_USE})
        public @interface Type {
        }

        @UnstableApi
        public final DataSpec c;
        public final int d;
        public static final int e = 1;
        public static final int f = 2;
        public static final int g = 3;

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec0, int v) {
            this(dataSpec0, 2000, v);
        }

        @UnstableApi
        public HttpDataSourceException(DataSpec dataSpec0, int v, int v1) {
            super(HttpDataSourceException.b(v, v1));
            this.c = dataSpec0;
            this.d = v1;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(IOException iOException0, DataSpec dataSpec0, int v) {
            this(iOException0, dataSpec0, 2000, v);
        }

        @UnstableApi
        public HttpDataSourceException(IOException iOException0, DataSpec dataSpec0, int v, int v1) {
            super(iOException0, HttpDataSourceException.b(v, v1));
            this.c = dataSpec0;
            this.d = v1;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String s, DataSpec dataSpec0, int v) {
            this(s, dataSpec0, 2000, v);
        }

        @UnstableApi
        public HttpDataSourceException(String s, DataSpec dataSpec0, int v, int v1) {
            super(s, HttpDataSourceException.b(v, v1));
            this.c = dataSpec0;
            this.d = v1;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String s, IOException iOException0, DataSpec dataSpec0, int v) {
            this(s, iOException0, dataSpec0, 2000, v);
        }

        @UnstableApi
        public HttpDataSourceException(String s, @Nullable IOException iOException0, DataSpec dataSpec0, int v, int v1) {
            super(s, iOException0, HttpDataSourceException.b(v, v1));
            this.c = dataSpec0;
            this.d = v1;
        }

        private static int b(int v, int v1) {
            return v != 2000 || v1 != 1 ? v : 2001;
        }

        @UnstableApi
        public static HttpDataSourceException c(IOException iOException0, DataSpec dataSpec0, int v) {
            int v1;
            String s = iOException0.getMessage();
            if(iOException0 instanceof SocketTimeoutException) {
                v1 = 2002;
            }
            else if(iOException0 instanceof InterruptedIOException) {
                v1 = 1004;
            }
            else {
                v1 = s == null || !c.g(s).matches("cleartext.*not permitted.*") ? 2001 : 2007;
            }
            return v1 == 2007 ? new CleartextNotPermittedException(iOException0, dataSpec0) : new HttpDataSourceException(iOException0, dataSpec0, v1, v);
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String h;

        @UnstableApi
        public InvalidContentTypeException(String s, DataSpec dataSpec0) {
            super("Invalid content type: " + s, dataSpec0, 2003, 1);
            this.h = s;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final int h;
        @Nullable
        public final String i;
        @UnstableApi
        public final Map j;
        public final byte[] k;

        @UnstableApi
        public InvalidResponseCodeException(int v, @Nullable String s, @Nullable IOException iOException0, Map map0, DataSpec dataSpec0, byte[] arr_b) {
            super("Response code: " + v, iOException0, dataSpec0, 2004, 1);
            this.h = v;
            this.i = s;
            this.j = map0;
            this.k = arr_b;
        }
    }

    @UnstableApi
    public static final class RequestProperties {
        private final Map a;
        @Nullable
        private Map b;

        public RequestProperties() {
            this.a = new HashMap();
        }

        public void a() {
            synchronized(this) {
                this.b = null;
                this.a.clear();
            }
        }

        public void b(Map map0) {
            synchronized(this) {
                this.b = null;
                this.a.clear();
                this.a.putAll(map0);
            }
        }

        public Map c() {
            synchronized(this) {
                if(this.b == null) {
                    this.b = DesugarCollections.unmodifiableMap(new HashMap(this.a));
                }
                return this.b;
            }
        }

        public void d(String s) {
            synchronized(this) {
                this.b = null;
                this.a.remove(s);
            }
        }

        public void e(String s, String s1) {
            synchronized(this) {
                this.b = null;
                this.a.put(s, s1);
            }
        }

        public void f(Map map0) {
            synchronized(this) {
                this.b = null;
                this.a.putAll(map0);
            }
        }
    }

    @UnstableApi
    public static final I a;

    static {
        HttpDataSource.a = new j();
    }

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    long a(DataSpec arg1) throws HttpDataSourceException;

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    Map b();

    @Override  // androidx.media3.datasource.DataSource
    @UnstableApi
    void close() throws HttpDataSourceException;

    @UnstableApi
    int f();

    @UnstableApi
    void j();

    @UnstableApi
    void m(String arg1, String arg2);

    @Override  // androidx.media3.common.DataReader
    @UnstableApi
    int read(byte[] arg1, int arg2, int arg3) throws HttpDataSourceException;

    @UnstableApi
    void t(String arg1);
}

