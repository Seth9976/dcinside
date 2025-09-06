package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class Property implements DTO {
    @m
    private final String affiliate_placement;
    @m
    private final String sdk_creative_size;
    @m
    private final String sdk_creative_type;
    @m
    private final String widget_id;

    public Property() {
        this(null, null, null, null, 15, null);
    }

    public Property(@m String s, @m String s1, @m String s2, @m String s3) {
        this.widget_id = s;
        this.sdk_creative_type = s1;
        this.sdk_creative_size = s2;
        this.affiliate_placement = s3;
    }

    public Property(String s, String s1, String s2, String s3, int v, w w0) {
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
        return this.widget_id;
    }

    @m
    public final String component2() {
        return this.sdk_creative_type;
    }

    @m
    public final String component3() {
        return this.sdk_creative_size;
    }

    @m
    public final String component4() {
        return this.affiliate_placement;
    }

    @l
    public final Property copy(@m String s, @m String s1, @m String s2, @m String s3) {
        return new Property(s, s1, s2, s3);
    }

    public static Property copy$default(Property property0, String s, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = property0.widget_id;
        }
        if((v & 2) != 0) {
            s1 = property0.sdk_creative_type;
        }
        if((v & 4) != 0) {
            s2 = property0.sdk_creative_size;
        }
        if((v & 8) != 0) {
            s3 = property0.affiliate_placement;
        }
        return property0.copy(s, s1, s2, s3);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Property)) {
            return false;
        }
        if(!L.g(this.widget_id, ((Property)object0).widget_id)) {
            return false;
        }
        if(!L.g(this.sdk_creative_type, ((Property)object0).sdk_creative_type)) {
            return false;
        }
        return L.g(this.sdk_creative_size, ((Property)object0).sdk_creative_size) ? L.g(this.affiliate_placement, ((Property)object0).affiliate_placement) : false;
    }

    @m
    public final String getAffiliate_placement() {
        return this.affiliate_placement;
    }

    @m
    public final String getSdk_creative_size() {
        return this.sdk_creative_size;
    }

    @m
    public final String getSdk_creative_type() {
        return this.sdk_creative_type;
    }

    @m
    public final String getWidget_id() {
        return this.widget_id;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.widget_id == null ? 0 : this.widget_id.hashCode();
        int v2 = this.sdk_creative_type == null ? 0 : this.sdk_creative_type.hashCode();
        int v3 = this.sdk_creative_size == null ? 0 : this.sdk_creative_size.hashCode();
        String s = this.affiliate_placement;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "Property(widget_id=" + this.widget_id + ", sdk_creative_type=" + this.sdk_creative_type + ", sdk_creative_size=" + this.sdk_creative_size + ", affiliate_placement=" + this.affiliate_placement + ')';
    }
}

