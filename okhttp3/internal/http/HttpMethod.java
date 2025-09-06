package okhttp3.internal.http;

import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

public final class HttpMethod {
    @l
    public static final HttpMethod INSTANCE;

    static {
        HttpMethod.INSTANCE = new HttpMethod();
    }

    // 去混淆评级： 低(25)
    public final boolean invalidatesCache(@l String s) {
        L.p(s, "method");
        return L.g(s, "POST") || L.g(s, "PATCH") || L.g(s, "PUT") || L.g(s, "DELETE") || L.g(s, "MOVE");
    }

    @n
    public static final boolean permitsRequestBody(@l String s) {
        L.p(s, "method");
        return !L.g(s, "GET") && !L.g(s, "HEAD");
    }

    public final boolean redirectsToGet(@l String s) {
        L.p(s, "method");
        return !L.g(s, "PROPFIND");
    }

    public final boolean redirectsWithBody(@l String s) {
        L.p(s, "method");
        return L.g(s, "PROPFIND");
    }

    // 去混淆评级： 低(25)
    @n
    public static final boolean requiresRequestBody(@l String s) {
        L.p(s, "method");
        return L.g(s, "POST") || L.g(s, "PUT") || L.g(s, "PATCH") || L.g(s, "PROPPATCH") || L.g(s, "REPORT");
    }
}

