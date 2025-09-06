package com.coupang.ads.view.rating;

import android.content.Context;
import android.util.AttributeSet;
import com.coupang.ads.custom.widget.AdsStarRating;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public class StarRating extends AdsStarRating {
    @j
    public StarRating(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public StarRating(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public StarRating(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v, 0, 8, null);
    }

    public StarRating(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.coupang.ads.custom.widget.AdsStarRating
    public void _$_clearFindViewByIdCache() {
    }
}

