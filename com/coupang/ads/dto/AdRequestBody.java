package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdRequestBody implements DTO {
    @m
    private final List placementGroupInfo;
    @m
    private final RawParameter rawParameters;
    @m
    private final String requestId;

    public AdRequestBody() {
        this(null, null, null, 7, null);
    }

    public AdRequestBody(@m String s, @m List list0, @m RawParameter rawParameter0) {
        this.requestId = s;
        this.placementGroupInfo = list0;
        this.rawParameters = rawParameter0;
    }

    public AdRequestBody(String s, List list0, RawParameter rawParameter0, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            list0 = null;
        }
        if((v & 4) != 0) {
            rawParameter0 = null;
        }
        this(s, list0, rawParameter0);
    }

    @m
    public final String component1() {
        return this.requestId;
    }

    @m
    public final List component2() {
        return this.placementGroupInfo;
    }

    @m
    public final RawParameter component3() {
        return this.rawParameters;
    }

    @l
    public final AdRequestBody copy(@m String s, @m List list0, @m RawParameter rawParameter0) {
        return new AdRequestBody(s, list0, rawParameter0);
    }

    public static AdRequestBody copy$default(AdRequestBody adRequestBody0, String s, List list0, RawParameter rawParameter0, int v, Object object0) {
        if((v & 1) != 0) {
            s = adRequestBody0.requestId;
        }
        if((v & 2) != 0) {
            list0 = adRequestBody0.placementGroupInfo;
        }
        if((v & 4) != 0) {
            rawParameter0 = adRequestBody0.rawParameters;
        }
        return adRequestBody0.copy(s, list0, rawParameter0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdRequestBody)) {
            return false;
        }
        if(!L.g(this.requestId, ((AdRequestBody)object0).requestId)) {
            return false;
        }
        return L.g(this.placementGroupInfo, ((AdRequestBody)object0).placementGroupInfo) ? L.g(this.rawParameters, ((AdRequestBody)object0).rawParameters) : false;
    }

    @m
    public final List getPlacementGroupInfo() {
        return this.placementGroupInfo;
    }

    @m
    public final RawParameter getRawParameters() {
        return this.rawParameters;
    }

    @m
    public final String getRequestId() {
        return this.requestId;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.requestId == null ? 0 : this.requestId.hashCode();
        int v2 = this.placementGroupInfo == null ? 0 : this.placementGroupInfo.hashCode();
        RawParameter rawParameter0 = this.rawParameters;
        if(rawParameter0 != null) {
            v = rawParameter0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "AdRequestBody(requestId=" + this.requestId + ", placementGroupInfo=" + this.placementGroupInfo + ", rawParameters=" + this.rawParameters + ')';
    }
}

