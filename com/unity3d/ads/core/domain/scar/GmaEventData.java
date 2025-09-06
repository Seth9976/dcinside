package com.unity3d.ads.core.domain.scar;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.banners.bridge.BannerBridge.BannerEvent;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class GmaEventData {
    @m
    private final BannerEvent bannerEvent;
    @m
    private final Integer errorCode;
    @m
    private final String errorMessage;
    @l
    private final c gmaEvent;
    @m
    private final String opportunityId;
    @m
    private final String placementId;
    @m
    private final String queryId;

    public GmaEventData(@l c c0, @m BannerEvent bannerBridge$BannerEvent0, @m String s, @m String s1, @m String s2, @m String s3, @m Integer integer0) {
        L.p(c0, "gmaEvent");
        super();
        this.gmaEvent = c0;
        this.bannerEvent = bannerBridge$BannerEvent0;
        this.opportunityId = s;
        this.placementId = s1;
        this.queryId = s2;
        this.errorMessage = s3;
        this.errorCode = integer0;
    }

    public GmaEventData(c c0, BannerEvent bannerBridge$BannerEvent0, String s, String s1, String s2, String s3, Integer integer0, int v, w w0) {
        this(c0, ((v & 2) == 0 ? bannerBridge$BannerEvent0 : null), ((v & 4) == 0 ? s : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? integer0 : null));
    }

    @l
    public final c component1() {
        return this.gmaEvent;
    }

    @m
    public final BannerEvent component2() {
        return this.bannerEvent;
    }

    @m
    public final String component3() {
        return this.opportunityId;
    }

    @m
    public final String component4() {
        return this.placementId;
    }

    @m
    public final String component5() {
        return this.queryId;
    }

    @m
    public final String component6() {
        return this.errorMessage;
    }

    @m
    public final Integer component7() {
        return this.errorCode;
    }

    @l
    public final GmaEventData copy(@l c c0, @m BannerEvent bannerBridge$BannerEvent0, @m String s, @m String s1, @m String s2, @m String s3, @m Integer integer0) {
        L.p(c0, "gmaEvent");
        return new GmaEventData(c0, bannerBridge$BannerEvent0, s, s1, s2, s3, integer0);
    }

    public static GmaEventData copy$default(GmaEventData gmaEventData0, c c0, BannerEvent bannerBridge$BannerEvent0, String s, String s1, String s2, String s3, Integer integer0, int v, Object object0) {
        if((v & 1) != 0) {
            c0 = gmaEventData0.gmaEvent;
        }
        if((v & 2) != 0) {
            bannerBridge$BannerEvent0 = gmaEventData0.bannerEvent;
        }
        if((v & 4) != 0) {
            s = gmaEventData0.opportunityId;
        }
        if((v & 8) != 0) {
            s1 = gmaEventData0.placementId;
        }
        if((v & 16) != 0) {
            s2 = gmaEventData0.queryId;
        }
        if((v & 0x20) != 0) {
            s3 = gmaEventData0.errorMessage;
        }
        if((v & 0x40) != 0) {
            integer0 = gmaEventData0.errorCode;
        }
        return gmaEventData0.copy(c0, bannerBridge$BannerEvent0, s, s1, s2, s3, integer0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GmaEventData)) {
            return false;
        }
        if(this.gmaEvent != ((GmaEventData)object0).gmaEvent) {
            return false;
        }
        if(this.bannerEvent != ((GmaEventData)object0).bannerEvent) {
            return false;
        }
        if(!L.g(this.opportunityId, ((GmaEventData)object0).opportunityId)) {
            return false;
        }
        if(!L.g(this.placementId, ((GmaEventData)object0).placementId)) {
            return false;
        }
        if(!L.g(this.queryId, ((GmaEventData)object0).queryId)) {
            return false;
        }
        return L.g(this.errorMessage, ((GmaEventData)object0).errorMessage) ? L.g(this.errorCode, ((GmaEventData)object0).errorCode) : false;
    }

    @m
    public final BannerEvent getBannerEvent() {
        return this.bannerEvent;
    }

    @m
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    @m
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @l
    public final c getGmaEvent() {
        return this.gmaEvent;
    }

    @m
    public final String getOpportunityId() {
        return this.opportunityId;
    }

    @m
    public final String getPlacementId() {
        return this.placementId;
    }

    @m
    public final String getQueryId() {
        return this.queryId;
    }

    @Override
    public int hashCode() {
        int v = this.gmaEvent.hashCode();
        int v1 = 0;
        int v2 = this.bannerEvent == null ? 0 : this.bannerEvent.hashCode();
        int v3 = this.opportunityId == null ? 0 : this.opportunityId.hashCode();
        int v4 = this.placementId == null ? 0 : this.placementId.hashCode();
        int v5 = this.queryId == null ? 0 : this.queryId.hashCode();
        int v6 = this.errorMessage == null ? 0 : this.errorMessage.hashCode();
        Integer integer0 = this.errorCode;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return (((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v1;
    }

    @Override
    @l
    public String toString() {
        return "GmaEventData(gmaEvent=" + this.gmaEvent + ", bannerEvent=" + this.bannerEvent + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", queryId=" + this.queryId + ", errorMessage=" + this.errorMessage + ", errorCode=" + this.errorCode + ')';
    }
}

