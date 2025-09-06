package com.coupang.ads.viewmodels;

import J.b;
import J.d;
import com.coupang.ads.dto.DTO;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdsRequest implements DTO {
    @l
    private final d adsMode;
    @m
    private final String affiliatePage;
    @m
    private final String affiliatePlacement;
    @l
    private final b creativeSize;
    @m
    private final String puid;
    @l
    private final String widgetId;

    public AdsRequest(@l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        super();
        this.widgetId = s;
        this.creativeSize = b0;
        this.adsMode = d0;
        this.affiliatePage = s1;
        this.affiliatePlacement = s2;
        this.puid = s3;
    }

    public AdsRequest(String s, b b0, d d0, String s1, String s2, String s3, int v, w w0) {
        if((v & 4) != 0) {
            d0 = d.a;
        }
        this(s, b0, d0, ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null), ((v & 0x20) == 0 ? s3 : null));
    }

    @l
    public final String component1() {
        return this.widgetId;
    }

    @l
    public final b component2() {
        return this.creativeSize;
    }

    @l
    public final d component3() {
        return this.adsMode;
    }

    @m
    public final String component4() {
        return this.affiliatePage;
    }

    @m
    public final String component5() {
        return this.affiliatePlacement;
    }

    @m
    public final String component6() {
        return this.puid;
    }

    @l
    public final AdsRequest copy(@l String s, @l b b0, @l d d0, @m String s1, @m String s2, @m String s3) {
        L.p(s, "widgetId");
        L.p(b0, "creativeSize");
        L.p(d0, "adsMode");
        return new AdsRequest(s, b0, d0, s1, s2, s3);
    }

    public static AdsRequest copy$default(AdsRequest adsRequest0, String s, b b0, d d0, String s1, String s2, String s3, int v, Object object0) {
        if((v & 1) != 0) {
            s = adsRequest0.widgetId;
        }
        if((v & 2) != 0) {
            b0 = adsRequest0.creativeSize;
        }
        if((v & 4) != 0) {
            d0 = adsRequest0.adsMode;
        }
        if((v & 8) != 0) {
            s1 = adsRequest0.affiliatePage;
        }
        if((v & 16) != 0) {
            s2 = adsRequest0.affiliatePlacement;
        }
        if((v & 0x20) != 0) {
            s3 = adsRequest0.puid;
        }
        return adsRequest0.copy(s, b0, d0, s1, s2, s3);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdsRequest)) {
            return false;
        }
        if(!L.g(this.widgetId, ((AdsRequest)object0).widgetId)) {
            return false;
        }
        if(this.creativeSize != ((AdsRequest)object0).creativeSize) {
            return false;
        }
        if(this.adsMode != ((AdsRequest)object0).adsMode) {
            return false;
        }
        if(!L.g(this.affiliatePage, ((AdsRequest)object0).affiliatePage)) {
            return false;
        }
        return L.g(this.affiliatePlacement, ((AdsRequest)object0).affiliatePlacement) ? L.g(this.puid, ((AdsRequest)object0).puid) : false;
    }

    @l
    public final d getAdsMode() {
        return this.adsMode;
    }

    @m
    public final String getAffiliatePage() {
        return this.affiliatePage;
    }

    @m
    public final String getAffiliatePlacement() {
        return this.affiliatePlacement;
    }

    @l
    public final b getCreativeSize() {
        return this.creativeSize;
    }

    @m
    public final String getPuid() {
        return this.puid;
    }

    @l
    public final String getWidgetId() {
        return this.widgetId;
    }

    @Override
    public int hashCode() {
        int v = this.widgetId.hashCode();
        int v1 = this.creativeSize.hashCode();
        int v2 = this.adsMode.hashCode();
        int v3 = 0;
        int v4 = this.affiliatePage == null ? 0 : this.affiliatePage.hashCode();
        int v5 = this.affiliatePlacement == null ? 0 : this.affiliatePlacement.hashCode();
        String s = this.puid;
        if(s != null) {
            v3 = s.hashCode();
        }
        return ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3;
    }

    @Override
    @l
    public String toString() {
        return "AdsRequest(widgetId=" + this.widgetId + ", creativeSize=" + this.creativeSize + ", adsMode=" + this.adsMode + ", affiliatePage=" + this.affiliatePage + ", affiliatePlacement=" + this.affiliatePlacement + ", puid=" + this.puid + ')';
    }
}

