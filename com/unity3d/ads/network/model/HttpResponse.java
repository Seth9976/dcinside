package com.unity3d.ads.network.model;

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
    private final Map headers;
    private final int statusCode;
    @l
    private final String urlString;

    @j
    public HttpResponse(@l Object object0) {
        L.p(object0, "body");
        this(object0, 0, null, null, 14, null);
    }

    @j
    public HttpResponse(@l Object object0, int v) {
        L.p(object0, "body");
        this(object0, v, null, null, 12, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0) {
        L.p(object0, "body");
        L.p(map0, "headers");
        this(object0, v, map0, null, 8, null);
    }

    @j
    public HttpResponse(@l Object object0, int v, @l Map map0, @l String s) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        super();
        this.body = object0;
        this.statusCode = v;
        this.headers = map0;
        this.urlString = s;
    }

    public HttpResponse(Object object0, int v, Map map0, String s, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 200;
        }
        if((v1 & 4) != 0) {
            map0 = Y.z();
        }
        if((v1 & 8) != 0) {
            s = "";
        }
        this(object0, v, map0, s);
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
    public final HttpResponse copy(@l Object object0, int v, @l Map map0, @l String s) {
        L.p(object0, "body");
        L.p(map0, "headers");
        L.p(s, "urlString");
        return new HttpResponse(object0, v, map0, s);
    }

    public static HttpResponse copy$default(HttpResponse httpResponse0, Object object0, int v, Map map0, String s, int v1, Object object1) {
        if((v1 & 1) != 0) {
            object0 = httpResponse0.body;
        }
        if((v1 & 2) != 0) {
            v = httpResponse0.statusCode;
        }
        if((v1 & 4) != 0) {
            map0 = httpResponse0.headers;
        }
        if((v1 & 8) != 0) {
            s = httpResponse0.urlString;
        }
        return httpResponse0.copy(object0, v, map0, s);
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
        return L.g(this.headers, ((HttpResponse)object0).headers) ? L.g(this.urlString, ((HttpResponse)object0).urlString) : false;
    }

    @l
    public final Object getBody() {
        return this.body;
    }

    @l
    public final Map getHeaders() {
        return this.headers;
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
        return ((this.body.hashCode() * 0x1F + this.statusCode) * 0x1F + this.headers.hashCode()) * 0x1F + this.urlString.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }
}

