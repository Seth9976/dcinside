package com.coupang.ads.dto;

import java.util.ArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdsProductPage implements DTO {
    @m
    private ArrayList adsProductList;
    @m
    private Impression baseImpression;
    @m
    private String creativeTemplate;
    @m
    private String loadingImpressionUrl;
    @m
    private String optOut;

    public AdsProductPage() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public AdsProductPage(@m ArrayList arrayList0, @m String s, @m Impression impression0, @m String s1, @m String s2) {
        this.adsProductList = arrayList0;
        this.loadingImpressionUrl = s;
        this.baseImpression = impression0;
        this.optOut = s1;
        this.creativeTemplate = s2;
    }

    public AdsProductPage(ArrayList arrayList0, String s, Impression impression0, String s1, String s2, int v, w w0) {
        this(((v & 1) == 0 ? arrayList0 : null), ((v & 2) == 0 ? s : null), ((v & 4) == 0 ? impression0 : null), ((v & 8) == 0 ? s1 : null), ((v & 16) == 0 ? s2 : null));
    }

    @m
    public final ArrayList component1() {
        return this.adsProductList;
    }

    @m
    public final String component2() {
        return this.loadingImpressionUrl;
    }

    @m
    public final Impression component3() {
        return this.baseImpression;
    }

    @m
    public final String component4() {
        return this.optOut;
    }

    @m
    public final String component5() {
        return this.creativeTemplate;
    }

    @l
    public final AdsProductPage copy(@m ArrayList arrayList0, @m String s, @m Impression impression0, @m String s1, @m String s2) {
        return new AdsProductPage(arrayList0, s, impression0, s1, s2);
    }

    public static AdsProductPage copy$default(AdsProductPage adsProductPage0, ArrayList arrayList0, String s, Impression impression0, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            arrayList0 = adsProductPage0.adsProductList;
        }
        if((v & 2) != 0) {
            s = adsProductPage0.loadingImpressionUrl;
        }
        if((v & 4) != 0) {
            impression0 = adsProductPage0.baseImpression;
        }
        if((v & 8) != 0) {
            s1 = adsProductPage0.optOut;
        }
        if((v & 16) != 0) {
            s2 = adsProductPage0.creativeTemplate;
        }
        return adsProductPage0.copy(arrayList0, s, impression0, s1, s2);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdsProductPage)) {
            return false;
        }
        if(!L.g(this.adsProductList, ((AdsProductPage)object0).adsProductList)) {
            return false;
        }
        if(!L.g(this.loadingImpressionUrl, ((AdsProductPage)object0).loadingImpressionUrl)) {
            return false;
        }
        if(!L.g(this.baseImpression, ((AdsProductPage)object0).baseImpression)) {
            return false;
        }
        return L.g(this.optOut, ((AdsProductPage)object0).optOut) ? L.g(this.creativeTemplate, ((AdsProductPage)object0).creativeTemplate) : false;
    }

    @m
    public final ArrayList getAdsProductList() {
        return this.adsProductList;
    }

    @m
    public final Impression getBaseImpression() {
        return this.baseImpression;
    }

    @m
    public final String getCreativeTemplate() {
        return this.creativeTemplate;
    }

    @m
    public final String getLoadingImpressionUrl() {
        return this.loadingImpressionUrl;
    }

    @m
    public final String getOptOut() {
        return this.optOut;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.adsProductList == null ? 0 : this.adsProductList.hashCode();
        int v2 = this.loadingImpressionUrl == null ? 0 : this.loadingImpressionUrl.hashCode();
        int v3 = this.baseImpression == null ? 0 : this.baseImpression.hashCode();
        int v4 = this.optOut == null ? 0 : this.optOut.hashCode();
        String s = this.creativeTemplate;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v;
    }

    public final void setAdsProductList(@m ArrayList arrayList0) {
        this.adsProductList = arrayList0;
    }

    public final void setBaseImpression(@m Impression impression0) {
        this.baseImpression = impression0;
    }

    public final void setCreativeTemplate(@m String s) {
        this.creativeTemplate = s;
    }

    public final void setLoadingImpressionUrl(@m String s) {
        this.loadingImpressionUrl = s;
    }

    public final void setOptOut(@m String s) {
        this.optOut = s;
    }

    @Override
    @l
    public String toString() [...] // 潜在的解密器
}

