package com.coupang.ads.custom.widget;

import com.coupang.ads.dto.AdsProduct;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AdsProductWidgetModel {
    @m
    private final Integer discount;
    @l
    private final AdsProduct product;

    public AdsProductWidgetModel(@l AdsProduct adsProduct0) {
        L.p(adsProduct0, "product");
        super();
        this.product = adsProduct0;
        String s = adsProduct0.getPrice();
        double f = NaN;
        double f1 = s == null ? NaN : Double.parseDouble(s);
        String s1 = adsProduct0.getOrgPrice();
        if(s1 != null) {
            f = Double.parseDouble(s1);
        }
        double f2 = 100.0 * (1.0 - f1 / f);
        this.discount = Double.isInfinite(f2) || Double.isNaN(f2) || f2 <= 0.0 || f2 >= 100.0 ? null : ((int)f2);
    }

    @m
    public final Integer getDiscount() {
        return this.discount;
    }

    @l
    public final AdsProduct getProduct() {
        return this.product;
    }
}

