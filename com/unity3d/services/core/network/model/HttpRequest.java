package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
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
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    @l
    private final String baseURL;
    @m
    private final Object body;
    @l
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    @m
    private final File downloadDestination;
    @l
    private final Map headers;
    private final boolean isProtobuf;
    @l
    private final RequestType method;
    @l
    private final OperationType operationType;
    @l
    private final Map parameters;
    @l
    private final String path;
    @m
    private final Integer port;
    private final int priority;
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
        this(s, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFFE, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        this(s, s1, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFFC, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        this(s, s1, requestType0, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFF8, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        this(s, s1, requestType0, object0, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFF0, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        this(s, s1, requestType0, object0, map0, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFE0, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        this(s, s1, requestType0, object0, map0, map1, null, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FFC0, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, null, null, 0, 0, 0, 0, false, null, null, 0, 0x1FF80, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, null, 0, 0, 0, 0, false, null, null, 0, 0x1FF00, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, 0, 0, 0, 0, false, null, null, 0, 0x1FE00, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, 0, 0, 0, false, null, null, 0, 0x1FC00, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, 0, 0, false, null, null, 0, 0x1F800, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, v2, 0, false, null, null, 0, 0x1F000, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, v2, v3, false, null, null, 0, 0x1E000, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3, boolean z) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, v2, v3, z, null, null, 0, 0x1C000, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3, boolean z, @l OperationType operationType0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        L.p(operationType0, "operationType");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, v2, v3, z, operationType0, null, 0, 0x18000, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3, boolean z, @l OperationType operationType0, @m File file0) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        L.p(operationType0, "operationType");
        this(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, v2, v3, z, operationType0, file0, 0, 0x10000, null);
    }

    @j
    public HttpRequest(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3, boolean z, @l OperationType operationType0, @m File file0, int v4) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        L.p(operationType0, "operationType");
        super();
        this.baseURL = s;
        this.path = s1;
        this.method = requestType0;
        this.body = object0;
        this.headers = map0;
        this.parameters = map1;
        this.bodyType = bodyType0;
        this.scheme = s2;
        this.port = integer0;
        this.connectTimeout = v;
        this.readTimeout = v1;
        this.writeTimeout = v2;
        this.callTimeout = v3;
        this.isProtobuf = z;
        this.operationType = operationType0;
        this.downloadDestination = file0;
        this.priority = v4;
    }

    public HttpRequest(String s, String s1, RequestType requestType0, Object object0, Map map0, Map map1, BodyType bodyType0, String s2, Integer integer0, int v, int v1, int v2, int v3, boolean z, OperationType operationType0, File file0, int v4, int v5, w w0) {
        RequestType requestType1 = (v5 & 4) == 0 ? requestType0 : RequestType.GET;
        Map map2 = (v5 & 16) == 0 ? map0 : Y.z();
        Map map3 = (v5 & 0x20) == 0 ? map1 : Y.z();
        BodyType bodyType1 = (v5 & 0x40) == 0 ? bodyType0 : BodyType.UNKNOWN;
        int v6 = 0;
        OperationType operationType1 = (v5 & 0x4000) == 0 ? operationType0 : OperationType.UNKNOWN;
        if((v5 & 0x10000) == 0) {
            v6 = v4;
        }
        this(s, ((v5 & 2) == 0 ? s1 : ""), requestType1, ((v5 & 8) == 0 ? object0 : null), map2, map3, bodyType1, ((v5 & 0x80) == 0 ? s2 : "https"), ((v5 & 0x100) == 0 ? integer0 : null), ((v5 & 0x200) == 0 ? v : 30000), ((v5 & 0x400) == 0 ? v1 : 30000), ((v5 & 0x800) == 0 ? v2 : 30000), ((v5 & 0x1000) == 0 ? v3 : 30000), ((v5 & 0x2000) == 0 ? z : false), operationType1, ((v5 & 0x8000) == 0 ? file0 : null), v6);
    }

    @l
    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    @l
    public final OperationType component15() {
        return this.operationType;
    }

    @m
    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    @l
    public final String component2() {
        return this.path;
    }

    @l
    public final RequestType component3() {
        return this.method;
    }

    @m
    public final Object component4() {
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
    public final BodyType component7() {
        return this.bodyType;
    }

    @l
    public final String component8() {
        return this.scheme;
    }

    @m
    public final Integer component9() {
        return this.port;
    }

    @l
    public final HttpRequest copy(@l String s, @l String s1, @l RequestType requestType0, @m Object object0, @l Map map0, @l Map map1, @l BodyType bodyType0, @l String s2, @m Integer integer0, int v, int v1, int v2, int v3, boolean z, @l OperationType operationType0, @m File file0, int v4) {
        L.p(s, "baseURL");
        L.p(s1, "path");
        L.p(requestType0, "method");
        L.p(map0, "headers");
        L.p(map1, "parameters");
        L.p(bodyType0, "bodyType");
        L.p(s2, "scheme");
        L.p(operationType0, "operationType");
        return new HttpRequest(s, s1, requestType0, object0, map0, map1, bodyType0, s2, integer0, v, v1, v2, v3, z, operationType0, file0, v4);
    }

    public static HttpRequest copy$default(HttpRequest httpRequest0, String s, String s1, RequestType requestType0, Object object0, Map map0, Map map1, BodyType bodyType0, String s2, Integer integer0, int v, int v1, int v2, int v3, boolean z, OperationType operationType0, File file0, int v4, int v5, Object object1) {
        String s3 = (v5 & 1) == 0 ? s : httpRequest0.baseURL;
        String s4 = (v5 & 2) == 0 ? s1 : httpRequest0.path;
        RequestType requestType1 = (v5 & 4) == 0 ? requestType0 : httpRequest0.method;
        Object object2 = (v5 & 8) == 0 ? object0 : httpRequest0.body;
        Map map2 = (v5 & 16) == 0 ? map0 : httpRequest0.headers;
        Map map3 = (v5 & 0x20) == 0 ? map1 : httpRequest0.parameters;
        BodyType bodyType1 = (v5 & 0x40) == 0 ? bodyType0 : httpRequest0.bodyType;
        String s5 = (v5 & 0x80) == 0 ? s2 : httpRequest0.scheme;
        Integer integer1 = (v5 & 0x100) == 0 ? integer0 : httpRequest0.port;
        int v6 = (v5 & 0x200) == 0 ? v : httpRequest0.connectTimeout;
        int v7 = (v5 & 0x400) == 0 ? v1 : httpRequest0.readTimeout;
        int v8 = (v5 & 0x800) == 0 ? v2 : httpRequest0.writeTimeout;
        int v9 = (v5 & 0x1000) == 0 ? v3 : httpRequest0.callTimeout;
        boolean z1 = (v5 & 0x2000) == 0 ? z : httpRequest0.isProtobuf;
        OperationType operationType1 = (v5 & 0x4000) == 0 ? operationType0 : httpRequest0.operationType;
        File file1 = (v5 & 0x8000) == 0 ? file0 : httpRequest0.downloadDestination;
        return (v5 & 0x10000) == 0 ? httpRequest0.copy(s3, s4, requestType1, object2, map2, map3, bodyType1, s5, integer1, v6, v7, v8, v9, z1, operationType1, file1, v4) : httpRequest0.copy(s3, s4, requestType1, object2, map2, map3, bodyType1, s5, integer1, v6, v7, v8, v9, z1, operationType1, file1, httpRequest0.priority);
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
        if(this.bodyType != ((HttpRequest)object0).bodyType) {
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
        if(this.writeTimeout != ((HttpRequest)object0).writeTimeout) {
            return false;
        }
        if(this.callTimeout != ((HttpRequest)object0).callTimeout) {
            return false;
        }
        if(this.isProtobuf != ((HttpRequest)object0).isProtobuf) {
            return false;
        }
        if(this.operationType != ((HttpRequest)object0).operationType) {
            return false;
        }
        return L.g(this.downloadDestination, ((HttpRequest)object0).downloadDestination) ? this.priority == ((HttpRequest)object0).priority : false;
    }

    @l
    public final String getBaseURL() {
        return this.baseURL;
    }

    @m
    public final Object getBody() {
        return this.body;
    }

    @l
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @m
    public final File getDownloadDestination() {
        return this.downloadDestination;
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
    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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
        int v = 0;
        int v1 = ((((((((((((this.baseURL.hashCode() * 0x1F + this.path.hashCode()) * 0x1F + this.method.hashCode()) * 0x1F + (this.body == null ? 0 : this.body.hashCode())) * 0x1F + this.headers.hashCode()) * 0x1F + this.parameters.hashCode()) * 0x1F + this.bodyType.hashCode()) * 0x1F + this.scheme.hashCode()) * 0x1F + (this.port == null ? 0 : this.port.hashCode())) * 0x1F + this.connectTimeout) * 0x1F + this.readTimeout) * 0x1F + this.writeTimeout) * 0x1F + this.callTimeout) * 0x1F;
        int v2 = this.isProtobuf;
        if(v2) {
            v2 = 1;
        }
        int v3 = this.operationType.hashCode();
        File file0 = this.downloadDestination;
        if(file0 != null) {
            v = file0.hashCode();
        }
        return (((v1 + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    @Override
    @l
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }
}

