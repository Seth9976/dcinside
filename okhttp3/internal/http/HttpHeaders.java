package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import kotlin.text.v;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.o;
import y4.l;
import z3.i;

@i(name = "HttpHeaders")
public final class HttpHeaders {
    @l
    private static final o QUOTED_STRING_DELIMITERS;
    @l
    private static final o TOKEN_DELIMITERS;

    static {
        HttpHeaders.QUOTED_STRING_DELIMITERS = o.d.l("\"\\");
        HttpHeaders.TOKEN_DELIMITERS = o.d.l("\t ,=");
    }

    @k(level = m.b, message = "No longer supported", replaceWith = @c0(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@l Response response0) {
        L.p(response0, "response");
        return HttpHeaders.promisesBody(response0);
    }

    @l
    public static final List parseChallenges(@l Headers headers0, @l String s) {
        L.p(headers0, "<this>");
        L.p(s, "headerName");
        List list0 = new ArrayList();
        int v = headers0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v.O1(s, headers0.name(v1), true)) {
                okio.l l0 = new okio.l().b3(headers0.value(v1));
                try {
                    HttpHeaders.readChallengeHeader(l0, list0);
                }
                catch(EOFException eOFException0) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, eOFException0);
                }
            }
        }
        return list0;
    }

    public static final boolean promisesBody(@l Response response0) {
        L.p(response0, "<this>");
        if(L.g(response0.request().method(), "HEAD")) {
            return false;
        }
        int v = response0.code();
        return v >= 100 && v < 200 || (v == 204 || v == 304) ? Util.headersContentLength(response0) != -1L || v.O1("chunked", Response.header$default(response0, "Transfer-Encoding", null, 2, null), true) : true;
    }

    private static final void readChallengeHeader(okio.l l0, List list0) throws EOFException {
        int v;
        String s1;
        String s;
        while(true) {
            s = null;
        label_1:
            if(s == null) {
                HttpHeaders.skipCommasAndWhitespace(l0);
                s = HttpHeaders.readToken(l0);
                if(s == null) {
                    return;
                }
            }
            boolean z = HttpHeaders.skipCommasAndWhitespace(l0);
            s1 = HttpHeaders.readToken(l0);
            if(s1 == null) {
                if(!l0.j3()) {
                    return;
                }
                list0.add(new Challenge(s, Y.z()));
                return;
            }
            v = Util.skipAll(l0, 61);
            if(z || !HttpHeaders.skipCommasAndWhitespace(l0) && !l0.j3()) {
                break;
            }
            Map map0 = Collections.singletonMap(null, s1 + v.h2("=", v));
            L.o(map0, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list0.add(new Challenge(s, map0));
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v1 = v + Util.skipAll(l0, 61);
        while(true) {
            if(s1 == null) {
                s1 = HttpHeaders.readToken(l0);
                if(HttpHeaders.skipCommasAndWhitespace(l0)) {
                    break;
                }
                else {
                    v1 = Util.skipAll(l0, 61);
                }
            }
            if(v1 == 0) {
                break;
            }
            if(v1 > 1) {
                return;
            }
            if(HttpHeaders.skipCommasAndWhitespace(l0)) {
                return;
            }
            String s2 = HttpHeaders.startsWith(l0, 34) ? HttpHeaders.readQuotedString(l0) : HttpHeaders.readToken(l0);
            if(s2 == null) {
                return;
            }
            if(((String)linkedHashMap0.put(s1, s2)) != null) {
                return;
            }
            if(!HttpHeaders.skipCommasAndWhitespace(l0) && !l0.j3()) {
                return;
            }
            s1 = null;
        }
        list0.add(new Challenge(s, linkedHashMap0));
        s = s1;
        goto label_1;
    }

    private static final String readQuotedString(okio.l l0) throws EOFException {
        if(l0.readByte() == 34) {
            okio.l l1 = new okio.l();
            while(true) {
                long v = l0.W(HttpHeaders.QUOTED_STRING_DELIMITERS);
                if(v == -1L) {
                    return null;
                }
                if(l0.Q(v) == 34) {
                    l1.write(l0, v);
                    l0.readByte();
                    return "";
                }
                if(l0.size() == v + 1L) {
                    return null;
                }
                l1.write(l0, v);
                l0.readByte();
                l1.write(l0, 1L);
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final String readToken(okio.l l0) {
        long v = l0.W(HttpHeaders.TOKEN_DELIMITERS);
        if(v == -1L) {
            v = l0.size();
        }
        return v == 0L ? null : l0.C0(v);
    }

    public static final void receiveHeaders(@l CookieJar cookieJar0, @l HttpUrl httpUrl0, @l Headers headers0) {
        L.p(cookieJar0, "<this>");
        L.p(httpUrl0, "url");
        L.p(headers0, "headers");
        if(cookieJar0 == CookieJar.NO_COOKIES) {
            return;
        }
        List list0 = Cookie.Companion.parseAll(httpUrl0, headers0);
        if(list0.isEmpty()) {
            return;
        }
        cookieJar0.saveFromResponse(httpUrl0, list0);
    }

    private static final boolean skipCommasAndWhitespace(okio.l l0) {
        boolean z = false;
        while(!l0.j3()) {
            int v = l0.Q(0L);
            if(v == 44) {
                l0.readByte();
                z = true;
            }
            else {
                if(v != 9 && v != 0x20) {
                    break;
                }
                l0.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(okio.l l0, byte b) {
        return !l0.j3() && l0.Q(0L) == b;
    }
}

