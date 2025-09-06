package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdsProduct implements DTO {
    @m
    private final String clickUrl;
    @m
    private final String eventId;
    @m
    private final String groupId;
    @m
    private final String imageMainPath;
    @m
    private final Impression impression;
    @m
    private final String itemId;
    @m
    private String orgPrice;
    @m
    private String price;
    @m
    private Double ratingAverage;
    @m
    private Long ratingCount;
    @m
    private final String requestId;
    @m
    private String rocketBadge;
    @m
    private final String title;
    @m
    private final String winnerVendorId;

    public AdsProduct() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFF, null);
    }

    public AdsProduct(@m String s, @m String s1, @m String s2, @m String s3, @m Double double0, @m Long long0, @m String s4, @m Impression impression0, @m String s5, @m String s6, @m String s7, @m String s8, @m String s9, @m String s10) {
        this.requestId = s;
        this.title = s1;
        this.imageMainPath = s2;
        this.price = s3;
        this.ratingAverage = double0;
        this.ratingCount = long0;
        this.clickUrl = s4;
        this.impression = impression0;
        this.winnerVendorId = s5;
        this.groupId = s6;
        this.itemId = s7;
        this.eventId = s8;
        this.rocketBadge = s9;
        this.orgPrice = s10;
    }

    public AdsProduct(String s, String s1, String s2, String s3, Double double0, Long long0, String s4, Impression impression0, String s5, String s6, String s7, String s8, String s9, String s10, int v, w w0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? s3 : null), ((v & 16) == 0 ? double0 : null), ((v & 0x20) == 0 ? long0 : null), ((v & 0x40) == 0 ? s4 : null), ((v & 0x80) == 0 ? impression0 : null), ((v & 0x100) == 0 ? s5 : null), ((v & 0x200) == 0 ? s6 : null), ((v & 0x400) == 0 ? s7 : null), ((v & 0x800) == 0 ? s8 : null), ((v & 0x1000) == 0 ? s9 : null), ((v & 0x2000) == 0 ? s10 : null));
    }

    @m
    public final String component1() {
        return this.requestId;
    }

    @m
    public final String component10() {
        return this.groupId;
    }

    @m
    public final String component11() {
        return this.itemId;
    }

    @m
    public final String component12() {
        return this.eventId;
    }

    @m
    public final String component13() {
        return this.rocketBadge;
    }

    @m
    public final String component14() {
        return this.orgPrice;
    }

    @m
    public final String component2() {
        return this.title;
    }

    @m
    public final String component3() {
        return this.imageMainPath;
    }

    @m
    public final String component4() {
        return this.price;
    }

    @m
    public final Double component5() {
        return this.ratingAverage;
    }

    @m
    public final Long component6() {
        return this.ratingCount;
    }

    @m
    public final String component7() {
        return this.clickUrl;
    }

    @m
    public final Impression component8() {
        return this.impression;
    }

    @m
    public final String component9() {
        return this.winnerVendorId;
    }

    @l
    public final AdsProduct copy(@m String s, @m String s1, @m String s2, @m String s3, @m Double double0, @m Long long0, @m String s4, @m Impression impression0, @m String s5, @m String s6, @m String s7, @m String s8, @m String s9, @m String s10) {
        return new AdsProduct(s, s1, s2, s3, double0, long0, s4, impression0, s5, s6, s7, s8, s9, s10);
    }

    public static AdsProduct copy$default(AdsProduct adsProduct0, String s, String s1, String s2, String s3, Double double0, Long long0, String s4, Impression impression0, String s5, String s6, String s7, String s8, String s9, String s10, int v, Object object0) {
        String s11 = (v & 1) == 0 ? s : adsProduct0.requestId;
        String s12 = (v & 2) == 0 ? s1 : adsProduct0.title;
        String s13 = (v & 4) == 0 ? s2 : adsProduct0.imageMainPath;
        String s14 = (v & 8) == 0 ? s3 : adsProduct0.price;
        Double double1 = (v & 16) == 0 ? double0 : adsProduct0.ratingAverage;
        Long long1 = (v & 0x20) == 0 ? long0 : adsProduct0.ratingCount;
        String s15 = (v & 0x40) == 0 ? s4 : adsProduct0.clickUrl;
        Impression impression1 = (v & 0x80) == 0 ? impression0 : adsProduct0.impression;
        String s16 = (v & 0x100) == 0 ? s5 : adsProduct0.winnerVendorId;
        String s17 = (v & 0x200) == 0 ? s6 : adsProduct0.groupId;
        String s18 = (v & 0x400) == 0 ? s7 : adsProduct0.itemId;
        String s19 = (v & 0x800) == 0 ? s8 : adsProduct0.eventId;
        String s20 = (v & 0x1000) == 0 ? s9 : adsProduct0.rocketBadge;
        return (v & 0x2000) == 0 ? adsProduct0.copy(s11, s12, s13, s14, double1, long1, s15, impression1, s16, s17, s18, s19, s20, s10) : adsProduct0.copy(s11, s12, s13, s14, double1, long1, s15, impression1, s16, s17, s18, s19, s20, adsProduct0.orgPrice);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AdsProduct)) {
            return false;
        }
        if(!L.g(this.requestId, ((AdsProduct)object0).requestId)) {
            return false;
        }
        if(!L.g(this.title, ((AdsProduct)object0).title)) {
            return false;
        }
        if(!L.g(this.imageMainPath, ((AdsProduct)object0).imageMainPath)) {
            return false;
        }
        if(!L.g(this.price, ((AdsProduct)object0).price)) {
            return false;
        }
        if(!L.g(this.ratingAverage, ((AdsProduct)object0).ratingAverage)) {
            return false;
        }
        if(!L.g(this.ratingCount, ((AdsProduct)object0).ratingCount)) {
            return false;
        }
        if(!L.g(this.clickUrl, ((AdsProduct)object0).clickUrl)) {
            return false;
        }
        if(!L.g(this.impression, ((AdsProduct)object0).impression)) {
            return false;
        }
        if(!L.g(this.winnerVendorId, ((AdsProduct)object0).winnerVendorId)) {
            return false;
        }
        if(!L.g(this.groupId, ((AdsProduct)object0).groupId)) {
            return false;
        }
        if(!L.g(this.itemId, ((AdsProduct)object0).itemId)) {
            return false;
        }
        if(!L.g(this.eventId, ((AdsProduct)object0).eventId)) {
            return false;
        }
        return L.g(this.rocketBadge, ((AdsProduct)object0).rocketBadge) ? L.g(this.orgPrice, ((AdsProduct)object0).orgPrice) : false;
    }

    @m
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @m
    public final String getEventId() {
        return this.eventId;
    }

    @m
    public final String getGroupId() {
        return this.groupId;
    }

    @m
    public final String getImageMainPath() {
        return this.imageMainPath;
    }

    @m
    public final Impression getImpression() {
        return this.impression;
    }

    @m
    public final String getItemId() {
        return this.itemId;
    }

    @m
    public final String getOrgPrice() {
        return this.orgPrice;
    }

    @m
    public final String getPrice() {
        return this.price;
    }

    @m
    public final Double getRatingAverage() {
        return this.ratingAverage;
    }

    @m
    public final Long getRatingCount() {
        return this.ratingCount;
    }

    @m
    public final String getRequestId() {
        return this.requestId;
    }

    @m
    public final String getRocketBadge() {
        return this.rocketBadge;
    }

    @m
    public final String getTitle() {
        return this.title;
    }

    @m
    public final String getWinnerVendorId() {
        return this.winnerVendorId;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.requestId == null ? 0 : this.requestId.hashCode();
        int v2 = this.title == null ? 0 : this.title.hashCode();
        int v3 = this.imageMainPath == null ? 0 : this.imageMainPath.hashCode();
        int v4 = this.price == null ? 0 : this.price.hashCode();
        int v5 = this.ratingAverage == null ? 0 : this.ratingAverage.hashCode();
        int v6 = this.ratingCount == null ? 0 : this.ratingCount.hashCode();
        int v7 = this.clickUrl == null ? 0 : this.clickUrl.hashCode();
        int v8 = this.impression == null ? 0 : this.impression.hashCode();
        int v9 = this.winnerVendorId == null ? 0 : this.winnerVendorId.hashCode();
        int v10 = this.groupId == null ? 0 : this.groupId.hashCode();
        int v11 = this.itemId == null ? 0 : this.itemId.hashCode();
        int v12 = this.eventId == null ? 0 : this.eventId.hashCode();
        int v13 = this.rocketBadge == null ? 0 : this.rocketBadge.hashCode();
        String s = this.orgPrice;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v;
    }

    public final void setOrgPrice(@m String s) {
        this.orgPrice = s;
    }

    public final void setPrice(@m String s) {
        this.price = s;
    }

    public final void setRatingAverage(@m Double double0) {
        this.ratingAverage = double0;
    }

    public final void setRatingCount(@m Long long0) {
        this.ratingCount = long0;
    }

    public final void setRocketBadge(@m String s) {
        this.rocketBadge = s;
    }

    @Override
    @l
    public String toString() [...] // 潜在的解密器
}

