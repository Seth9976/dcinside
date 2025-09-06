package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.L;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import y4.l;
import y4.m;

public final class ExchangeFinder {
    @l
    private final Address address;
    @l
    private final RealCall call;
    @l
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    @l
    private final EventListener eventListener;
    @m
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    @m
    private Selection routeSelection;
    @m
    private RouteSelector routeSelector;

    public ExchangeFinder(@l RealConnectionPool realConnectionPool0, @l Address address0, @l RealCall realCall0, @l EventListener eventListener0) {
        L.p(realConnectionPool0, "connectionPool");
        L.p(address0, "address");
        L.p(realCall0, "call");
        L.p(eventListener0, "eventListener");
        super();
        this.connectionPool = realConnectionPool0;
        this.address = address0;
        this.call = realCall0;
        this.eventListener = eventListener0;
    }

    @l
    public final ExchangeCodec find(@l OkHttpClient okHttpClient0, @l RealInterceptorChain realInterceptorChain0) {
        L.p(okHttpClient0, "client");
        L.p(realInterceptorChain0, "chain");
        try {
            return this.findHealthyConnection(realInterceptorChain0.getConnectTimeoutMillis$okhttp(), realInterceptorChain0.getReadTimeoutMillis$okhttp(), realInterceptorChain0.getWriteTimeoutMillis$okhttp(), okHttpClient0.pingIntervalMillis(), okHttpClient0.retryOnConnectionFailure(), !L.g(realInterceptorChain0.getRequest$okhttp().method(), "GET")).newCodec$okhttp(okHttpClient0, realInterceptorChain0);
        }
        catch(RouteException routeException0) {
            this.trackFailure(routeException0.getLastConnectException());
            throw routeException0;
        }
        catch(IOException iOException0) {
            this.trackFailure(iOException0);
            throw new RouteException(iOException0);
        }
    }

