package androidx.media3.datasource;

import O1.a;
import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.NetworkException;
import android.net.http.UrlRequest.Builder;
import android.net.http.UrlRequest.Callback;
import android.net.http.UrlRequest.StatusListener;
import android.net.http.UrlRequest;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.I;
import com.google.common.base.c;
import com.google.common.primitives.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;

@RequiresApi(34)
@UnstableApi
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {
    public static final class Factory implements androidx.media3.datasource.HttpDataSource.Factory {
        private final HttpEngine a;
        private final Executor b;
        private final RequestProperties c;
        @Nullable
        private I d;
        @Nullable
        private TransferListener e;
        @Nullable
        private String f;
        private int g;
        private int h;
        private int i;
        private boolean j;
        private boolean k;
        private boolean l;

        public Factory(HttpEngine httpEngine0, Executor executor0) {
            this.a = v.a(Assertions.g(httpEngine0));
            this.b = executor0;
            this.c = new RequestProperties();
            this.g = 3;
            this.h = 8000;
            this.i = 8000;
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @UnstableApi
        public DataSource a() {
            return this.a();
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @UnstableApi
        public HttpDataSource a() {
            HttpDataSource httpDataSource0 = new HttpEngineDataSource(this.a, this.b, this.g, this.h, this.i, this.j, this.k, this.f, this.c, this.d, this.l);
            TransferListener transferListener0 = this.e;
            if(transferListener0 != null) {
                ((BaseDataSource)httpDataSource0).l(transferListener0);
            }
            return httpDataSource0;
        }

        @Override  // androidx.media3.datasource.HttpDataSource$Factory
        @a
        @UnstableApi
        public androidx.media3.datasource.HttpDataSource.Factory b(Map map0) {
            return this.e(map0);
        }

        @a
        @UnstableApi
        public Factory c(int v) {
            this.h = v;
            return this;
        }

        @a
        @UnstableApi
        public Factory d(@Nullable I i0) {
            this.d = i0;
            return this;
        }

        @a
        @UnstableApi
        public final Factory e(Map map0) {
            this.c.b(map0);
            return this;
        }

        @a
        @UnstableApi
        public Factory f(boolean z) {
            this.k = z;
            return this;
        }

        @a
        @UnstableApi
        public Factory g(boolean z) {
            this.l = z;
            return this;
        }

        @a
        @UnstableApi
        public Factory h(int v) {
            this.i = v;
            return this;
        }

        @a
        @UnstableApi
        public Factory i(int v) {
            this.g = v;
            return this;
        }

        @a
        @UnstableApi
        public Factory j(boolean z) {
            this.j = z;
            return this;
        }

        @a
        @UnstableApi
        public Factory k(@Nullable TransferListener transferListener0) {
            this.e = transferListener0;
            return this;
        }

        @a
        @UnstableApi
        public Factory l(@Nullable String s) {
            this.f = s;
            return this;
        }
    }

    @UnstableApi
    public static final class OpenException extends HttpDataSourceException {
        public final int h;

        public OpenException(DataSpec dataSpec0, int v, int v1) {
            super(dataSpec0, v, 1);
            this.h = v1;
        }

        public OpenException(IOException iOException0, DataSpec dataSpec0, int v, int v1) {
            super(iOException0, dataSpec0, v, 1);
            this.h = v1;
        }

        public OpenException(String s, DataSpec dataSpec0, int v, int v1) {
            super(s, dataSpec0, v, 1);
            this.h = v1;
        }
    }

    final class UrlRequestCallback implements UrlRequest.Callback {
        private volatile boolean a;
        final HttpEngineDataSource b;

        private UrlRequestCallback() {
            this.a = false;
        }

        UrlRequestCallback(androidx.media3.datasource.HttpEngineDataSource.1 httpEngineDataSource$10) {
        }

        public void a() {
            this.a = true;
        }

        @Override  // android.net.http.UrlRequest$Callback
        public void onCanceled(UrlRequest urlRequest0, @Nullable UrlResponseInfo urlResponseInfo0) {
            synchronized(this) {
            }
        }

        @Override  // android.net.http.UrlRequest$Callback
        public void onFailed(UrlRequest urlRequest0, @Nullable UrlResponseInfo urlResponseInfo0, HttpException httpException0) {
            synchronized(this) {
                if(this.a) {
                    return;
                }
                if(!B.a(httpException0) || ((NetworkException)httpException0).getErrorCode() != 1) {
                    HttpEngineDataSource.this.z = httpException0;
                }
                else {
                    UnknownHostException unknownHostException0 = new UnknownHostException();
                    HttpEngineDataSource.this.z = unknownHostException0;
                }
                HttpEngineDataSource.this.p.f();
            }
        }

        @Override  // android.net.http.UrlRequest$Callback
        public void onReadCompleted(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0, ByteBuffer byteBuffer0) {
            synchronized(this) {
                if(this.a) {
                    return;
                }
                HttpEngineDataSource.this.p.f();
            }
        }

        @Override  // android.net.http.UrlRequest$Callback
        public void onRedirectReceived(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0, String s) {
            UrlRequestWrapper httpEngineDataSource$UrlRequestWrapper0;
            synchronized(this) {
                if(this.a) {
                    return;
                }
                Object object0 = Assertions.g(HttpEngineDataSource.this.v);
                int v1 = urlResponseInfo0.getHttpStatusCode();
                if(((DataSpec)object0).c == 2 && (v1 == 307 || v1 == 308)) {
                    InvalidResponseCodeException httpDataSource$InvalidResponseCodeException0 = new InvalidResponseCodeException(v1, urlResponseInfo0.getHttpStatusText(), null, urlResponseInfo0.getHeaders().getAsMap(), ((DataSpec)object0), Util.f);
                    HttpEngineDataSource.this.z = httpDataSource$InvalidResponseCodeException0;
                    HttpEngineDataSource.this.p.f();
                    return;
                }
                if(HttpEngineDataSource.this.k) {
                    HttpEngineDataSource.this.X();
                }
                boolean z = HttpEngineDataSource.this.s && ((DataSpec)object0).c == 2 && v1 == 302;
                if(!z && !HttpEngineDataSource.this.l) {
                    urlRequest0.followRedirect();
                    return;
                }
                String s1 = HttpEngineDataSource.T(((List)urlResponseInfo0.getHeaders().getAsMap().get("Set-Cookie")));
                if(!z && TextUtils.isEmpty(s1)) {
                    urlRequest0.followRedirect();
                    return;
                }
                urlRequest0.cancel();
                DataSpec dataSpec0 = z || ((DataSpec)object0).c != 2 ? ((DataSpec)object0).i(Uri.parse(s)) : ((DataSpec)object0).a().k(s).e(1).d(null).a();
                if(!TextUtils.isEmpty(s1)) {
                    HashMap hashMap0 = new HashMap();
                    hashMap0.putAll(((DataSpec)object0).e);
                    hashMap0.put("Cookie", s1);
                    dataSpec0 = dataSpec0.a().f(hashMap0).a();
                }
                try {
                    httpEngineDataSource$UrlRequestWrapper0 = HttpEngineDataSource.this.N(dataSpec0);
                }
                catch(IOException iOException0) {
                    HttpEngineDataSource.this.z = iOException0;
                    return;
                }
                if(HttpEngineDataSource.this.w != null) {
                    HttpEngineDataSource.this.w.a();
                }
                HttpEngineDataSource.this.w = httpEngineDataSource$UrlRequestWrapper0;
                HttpEngineDataSource.this.w.e();
            }
        }

        @Override  // android.net.http.UrlRequest$Callback
        public void onResponseStarted(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0) {
            synchronized(this) {
                if(this.a) {
                    return;
                }
                HttpEngineDataSource.this.y = urlResponseInfo0;
                HttpEngineDataSource.this.p.f();
            }
        }

        @Override  // android.net.http.UrlRequest$Callback
        public void onSucceeded(UrlRequest urlRequest0, UrlResponseInfo urlResponseInfo0) {
            synchronized(this) {
                if(this.a) {
                    return;
                }
                HttpEngineDataSource.this.A = true;
                HttpEngineDataSource.this.p.f();
            }
        }
    }

    static final class UrlRequestWrapper {
        private final UrlRequest a;
        private final UrlRequestCallback b;

        UrlRequestWrapper(UrlRequest urlRequest0, UrlRequestCallback httpEngineDataSource$UrlRequestCallback0) {
            this.a = urlRequest0;
            this.b = httpEngineDataSource$UrlRequestCallback0;
        }

        public void a() {
            this.b.a();
            this.a.cancel();
        }

        public int b() throws InterruptedException {
            ConditionVariable conditionVariable0 = new ConditionVariable();
            int[] arr_v = new int[1];
            androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper.1 httpEngineDataSource$UrlRequestWrapper$10 = new UrlRequest.StatusListener() {
                final UrlRequestWrapper c;

                @Override  // android.net.http.UrlRequest$StatusListener
                public void onStatus(int v) {
                    arr_v[0] = v;
                    conditionVariable0.f();
                }
            };
            this.a.getStatus(httpEngineDataSource$UrlRequestWrapper$10);
            conditionVariable0.a();
            return arr_v[0];
        }

        public UrlRequest.Callback c() {
            return this.b;
        }

        public void d(ByteBuffer byteBuffer0) {
            this.a.read(byteBuffer0);
        }

        public void e() {
            this.a.start();
        }
    }

    private boolean A;
    private volatile long B;
    @UnstableApi
    public static final int C = 8000;
    @UnstableApi
    public static final int D = 8000;
    private static final int E = 0x8000;
    private final HttpEngine f;
    private final Executor g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final boolean l;
    @Nullable
    private final String m;
    @Nullable
    private final RequestProperties n;
    private final RequestProperties o;
    private final ConditionVariable p;
    private final Clock q;
    @Nullable
    private I r;
    private final boolean s;
    private boolean t;
    private long u;
    @Nullable
    private DataSpec v;
    @Nullable
    private UrlRequestWrapper w;
    @Nullable
    private ByteBuffer x;
    @Nullable
    private UrlResponseInfo y;
    @Nullable
    private IOException z;

    @UnstableApi
    HttpEngineDataSource(HttpEngine httpEngine0, Executor executor0, int v, int v1, int v2, boolean z, boolean z1, @Nullable String s, @Nullable RequestProperties httpDataSource$RequestProperties0, @Nullable I i0, boolean z2) {
        super(true);
        this.f = v.a(Assertions.g(httpEngine0));
        this.g = (Executor)Assertions.g(executor0);
        this.h = v;
        this.i = v1;
        this.j = v2;
        this.k = z;
        this.l = z1;
        this.m = s;
        this.n = httpDataSource$RequestProperties0;
        this.r = i0;
        this.s = z2;
        this.q = Clock.a;
        this.o = new RequestProperties();
        this.p = new ConditionVariable();
    }

    private boolean L() throws InterruptedException {
        long v = this.q.elapsedRealtime();
        boolean z = false;
        while(!z && v < this.B) {
            z = this.p.b(this.B - v + 5L);
            v = this.q.elapsedRealtime();
        }
        return z;
    }

    private UrlRequest.Builder M(DataSpec dataSpec0, UrlRequest.Callback urlRequest$Callback0) throws IOException {
        UrlRequest.Builder urlRequest$Builder0 = this.f.newUrlRequestBuilder(dataSpec0.a.toString(), this.g, urlRequest$Callback0).setPriority(this.h).setDirectExecutorAllowed(true);
        HashMap hashMap0 = new HashMap();
        RequestProperties httpDataSource$RequestProperties0 = this.n;
        if(httpDataSource$RequestProperties0 != null) {
            hashMap0.putAll(httpDataSource$RequestProperties0.c());
        }
        hashMap0.putAll(this.o.c());
        hashMap0.putAll(dataSpec0.e);
        for(Object object0: hashMap0.entrySet()) {
            urlRequest$Builder0.addHeader(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        if(dataSpec0.d != null && !hashMap0.containsKey("Content-Type")) {
            throw new OpenException("HTTP request with non-empty body must set Content-Type", dataSpec0, 1004, 0);
        }
        String s = HttpUtil.a(dataSpec0.g, dataSpec0.h);
        if(s != null) {
            urlRequest$Builder0.addHeader("Range", s);
        }
        String s1 = this.m;
        if(s1 != null) {
            urlRequest$Builder0.addHeader("User-Agent", s1);
        }
        urlRequest$Builder0.setHttpMethod(dataSpec0.b());
        if(dataSpec0.d != null) {
            urlRequest$Builder0.setUploadDataProvider(new ByteArrayUploadDataProvider(dataSpec0.d), this.g);
        }
        return urlRequest$Builder0;
    }

    private UrlRequestWrapper N(DataSpec dataSpec0) throws IOException {
        UrlRequestCallback httpEngineDataSource$UrlRequestCallback0 = new UrlRequestCallback(this, null);
        return new UrlRequestWrapper(this.M(dataSpec0, httpEngineDataSource$UrlRequestCallback0).build(), httpEngineDataSource$UrlRequestCallback0);
    }

    private static int O(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        int v = Math.min(byteBuffer0.remaining(), byteBuffer1.remaining());
        byteBuffer0.limit(byteBuffer0.position() + v);
        byteBuffer1.put(byteBuffer0);
        byteBuffer0.limit(byteBuffer0.limit());
        return v;
    }

    @Nullable
    @VisibleForTesting
    @UnstableApi
    UrlRequest.Callback P() {
        return this.w == null ? null : this.w.c();
    }

    @Nullable
    private static String Q(Map map0, String s) {
        List list0 = (List)map0.get(s);
        return list0 == null || list0.isEmpty() ? null : ((String)list0.get(0));
    }

    private ByteBuffer R() {
        if(this.x == null) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0x8000);
            this.x = byteBuffer0;
            byteBuffer0.limit(0);
        }
        return this.x;
    }

    private static boolean S(UrlResponseInfo urlResponseInfo0) {
        for(Object object0: urlResponseInfo0.getHeaders().getAsList()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((String)map$Entry0.getKey()).equalsIgnoreCase("Content-Encoding")) {
                return !((String)map$Entry0.getValue()).equalsIgnoreCase("identity");
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Nullable
    private static String T(@Nullable List list0) {
        return list0 == null || list0.isEmpty() ? null : TextUtils.join(";", list0);
    }

    @UnstableApi
    public int U(ByteBuffer byteBuffer0) throws HttpDataSourceException {
        boolean z = false;
        Assertions.i(this.t);
        if(!byteBuffer0.isDirect()) {
            throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
        }
        if(!byteBuffer0.hasRemaining()) {
            return 0;
        }
        if(this.u == 0L) {
            return -1;
        }
        int v = byteBuffer0.remaining();
        ByteBuffer byteBuffer1 = this.x;
        if(byteBuffer1 != null) {
            int v1 = HttpEngineDataSource.O(byteBuffer1, byteBuffer0);
            if(v1 != 0) {
                long v2 = this.u;
                if(v2 != -1L) {
                    this.u = v2 - ((long)v1);
                }
                this.u(v1);
                return v1;
            }
        }
        this.p.d();
        this.V(byteBuffer0, this.v);
        if(this.A) {
            this.u = 0L;
            return -1;
        }
        if(v > byteBuffer0.remaining()) {
            z = true;
        }
        Assertions.i(z);
        int v3 = v - byteBuffer0.remaining();
        long v4 = this.u;
        if(v4 != -1L) {
            this.u = v4 - ((long)v3);
        }
        this.u(v3);
        return v3;
    }

    private void V(ByteBuffer byteBuffer0, DataSpec dataSpec0) throws HttpDataSourceException {
        this.w.d(byteBuffer0);
        try {
            if(!this.p.b(((long)this.j))) {
                throw new SocketTimeoutException();
            }
        }
        catch(InterruptedException unused_ex) {
            if(byteBuffer0 == this.x) {
                this.x = null;
            }
            Thread.currentThread().interrupt();
            this.z = new InterruptedIOException();
        }
        catch(SocketTimeoutException socketTimeoutException0) {
            if(byteBuffer0 == this.x) {
                this.x = null;
            }
            this.z = new HttpDataSourceException(socketTimeoutException0, dataSpec0, 2002, 2);
        }
        IOException iOException0 = this.z;
        if(iOException0 != null) {
            throw iOException0 instanceof HttpDataSourceException ? ((HttpDataSourceException)iOException0) : HttpDataSourceException.c(iOException0, dataSpec0, 2);
        }
    }

    private byte[] W() throws IOException {
        byte[] arr_b = Util.f;
        ByteBuffer byteBuffer0 = this.R();
        while(!this.A) {
            this.p.d();
            byteBuffer0.clear();
            this.V(byteBuffer0, this.v);
            byteBuffer0.flip();
            if(byteBuffer0.remaining() > 0) {
                int v = arr_b.length;
                arr_b = Arrays.copyOf(arr_b, arr_b.length + byteBuffer0.remaining());
                byteBuffer0.get(arr_b, v, byteBuffer0.remaining());
            }
        }
        return arr_b;
    }

    private void X() {
        this.B = this.q.elapsedRealtime() + ((long)this.i);
    }

    private void Y(long v, DataSpec dataSpec0) throws HttpDataSourceException {
        if(v == 0L) {
            return;
        }
        ByteBuffer byteBuffer0 = this.R();
        while(v > 0L) {
            try {
                this.p.d();
                byteBuffer0.clear();
                this.V(byteBuffer0, dataSpec0);
                if(Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if(this.A) {
                    throw new OpenException(dataSpec0, 2008, 14);
                }
                byteBuffer0.flip();
                Assertions.i(byteBuffer0.hasRemaining());
                int v1 = (int)Math.min(byteBuffer0.remaining(), v);
                byteBuffer0.position(byteBuffer0.position() + v1);
                v -= (long)v1;
                continue;
            label_18:
                if(iOException0 instanceof HttpDataSourceException) {
                    throw (HttpDataSourceException)iOException0;
                }
                throw new OpenException(iOException0, dataSpec0, (iOException0 instanceof SocketTimeoutException ? 2002 : 2001), 14);
            }
            catch(IOException iOException0) {
                goto label_18;
            }
            throw new OpenException(iOException0, dataSpec0, (iOException0 instanceof SocketTimeoutException ? 2002 : 2001), 14);
        }
        return;
    }

    @Override  // androidx.media3.datasource.HttpDataSource, androidx.media3.datasource.DataSource
    @UnstableApi
    public long a(DataSpec dataSpec0) throws HttpDataSourceException {
        byte[] arr_b;
        UrlRequestWrapper httpEngineDataSource$UrlRequestWrapper0;
        Assertions.g(dataSpec0);
        Assertions.i(!this.t);
        this.p.d();
        this.X();
        this.v = dataSpec0;
        try {
            httpEngineDataSource$UrlRequestWrapper0 = this.N(dataSpec0);
            this.w = httpEngineDataSource$UrlRequestWrapper0;
        }
        catch(IOException iOException0) {
            if(iOException0 instanceof HttpDataSourceException) {
                throw (HttpDataSourceException)iOException0;
            }
            throw new OpenException(iOException0, dataSpec0, 2000, 0);
        }
        httpEngineDataSource$UrlRequestWrapper0.e();
        this.w(dataSpec0);
        try {
            boolean z = this.L();
            IOException iOException1 = this.z;
            if(iOException1 != null) {
                String s = iOException1.getMessage();
                if(!(s == null || !c.g(s).contains("err_cleartext_not_permitted"))) {
                    throw new CleartextNotPermittedException(iOException1, dataSpec0);
                }
                throw new OpenException(iOException1, dataSpec0, 2001, httpEngineDataSource$UrlRequestWrapper0.b());
            }
        }
        catch(InterruptedException unused_ex) {
            goto label_64;
        }
        if(z) {
            UrlResponseInfo urlResponseInfo0 = q.a(Assertions.g(this.y));
            int v = urlResponseInfo0.getHttpStatusCode();
            Map map0 = urlResponseInfo0.getHeaders().getAsMap();
            long v1 = 0L;
            long v2 = -1L;
            if(v >= 200 && v <= 299) {
                I i0 = this.r;
                if(i0 != null) {
                    String s1 = HttpEngineDataSource.Q(map0, "Content-Type");
                    if(s1 != null && !i0.apply(s1)) {
                        throw new InvalidContentTypeException(s1, dataSpec0);
                    }
                }
                if(v == 200) {
                    long v3 = dataSpec0.g;
                    if(v3 != 0L) {
                        v1 = v3;
                    }
                }
                if(HttpEngineDataSource.S(urlResponseInfo0)) {
                    this.u = dataSpec0.h;
                }
                else {
                    long v4 = dataSpec0.h;
                    if(v4 == -1L) {
                        long v5 = HttpUtil.b(HttpEngineDataSource.Q(map0, "Content-Length"), HttpEngineDataSource.Q(map0, "Content-Range"));
                        if(v5 != -1L) {
                            v2 = v5 - v1;
                        }
                        this.u = v2;
                    }
                    else {
                        this.u = v4;
                    }
                }
                this.t = true;
                this.x(dataSpec0);
                this.Y(v1, dataSpec0);
                return this.u;
            }
            if(v == 0x1A0) {
                long v6 = HttpUtil.c(HttpEngineDataSource.Q(map0, "Content-Range"));
                if(dataSpec0.g == v6) {
                    this.t = true;
                    this.x(dataSpec0);
                    return dataSpec0.h == -1L ? 0L : dataSpec0.h;
                }
            }
            try {
                arr_b = this.W();
            }
            catch(IOException unused_ex) {
                arr_b = Util.f;
            }
            DataSourceException dataSourceException0 = v == 0x1A0 ? new DataSourceException(2008) : null;
            throw new InvalidResponseCodeException(v, urlResponseInfo0.getHttpStatusText(), dataSourceException0, map0, dataSpec0, arr_b);
        }
        try {
            throw new OpenException(new SocketTimeoutException(), dataSpec0, 2002, httpEngineDataSource$UrlRequestWrapper0.b());
        }
        catch(InterruptedException unused_ex) {
        label_64:
            Thread.currentThread().interrupt();
            throw new OpenException(new InterruptedIOException(), dataSpec0, 1004, -1);
        }
    }

    @Override  // androidx.media3.datasource.BaseDataSource, androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public Map b() {
        return this.y == null ? Collections.emptyMap() : this.y.getHeaders().getAsMap();
    }

    @Override  // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri c() {
        return this.y == null ? null : Uri.parse(this.y.getUrl());
    }

    @Override  // androidx.media3.datasource.HttpDataSource, androidx.media3.datasource.DataSource
    @UnstableApi
    public void close() {
        synchronized(this) {
            UrlRequestWrapper httpEngineDataSource$UrlRequestWrapper0 = this.w;
            if(httpEngineDataSource$UrlRequestWrapper0 != null) {
                httpEngineDataSource$UrlRequestWrapper0.a();
                this.w = null;
            }
            ByteBuffer byteBuffer0 = this.x;
            if(byteBuffer0 != null) {
                byteBuffer0.limit(0);
            }
            this.v = null;
            this.y = null;
            this.z = null;
            this.A = false;
            if(this.t) {
                this.t = false;
                this.v();
            }
        }
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int f() {
        return this.y == null || this.y.getHttpStatusCode() <= 0 ? -1 : this.y.getHttpStatusCode();
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void j() {
        this.o.a();
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void m(String s, String s1) {
        this.o.e(s, s1);
    }

    @Override  // androidx.media3.datasource.HttpDataSource, androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] arr_b, int v, int v1) throws HttpDataSourceException {
        Assertions.i(this.t);
        if(v1 == 0) {
            return 0;
        }
        if(this.u == 0L) {
            return -1;
        }
        ByteBuffer byteBuffer0 = this.R();
        if(!byteBuffer0.hasRemaining()) {
            this.p.d();
            byteBuffer0.clear();
            this.V(byteBuffer0, this.v);
            if(this.A) {
                this.u = 0L;
                return -1;
            }
            byteBuffer0.flip();
            Assertions.i(byteBuffer0.hasRemaining());
        }
        int v2 = (int)n.u(new long[]{(this.u == -1L ? 0x7FFFFFFFFFFFFFFFL : this.u), ((long)byteBuffer0.remaining()), ((long)v1)});
        byteBuffer0.get(arr_b, v, v2);
        long v3 = this.u;
        if(v3 != -1L) {
            this.u = v3 - ((long)v2);
        }
        this.u(v2);
        return v2;
    }

    @Override  // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void t(String s) {
        this.o.d(s);
    }

    class androidx.media3.datasource.HttpEngineDataSource.1 {
    }

}

