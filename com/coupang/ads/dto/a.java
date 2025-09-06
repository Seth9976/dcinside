package com.coupang.ads.dto;

import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class a {
    @l
    public static final AdsProduct a(@l ProductDetails productDetails0, @m String s) {
        L.p(productDetails0, "<this>");
        String s1 = productDetails0.getTitle();
        String s2 = "https://thumbnail10.coupangcdn.com/thumbnails/remote/492x492ex/image/" + productDetails0.getImageMainPath();
        String s3 = productDetails0.getPrice();
        Double double0 = productDetails0.getRatingAverage();
        Long long0 = productDetails0.getRatingCount();
        String s4 = productDetails0.getClickUrl();
        Impression impression0 = new Impression(productDetails0.getImpressionUrl(), null, 2, null);
        String s5 = productDetails0.getWinnerVendorItemId();
        String s6 = productDetails0.getGroupId();
        String s7 = productDetails0.getItemId();
        String s8 = productDetails0.getEventId();
        List list0 = productDetails0.getInventoryType();
        if(list0 != null && list0.contains("OVERNIGHT")) {
            return new AdsProduct(s, s1, s2, s3, double0, long0, s4, impression0, s5, s6, s7, s8, "FRESH", productDetails0.getOrgPrice());
        }
        String s9 = "ROCKET";
        List list1 = productDetails0.getDeliveryChargeType();
        if(list1 == null || !list1.contains("ROCKET")) {
            s9 = "FREE";
            List list2 = productDetails0.getDeliveryChargeType();
            if(list2 == null || !list2.contains("FREE")) {
                List list3 = productDetails0.getDeliveryChargeType();
                return list3 != null && list3.contains("CONDITIONAL_FREE") ? new AdsProduct(s, s1, s2, s3, double0, long0, s4, impression0, s5, s6, s7, s8, "CONDITIONAL_FREE", productDetails0.getOrgPrice()) : new AdsProduct(s, s1, s2, s3, double0, long0, s4, impression0, s5, s6, s7, s8, null, productDetails0.getOrgPrice());
            }
        }
        return new AdsProduct(s, s1, s2, s3, double0, long0, s4, impression0, s5, s6, s7, s8, s9, productDetails0.getOrgPrice());
    }
}

