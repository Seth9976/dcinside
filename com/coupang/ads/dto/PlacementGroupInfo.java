package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class PlacementGroupInfo implements DTO {
    @m
    private final List ads;
    @m
    private final ImpressionDetails properties;

    public PlacementGroupInfo() {
        this(null, null, 3, null);
    }

    public PlacementGroupInfo(@m List list0, @m ImpressionDetails impressionDetails0) {
        this.ads = list0;
        this.properties = impressionDetails0;
    }

    public PlacementGroupInfo(List list0, ImpressionDetails impressionDetails0, int v, w w0) {
        if((v & 1) != 0) {
            list0 = null;
        }
        if((v & 2) != 0) {
            impressionDetails0 = null;
        }
        this(list0, impressionDetails0);
    }

    @m
    public final List component1() {
        return this.ads;
    }

    @m
    public final ImpressionDetails component2() {
        return this.properties;
    }

    @l
    public final PlacementGroupInfo copy(@m List list0, @m ImpressionDetails impressionDetails0) {
        return new PlacementGroupInfo(list0, impressionDetails0);
    }

    public static PlacementGroupInfo copy$default(PlacementGroupInfo placementGroupInfo0, List list0, ImpressionDetails impressionDetails0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = placementGroupInfo0.ads;
        }
        if((v & 2) != 0) {
            impressionDetails0 = placementGroupInfo0.properties;
        }
        return placementGroupInfo0.copy(list0, impressionDetails0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PlacementGroupInfo)) {
            return false;
        }
        return L.g(this.ads, ((PlacementGroupInfo)object0).ads) ? L.g(this.properties, ((PlacementGroupInfo)object0).properties) : false;
    }

    @m
    public final List getAds() {
        return this.ads;
    }

    @m
    public final ImpressionDetails getProperties() {
        return this.properties;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.ads == null ? 0 : this.ads.hashCode();
        ImpressionDetails impressionDetails0 = this.properties;
        if(impressionDetails0 != null) {
            v = impressionDetails0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "PlacementGroupInfo(ads=" + this.ads + ", properties=" + this.properties + ')';
    }
}

