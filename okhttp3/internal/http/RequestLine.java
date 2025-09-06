package okhttp3.internal.http;

import java.net.Proxy.Type;
import kotlin.jvm.internal.L;
import okhttp3.HttpUrl;
import okhttp3.Request;
import y4.l;

public final class RequestLine {
    @l
    public static final RequestLine INSTANCE;

    static {
        RequestLine.INSTANCE = new RequestLine();
    }

    @l
    public final String get(@l Request request0, @l Proxy.Type proxy$Type0) {
        L.p(request0, "request");
        L.p(proxy$Type0, "proxyType");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(request0.method());
        stringBuilder0.append(' ');
        RequestLine requestLine0 = RequestLine.INSTANCE;
        if(requestLine0.includeAuthorityInRequestLine(request0, proxy$Type0)) {
            stringBuilder0.append(request0.url());
        }
        else {
            stringBuilder0.append(requestLine0.requestPath(request0.url()));
        }
        stringBuilder0.append(" HTTP/1.1");
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    private final boolean includeAuthorityInRequestLine(Request request0, Proxy.Type proxy$Type0) {
        return !request0.isHttps() && proxy$Type0 == Proxy.Type.HTTP;
    }

    @l
    public final String requestPath(@l HttpUrl httpUrl0) {
        L.p(httpUrl0, "url");
        String s = httpUrl0.encodedPath();
        String s1 = httpUrl0.encodedQuery();
        return s1 == null ? s : s + '?' + s1;
    }
}

