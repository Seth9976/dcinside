package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.L;
import kotlin.o;
import kotlin.text.v;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.Z;
import okio.m;
import y4.l;

public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) throws IOException {
        boolean z;
        Builder response$Builder0;
        L.p(interceptor$Chain0, "chain");
        Exchange exchange0 = ((RealInterceptorChain)interceptor$Chain0).getExchange$okhttp();
        L.m(exchange0);
        Request request0 = ((RealInterceptorChain)interceptor$Chain0).getRequest$okhttp();
        RequestBody requestBody0 = request0.body();
        long v = System.currentTimeMillis();
        Long long0 = null;
        try {
            exchange0.writeRequestHeaders(request0);
            if(!HttpMethod.permitsRequestBody(request0.method()) || requestBody0 == null) {
                goto label_28;
            }
            else {
                if(v.O1("100-continue", request0.header("Expect"), true)) {
                    exchange0.flushRequest();
                    response$Builder0 = exchange0.readResponseHeaders(true);
                    goto label_12;
                }
                else {
                    goto label_17;
                }
                goto label_19;
            }
            goto label_36;
        }
        catch(IOException iOException0) {
            response$Builder0 = null;
            z = true;
            goto label_40;
        }
        try {
        label_12:
            exchange0.responseHeadersStart();
            z = false;
            goto label_19;
        }
        catch(IOException iOException0) {
            z = true;
            goto label_40;
        }
        try {
        label_17:
            response$Builder0 = null;
            z = true;
        }
        catch(IOException iOException0) {
            response$Builder0 = null;
            z = true;
            goto label_40;
        }
        try {
        label_19:
            if(response$Builder0 == null) {
                m m0 = Z.d(exchange0.createRequestBody(request0, false));
                requestBody0.writeTo(m0);
                m0.close();
            }
            else {
                exchange0.noRequestBody();
                if(!exchange0.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange0.noNewExchangesOnConnection();
                }
            }
            goto label_36;
        }
        catch(IOException iOException0) {
            goto label_40;
        }
        try {
        label_28:
            exchange0.noRequestBody();
            response$Builder0 = null;
            z = true;
            goto label_36;
        }
        catch(IOException iOException0) {
            response$Builder0 = null;
        }
        z = true;
        goto label_40;
        try {
        label_36:
            exchange0.finishRequest();
            iOException0 = null;
            goto label_42;
        }
        catch(IOException iOException0) {
        }
    label_40:
        if(iOException0 instanceof ConnectionShutdownException || !exchange0.getHasFailure$okhttp()) {
            throw iOException0;
        }
        try {
        label_42:
            if(response$Builder0 == null) {
                response$Builder0 = exchange0.readResponseHeaders(false);
                L.m(response$Builder0);
                if(z) {
                    exchange0.responseHeadersStart();
                    z = false;
                }
            }
            Response response0 = response$Builder0.request(request0).handshake(exchange0.getConnection$okhttp().handshake()).sentRequestAtMillis(v).receivedResponseAtMillis(System.currentTimeMillis()).build();
            int v1 = response0.code();
            if(this.shouldIgnoreAndWaitForRealResponse(v1)) {
                Builder response$Builder1 = exchange0.readResponseHeaders(false);
                L.m(response$Builder1);
                if(z) {
                    exchange0.responseHeadersStart();
                }
                response0 = response$Builder1.request(request0).handshake(exchange0.getConnection$okhttp().handshake()).sentRequestAtMillis(v).receivedResponseAtMillis(System.currentTimeMillis()).build();
                v1 = response0.code();
            }
            exchange0.responseHeadersEnd(response0);
            Response response1 = !this.forWebSocket || v1 != 101 ? response0.newBuilder().body(exchange0.openResponseBody(response0)).build() : response0.newBuilder().body(Util.EMPTY_RESPONSE).build();
            if(v.O1("close", response1.request().header("Connection"), true) || v.O1("close", Response.header$default(response1, "Connection", null, 2, null), true)) {
                exchange0.noNewExchangesOnConnection();
            }
            if(v1 == 204 || v1 == 205) {
                ResponseBody responseBody0 = response1.body();
                if((responseBody0 == null ? -1L : responseBody0.contentLength()) > 0L) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("HTTP ");
                    stringBuilder0.append(v1);
                    stringBuilder0.append(" had non-zero Content-Length: ");
                    ResponseBody responseBody1 = response1.body();
                    if(responseBody1 != null) {
                        long0 = responseBody1.contentLength();
                    }
                    stringBuilder0.append(long0);
                    throw new ProtocolException(stringBuilder0.toString());
                }
            }
            return response1;
        label_75:
            if(iOException0 == null) {
                throw iOException1;
            }
        }
        catch(IOException iOException1) {
            goto label_75;
        }
        o.a(iOException0, iOException1);
        throw iOException0;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int v) {
        return v == 100 || 102 <= v && v < 200;
    }
}

