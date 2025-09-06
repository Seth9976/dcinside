package com.coupang.ads.dto;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class GoodsDetails implements DTO {
    @m
    private final ProductDetails corpusDoc;

    public GoodsDetails() {
        this(null, 1, null);
    }

    public GoodsDetails(@m ProductDetails productDetails0) {
        this.corpusDoc = productDetails0;
    }

    public GoodsDetails(ProductDetails productDetails0, int v, w w0) {
        if((v & 1) != 0) {
            productDetails0 = null;
        }
        this(productDetails0);
    }

    @m
    public final ProductDetails component1() {
        return this.corpusDoc;
    }

    @l
    public final GoodsDetails copy(@m ProductDetails productDetails0) {
        return new GoodsDetails(productDetails0);
    }

    public static GoodsDetails copy$default(GoodsDetails goodsDetails0, ProductDetails productDetails0, int v, Object object0) {
        if((v & 1) != 0) {
            productDetails0 = goodsDetails0.corpusDoc;
        }
        return goodsDetails0.copy(productDetails0);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof GoodsDetails ? L.g(this.corpusDoc, ((GoodsDetails)object0).corpusDoc) : false;
    }

    @m
    public final ProductDetails getCorpusDoc() {
        return this.corpusDoc;
    }

    @Override
    public int hashCode() {
        return this.corpusDoc == null ? 0 : this.corpusDoc.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "GoodsDetails(corpusDoc=" + this.corpusDoc + ')';
    }
}

