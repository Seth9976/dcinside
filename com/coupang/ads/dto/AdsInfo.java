package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class AdsInfo implements DTO {
    @m
    private final GoodsDetails gd;

    public AdsInfo() {
        this(null, 1, null);
    }

    public AdsInfo(@m GoodsDetails goodsDetails0) {
        this.gd = goodsDetails0;
    }

    public AdsInfo(GoodsDetails goodsDetails0, int v, w w0) {
        if((v & 1) != 0) {
            goodsDetails0 = null;
        }
        this(goodsDetails0);
    }

    @m
    public final GoodsDetails component1() {
        return this.gd;
    }

    @l
    public final AdsInfo copy(@m GoodsDetails goodsDetails0) {
        return new AdsInfo(goodsDetails0);
    }

    public static AdsInfo copy$default(AdsInfo adsInfo0, GoodsDetails goodsDetails0, int v, Object object0) {
        if((v & 1) != 0) {
            goodsDetails0 = adsInfo0.gd;
        }
        return adsInfo0.copy(goodsDetails0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof AdsInfo ? L.g(this.gd, ((AdsInfo)object0).gd) : false;
    }

    @m
    public final GoodsDetails getGd() {
        return this.gd;
    }

    @Override
    public int hashCode() {
        return this.gd == null ? 0 : this.gd.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AdsInfo(gd=" + this.gd + ')';
    }
}

