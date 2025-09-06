package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class WebViewClientError {
    @l
    private final ErrorReason reason;
    @m
    private final Integer statusCode;
    @m
    private final String url;

    public WebViewClientError(@m String s, @l ErrorReason errorReason0, @m Integer integer0) {
        L.p(errorReason0, "reason");
        super();
        this.url = s;
        this.reason = errorReason0;
        this.statusCode = integer0;
    }

    public WebViewClientError(String s, ErrorReason errorReason0, Integer integer0, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            integer0 = null;
        }
        this(s, errorReason0, integer0);
    }

    @m
    public final String component1() {
        return this.url;
    }

    @l
    public final ErrorReason component2() {
        return this.reason;
    }

    @m
    public final Integer component3() {
        return this.statusCode;
    }

    @l
    public final WebViewClientError copy(@m String s, @l ErrorReason errorReason0, @m Integer integer0) {
        L.p(errorReason0, "reason");
        return new WebViewClientError(s, errorReason0, integer0);
    }

    public static WebViewClientError copy$default(WebViewClientError webViewClientError0, String s, ErrorReason errorReason0, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            s = webViewClientError0.url;
        }
        if((v & 2) != 0) {
            errorReason0 = webViewClientError0.reason;
        }
        if((v & 4) != 0) {
            integer0 = webViewClientError0.statusCode;
        }
        return webViewClientError0.copy(s, errorReason0, integer0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WebViewClientError)) {
            return false;
        }
        if(!L.g(this.url, ((WebViewClientError)object0).url)) {
            return false;
        }
        return this.reason == ((WebViewClientError)object0).reason ? L.g(this.statusCode, ((WebViewClientError)object0).statusCode) : false;
    }

    @l
    public final ErrorReason getReason() {
        return this.reason;
    }

    @m
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @m
    public final String getUrl() {
        return this.url;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.url == null ? 0 : this.url.hashCode();
        int v2 = this.reason.hashCode();
        Integer integer0 = this.statusCode;
        if(integer0 != null) {
            v = integer0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }
}

