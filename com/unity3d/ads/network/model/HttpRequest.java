package com.unity3d.ads.network.model;

import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class HttpRequest {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    @l
    private final String baseURL;
    @l
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    @l
    private final Map headers;
    @l
    private final RequestType method;
    @l
    private final Map parameters;
    @l
    private final String path;
    @m
    private final Integer port;
    private final int readTimeout;
    @l
    private final String scheme;
    private final int writeTimeout;

    static {
        HttpRequest.Companion = new Companion(null);
    }

    @j
    public HttpRequest(@l String s) {
        L.p(s, "baseURL");
        this(s, null, null, null, null, null, null, null, 0, 0, 0, 0, 0xFFE, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        this(s, s1, null, null, null, null, null, null, 0, 0, 0, 0, 0xFFC, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        this(s, s1, requestType0, null, null, null, null, null, 0, 0, 0, 0, 0xFF8, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        this(s, s1, requestType0, httpBody0, null, null, null, null, 0, 0, 0, 0, 0xFF0, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        this(s, s1, requestType0, httpBody0, map0, null, null, null, 0, 0, 0, 0, 0xFE0, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        this(s, s1, requestType0, httpBody0, map0, map1, null, null, 0, 0, 0, 0, 0xFC0, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        this(s, s1, requestType0, httpBody0, map0, map1, s2, null, 0, 0, 0, 0, 0xF80, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2, @m Integer integer0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        this(s, s1, requestType0, httpBody0, map0, map1, s2, integer0, 0, 0, 0, 0, 0xF00, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2, @m Integer integer0, int v) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        this(s, s1, requestType0, httpBody0, map0, map1, s2, integer0, v, 0, 0, 0, 0xE00, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2, @m Integer integer0, int v, int v1) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        this(s, s1, requestType0, httpBody0, map0, map1, s2, integer0, v, v1, 0, 0, 0xC00, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2, @m Integer integer0, int v, int v1, int v2) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        this(s, s1, requestType0, httpBody0, map0, map1, s2, integer0, v, v1, v2, 0, 0x800, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        super();
        this.baseURL = s;
        this.path = s1;
        this.method = requestType0;
        this.body = httpBody0;
        this.headers = map0;
        this.parameters = map1;
        this.scheme = s2;
        this.port = integer0;
        this.connectTimeout = v;
        this.readTimeout = v1;
        this.writeTimeout = v2;
        this.callTimeout = v3;
    }

    public HttpRequest(String s, String s1, RequestType requestType0, HttpBody httpBody0, Map map0, Map map1, String s2, Integer integer0, int v, int v1, int v2, int v3, int v4, w w0) {
        RequestType requestType1 = (v4 & 4) == 0 ? requestType0 : RequestType.GET;
        HttpBody httpBody1 = (v4 & 8) == 0 ? httpBody0 : EmptyBody.INSTANCE;
        this(s, ((v4 & 2) == 0 ? s1 : ""), requestType1, httpBody1, ((v4 & 16) == 0 ? map0 : Y.z()), ((v4 & 0x20) == 0 ? map1 : Y.z()), ((v4 & 0x40) == 0 ? s2 : "https"), ((v4 & 0x80) == 0 ? integer0 : null), ((v4 & 0x100) == 0 ? v : 30000), ((v4 & 0x200) == 0 ? v1 : 30000), ((v4 & 0x400) == 0 ? v2 : 30000), ((v4 & 0x800) == 0 ? v3 : 30000));
    }

    @l
    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    @l
    public final String component2() {
        return this.path;
    }

    @l
    public final RequestType component3() {
        return this.method;
    }

    @l
    public final HttpBody component4() {
        return this.body;
    }

    @l
    public final Map component5() {
        return this.headers;
    }

    @l
    public final Map component6() {
        return this.parameters;
    }

    @l
    public final String component7() {
        return this.scheme;
    }

    @m
    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    @l
    public final HttpRequest copy(@l String s, @l String s1, @l RequestType requestType0, @l HttpBody httpBody0, @l Map map0, @l Map map1, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(httpBody0, "body");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(s2, "scheme");
        return new HttpRequest(s, s1, requestType0, httpBody0, map0, map1, s2, integer0, v, v1, v2, v3);
    }

    public static HttpRequest copy$default(HttpRequest httpRequest0, String s, String s1, RequestType requestType0, HttpBody httpBody0, Map map0, Map map1, String s2, Integer integer0, int v, int v1, int v2, int v3, int v4, Object object0) {
        String s3 = (v4 & 1) == 0 ? s : httpRequest0.baseURL;
        String s4 = (v4 & 2) == 0 ? s1 : httpRequest0.path;
        RequestType requestType1 = (v4 & 4) == 0 ? requestType0 : httpRequest0.method;
        HttpBody httpBody1 = (v4 & 8) == 0 ? httpBody0 : httpRequest0.body;
        Map map2 = (v4 & 16) == 0 ? map0 : httpRequest0.headers;
        Map map3 = (v4 & 0x20) == 0 ? map1 : httpRequest0.parameters;
        String s5 = (v4 & 0x40) == 0 ? s2 : httpRequest0.scheme;
        Integer integer1 = (v4 & 0x80) == 0 ? integer0 : httpRequest0.port;
        int v5 = (v4 & 0x100) == 0 ? v : httpRequest0.connectTimeout;
        int v6 = (v4 & 0x200) == 0 ? v1 : httpRequest0.readTimeout;
        int v7 = (v4 & 0x400) == 0 ? v2 : httpRequest0.writeTimeout;
        return (v4 & 0x800) == 0 ? httpRequest0.copy(s3, s4, requestType1, httpBody1, map2, map3, s5, integer1, v5, v6, v7, v3) : httpRequest0.copy(s3, s4, requestType1, httpBody1, map2, map3, s5, integer1, v5, v6, v7, httpRequest0.callTimeout);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HttpRequest)) {
            return false;
        }
        if(!L.g(this.baseURL, ((HttpRequest)object0).baseURL)) {
            return false;
        }
        if(!L.g(this.path, ((HttpRequest)object0).path)) {
            return false;
        }
        if(this.method != ((HttpRequest)object0).method) {
            return false;
        }
        if(!L.g(this.body, ((HttpRequest)object0).body)) {
            return false;
        }
        if(!L.g(this.headers, ((HttpRequest)object0).headers)) {
            return false;
        }
        if(!L.g(this.parameters, ((HttpRequest)object0).parameters)) {
            return false;
        }
        if(!L.g(this.scheme, ((HttpRequest)object0).scheme)) {
            return false;
        }
        if(!L.g(this.port, ((HttpRequest)object0).port)) {
            return false;
        }
        if(this.connectTimeout != ((HttpRequest)object0).connectTimeout) {
            return false;
        }
        if(this.readTimeout != ((HttpRequest)object0).readTimeout) {
            return false;
        }
        return this.writeTimeout == ((HttpRequest)object0).writeTimeout ? this.callTimeout == ((HttpRequest)object0).callTimeout : false;
    }

    @l
    public final String getBaseURL() {
        return this.baseURL;
    }

    @l
    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @l
    public final Map getHeaders() {
        return this.headers;
    }

    @l
    public final RequestType getMethod() {
        return this.method;
    }

    @l
    public final Map getParameters() {
        return this.parameters;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @m
    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @l
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    @Override
    public int hashCode() {
        int v = this.baseURL.hashCode();
        int v1 = this.path.hashCode();
        int v2 = this.method.hashCode();
        int v3 = this.body.hashCode();
        int v4 = this.headers.hashCode();
        int v5 = this.parameters.hashCode();
        int v6 = this.scheme.hashCode();
        return this.port == null ? (((((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 961 + this.connectTimeout) * 0x1F + this.readTimeout) * 0x1F + this.writeTimeout) * 0x1F + this.callTimeout : ((((((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + this.port.hashCode()) * 0x1F + this.connectTimeout) * 0x1F + this.readTimeout) * 0x1F + this.writeTimeout) * 0x1F + this.callTimeout;
    }

    @Override
    @l
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }
}

