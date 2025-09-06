package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ImpressionDetails implements DTO {
    @m
    private String creative_template;
    @m
    private final String impression_url;
    @m
    private final String loading_impression_url;
    @m
    private final String optout_url;

    public ImpressionDetails() {
        this(null, null, null, null, 15, null);
    }

    public ImpressionDetails(@m String s, @m String s1, @m String s2, @m String s3) {
        this.impression_url = s;
        this.loading_impression_url = s1;
        this.optout_url = s2;
        this.creative_template = s3;
    }

    public ImpressionDetails(String s, String s1, String s2, String s3, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        if((v & 8) != 0) {
            s3 = null;
        }
        this(s, s1, s2, s3);
    }

    @m
    public final String component1() {
        return this.impression_url;
    }

    @m
    public final String component2() {
        return this.loading_impression_url;
    }

    @m
    public final String component3() {
        return this.optout_url;
    }

    @m
    public final String component4() {
        return this.creative_template;
    }

    @l
    public final ImpressionDetails copy(@m String s, @m String s1, @m String s2, @m String s3) {
        return new ImpressionDetails(s, s1, s2, s3);
    }

    public static ImpressionDetails copy$default(ImpressionDetails impressionDetails0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = impressionDetails0.impression_url;
        }
        if((v & 2) != 0) {
            s1 = impressionDetails0.loading_impression_url;
        }
        if((v & 4) != 0) {
            s2 = impressionDetails0.optout_url;
        }
        if((v & 8) != 0) {
            s3 = impressionDetails0.creative_template;
        }
        return impressionDetails0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ImpressionDetails)) {
            return false;
        }
        if(!L.g(this.impression_url, ((ImpressionDetails)object0).impression_url)) {
            return false;
        }
        if(!L.g(this.loading_impression_url, ((ImpressionDetails)object0).loading_impression_url)) {
            return false;
        }
        return L.g(this.optout_url, ((ImpressionDetails)object0).optout_url) ? L.g(this.creative_template, ((ImpressionDetails)object0).creative_template) : false;
    }

    @m
    public final String getCreative_template() {
        return this.creative_template;
    }

    @m
    public final String getImpression_url() {
        return this.impression_url;
    }

    @m
    public final String getLoading_impression_url() {
        return this.loading_impression_url;
    }

    @m
    public final String getOptout_url() {
        return this.optout_url;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.impression_url == null ? 0 : this.impression_url.hashCode();
        int v2 = this.loading_impression_url == null ? 0 : this.loading_impression_url.hashCode();
        int v3 = this.optout_url == null ? 0 : this.optout_url.hashCode();
        String s = this.creative_template;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    public final void setCreative_template(@m String s) {
        this.creative_template = s;
    }

    @Override
    @l
    public String toString() {
        return "ImpressionDetails(impression_url=" + this.impression_url + ", loading_impression_url=" + this.loading_impression_url + ", optout_url=" + this.optout_url + ", creative_template=" + this.creative_template + ')';
    }
}

