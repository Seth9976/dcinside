package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.c0;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okhttp3.internal.cache.DiskLruCache.Snapshot;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Z;
import okio.m0;
import okio.n;
import okio.o.a;
import okio.o0;
import okio.o;
import okio.x;
import okio.y;
import y4.l;
import y4.m;
import z3.i;

public final class Cache implements Closeable, Flushable {
    static final class CacheResponseBody extends ResponseBody {
        @l
        private final n bodySource;
        @m
        private final String contentLength;
        @m
        private final String contentType;
        @l
        private final Snapshot snapshot;

        public CacheResponseBody(@l Snapshot diskLruCache$Snapshot0, @m String s, @m String s1) {
            L.p(diskLruCache$Snapshot0, "snapshot");
            super();
            this.snapshot = diskLruCache$Snapshot0;
            this.contentType = s;
            this.contentLength = s1;
            this.bodySource = Z.e(new y(this) {
                @Override  // okio.y
                public void close() throws IOException {
                    CacheResponseBody.this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override  // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength == null ? -1L : Util.toLongOrDefault(this.contentLength, -1L);
        }

        @Override  // okhttp3.ResponseBody
        @m
        public MediaType contentType() {
            return this.contentType == null ? null : MediaType.Companion.parse(this.contentType);
        }

        @l
        public final Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override  // okhttp3.ResponseBody
        @l
        public n source() {
            return this.bodySource;
        }
    }

    @s0({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final boolean hasVaryAll(@l Response response0) {
            L.p(response0, "<this>");
            return this.varyFields(response0.headers()).contains("*");
        }

        @l
        @z3.n
        public final String key(@l HttpUrl httpUrl0) {
            L.p(httpUrl0, "url");
            return o.d.l(httpUrl0.toString()).S().z();
        }

        public final int readInt$okhttp(@l n n0) throws IOException {
            L.p(n0, "source");
            try {
                long v = n0.o3();
                String s = n0.M2();
                if(v < 0L || v > 0x7FFFFFFFL || s.length() > 0) {
                    throw new IOException("expected an int but was \"" + v + s + '\"');
                }
                return (int)v;
            }
            catch(NumberFormatException numberFormatException0) {
            }
            throw new IOException(numberFormatException0.getMessage());
        }

        private final Set varyFields(Headers headers0) {
            int v = headers0.size();
            Set set0 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                if(v.O1("Vary", headers0.name(v1), true)) {
                    String s = headers0.value(v1);
                    if(set0 == null) {
                        set0 = new TreeSet(v.U1(u0.a));
                    }
                    for(Object object0: v.U4(s, new char[]{','}, false, 0, 6, null)) {
                        set0.add(v.G5(((String)object0)).toString());
                    }
                }
            }
            return set0 == null ? k0.k() : set0;
        }

        private final Headers varyHeaders(Headers headers0, Headers headers1) {
            Set set0 = this.varyFields(headers1);
            if(set0.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Builder headers$Builder0 = new Builder();
            int v = headers0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = headers0.name(v1);
                if(set0.contains(s)) {
                    headers$Builder0.add(s, headers0.value(v1));
                }
            }
            return headers$Builder0.build();
        }

        @l
        public final Headers varyHeaders(@l Response response0) {
            L.p(response0, "<this>");
            Response response1 = response0.networkResponse();
            L.m(response1);
            return this.varyHeaders(response1.request().headers(), response0.headers());
        }

        public final boolean varyMatches(@l Response response0, @l Headers headers0, @l Request request0) {
            L.p(response0, "cachedResponse");
            L.p(headers0, "cachedRequest");
            L.p(request0, "newRequest");
            Set set0 = this.varyFields(response0.headers());
            if(!(set0 instanceof Collection) || !set0.isEmpty()) {
                for(Object object0: set0) {
                    if(!L.g(headers0.values(((String)object0)), request0.headers(((String)object0)))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
    }

    static final class Entry {
        public static final class okhttp3.Cache.Entry.Companion {
            private okhttp3.Cache.Entry.Companion() {
            }

            public okhttp3.Cache.Entry.Companion(w w0) {
            }
        }

        @l
        public static final okhttp3.Cache.Entry.Companion Companion;
        @l
        private static final String RECEIVED_MILLIS;
        @l
        private static final String SENT_MILLIS;
        private final int code;
        @m
        private final Handshake handshake;
        @l
        private final String message;
        @l
        private final Protocol protocol;
        private final long receivedResponseMillis;
        @l
        private final String requestMethod;
        @l
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        @l
        private final HttpUrl url;
        @l
        private final Headers varyHeaders;

        // 去混淆评级： 低(20)
        static {
            Entry.Companion = new okhttp3.Cache.Entry.Companion(null);
            Entry.SENT_MILLIS = "OkHttp-Sent-Millis";
            Entry.RECEIVED_MILLIS = "OkHttp-Received-Millis";
        }

        public Entry(@l Response response0) {
            L.p(response0, "response");
            super();
            this.url = response0.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response0);
            this.requestMethod = response0.request().method();
            this.protocol = response0.protocol();
            this.code = response0.code();
            this.message = response0.message();
            this.responseHeaders = response0.headers();
            this.handshake = response0.handshake();
            this.sentRequestMillis = response0.sentRequestAtMillis();
            this.receivedResponseMillis = response0.receivedResponseAtMillis();
        }

        public Entry(@l o0 o00) throws IOException {
            L.p(o00, "rawSource");
            TlsVersion tlsVersion0;
            super();
            try {
                n n0 = Z.e(o00);
                String s = n0.M2();
                HttpUrl httpUrl0 = HttpUrl.Companion.parse(s);
                if(httpUrl0 == null) {
                    IOException iOException0 = new IOException("Cache corruption for " + s);
                    Platform.Companion.get().log("cache corruption", 5, iOException0);
                    throw iOException0;
                }
                this.url = httpUrl0;
                this.requestMethod = n0.M2();
                Builder headers$Builder0 = new Builder();
                int v = Cache.Companion.readInt$okhttp(n0);
                for(int v2 = 0; v2 < v; ++v2) {
                    headers$Builder0.addLenient$okhttp(n0.M2());
                }
                this.varyHeaders = headers$Builder0.build();
                String s1 = n0.M2();
                StatusLine statusLine0 = StatusLine.Companion.parse(s1);
                this.protocol = statusLine0.protocol;
                this.code = statusLine0.code;
                this.message = statusLine0.message;
                Builder headers$Builder1 = new Builder();
                int v3 = Cache.Companion.readInt$okhttp(n0);
                for(int v1 = 0; v1 < v3; ++v1) {
                    headers$Builder1.addLenient$okhttp(n0.M2());
                }
                String s2 = headers$Builder1.get(Entry.SENT_MILLIS);
                String s3 = headers$Builder1.get(Entry.RECEIVED_MILLIS);
                headers$Builder1.removeAll(Entry.SENT_MILLIS);
                headers$Builder1.removeAll(Entry.RECEIVED_MILLIS);
                long v4 = 0L;
                this.sentRequestMillis = s2 == null ? 0L : Long.parseLong(s2);
                if(s3 != null) {
                    v4 = Long.parseLong(s3);
                }
                this.receivedResponseMillis = v4;
                this.responseHeaders = headers$Builder1.build();
                if(this.isHttps()) {
                    String s4 = n0.M2();
                    if(s4.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + s4 + '\"');
                    }
                    String s5 = n0.M2();
                    CipherSuite cipherSuite0 = CipherSuite.Companion.forJavaName(s5);
                    List list0 = this.readCertificateList(n0);
                    List list1 = this.readCertificateList(n0);
                    if(n0.j3()) {
                        tlsVersion0 = TlsVersion.SSL_3_0;
                    }
                    else {
                        String s6 = n0.M2();
                        tlsVersion0 = TlsVersion.Companion.forJavaName(s6);
                    }
                    this.handshake = Handshake.Companion.get(tlsVersion0, cipherSuite0, list0, list1);
                }
                else {
                    this.handshake = null;
                }
                goto label_63;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(o00, throwable0);
                throw throwable1;
            }
        label_63:
            c.a(o00, null);
        }

        private final boolean isHttps() {
            return L.g(this.url.scheme(), "https");
        }

        public final boolean matches(@l Request request0, @l Response response0) {
            L.p(request0, "request");
            L.p(response0, "response");
            return L.g(this.url, request0.url()) && L.g(this.requestMethod, request0.method()) && Cache.Companion.varyMatches(response0, this.varyHeaders, request0);
        }

        private final List readCertificateList(n n0) throws IOException {
            int v = Cache.Companion.readInt$okhttp(n0);
            if(v == -1) {
                return u.H();
            }
            try {
                CertificateFactory certificateFactory0 = CertificateFactory.getInstance("X.509");
                List list0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    String s = n0.M2();
                    okio.l l0 = new okio.l();
                    o o0 = o.d.h(s);
                    if(o0 == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    l0.t1(o0);
                    ((ArrayList)list0).add(certificateFactory0.generateCertificate(l0.J()));
                }
                return list0;
            }
            catch(CertificateException certificateException0) {
            }
            throw new IOException(certificateException0.getMessage());
        }

        @l
        public final Response response(@l Snapshot diskLruCache$Snapshot0) {
            L.p(diskLruCache$Snapshot0, "snapshot");
            String s = this.responseHeaders.get("Content-Type");
            String s1 = this.responseHeaders.get("Content-Length");
            Request request0 = new okhttp3.Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build();
            return new okhttp3.Response.Builder().request(request0).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(diskLruCache$Snapshot0, s, s1)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        private final void writeCertList(okio.m m0, List list0) throws IOException {
            try {
                m0.v0(((long)list0.size())).writeByte(10);
                for(Object object0: list0) {
                    byte[] arr_b = ((Certificate)object0).getEncoded();
                    L.o(arr_b, "bytes");
                    m0.D2(a.p(o.d, arr_b, 0, 0, 3, null).d()).writeByte(10);
                }
            }
            catch(CertificateEncodingException certificateEncodingException0) {
                throw new IOException(certificateEncodingException0.getMessage());
            }
        }

        public final void writeTo(@l Editor diskLruCache$Editor0) throws IOException {
            L.p(diskLruCache$Editor0, "editor");
            okio.m m0 = Z.d(diskLruCache$Editor0.newSink(0));
            try {
                m0.D2(this.url.toString()).writeByte(10);
                m0.D2(this.requestMethod).writeByte(10);
                m0.v0(((long)this.varyHeaders.size())).writeByte(10);
                int v1 = this.varyHeaders.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    m0.D2(this.varyHeaders.name(v2)).D2(": ").D2(this.varyHeaders.value(v2)).writeByte(10);
                }
                m0.D2(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                m0.v0(((long)(this.responseHeaders.size() + 2))).writeByte(10);
                int v3 = this.responseHeaders.size();
                for(int v = 0; v < v3; ++v) {
                    m0.D2(this.responseHeaders.name(v)).D2(": ").D2(this.responseHeaders.value(v)).writeByte(10);
                }
                m0.D2(Entry.SENT_MILLIS).D2(": ").v0(this.sentRequestMillis).writeByte(10);
                m0.D2(Entry.RECEIVED_MILLIS).D2(": ").v0(this.receivedResponseMillis).writeByte(10);
                if(this.isHttps()) {
                    m0.writeByte(10);
                    L.m(this.handshake);
                    m0.D2(this.handshake.cipherSuite().javaName()).writeByte(10);
                    this.writeCertList(m0, this.handshake.peerCertificates());
                    this.writeCertList(m0, this.handshake.localCertificates());
                    m0.D2(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                goto label_34;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(m0, throwable0);
                throw throwable1;
            }
        label_34:
            c.a(m0, null);
        }
    }

    final class RealCacheRequest implements CacheRequest {
        @l
        private final m0 body;
        @l
        private final m0 cacheOut;
        private boolean done;
        @l
        private final Editor editor;

        public RealCacheRequest(@l Editor diskLruCache$Editor0) {
            L.p(diskLruCache$Editor0, "editor");
            Cache.this = cache0;
            super();
            this.editor = diskLruCache$Editor0;
            m0 m00 = diskLruCache$Editor0.newSink(1);
            this.cacheOut = m00;
            this.body = new x(/*ERROR_MISSING_ARG_2/*) {
                @Override  // okio.x
                public void close() throws IOException {
                    Cache cache0 = this;
                    RealCacheRequest cache$RealCacheRequest0 = m00;
                    synchronized(cache0) {
                        if(cache$RealCacheRequest0.getDone()) {
                            return;
                        }
                        cache$RealCacheRequest0.setDone(true);
                        cache0.setWriteSuccessCount$okhttp(cache0.getWriteSuccessCount$okhttp() + 1);
                    }
                    super.close();
                    m00.editor.commit();
                }
            };
        }

        @Override  // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache0 = Cache.this;
            synchronized(cache0) {
                if(this.done) {
                    return;
                }
                this.done = true;
                cache0.setWriteAbortCount$okhttp(cache0.getWriteAbortCount$okhttp() + 1);
            }
            Util.closeQuietly(this.cacheOut);
            try {
                this.editor.abort();
            }
            catch(IOException unused_ex) {
            }
        }

        @Override  // okhttp3.internal.cache.CacheRequest
        @l
        public m0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    @l
    public static final Companion Companion = null;
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    @l
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    @k(level = kotlin.m.b, message = "moved to val", replaceWith = @c0(expression = "directory", imports = {}))
    @l
    @i(name = "-deprecated_directory")
    public final File -deprecated_directory() {
        return this.cache.getDirectory();
    }

    static {
        Cache.Companion = new Companion(null);
    }

    public Cache(@l File file0, long v) {
        L.p(file0, "directory");
        this(file0, v, FileSystem.SYSTEM);
    }

    public Cache(@l File file0, long v, @l FileSystem fileSystem0) {
        L.p(file0, "directory");
        L.p(fileSystem0, "fileSystem");
        super();
        this.cache = new DiskLruCache(fileSystem0, file0, 201105, 2, v, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(Editor diskLruCache$Editor0) {
        if(diskLruCache$Editor0 != null) {
            try {
                diskLruCache$Editor0.abort();
            }
            catch(IOException unused_ex) {
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    @l
    @i(name = "directory")
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override
    public void flush() throws IOException {
        this.cache.flush();
    }

    @m
    public final Response get$okhttp(@l Request request0) {
        Entry cache$Entry0;
        Snapshot diskLruCache$Snapshot0;
        L.p(request0, "request");
        String s = Cache.Companion.key(request0.url());
        try {
            diskLruCache$Snapshot0 = this.cache.get(s);
            if(diskLruCache$Snapshot0 == null) {
                return null;
            }
            goto label_5;
        }
        catch(IOException unused_ex) {
        }
        return null;
        try {
        label_5:
            cache$Entry0 = new Entry(diskLruCache$Snapshot0.getSource(0));
        }
        catch(IOException unused_ex) {
            Util.closeQuietly(diskLruCache$Snapshot0);
            return null;
        }
        Response response0 = cache$Entry0.response(diskLruCache$Snapshot0);
        if(!cache$Entry0.matches(request0, response0)) {
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 != null) {
                Util.closeQuietly(responseBody0);
            }
            return null;
        }
        return response0;
    }

    @l
    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final int hitCount() {
        synchronized(this) {
        }
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    @l
    @z3.n
    public static final String key(@l HttpUrl httpUrl0) {
        return Cache.Companion.key(httpUrl0);
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final int networkCount() {
        synchronized(this) {
        }
        return this.networkCount;
    }

    @m
    public final CacheRequest put$okhttp(@l Response response0) {
        Editor diskLruCache$Editor0;
        L.p(response0, "response");
        String s = response0.request().method();
        if(HttpMethod.INSTANCE.invalidatesCache(response0.request().method())) {
            try {
                this.remove$okhttp(response0.request());
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        if(!L.g(s, "GET")) {
            return null;
        }
        Companion cache$Companion0 = Cache.Companion;
        if(cache$Companion0.hasVaryAll(response0)) {
            return null;
        }
        Entry cache$Entry0 = new Entry(response0);
        try {
            String s1 = cache$Companion0.key(response0.request().url());
            diskLruCache$Editor0 = null;
            diskLruCache$Editor0 = DiskLruCache.edit$default(this.cache, s1, 0L, 2, null);
            if(diskLruCache$Editor0 != null) {
                cache$Entry0.writeTo(diskLruCache$Editor0);
                return new RealCacheRequest(this, diskLruCache$Editor0);
            }
        }
        catch(IOException unused_ex) {
            this.abortQuietly(diskLruCache$Editor0);
        }
        return null;
    }

    public final void remove$okhttp(@l Request request0) throws IOException {
        L.p(request0, "request");
        String s = Cache.Companion.key(request0.url());
        this.cache.remove(s);
    }

    public final int requestCount() {
        synchronized(this) {
        }
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int v) {
        this.writeAbortCount = v;
    }

    public final void setWriteSuccessCount$okhttp(int v) {
        this.writeSuccessCount = v;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final void trackConditionalCacheHit$okhttp() {
        synchronized(this) {
            ++this.hitCount;
        }
    }

    public final void trackResponse$okhttp(@l CacheStrategy cacheStrategy0) {
        synchronized(this) {
            L.p(cacheStrategy0, "cacheStrategy");
            ++this.requestCount;
            if(cacheStrategy0.getNetworkRequest() != null) {
                ++this.networkCount;
            }
            else if(cacheStrategy0.getCacheResponse() != null) {
                ++this.hitCount;
            }
        }
    }

    public final void update$okhttp(@l Response response0, @l Response response1) {
        Editor diskLruCache$Editor0;
        L.p(response0, "cached");
        L.p(response1, "network");
        Entry cache$Entry0 = new Entry(response1);
        ResponseBody responseBody0 = response0.body();
        L.n(responseBody0, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        Snapshot diskLruCache$Snapshot0 = ((CacheResponseBody)responseBody0).getSnapshot();
        try {
            diskLruCache$Editor0 = null;
            diskLruCache$Editor0 = diskLruCache$Snapshot0.edit();
            if(diskLruCache$Editor0 != null) {
                cache$Entry0.writeTo(diskLruCache$Editor0);
                diskLruCache$Editor0.commit();
            }
        }
        catch(IOException unused_ex) {
            this.abortQuietly(diskLruCache$Editor0);
        }
    }

    @l
    public final Iterator urls() throws IOException {
        return new Object() {
            private boolean canRemove;
            @l
            private final Iterator delegate;
            @m
            private String nextUrl;

            {
                this.delegate = cache0.getCache$okhttp().snapshots();
            }

            @Override
            public boolean hasNext() {
                if(this.nextUrl != null) {
                    return true;
                }
                this.canRemove = false;
                while(this.delegate.hasNext()) {
                    try {
                        Object object0 = this.delegate.next();
                        Closeable closeable0 = (Closeable)object0;
                        try {
                            this.nextUrl = Z.e(((Snapshot)closeable0).getSource(0)).M2();
                        }
                        catch(Throwable throwable0) {
                            c.a(closeable0, throwable0);
                            throw throwable0;
                        }
                        c.a(closeable0, null);
                        return true;
                    }
                    catch(IOException unused_ex) {
                    }
                }
                return false;
            }

            @Override
            public Object next() {
                return this.next();
            }

            @l
            public String next() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                String s = this.nextUrl;
                L.m(s);
                this.nextUrl = null;
                this.canRemove = true;
                return s;
            }

            @Override
            public void remove() {
                if(!this.canRemove) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.delegate.remove();
            }
        };
    }

    public final int writeAbortCount() {
        synchronized(this) {
        }
        return this.writeAbortCount;
    }

    public final int writeSuccessCount() {
        synchronized(this) {
        }
        return this.writeSuccessCount;
    }
}

