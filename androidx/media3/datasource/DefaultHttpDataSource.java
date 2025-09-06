package androidx.media3.datasource;

import O1.a;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.I;
import com.google.common.collect.D4;
import com.google.common.collect.Q2;
import com.google.common.collect.j2;
import com.google.common.io.h;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public static final class Factory implements androidx.media3.datasource.HttpDataSource.Factory {
        private final RequestProperties a;
        @Nullable
        private TransferListener b;
        @Nullable
        private I c;
        @Nullable
        private String d;
        private int e;
        private int f;
        private boolean g;
        private boolean h;
        private boolean i;

        public Factory() {
            this.a = new RequestProperties();
            this.e = 8000;
            this.f = 8000;
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @UnstableApi
        public DataSource a() {
            return this.c();
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @UnstableApi
        public HttpDataSource a() {
            return this.c();
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @a
        @UnstableApi
        public androidx.media3.datasource.HttpDataSource.Factory b(Map map0) {
            return this.h(map0);
        }

        @UnstableApi
        public DefaultHttpDataSource c() {
            DefaultHttpDataSource defaultHttpDataSource0 = new DefaultHttpDataSource(this.d, this.e, this.f, this.g, this.h, this.a, this.c, this.i, null);
            TransferListener transferListener0 = this.b;
            if(transferListener0 != null) {
                defaultHttpDataSource0.l(transferListener0);
            }
            return defaultHttpDataSource0;
        }

        @a
        @UnstableApi
        public Factory d(boolean z) {
            this.g = z;
            return this;
        }

        @a
        @UnstableApi
        public Factory e(int v) {
            this.e = v;
            return this;
        }

        @a
        @UnstableApi
        public Factory f(@Nullable I i0) {
            this.c = i0;
            return this;
        }

        @a
        @UnstableApi
        public Factory g(boolean z) {
            this.h = z;
            return this;
        }

        @a
        @UnstableApi
        public Factory h(Map map0) {
            this.a.b(map0);
            return this;
        }

        @a
        @UnstableApi
        public Factory i(boolean z) {
            this.i = z;
            return this;
        }

        @a
        @UnstableApi
        public Factory j(int v) {
            this.f = v;
            return this;
        }

        @a
        @UnstableApi
        public Factory k(@Nullable TransferListener transferListener0) {
            this.b = transferListener0;
            return this;
        }

        @a
        @UnstableApi
        public Factory l(@Nullable String s) {
            this.d = s;
            return this;
        }
    }

    static class NullFilteringHeadersMap extends j2 {
        private final Map a;

        public NullFilteringHeadersMap(Map map0) {
            this.a = map0;
        }

        @Override  // com.google.common.collect.j2
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.collect.j2
        protected Map M() {
            return this.a;
        }

        @Override  // com.google.common.collect.j2
        public boolean containsKey(@Nullable Object object0) {
            return object0 != null && super.containsKey(object0);
        }

        @Override  // com.google.common.collect.j2
        public boolean containsValue(@Nullable Object object0) {
            return super.P(object0);
        }

        @Override  // com.google.common.collect.j2
        public Set entrySet() {
            return D4.i(super.entrySet(), (Map.Entry map$Entry0) -> map$Entry0.getKey() != null);
        }

        @Override  // com.google.common.collect.j2
        public boolean equals(@Nullable Object object0) {
            return object0 != null && super.S(object0);
        }

        @Override  // com.google.common.collect.j2
        @Nullable
        public Object get(@Nullable Object object0) {
            return this.get(object0);
        }

        @Nullable
        public List get(@Nullable Object object0) {
            return object0 == null ? null : ((List)super.get(object0));
        }

        @Override  // com.google.common.collect.j2
        public int hashCode() {
            return super.U();
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.common.collect.j2
        public boolean isEmpty() {
            return super.isEmpty() || super.size() == 1 && super.containsKey(null);
        }

        @Override  // com.google.common.collect.j2
        public Set keySet() {
            return D4.i(super.keySet(), (String s) -> s != null);
        }

        // 检测为 Lambda 实现
        private static boolean s0(Map.Entry map$Entry0) [...]

        @Override  // com.google.common.collect.j2
        public int size() {
            int v = super.containsKey(null);
            return super.size() - v;
        }

        // 检测为 Lambda 实现
        private static boolean t0(String s) [...]
    }

    private static final int A = 308;
    private static final long B = 0x800L;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    @Nullable
    private final String j;
    @Nullable
    private final RequestProperties k;
    private final RequestProperties l;
    @Nullable
    private final I m;
    private final boolean n;
    @Nullable
    private DataSpec o;
    @Nullable
    private HttpURLConnection p;
    @Nullable
    private InputStream q;
    private boolean r;
    private int s;
    private long t;
    private long u;
    @UnstableApi
    public static final int v = 8000;
    @UnstableApi
    public static final int w = 8000;
    private static final String x = "DefaultHttpDataSource";
    private static final int y = 20;
    private static final int z = 307;

    private DefaultHttpDataSource(@Nullable String s, int v, int v1, boolean z, boolean z1, @Nullable RequestProperties httpDataSource$RequestProperties0, @Nullable I i0, boolean z2) {
        super(true);
        this.j = s;
        this.h = v;
        this.i = v1;
        this.f = z;
        this.g = z1;
        if(z && z1) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.k = httpDataSource$RequestProperties0;
        this.m = i0;
        this.l = new RequestProperties();
        this.n = z2;
    }

    DefaultHttpDataSource(String s, int v, int v1, boolean z, boolean z1, RequestProperties httpDataSource$RequestProperties0, I i0, boolean z2, androidx.media3.datasource.DefaultHttpDataSource.1 defaultHttpDataSource$10) {
        this(s, v, v1, z, z1, httpDataSource$RequestProperties0, i0, z2);
    }

    private static boolean A(HttpURLConnection httpURLConnection0) {
        return "gzip".equalsIgnoreCase(httpURLConnection0.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection B(DataSpec dataSpec0) throws IOException {
        URL uRL2;
        URL uRL0 = new URL(dataSpec0.a.toString());
        int v = dataSpec0.c;
        byte[] arr_b = dataSpec0.d;
        long v1 = dataSpec0.g;
        long v2 = dataSpec0.h;
        boolean z = dataSpec0.d(1);
        if(!this.f && !this.g && !this.n) {
            return this.C(uRL0, v, arr_b, v1, v2, z, true, dataSpec0.e);
        }
        URL uRL1 = uRL0;
        int v3 = v;
        byte[] arr_b1 = arr_b;
        int v4;
        for(v4 = 0; v4 <= 20; ++v4) {
            HttpURLConnection httpURLConnection0 = this.C(uRL1, v3, arr_b1, v1, v2, z, false, dataSpec0.e);
            int v5 = httpURLConnection0.getResponseCode();
            String s = httpURLConnection0.getHeaderField("Location");
            if((v3 == 1 || v3 == 3) && (v5 == 300 || v5 == 301 || v5 == 302 || v5 == 303 || v5 == 307 || v5 == 308)) {
                httpURLConnection0.disconnect();
                uRL1 = this.z(uRL1, s, dataSpec0);
            }
            else {
                if(v3 == 2 && (v5 == 300 || v5 == 301 || v5 == 302 || v5 == 303)) {
                    httpURLConnection0.disconnect();
                    if(!this.n || v5 != 302) {
                        arr_b1 = null;
                        uRL2 = uRL1;
                        v3 = 1;
                    }
                    else {
                        uRL2 = uRL1;
                    }
                    uRL1 = this.z(uRL2, s, dataSpec0);
                    continue;
                }
                return httpURLConnection0;
            }
        }
        throw new HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + (v4 + 1)), dataSpec0, 2001, 1);
    }

    private HttpURLConnection C(URL uRL0, int v, @Nullable byte[] arr_b, long v1, long v2, boolean z, boolean z1, Map map0) throws IOException {
        HttpURLConnection httpURLConnection0 = this.E(uRL0);
        httpURLConnection0.setConnectTimeout(this.h);
        httpURLConnection0.setReadTimeout(this.i);
        HashMap hashMap0 = new HashMap();
        RequestProperties httpDataSource$RequestProperties0 = this.k;
        if(httpDataSource$RequestProperties0 != null) {
            hashMap0.putAll(httpDataSource$RequestProperties0.c());
        }
        hashMap0.putAll(this.l.c());
        hashMap0.putAll(map0);
        for(Object object0: hashMap0.entrySet()) {
            httpURLConnection0.setRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        String s = HttpUtil.a(v1, v2);
        if(s != null) {
            httpURLConnection0.setRequestProperty("Range", s);
        }
        String s1 = this.j;
        if(s1 != null) {
            httpURLConnection0.setRequestProperty("User-Agent", s1);
        }
        httpURLConnection0.setRequestProperty("Accept-Encoding", (z ? "gzip" : "identity"));
        httpURLConnection0.setInstanceFollowRedirects(z1);
        httpURLConnection0.setDoOutput(arr_b != null);
        httpURLConnection0.setRequestMethod(DataSpec.c(v));
        if(arr_b != null) {
            httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
            httpURLConnection0.connect();
            OutputStream outputStream0 = httpURLConnection0.getOutputStream();
            outputStream0.write(arr_b);
            outputStream0.close();
            return httpURLConnection0;
        }
        httpURLConnection0.connect();
        return httpURLConnection0;
    }

    private static void D(@Nullable HttpURLConnection httpURLConnection0, long v) {
        if(httpURLConnection0 != null && Util.a <= 20) {
            try {
                InputStream inputStream0 = httpURLConnection0.getInputStream();
                if(v == -1L) {
                    if(inputStream0.read() == -1) {
                        return;
                    }
                }
                else if(v <= 0x800L) {
                    return;
                }
                String s = inputStream0.getClass().getName();
                if("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(s) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(s)) {
                    Method method0 = ((Class)Assertions.g(inputStream0.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", null);
                    method0.setAccessible(true);
                    method0.invoke(inputStream0, null);
                }
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @VisibleForTesting
    HttpURLConnection E(URL uRL0) throws IOException {
        return (HttpURLConnection)(((URLConnection)FirebasePerfUrlConnection.instrument(uRL0.openConnection())));
    }

    private int F(byte[] arr_b, int v, int v1) throws IOException {
        if(v1 == 0) {
            return 0;
        }
        long v2 = this.t;
        if(v2 != -1L) {
            long v3 = v2 - this.u;
            if(v3 == 0L) {
                return -1;
            }
            v1 = (int)Math.min(v1, v3);
        }
        int v4 = this.q.read(arr_b, v, v1);
        if(v4 == -1) {
            return -1;
        }
        this.u += (long)v4;
        this.u(v4);
        return v4;
    }

    private void G(long v, DataSpec dataSpec0) throws IOException {
        if(v == 0L) {
            return;
        }
        while(v > 0L) {
            int v1 = this.q.read(new byte[0x1000], 0, ((int)Math.min(v, 0x1000L)));
            if(Thread.currentThread().isInterrupted()) {
                throw new HttpDataSourceException(new InterruptedIOException(), dataSpec0, 2000, 1);
            }
            if(v1 == -1) {
                throw new HttpDataSourceException(dataSpec0, 2008, 1);
            }
            v -= (long)v1;
            this.u(v1);
        }
    }

    @Override  // androidx.media3.datasource.HttpDataSource, androidx.media3.datasource.DataSource
    @UnstableApi
    public long a(DataSpec dataSpec0) throws HttpDataSourceException {
        byte[] arr_b;
        String s;
        HttpURLConnection httpURLConnection0;
        long v1;
        this.o = dataSpec0;
        long v = 0L;
        this.u = 0L;
        this.t = 0L;
        this.w(dataSpec0);
        try {
            v1 = -1L;
            httpURLConnection0 = this.B(dataSpec0);
            this.p = httpURLConnection0;
            this.s = httpURLConnection0.getResponseCode();
            s = httpURLConnection0.getResponseMessage();
        }
        catch(IOException iOException0) {
            this.y();
            throw HttpDataSourceException.c(iOException0, dataSpec0, 1);
        }
        if(this.s >= 200 && this.s <= 299) {
            String s1 = httpURLConnection0.getContentType();
            if(this.m != null && !this.m.apply(s1)) {
                this.y();
                throw new InvalidContentTypeException(s1, dataSpec0);
            }
            if(this.s == 200) {
                long v2 = dataSpec0.g;
                if(v2 != 0L) {
                    v = v2;
                }
            }
            boolean z = DefaultHttpDataSource.A(httpURLConnection0);
            if(z) {
                this.t = dataSpec0.h;
            }
            else {
                long v3 = dataSpec0.h;
                if(v3 == -1L) {
                    long v4 = HttpUtil.b(httpURLConnection0.getHeaderField("Content-Length"), httpURLConnection0.getHeaderField("Content-Range"));
                    if(v4 != -1L) {
                        v1 = v4 - v;
                    }
                    this.t = v1;
                }
                else {
                    this.t = v3;
                }
            }
            try {
                this.q = httpURLConnection0.getInputStream();
                if(z) {
                    this.q = new GZIPInputStream(this.q);
                }
            }
            catch(IOException iOException1) {
                this.y();
                throw new HttpDataSourceException(iOException1, dataSpec0, 2000, 1);
            }
            this.r = true;
            this.x(dataSpec0);
            try {
                this.G(v, dataSpec0);
                return this.t;
            }
            catch(IOException iOException2) {
                this.y();
                throw iOException2 instanceof HttpDataSourceException ? ((HttpDataSourceException)iOException2) : new HttpDataSourceException(iOException2, dataSpec0, 2000, 1);
            }
        }
        Map map0 = httpURLConnection0.getHeaderFields();
        if(this.s == 0x1A0) {
            long v5 = HttpUtil.c(httpURLConnection0.getHeaderField("Content-Range"));
            if(dataSpec0.g == v5) {
                this.r = true;
                this.x(dataSpec0);
                return dataSpec0.h == -1L ? 0L : dataSpec0.h;
            }
        }
        InputStream inputStream0 = httpURLConnection0.getErrorStream();
        try {
            arr_b = inputStream0 == null ? Util.f : h.u(inputStream0);
        }
        catch(IOException unused_ex) {
            arr_b = Util.f;
        }
        this.y();
        DataSourceException dataSourceException0 = this.s == 0x1A0 ? new DataSourceException(2008) : null;
        throw new InvalidResponseCodeException(this.s, s, dataSourceException0, map0, dataSpec0, arr_b);
    }

    @Override  // androidx.media3.datasource.BaseDataSource, androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public Map b() {
        HttpURLConnection httpURLConnection0 = this.p;
        return httpURLConnection0 == null ? Q2.u() : new NullFilteringHeadersMap(httpURLConnection0.getHeaderFields());
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri c() {
        return this.p == null ? null : Uri.parse(this.p.getURL().toString());
    }

    @Override  // androidx.media3.datasource.HttpDataSource, androidx.media3.datasource.DataSource
    @UnstableApi
    public void close() throws HttpDataSourceException {
        try {
            InputStream inputStream0 = this.q;
            if(inputStream0 != null) {
                DefaultHttpDataSource.D(this.p, (this.t == -1L ? -1L : this.t - this.u));
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    throw new HttpDataSourceException(iOException0, this.o, 2000, 3);
                }
            }
        }
        finally {
            this.q = null;
            this.y();
            if(this.r) {
                this.r = false;
                this.v();
            }
        }
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int f() {
        if(this.p != null) {
            return this.s > 0 ? this.s : -1;
        }
        return -1;
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void j() {
        this.l.a();
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void m(String s, String s1) {
        Assertions.g(s);
        Assertions.g(s1);
        this.l.e(s, s1);
    }

    @Override  // androidx.media3.datasource.HttpDataSource, androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] arr_b, int v, int v1) throws HttpDataSourceException {
        try {
            return this.F(arr_b, v, v1);
        }
        catch(IOException iOException0) {
            throw HttpDataSourceException.c(iOException0, this.o, 2);
        }
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void t(String s) {
        Assertions.g(s);
        this.l.d(s);
    }

    private void y() {
        HttpURLConnection httpURLConnection0 = this.p;
        if(httpURLConnection0 != null) {
            try {
                httpURLConnection0.disconnect();
            }
            catch(Exception exception0) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", exception0);
            }
            this.p = null;
        }
    }

    private URL z(URL uRL0, @Nullable String s, DataSpec dataSpec0) throws HttpDataSourceException {
        URL uRL1;
        if(s == null) {
            throw new HttpDataSourceException("Null location redirect", dataSpec0, 2001, 1);
        }
        try {
            uRL1 = new URL(uRL0, s);
        }
        catch(MalformedURLException malformedURLException0) {
            throw new HttpDataSourceException(malformedURLException0, dataSpec0, 2001, 1);
        }
        String s1 = uRL1.getProtocol();
        if(!"https".equals(s1) && !"http".equals(s1)) {
            throw new HttpDataSourceException("Unsupported protocol redirect: " + s1, dataSpec0, 2001, 1);
        }
        if(!this.f && !s1.equals(uRL0.getProtocol())) {
            if(this.g) {
                try {
                    return new URL(uRL1.toString().replaceFirst(s1, uRL0.getProtocol()));
                }
                catch(MalformedURLException malformedURLException1) {
                    throw new HttpDataSourceException(malformedURLException1, dataSpec0, 2001, 1);
                }
            }
            throw new HttpDataSourceException("Disallowed cross-protocol redirect (" + uRL0.getProtocol() + " to " + s1 + ")", dataSpec0, 2001, 1);
        }
        return uRL1;
    }

    class androidx.media3.datasource.DefaultHttpDataSource.1 {
    }

}

