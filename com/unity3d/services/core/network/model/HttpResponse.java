package com.unity3d.services.core.network.model;

import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class HttpResponse {
    @l
    private final Object body;
    @l
    private final String client;
    private final long contentSize;
    @l
    private final Map headers;
    @l
    private final String protocol;
    private final int statusCode;
    @l
    private final String urlString;

    @j
    public HttpResponse(@l Object object0) {
        L.p(object0, "body");
        this(object0, 0, null, null, null, null, 0L, 0x7E, null);
    }

    @j
    public HttpResponse(@l Object object0, int v) {
        L.p(object0, "body");
        this(object0, v, null, null, null, null, 0L, 0x7C, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0) {
        L.p(object0, "body");
        L.p(map0, "headers");
        this(object0, v, map0, null, null, null, 0L, 120, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0, @l String s) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        this(object0, v, map0, s, null, null, 0L, 0x70, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0, @l String s, @l String s1) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        L.p(s1, "protocol");
        this(object0, v, map0, s, s1, null, 0L, 0x60, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0, @l String s, @l String s1, @l String s2) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        L.p(s1, "protocol");
        L.p(s2, "client");
        this(object0, v, map0, s, s1, s2, 0L, 0x40, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0, @l String s, @l String s1, @l String s2, long v1) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        L.p(s1, "protocol");
        L.p(s2, "client");
        super();
        this.body = object0;
        this.statusCode = v;
        this.headers = map0;
        this.urlString = s;
        this.protocol = s1;
        this.client = s2;
        this.contentSize = v1;
    }

    public HttpResponse(Object object0, int v, Map map0, String s, String s1, String s2, long v1, int v2, w w0) {
        this(object0, ((v2 & 2) == 0 ? v : 200), ((v2 & 4) == 0 ? map0 : Y.z()), ((v2 & 8) == 0 ? s : ""), ((v2 & 16) == 0 ? s1 : ""), ((v2 & 0x20) == 0 ? s2 : "unknown"), ((v2 & 0x40) == 0 ? v1 : -1L));
    }

    @l
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @l
    public final Map component3() {
        return this.headers;
    }

    @l
    public final String component4() {
        return this.urlString;
    }

    @l
    public final String component5() {
        return this.protocol;
    }

    @l
    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    @l
    public final HttpResponse copy(@l Object object0, int v, @l Map map0, @l String s, @l String s1, @l String s2, long v1) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        L.p(s1, "protocol");
        L.p(s2, "client");
        return new HttpResponse(object0, v, map0, s, s1, s2, v1);
    }

    public static HttpResponse copy$default(HttpResponse httpResponse0, Object object0, int v, Map map0, String s, String s1, String s2, long v1, int v2, Object object1) {
        Object object2 = (v2 & 1) == 0 ? object0 : httpResponse0.body;
        int v3 = (v2 & 2) == 0 ? v : httpResponse0.statusCode;
        Map map1 = (v2 & 4) == 0 ? map0 : httpResponse0.headers;
        String s3 = (v2 & 8) == 0 ? s : httpResponse0.urlString;
        String s4 = (v2 & 16) == 0 ? s1 : httpResponse0.protocol;
        String s5 = (v2 & 0x20) == 0 ? s2 : httpResponse0.client;
        return (v2 & 0x40) == 0 ? httpResponse0.copy(object2, v3, map1, s3, s4, s5, v1) : httpResponse0.copy(object2, v3, map1, s3, s4, s5, httpResponse0.contentSize);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof HttpResponse)) {
            return false;
        }
        if(!L.g(this.body, ((HttpResponse)object0).body)) {
            return false;
        }
        if(this.statusCode != ((HttpResponse)object0).statusCode) {
            return false;
        }
        if(!L.g(this.headers, ((HttpResponse)object0).headers)) {
            return false;
        }
        if(!L.g(this.urlString, ((HttpResponse)object0).urlString)) {
            return false;
        }
        if(!L.g(this.protocol, ((HttpResponse)object0).protocol)) {
            return false;
        }
        return L.g(this.client, ((HttpResponse)object0).client) ? this.contentSize == ((HttpResponse)object0).contentSize : false;
    }

    @l
    public final Object getBody() {
        return this.body;
    }

    @l
    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    @l
    public final Map getHeaders() {
        return this.headers;
    }

    @l
    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @l
    public final String getUrlString() {
        return this.urlString;
    }

    @Override
    public int hashCode() {
        return (((((this.body.hashCode() * 0x1F + this.statusCode) * 0x1F + this.headers.hashCode()) * 0x1F + this.urlString.hashCode()) * 0x1F + this.protocol.hashCode()) * 0x1F + this.client.hashCode()) * 0x1F + ((int)(this.contentSize ^ this.contentSize >>> 0x20));
    }

    @Override
    @l
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }
}

