package com.coupang.ads.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.coupang.ads.R.layout;
import com.coupang.ads.dto.DTO;
import com.coupang.ads.tools.q;
import com.coupang.ads.view.b;
import com.coupang.ads.view.rating.StarRating;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class Banner320x50View extends BaseBannerView {
    @j
    public Banner320x50View(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public Banner320x50View(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public Banner320x50View(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        View.inflate(context0, layout.ads_view_banner_320x50, this);
    }

    public Banner320x50View(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
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

    @Override  // com.coupang.ads.view.banner.BaseBannerView
    public void onBindModelData(@l DTO dTO0) {
        L.p(dTO0, "data");
        super.onBindModelData(dTO0);
        b b0 = this.getAdsProductViewHolder();
        StarRating starRating0 = b0.i();
        if(starRating0 != null && starRating0.getVisibility() == 0) {
        label_13:
            TextView textView2 = b0.j();
            if(textView2 != null) {
                q.b(textView2);
            }
        }
        else {
            TextView textView0 = b0.f();
            if(textView0 != null && textView0.getVisibility() == 0) {
                goto label_13;
            }
            else {
                ImageView imageView0 = b0.d();
                if(imageView0 != null && imageView0.getVisibility() == 0) {
                    goto label_13;
                }
                else {
                    TextView textView1 = b0.j();
                    if(textView1 != null) {
                        q.h(textView1);
                    }
                }
            }
        }
    }
}

