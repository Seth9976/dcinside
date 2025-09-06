package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdsDto implements DTO {
    @m
    private final List placementGroups;
    @m
    private final String requestId;

    public AdsDto() {
        this(null, null, 3, null);
    }

    public AdsDto(@m String s, @m List list0) {
        this.requestId = s;
        this.placementGroups = list0;
    }

    public AdsDto(String s, List list0, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            list0 = null;
        }
        this(s, list0);
    }

    @m
    public final String component1() {
        return this.requestId;
    }

    @m
    public final List component2() {
        return this.placementGroups;
    }

    @l
    public final AdsDto copy(@m String s, @m List list0) {
        return new AdsDto(s, list0);
    }

    public static AdsDto copy$default(AdsDto adsDto0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            s = adsDto0.requestId;
        }
        if((v & 2) != 0) {
            list0 = adsDto0.placementGroups;
        }
        return adsDto0.copy(s, list0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdsDto)) {
            return false;
        }
        return L.g(this.requestId, ((AdsDto)object0).requestId) ? L.g(this.placementGroups, ((AdsDto)object0).placementGroups) : false;
    }

    @m
    public final List getPlacementGroups() {
        return this.placementGroups;
    }

    @m
    public final String getRequestId() {
        return this.requestId;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.requestId == null ? 0 : this.requestId.hashCode();
        List list0 = this.placementGroups;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "AdsDto(requestId=" + this.requestId + ", placementGroups=" + this.placementGroups + ')';
    }
}