    private final RealConnection findConnection(int v, int v1, int v2, int v3, boolean z) throws IOException {
        Socket socket0;
        List list0;
        if(this.call.isCanceled()) {
            throw new IOException("Canceled");
        }
        RealConnection realConnection0 = this.call.getConnection();
        if(realConnection0 != null) {
            synchronized(realConnection0) {
                socket0 = realConnection0.getNoNewExchanges() || !this.sameHostAndPort(realConnection0.route().address().url()) ? this.call.releaseConnectionNoEvents$okhttp() : null;
            }
            if(this.call.getConnection() != null) {
                if(socket0 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                return realConnection0;
            }
            if(socket0 != null) {
                Util.closeQuietly(socket0);
            }
            this.eventListener.connectionReleased(this.call, realConnection0);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if(this.connectionPool.callAcquirePooledConnection(this.address, this.call, null, false)) {
            RealConnection realConnection1 = this.call.getConnection();
            L.m(realConnection1);
            this.eventListener.connectionAcquired(this.call, realConnection1);
            return realConnection1;
        }
        Route route0 = this.nextRouteToTry;
        if(route0 == null) {
            Selection routeSelector$Selection0 = this.routeSelection;
            if(routeSelector$Selection0 != null) {
                L.m(routeSelector$Selection0);
                if(routeSelector$Selection0.hasNext()) {
                    Selection routeSelector$Selection1 = this.routeSelection;
                    L.m(routeSelector$Selection1);
                    route0 = routeSelector$Selection1.next();
                    list0 = null;
                    goto label_53;
                }
            }
            RouteSelector routeSelector0 = this.routeSelector;
            if(routeSelector0 == null) {
                routeSelector0 = new RouteSelector(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                this.routeSelector = routeSelector0;
            }
            Selection routeSelector$Selection2 = routeSelector0.next();
            this.routeSelection = routeSelector$Selection2;
            list0 = routeSelector$Selection2.getRoutes();
            if(this.call.isCanceled()) {
                throw new IOException("Canceled");
            }
            if(this.connectionPool.callAcquirePooledConnection(this.address, this.call, list0, false)) {
                RealConnection realConnection2 = this.call.getConnection();
                L.m(realConnection2);
                this.eventListener.connectionAcquired(this.call, realConnection2);
                return realConnection2;
            }
            route0 = routeSelector$Selection2.next();
        }
        else {
            L.m(route0);
            this.nextRouteToTry = null;
            list0 = null;
        }
    label_53:
        RealConnection realConnection3 = new RealConnection(this.connectionPool, route0);
        this.call.setConnectionToCancel(realConnection3);
        try {
            realConnection3.connect(v, v1, v2, v3, z, this.call, this.eventListener);
        }
        finally {
            this.call.setConnectionToCancel(null);
        }
        this.call.getClient().getRouteDatabase().connected(realConnection3.route());
        if(this.connectionPool.callAcquirePooledConnection(this.address, this.call, list0, true)) {
            RealConnection realConnection4 = this.call.getConnection();
            L.m(realConnection4);
            this.nextRouteToTry = route0;
            Util.closeQuietly(realConnection3.socket());
            this.eventListener.connectionAcquired(this.call, realConnection4);
            return realConnection4;
        }
        synchronized(realConnection3) {
            this.connectionPool.put(realConnection3);
            this.call.acquireConnectionNoEvents(realConnection3);
        }
        this.eventListener.connectionAcquired(this.call, realConnection3);
        return realConnection3;
    }

    private final RealConnection findHealthyConnection(int v, int v1, int v2, int v3, boolean z, boolean z1) throws IOException {
        boolean z2;
        do {
            do {
                RealConnection realConnection0 = this.findConnection(v, v1, v2, v3, z);
                if(realConnection0.isHealthy(z1)) {
                    return realConnection0;
                }
                z2 = true;
                realConnection0.noNewExchanges$okhttp();
            }
            while(this.nextRouteToTry != null || (this.routeSelection == null ? true : this.routeSelection.hasNext()));
            RouteSelector routeSelector0 = this.routeSelector;
            if(routeSelector0 != null) {
                z2 = routeSelector0.hasNext();
            }
        }
        while(z2);
        throw new IOException("exhausted all routes");
    }

    @l
    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        if(this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if(this.nextRouteToTry != null) {
            return true;
        }
        Route route0 = this.retryRoute();
        if(route0 != null) {
            this.nextRouteToTry = route0;
            return true;
        }
        if(this.routeSelection != null && this.routeSelection.hasNext()) {
            return true;
        }
        return this.routeSelector == null ? true : this.routeSelector.hasNext();
    }

    private final Route retryRoute() {
        if(this.refusedStreamCount <= 1 && this.connectionShutdownCount <= 1 && this.otherFailureCount <= 0) {
            RealConnection realConnection0 = this.call.getConnection();
            if(realConnection0 == null) {
                return null;
            }
            synchronized(realConnection0) {
                if(realConnection0.getRouteFailureCount$okhttp() != 0) {
                    return null;
                }
                if(!Util.canReuseConnectionFor(realConnection0.route().address().url(), this.address.url())) {
                    return null;
                }
            }
            return realConnection0.route();
        }
        return null;
    }

    public final boolean sameHostAndPort(@l HttpUrl httpUrl0) {
        L.p(httpUrl0, "url");
        HttpUrl httpUrl1 = this.address.url();
        return httpUrl0.port() == httpUrl1.port() && L.g(httpUrl0.host(), httpUrl1.host());
    }

    public final void trackFailure(@l IOException iOException0) {
        L.p(iOException0, "e");
        this.nextRouteToTry = null;
        if(iOException0 instanceof StreamResetException && ((StreamResetException)iOException0).errorCode == ErrorCode.REFUSED_STREAM) {
            ++this.refusedStreamCount;
            return;
        }
        if(iOException0 instanceof ConnectionShutdownException) {
            ++this.connectionShutdownCount;
            return;
        }
        ++this.otherFailureCount;
    }
}

