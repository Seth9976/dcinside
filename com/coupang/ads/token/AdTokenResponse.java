package com.coupang.ads.token;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdTokenResponse {
    @l
    private final String appVersion;
    private final int code;
    private final long createdTime;
    @l
    private final String message;
    @m
    private final String token;
    @m
    private final String tokenId;
    private final long ttl;

    public AdTokenResponse(@m String s, long v, long v1, @m String s1, int v2, @l String s2, @l String s3) {
        L.p(s2, "message");
        L.p(s3, "appVersion");
        super();
        this.token = s;
        this.createdTime = v;
        this.ttl = v1;
        this.tokenId = s1;
        this.code = v2;
        this.message = s2;
        this.appVersion = s3;
    }

    public AdTokenResponse(String s, long v, long v1, String s1, int v2, String s2, String s3, int v3, w w0) {
        this(s, ((v3 & 2) == 0 ? v : 0L), ((v3 & 4) == 0 ? v1 : 0L), ((v3 & 8) == 0 ? s1 : null), ((v3 & 16) == 0 ? v2 : 0), s2, s3);
    }

    @m
    public final String component1() {
        return this.token;
    }

    public final long component2() {
        return this.createdTime;
    }

    public final long component3() {
        return this.ttl;
    }

    @m
    public final String component4() {
        return this.tokenId;
    }

    public final int component5() {
        return this.code;
    }

    @l
    public final String component6() {
        return this.message;
    }

    @l
    public final String component7() {
        return this.appVersion;
    }

    @l
    public final AdTokenResponse copy(@m String s, long v, long v1, @m String s1, int v2, @l String s2, @l String s3) {
        L.p(s2, "message");
        L.p(s3, "appVersion");
        return new AdTokenResponse(s, v, v1, s1, v2, s2, s3);
    }

    public static AdTokenResponse copy$default(AdTokenResponse adTokenResponse0, String s, long v, long v1, String s1, int v2, String s2, String s3, int v3, Object object0) {
        String s4 = (v3 & 1) == 0 ? s : adTokenResponse0.token;
        long v4 = (v3 & 2) == 0 ? v : adTokenResponse0.createdTime;
        long v5 = (v3 & 4) == 0 ? v1 : adTokenResponse0.ttl;
        String s5 = (v3 & 8) == 0 ? s1 : adTokenResponse0.tokenId;
        int v6 = (v3 & 16) == 0 ? v2 : adTokenResponse0.code;
        String s6 = (v3 & 0x20) == 0 ? s2 : adTokenResponse0.message;
        return (v3 & 0x40) == 0 ? adTokenResponse0.copy(s4, v4, v5, s5, v6, s6, s3) : adTokenResponse0.copy(s4, v4, v5, s5, v6, s6, adTokenResponse0.appVersion);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdTokenResponse)) {
            return false;
        }
        if(!L.g(this.token, ((AdTokenResponse)object0).token)) {
            return false;
        }
        if(this.createdTime != ((AdTokenResponse)object0).createdTime) {
            return false;
        }
        if(this.ttl != ((AdTokenResponse)object0).ttl) {
            return false;
        }
        if(!L.g(this.tokenId, ((AdTokenResponse)object0).tokenId)) {
            return false;
        }
        if(this.code != ((AdTokenResponse)object0).code) {
            return false;
        }
        return L.g(this.message, ((AdTokenResponse)object0).message) ? L.g(this.appVersion, ((AdTokenResponse)object0).appVersion) : false;
    }

    @l
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getCode() {
        return this.code;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    @l
    public final String getMessage() {
        return this.message;
    }

    @m
    public final String getToken() {
        return this.token;
    }

    @m
    public final String getTokenId() {
        return this.tokenId;
    }

    public final long getTtl() {
        return this.ttl;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.token == null ? 0 : this.token.hashCode();
        int v2 = (int)(this.createdTime ^ this.createdTime >>> 0x20);
        int v3 = (int)(this.ttl ^ this.ttl >>> 0x20);
        String s = this.tokenId;
        if(s != null) {
            v = s.hashCode();
        }
        return (((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v) * 0x1F + this.code) * 0x1F + this.message.hashCode()) * 0x1F + this.appVersion.hashCode();
    }

    public final boolean isUnexpired() {
        return this.token != null && System.currentTimeMillis() < (this.createdTime + this.ttl) * 1000L;
    }

    @Override
    @l
    public String toString() {
        return "AdTokenResponse(token=" + this.token + ", createdTime=" + this.createdTime + ", ttl=" + this.ttl + ", tokenId=" + this.tokenId + ", code=" + this.code + ", message=" + this.message + ", appVersion=" + this.appVersion + ')';
    }
}

