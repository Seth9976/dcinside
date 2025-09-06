package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class ProductDetails implements DTO {
    @m
    private String clickUrl;
    @m
    private List deliveryChargeType;
    @m
    private String eventId;
    @m
    private String groupId;
    @m
    private String imageMainPath;
    @m
    private String impressionUrl;
    @m
    private List inventoryType;
    @m
    private String itemId;
    @m
    private String orgPrice;
    @m
    private String price;
    @m
    private Double ratingAverage;
    @m
    private Long ratingCount;
    @m
    private String title;
    @m
    private String winnerVendorItemId;

    public ProductDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFF, null);
    }

    public ProductDetails(@m String s, @m String s1, @m String s2, @m Double double0, @m Long long0, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7, @m String s8, @m List list0, @m List list1, @m String s9) {
        this.title = s;
        this.imageMainPath = s1;
        this.price = s2;
        this.ratingAverage = double0;
        this.ratingCount = long0;
        this.clickUrl = s3;
        this.impressionUrl = s4;
        this.winnerVendorItemId = s5;
        this.eventId = s6;
        this.groupId = s7;
        this.itemId = s8;
        this.inventoryType = list0;
        this.deliveryChargeType = list1;
        this.orgPrice = s9;
    }

    public ProductDetails(String s, String s1, String s2, Double double0, Long long0, String s3, String s4, String s5, String s6, String s7, String s8, List list0, List list1, String s9, int v, w w0) {
        this(((v & 1) == 0 ? s : null), ((v & 2) == 0 ? s1 : null), ((v & 4) == 0 ? s2 : null), ((v & 8) == 0 ? double0 : null), ((v & 16) == 0 ? long0 : null), ((v & 0x20) == 0 ? s3 : null), ((v & 0x40) == 0 ? s4 : null), ((v & 0x80) == 0 ? s5 : null), ((v & 0x100) == 0 ? s6 : null), ((v & 0x200) == 0 ? s7 : null), ((v & 0x400) == 0 ? s8 : null), ((v & 0x800) == 0 ? list0 : null), ((v & 0x1000) == 0 ? list1 : null), ((v & 0x2000) == 0 ? s9 : null));
    }

    @m
    public final String component1() {
        return this.title;
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
    public final List component12() {
        return this.inventoryType;
    }

    @m
    public final List component13() {
        return this.deliveryChargeType;
    }

    @m
    public final String component14() {
        return this.orgPrice;
    }

    @m
    public final String component2() {
        return this.imageMainPath;
    }

    @m
    public final String component3() {
        return this.price;
    }

    @m
    public final Double component4() {
        return this.ratingAverage;
    }

    @m
    public final Long component5() {
        return this.ratingCount;
    }

    @m
    public final String component6() {
        return this.clickUrl;
    }

    @m
    public final String component7() {
        return this.impressionUrl;
    }

    @m
    public final String component8() {
        return this.winnerVendorItemId;
    }

    @m
    public final String component9() {
        return this.eventId;
    }

    @l
    public final ProductDetails copy(@m String s, @m String s1, @m String s2, @m Double double0, @m Long long0, @m String s3, @m String s4, @m String s5, @m String s6, @m String s7, @m String s8, @m List list0, @m List list1, @m String s9) {
        return new ProductDetails(s, s1, s2, double0, long0, s3, s4, s5, s6, s7, s8, list0, list1, s9);
    }

    public static ProductDetails copy$default(ProductDetails productDetails0, String s, String s1, String s2, Double double0, Long long0, String s3, String s4, String s5, String s6, String s7, String s8, List list0, List list1, String s9, int v, Object object0) {
        String s10 = (v & 1) == 0 ? s : productDetails0.title;
        String s11 = (v & 2) == 0 ? s1 : productDetails0.imageMainPath;
        String s12 = (v & 4) == 0 ? s2 : productDetails0.price;
        Double double1 = (v & 8) == 0 ? double0 : productDetails0.ratingAverage;
        Long long1 = (v & 16) == 0 ? long0 : productDetails0.ratingCount;
        String s13 = (v & 0x20) == 0 ? s3 : productDetails0.clickUrl;
        String s14 = (v & 0x40) == 0 ? s4 : productDetails0.impressionUrl;
        String s15 = (v & 0x80) == 0 ? s5 : productDetails0.winnerVendorItemId;
        String s16 = (v & 0x100) == 0 ? s6 : productDetails0.eventId;
        String s17 = (v & 0x200) == 0 ? s7 : productDetails0.groupId;
        String s18 = (v & 0x400) == 0 ? s8 : productDetails0.itemId;
        List list2 = (v & 0x800) == 0 ? list0 : productDetails0.inventoryType;
        List list3 = (v & 0x1000) == 0 ? list1 : productDetails0.deliveryChargeType;
        return (v & 0x2000) == 0 ? productDetails0.copy(s10, s11, s12, double1, long1, s13, s14, s15, s16, s17, s18, list2, list3, s9) : productDetails0.copy(s10, s11, s12, double1, long1, s13, s14, s15, s16, s17, s18, list2, list3, productDetails0.orgPrice);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ProductDetails)) {
            return false;
        }
        if(!L.g(this.title, ((ProductDetails)object0).title)) {
            return false;
        }
        if(!L.g(this.imageMainPath, ((ProductDetails)object0).imageMainPath)) {
            return false;
        }
        if(!L.g(this.price, ((ProductDetails)object0).price)) {
            return false;
        }
        if(!L.g(this.ratingAverage, ((ProductDetails)object0).ratingAverage)) {
            return false;
        }
        if(!L.g(this.ratingCount, ((ProductDetails)object0).ratingCount)) {
            return false;
        }
        if(!L.g(this.clickUrl, ((ProductDetails)object0).clickUrl)) {
            return false;
        }
        if(!L.g(this.impressionUrl, ((ProductDetails)object0).impressionUrl)) {
            return false;
        }
        if(!L.g(this.winnerVendorItemId, ((ProductDetails)object0).winnerVendorItemId)) {
            return false;
        }
        if(!L.g(this.eventId, ((ProductDetails)object0).eventId)) {
            return false;
        }
        if(!L.g(this.groupId, ((ProductDetails)object0).groupId)) {
            return false;
        }
        if(!L.g(this.itemId, ((ProductDetails)object0).itemId)) {
            return false;
        }
        if(!L.g(this.inventoryType, ((ProductDetails)object0).inventoryType)) {
            return false;
        }
        return L.g(this.deliveryChargeType, ((ProductDetails)object0).deliveryChargeType) ? L.g(this.orgPrice, ((ProductDetails)object0).orgPrice) : false;
    }

    @m
    public final String getClickUrl() {
        return this.clickUrl;
    }

    @m
    public final List getDeliveryChargeType() {
        return this.deliveryChargeType;
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
    public final String getImpressionUrl() {
        return this.impressionUrl;
    }

    @m
    public final List getInventoryType() {
        return this.inventoryType;
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
    public final String getTitle() {
        return this.title;
    }

    @m
    public final String getWinnerVendorItemId() {
        return this.winnerVendorItemId;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.title == null ? 0 : this.title.hashCode();
        int v2 = this.imageMainPath == null ? 0 : this.imageMainPath.hashCode();
        int v3 = this.price == null ? 0 : this.price.hashCode();
        int v4 = this.ratingAverage == null ? 0 : this.ratingAverage.hashCode();
        int v5 = this.ratingCount == null ? 0 : this.ratingCount.hashCode();
        int v6 = this.clickUrl == null ? 0 : this.clickUrl.hashCode();
        int v7 = this.impressionUrl == null ? 0 : this.impressionUrl.hashCode();
        int v8 = this.winnerVendorItemId == null ? 0 : this.winnerVendorItemId.hashCode();
        int v9 = this.eventId == null ? 0 : this.eventId.hashCode();
        int v10 = this.groupId == null ? 0 : this.groupId.hashCode();
        int v11 = this.itemId == null ? 0 : this.itemId.hashCode();
        int v12 = this.inventoryType == null ? 0 : this.inventoryType.hashCode();
        int v13 = this.deliveryChargeType == null ? 0 : this.deliveryChargeType.hashCode();
        String s = this.orgPrice;
        if(s != null) {
            v = s.hashCode();
        }
        return ((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v;
    }

    public final void setClickUrl(@m String s) {
        this.clickUrl = s;
    }

    public final void setDeliveryChargeType(@m List list0) {
        this.deliveryChargeType = list0;
    }

    public final void setEventId(@m String s) {
        this.eventId = s;
    }

    public final void setGroupId(@m String s) {
        this.groupId = s;
    }

    public final void setImageMainPath(@m String s) {
        this.imageMainPath = s;
    }

    public final void setImpressionUrl(@m String s) {
        this.impressionUrl = s;
    }

    public final void setInventoryType(@m List list0) {
        this.inventoryType = list0;
    }

    public final void setItemId(@m String s) {
        this.itemId = s;
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

    public final void setTitle(@m String s) {
        this.title = s;
    }

    public final void setWinnerVendorItemId(@m String s) {
        this.winnerVendorItemId = s;
    }

    @Override
    @l
    public String toString() {
        return "ProductDetails(title=" + this.title + ", imageMainPath=" + this.imageMainPath + ", price=" + this.price + ", ratingAverage=" + this.ratingAverage + ", ratingCount=" + this.ratingCount + ", clickUrl=" + this.clickUrl + ", impressionUrl=" + this.impressionUrl + ", winnerVendorItemId=" + this.winnerVendorItemId + ", eventId=" + this.eventId + ", groupId=" + this.groupId + ", itemId=" + this.itemId + ", inventoryType=" + this.inventoryType + ", deliveryChargeType=" + this.deliveryChargeType + ", orgPrice=" + this.orgPrice + ')';
    }
}

