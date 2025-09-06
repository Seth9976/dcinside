package com.coupang.ads.dto;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import y4.l;
import y4.m;

public final class b {
    @l
    private static final AdsProduct a;

    static {
        b.a = new AdsProduct(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x3FFF, null);
    }

    @m
    public static final AdsProduct a(@m DTO dTO0) {
        if(dTO0 instanceof AdsProduct) {
            return (AdsProduct)dTO0;
        }
        if(dTO0 instanceof AdsProductPage) {
            ArrayList arrayList0 = ((AdsProductPage)dTO0).getAdsProductList();
            return arrayList0 == null ? null : ((AdsProduct)u.W2(arrayList0, 0));
        }
        return null;
    }

    @m
    public static final ProductDetails b(@m AdsDto adsDto0) {
        if(adsDto0 != null) {
            List list0 = adsDto0.getPlacementGroups();
            if(list0 != null) {
                PlacementGroupInfo placementGroupInfo0 = (PlacementGroupInfo)u.W2(list0, 0);
                if(placementGroupInfo0 != null) {
                    List list1 = placementGroupInfo0.getAds();
                    if(list1 != null) {
                        AdsInfo adsInfo0 = (AdsInfo)u.W2(list1, 0);
                        if(adsInfo0 != null) {
                            GoodsDetails goodsDetails0 = adsInfo0.getGd();
                            return goodsDetails0 == null ? null : goodsDetails0.getCorpusDoc();
                        }
                    }
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @m
    public static final AdsProductPage c(@m DTO dTO0) {
        return dTO0 instanceof AdsProductPage ? ((AdsProductPage)dTO0) : null;
    }

    @m
    public static final ImpressionDetails d(@m AdsDto adsDto0) {
        if(adsDto0 != null) {
            List list0 = adsDto0.getPlacementGroups();
            if(list0 != null) {
                PlacementGroupInfo placementGroupInfo0 = (PlacementGroupInfo)u.W2(list0, 0);
                return placementGroupInfo0 == null ? null : placementGroupInfo0.getProperties();
            }
        }
        return null;
    }

    @l
    public static final AdsProduct e() {
        return b.a;
    }
}

