package com.coupang.ads.viewmodels;

import com.coupang.ads.dto.AdsDto;
import com.coupang.ads.dto.AdsInfo;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.dto.GoodsDetails;
import com.coupang.ads.dto.Impression;
import com.coupang.ads.dto.ImpressionDetails;
import com.coupang.ads.dto.PlacementGroupInfo;
import com.coupang.ads.dto.ProductDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import y4.l;

public final class b implements a {
    @Override  // com.coupang.ads.viewmodels.a
    public DTO a(AdsRequest adsRequest0, AdsDto adsDto0) {
        return this.c(adsRequest0, adsDto0);
    }

    private final AdsProductPage b(AdsRequest adsRequest0, AdsDto adsDto0) {
        List list0 = adsDto0.getPlacementGroups();
        AdsProductPage adsProductPage0 = null;
        if(list0 != null) {
            AdsProductPage adsProductPage1 = null;
            for(Object object0: list0) {
                ArrayList arrayList0 = new ArrayList();
                ImpressionDetails impressionDetails0 = ((PlacementGroupInfo)object0).getProperties();
                ImpressionDetails impressionDetails1 = ((PlacementGroupInfo)object0).getProperties();
                Impression impression0 = new Impression((impressionDetails1 == null ? null : impressionDetails1.getImpression_url()), null, 2, null);
                ImpressionDetails impressionDetails2 = ((PlacementGroupInfo)object0).getProperties();
                ImpressionDetails impressionDetails3 = ((PlacementGroupInfo)object0).getProperties();
                AdsProductPage adsProductPage2 = new AdsProductPage(arrayList0, (impressionDetails0 == null ? null : impressionDetails0.getLoading_impression_url()), impression0, (impressionDetails2 == null ? null : impressionDetails2.getOptout_url()), (impressionDetails3 == null ? null : impressionDetails3.getCreative_template()));
                List list1 = ((PlacementGroupInfo)object0).getAds();
                if(list1 != null) {
                    for(Object object1: list1) {
                        GoodsDetails goodsDetails0 = ((AdsInfo)object1).getGd();
                        if(goodsDetails0 != null) {
                            ProductDetails productDetails0 = goodsDetails0.getCorpusDoc();
                            if(productDetails0 != null) {
                                ArrayList arrayList1 = adsProductPage2.getAdsProductList();
                                if(arrayList1 != null) {
                                    arrayList1.add(com.coupang.ads.dto.a.a(productDetails0, adsDto0.getRequestId()));
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = adsProductPage2.getAdsProductList();
                if(arrayList2 != null && !arrayList2.isEmpty()) {
                    adsProductPage1 = adsProductPage2;
                }
            }
            adsProductPage0 = adsProductPage1;
        }
        if(adsProductPage0 == null) {
            throw new com.coupang.ads.b(adsRequest0, "Data is empty", null, 0, 12, null);
        }
        return adsProductPage0;
    }

    @l
    public AdsProductPage c(@l AdsRequest adsRequest0, @l AdsDto adsDto0) throws com.coupang.ads.b {
        Object object0;
        L.p(adsRequest0, "adsRequest");
        L.p(adsDto0, "data");
        try {
            object0 = e0.b(this.b(adsRequest0, adsDto0));
        }
        catch(Throwable throwable0) {
            object0 = e0.b(f0.a(throwable0));
        }
        AdsProductPage adsProductPage0 = (AdsProductPage)com.coupang.ads.tools.l.b(object0, adsRequest0, "ListProductViewModel.convertListUIData");
        if(adsProductPage0 == null) {
            throw new com.coupang.ads.b(adsRequest0, "convert response to product failed, empty field", null, 0, 12, null);
        }
        return adsProductPage0;
    }

    @Override  // com.coupang.ads.viewmodels.a
    @l
    public String getName() {
        return "AdsProductList";
    }
}

