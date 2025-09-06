package okhttp3.internal.http;

import java.io.IOException;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request.Builder;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okio.B;
import okio.Z;
import y4.l;

@s0({"SMAP\nBridgeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 BridgeInterceptor.kt\nokhttp3/internal/http/BridgeInterceptor\n*L\n111#1:118,3\n*E\n"})
public final class BridgeInterceptor implements Interceptor {
    @l
    private final CookieJar cookieJar;

    public BridgeInterceptor(@l CookieJar cookieJar0) {
        L.p(cookieJar0, "cookieJar");
        super();
        this.cookieJar = cookieJar0;
    }

    private final String cookieHeader(List list0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = 0;
        for(Object object0: list0) {
            if(v < 0) {
                u.Z();
            }
            if(v > 0) {
                stringBuilder0.append("; ");
            }
            stringBuilder0.append(((Cookie)object0).name());
            stringBuilder0.append('=');
            stringBuilder0.append(((Cookie)object0).value());
            ++v;
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    @Override  // okhttp3.Interceptor
    @l
    public Response intercept(@l Chain interceptor$Chain0) throws IOException {
        L.p(interceptor$Chain0, "chain");
        Request request0 = interceptor$Chain0.request();
        Builder request$Builder0 = request0.newBuilder();
        RequestBody requestBody0 = request0.body();
        if(requestBody0 != null) {
            MediaType mediaType0 = requestBody0.contentType();
            if(mediaType0 != null) {
                request$Builder0.header("Content-Type", mediaType0.toString());
            }
            long v = requestBody0.contentLength();
            if(v == -1L) {
                request$Builder0.header("Transfer-Encoding", "chunked");
                request$Builder0.removeHeader("Content-Length");
            }
            else {
                request$Builder0.header("Content-Length", String.valueOf(v));
                request$Builder0.removeHeader("Transfer-Encoding");
            }
        }
        boolean z = false;
        if(request0.header("Host") == null) {
            request$Builder0.header("Host", Util.toHostHeader$default(request0.url(), false, 1, null));
        }
        if(request0.header("Connection") == null) {
            request$Builder0.header("Connection", "Keep-Alive");
        }
        if(request0.header("Accept-Encoding") == null && request0.header("Range") == null) {
            request$Builder0.header("Accept-Encoding", "gzip");
            z = true;
        }
        List list0 = this.cookieJar.loadForRequest(request0.url());
        if(!list0.isEmpty()) {
            request$Builder0.header("Cookie", this.cookieHeader(list0));
        }
        if(request0.header("User-Agent") == null) {
            request$Builder0.header("User-Agent", "okhttp/4.12.0");
        }
        Response response0 = interceptor$Chain0.proceed(request$Builder0.build());
        HttpHeaders.receiveHeaders(this.cookieJar, request0.url(), response0.headers());
        okhttp3.Response.Builder response$Builder0 = response0.newBuilder().request(request0);
        if(z && v.O1("gzip", Response.header$default(response0, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody(response0)) {
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 != null) {
                B b0 = new B(responseBody0.source());
                response$Builder0.headers(response0.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
                response$Builder0.body(new RealResponseBody(Response.header$default(response0, "Content-Type", null, 2, null), -1L, Z.e(b0)));
            }
        }
        return response$Builder0.build();
    }
}

