package com.coupang.ads.custom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import com.coupang.ads.R.style;
import com.coupang.ads.dto.AdsProductPage;
import com.coupang.ads.tools.h;
import com.coupang.ads.tools.q;
import com.coupang.ads.view.image.RoundImageView;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdsPlacementOptOut extends RoundImageView implements View.OnClickListener, AdsWidgetPlacement {
    @m
    private AdsProductPage adsProductPage;

    @j
    public AdsPlacementOptOut(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 2, null);
    }

    @j
    public AdsPlacementOptOut(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0, 0, style.AdsOptOutImageView);
    }

    public AdsPlacementOptOut(Context context0, AttributeSet attributeSet0, int v, w w0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    @Override  // com.coupang.ads.view.image.RoundImageView
    public void _$_clearFindViewByIdCache() {
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    @m
    public AdsProductPage getAdsProductPage() {
        return this.adsProductPage;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(@m View view0) {
        AdsProductPage adsProductPage0 = this.getAdsProductPage();
        if(adsProductPage0 != null) {
            Context context0 = this.getContext();
            L.o(context0, "context");
            h.b(adsProductPage0, context0);
        }
    }

    @Override  // com.coupang.ads.custom.widget.AdsWidgetPlacement
    public void setAdsProductPage(@m AdsProductPage adsProductPage0) {
        this.adsProductPage = adsProductPage0;
        if(adsProductPage0 != null) {
            String s = adsProductPage0.getOptOut();
            if(s != null && s.length() > 0) {
                this.setOnClickListener(this);
                q.h(this);
                return;
            }
        }
        q.b(this);
    }
}

