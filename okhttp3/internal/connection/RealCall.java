package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.o;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.CallServerInterceptor;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;
import okio.j;
import okio.q0;
import y4.l;
import y4.m;

@s0({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,551:1\n1#2:552\n608#3,4:553\n615#3,4:557\n615#3,4:561\n608#3,4:565\n350#4,7:569\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall\n*L\n269#1:553,4\n344#1:557,4\n348#1:561,4\n375#1:565,4\n378#1:569,7\n*E\n"})
public final class RealCall implements Call {
    @s0({"SMAP\nRealCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,551:1\n615#2,4:552\n409#2,9:556\n*S KotlinDebug\n*F\n+ 1 RealCall.kt\nokhttp3/internal/connection/RealCall$AsyncCall\n*L\n494#1:552,4\n513#1:556,9\n*E\n"})
    public final class AsyncCall implements Runnable {
        @l
        private volatile AtomicInteger callsPerHost;
        @l
        private final Callback responseCallback;

        public AsyncCall(@l Callback callback0) {
            L.p(callback0, "responseCallback");
            RealCall.this = realCall0;
            super();
            this.responseCallback = callback0;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void executeOn(@l ExecutorService executorService0) {
            L.p(executorService0, "executorService");
            Dispatcher dispatcher0 = RealCall.this.getClient().dispatcher();
            if(Util.assertionsEnabled && Thread.holdsLock(dispatcher0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12488 MUST NOT hold lock on " + dispatcher0);
            }
            try {
                executorService0.execute(this);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                InterruptedIOException interruptedIOException0 = new InterruptedIOException("executor rejected");
                interruptedIOException0.initCause(rejectedExecutionException0);
                RealCall.this.noMoreExchanges$okhttp(interruptedIOException0);
                this.responseCallback.onFailure(RealCall.this, interruptedIOException0);
            }
            finally {
                RealCall.this.getClient().dispatcher().finished$okhttp(this);
            }
        }

        @l
        public final RealCall getCall() {
            return RealCall.this;
        }

        @l
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        @l
        public final String getHost() {
            return RealCall.this.getOriginalRequest().url().host();
        }

        @l
        public final Request getRequest() {
            return RealCall.this.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(@l AsyncCall realCall$AsyncCall0) {
            L.p(realCall$AsyncCall0, "other");
            this.callsPerHost = realCall$AsyncCall0.callsPerHost;
        }

        @Override
        public void run() {
            Throwable throwable2;
            IOException iOException1;
            boolean z;
            Response response0;
            RealCall realCall0 = RealCall.this;
            Thread thread0 = Thread.currentThread();
            thread0.setName("OkHttp " + RealCall.this.redactedUrl$okhttp());
            try {
                realCall0.timeout.enter();
                try {
                    response0 = realCall0.getResponseWithInterceptorChain$okhttp();
                    z = true;
                }
                catch(IOException iOException0) {
                    try {
                        iOException1 = iOException0;
                        z = false;
                        goto label_19;
                    }
                    catch(Throwable throwable1) {
                        realCall0.getClient().dispatcher().finished$okhttp(this);
                        throw throwable1;
                    }
                }
                catch(Throwable throwable0) {
                    throwable2 = throwable0;
                    z = false;
                    goto label_25;
                }
                try {
                    this.responseCallback.onResponse(realCall0, response0);
                    goto label_35;
                }
                catch(IOException iOException1) {
                }
                catch(Throwable throwable2) {
                    goto label_25;
                }
                try {
                label_19:
                    if(z) {
                        Platform.Companion.get().log("Callback failure for " + realCall0.toLoggableString(), 4, iOException1);
                    }
                    else {
                        this.responseCallback.onFailure(realCall0, iOException1);
                        goto label_35;
                    label_25:
                        realCall0.cancel();
                        if(!z) {
                            IOException iOException2 = new IOException("canceled due to " + throwable2);
                            o.a(iOException2, throwable2);
                            this.responseCallback.onFailure(realCall0, iOException2);
                        }
                        throw throwable2;
                    }
                }
                catch(Throwable throwable1) {
                    realCall0.getClient().dispatcher().finished$okhttp(this);
                    throw throwable1;
                }
            label_35:
                realCall0.getClient().dispatcher().finished$okhttp(this);
            }
            finally {
                thread0.setName("jeb-dexdec-sb-st-12455");
            }
        }
    }

    public static final class CallReference extends WeakReference {
        @m
        private final Object callStackTrace;

        public CallReference(@l RealCall realCall0, @m Object object0) {
            L.p(realCall0, "referent");
            super(realCall0);
            this.callStackTrace = object0;
        }

        @m
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    @m
    private Object callStackTrace;
    private volatile boolean canceled;
    @l
    private final OkHttpClient client;
    @m
    private RealConnection connection;
    @l
    private final RealConnectionPool connectionPool;
    @m
    private volatile RealConnection connectionToCancel;
    @l
    private final EventListener eventListener;
    @m
    private volatile Exchange exchange;
    @m
    private ExchangeFinder exchangeFinder;
    @l
    private final AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    @m
    private Exchange interceptorScopedExchange;
    @l
    private final Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    @l
    private final okhttp3.internal.connection.RealCall.timeout.1 timeout;
    private boolean timeoutEarlyExit;

    public RealCall(@l OkHttpClient okHttpClient0, @l Request request0, boolean z) {
        L.p(okHttpClient0, "client");
        L.p(request0, "originalRequest");
        super();
        this.client = okHttpClient0;
        this.originalRequest = request0;
        this.forWebSocket = z;
        this.connectionPool = okHttpClient0.connectionPool().getDelegate$okhttp();
        this.eventListener = okHttpClient0.eventListenerFactory().create(this);
        okhttp3.internal.connection.RealCall.timeout.1 realCall$timeout$10 = new j() {
            @Override  // okio.j
            protected void timedOut() {
                RealCall.this.cancel();
            }
        };
        realCall$timeout$10.timeout(((long)okHttpClient0.callTimeoutMillis()), TimeUnit.MILLISECONDS);
        this.timeout = realCall$timeout$10;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    public final void acquireConnectionNoEvents(@l RealConnection realConnection0) {
        L.p(realConnection0, "connection");
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12451 MUST hold lock on " + realConnection0);
        }
        if(this.connection != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.connection = realConnection0;
        realConnection0.getCalls().add(new CallReference(this, this.callStackTrace));
    }

    private final IOException callDone(IOException iOException0) {
        Socket socket0;
        boolean z = Util.assertionsEnabled;
        if(z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12426 MUST NOT hold lock on " + this);
        }
        RealConnection realConnection0 = this.connection;
        if(realConnection0 != null) {
            if(z && Thread.holdsLock(realConnection0)) {
                throw new AssertionError("Thread jeb-dexdec-sb-st-12426 MUST NOT hold lock on " + realConnection0);
            }
            synchronized(realConnection0) {
                socket0 = this.releaseConnectionNoEvents$okhttp();
            }
            if(this.connection == null) {
                if(socket0 != null) {
                    Util.closeQuietly(socket0);
                }
                this.eventListener.connectionReleased(this, realConnection0);
            }
            else if(socket0 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOException1 = this.timeoutExit(iOException0);
        if(iOException0 != null) {
            L.m(iOException1);
            this.eventListener.callFailed(this, iOException1);
            return iOException1;
        }
        this.eventListener.callEnd(this);
        return iOException1;
    }

    private final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this);
    }

    @Override  // okhttp3.Call
    public void cancel() {
        if(this.canceled) {
            return;
        }
        this.canceled = true;
        Exchange exchange0 = this.exchange;
        if(exchange0 != null) {
            exchange0.cancel();
        }
        RealConnection realConnection0 = this.connectionToCancel;
        if(realConnection0 != null) {
            realConnection0.cancel();
        }
        this.eventListener.canceled(this);
    }

    @Override
    public Object clone() {
        return this.clone();
    }

    @Override  // okhttp3.Call
    public Call clone() {
        return this.clone();
    }

    @l
    public RealCall clone() {
        return new RealCall(this.client, this.originalRequest, this.forWebSocket);
    }

    private final Address createAddress(HttpUrl httpUrl0) {
        if(httpUrl0.isHttps()) {
            SSLSocketFactory sSLSocketFactory0 = this.client.sslSocketFactory();
            return new Address(httpUrl0.host(), httpUrl0.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory0, this.client.hostnameVerifier(), this.client.certificatePinner(), this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
        }
        return new Address(httpUrl0.host(), httpUrl0.port(), this.client.dns(), this.client.socketFactory(), null, null, null, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    @Override  // okhttp3.Call
    public void enqueue(@l Callback callback0) {
        L.p(callback0, "responseCallback");
        if(!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.callStart();
        AsyncCall realCall$AsyncCall0 = new AsyncCall(this, callback0);
        this.client.dispatcher().enqueue$okhttp(realCall$AsyncCall0);
    }

    public final void enterNetworkInterceptorExchange(@l Request request0, boolean z) {
        L.p(request0, "request");
        if(this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized(this) {
            if(!this.responseBodyOpen) {
                if(this.requestBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
                if(z) {
                    Address address0 = this.createAddress(request0.url());
                    this.exchangeFinder = new ExchangeFinder(this.connectionPool, address0, this, this.eventListener);
                }
                return;
            }
        }
        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
    }

    @Override  // okhttp3.Call
    @l
    public Response execute() {
        if(this.executed.compareAndSet(false, true)) {
            this.timeout.enter();
            this.callStart();
            try {
                this.client.dispatcher().executed$okhttp(this);
                return this.getResponseWithInterceptorChain$okhttp();
            }
            finally {
                this.client.dispatcher().finished$okhttp(this);
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean z) {
        synchronized(this) {
            if(this.expectMoreExchanges) {
                if(z) {
                    Exchange exchange0 = this.exchange;
                    if(exchange0 != null) {
                        exchange0.detachWithViolence();
                    }
                }
                this.interceptorScopedExchange = null;
                return;
            }
        }
        throw new IllegalStateException("released");
    }

    @l
    public final OkHttpClient getClient() {
        return this.client;
    }

    @m
    public final RealConnection getConnection() {
        return this.connection;
    }

    @m
    public final RealConnection getConnectionToCancel() {
        return this.connectionToCancel;
    }

    @l
    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    @m
    public final Exchange getInterceptorScopedExchange$okhttp() {
        return this.interceptorScopedExchange;
    }

    @l
    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    @l
    public final Response getResponseWithInterceptorChain$okhttp() throws IOException {
        Response response0;
        ArrayList arrayList0 = new ArrayList();
        u.q0(arrayList0, this.client.interceptors());
        arrayList0.add(new RetryAndFollowUpInterceptor(this.client));
        arrayList0.add(new BridgeInterceptor(this.client.cookieJar()));
        arrayList0.add(new CacheInterceptor(this.client.cache()));
        arrayList0.add(ConnectInterceptor.INSTANCE);
        if(!this.forWebSocket) {
            u.q0(arrayList0, this.client.networkInterceptors());
        }
        arrayList0.add(new CallServerInterceptor(this.forWebSocket));
        RealInterceptorChain realInterceptorChain0 = new RealInterceptorChain(this, arrayList0, 0, null, this.originalRequest, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
        boolean z = false;
        try {
            response0 = realInterceptorChain0.proceed(this.originalRequest);
            if(this.isCanceled()) {
                Util.closeQuietly(response0);
                throw new IOException("Canceled");
            }
            goto label_27;
        }
        catch(IOException iOException0) {
            try {
                IOException iOException1 = this.noMoreExchanges$okhttp(iOException0);
                L.n(iOException1, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOException1;
            }
            catch(Throwable throwable1) {
                throwable0 = throwable1;
                z = true;
            }
        }
        catch(Throwable throwable0) {
        }
        if(!z) {
            this.noMoreExchanges$okhttp(null);
        }
        throw throwable0;
    label_27:
        this.noMoreExchanges$okhttp(null);
        return response0;
    }

    @l
    public final Exchange initExchange$okhttp(@l RealInterceptorChain realInterceptorChain0) {
        L.p(realInterceptorChain0, "chain");
        synchronized(this) {
            if(this.expectMoreExchanges) {
                if(this.responseBodyOpen || this.requestBodyOpen) {
                    throw new IllegalStateException("Check failed.");
                }
                ExchangeFinder exchangeFinder0 = this.exchangeFinder;
                L.m(exchangeFinder0);
                ExchangeCodec exchangeCodec0 = exchangeFinder0.find(this.client, realInterceptorChain0);
                Exchange exchange0 = new Exchange(this, this.eventListener, exchangeFinder0, exchangeCodec0);
                this.interceptorScopedExchange = exchange0;
                this.exchange = exchange0;
                synchronized(this) {
                    this.requestBodyOpen = true;
                    this.responseBodyOpen = true;
                }
                if(this.canceled) {
                    throw new IOException("Canceled");
                }
                return exchange0;
            }
        }
        throw new IllegalStateException("released");
    }

    @Override  // okhttp3.Call
    public boolean isCanceled() {
        return this.canceled;
    }

    @Override  // okhttp3.Call
    public boolean isExecuted() {
        return this.executed.get();
    }

    public final IOException messageDone$okhttp(@l Exchange exchange0, boolean z, boolean z1, IOException iOException0) {
        int v2;
        L.p(exchange0, "exchange");
        if(!L.g(exchange0, this.exchange)) {
            return iOException0;
        }
        synchronized(this) {
            int v = 0;
            if((!z || !this.requestBodyOpen) && (!z1 || !this.responseBodyOpen)) {
                v2 = 0;
            }
            else {
                if(z) {
                    this.requestBodyOpen = false;
                }
                if(z1) {
                    this.responseBodyOpen = false;
                }
                int v1 = this.requestBodyOpen || this.responseBodyOpen ? 0 : 1;
                if(!this.requestBodyOpen && !this.responseBodyOpen && !this.expectMoreExchanges) {
                    v = 1;
                }
                v2 = v;
                v = v1;
            }
        }
        if(v != 0) {
            this.exchange = null;
            RealConnection realConnection0 = this.connection;
            if(realConnection0 != null) {
                realConnection0.incrementSuccessCount$okhttp();
            }
        }
        return v2 == 0 ? iOException0 : this.callDone(iOException0);
    }

    @m
    public final IOException noMoreExchanges$okhttp(@m IOException iOException0) {
        boolean z;
        synchronized(this) {
            z = false;
            if(this.expectMoreExchanges) {
                this.expectMoreExchanges = false;
                if(!this.requestBodyOpen && !this.responseBodyOpen) {
                    z = true;
                }
            }
        }
        return z ? this.callDone(iOException0) : iOException0;
    }

    @l
    public final String redactedUrl$okhttp() {
        return this.originalRequest.url().redact();
    }

    @m
    public final Socket releaseConnectionNoEvents$okhttp() {
        RealConnection realConnection0 = this.connection;
        L.m(realConnection0);
        if(Util.assertionsEnabled && !Thread.holdsLock(realConnection0)) {
            throw new AssertionError("Thread jeb-dexdec-sb-st-12491 MUST hold lock on " + realConnection0);
        }
        List list0 = realConnection0.getCalls();
        int v = 0;
        Iterator iterator0 = list0.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(L.g(((Reference)object0).get(), this)) {
                break;
            }
            ++v;
        }
        if(v == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list0.remove(v);
        this.connection = null;
        if(list0.isEmpty()) {
            realConnection0.setIdleAtNs$okhttp(System.nanoTime());
            return this.connectionPool.connectionBecameIdle(realConnection0) ? realConnection0.socket() : null;
        }
        return null;
    }

    @Override  // okhttp3.Call
    @l
    public Request request() {
        return this.originalRequest;
    }

    public final boolean retryAfterFailure() {
        ExchangeFinder exchangeFinder0 = this.exchangeFinder;
        L.m(exchangeFinder0);
        return exchangeFinder0.retryAfterFailure();
    }

    public final void setConnectionToCancel(@m RealConnection realConnection0) {
        this.connectionToCancel = realConnection0;
    }

    @l
    public j timeout() {
        return this.timeout;
    }

    @Override  // okhttp3.Call
    public q0 timeout() {
        return this.timeout();
    }

    public final void timeoutEarlyExit() {
        if(this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.exit();
    }

    private final IOException timeoutExit(IOException iOException0) {
        if(this.timeoutEarlyExit) {
            return iOException0;
        }
        if(!this.timeout.exit()) {
            return iOException0;
        }
        IOException iOException1 = new InterruptedIOException("timeout");
        if(iOException0 != null) {
            iOException1.initCause(iOException0);
        }
        return iOException1;
    }

    // 去混淆评级： 低(40)
    private final String toLoggableString() {
        return (this.isCanceled() ? "canceled " : "") + (this.forWebSocket ? "web socket" : "call") + " to " + this.redactedUrl$okhttp();
    }
}

