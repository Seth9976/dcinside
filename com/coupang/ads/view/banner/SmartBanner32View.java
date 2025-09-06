package com.coupang.ads.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.coupang.ads.R.layout;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class SmartBanner32View extends BaseBannerView {
    @j
    public SmartBanner32View(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public SmartBanner32View(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public SmartBanner32View(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        View.inflate(context0, layout.ads_view_banner_smart_banner_32, this);
    }

    public SmartBanner32View(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // com.coupang.ads.view.banner.BaseBannerView
    public void _$_clearFindViewByIdCache() {
    }
}

