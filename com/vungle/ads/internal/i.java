package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.b1;
import com.vungle.ads.d1;
import com.vungle.ads.internal.model.b;
import com.vungle.ads.internal.presenter.c;
import com.vungle.ads.internal.util.y;
import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class i extends a {
    @l
    private final b1 adSize;
    @m
    private b1 updatedAdSize;

    public i(@l Context context0, @l b1 b10) {
        L.p(context0, "context");
        L.p(b10, "adSize");
        super(context0);
        this.adSize = b10;
    }

    @Override  // com.vungle.ads.internal.a
    public void adLoadedAndUpdateConfigure$vungle_ads_release(@l b b0) {
        L.p(b0, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(b0);
        if(this.adSize.isAdaptiveWidth$vungle_ads_release() || this.adSize.isAdaptiveHeight$vungle_ads_release()) {
            V v0 = y.INSTANCE.getDeviceWidthAndHeightWithOrientation(this.getContext(), 0);
            int v1 = ((Number)v0.b()).intValue();
            int v2 = this.adSize.isAdaptiveWidth$vungle_ads_release() ? b0.adWidth() : this.adSize.getWidth();
            int v3 = this.adSize.isAdaptiveHeight$vungle_ads_release() ? b0.adHeight() : this.adSize.getHeight();
            this.updatedAdSize = new b1(Math.min(((Number)v0.a()).intValue(), v2), (!this.adSize.isAdaptiveHeight$vungle_ads_release() || this.adSize.getHeight() <= 0 ? Math.min(v1, v3) : Math.min(this.adSize.getHeight(), Math.min(v1, v3))));
        }
    }

    @Override  // com.vungle.ads.internal.a
    @l
    public b1 getAdSizeForAdRequest() {
        return this.adSize;
    }

    @m
    public final b1 getUpdatedAdSize$vungle_ads_release() {
        return this.updatedAdSize;
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdSize(@m b1 b10) {
        return b10 == null ? false : b10.isValidSize$vungle_ads_release();
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(@l com.vungle.ads.internal.model.m m0) {
        L.p(m0, "placement");
        return m0.isBanner() || m0.isMREC() || m0.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(@m b1 b10) {
        this.updatedAdSize = b10;
    }

    @l
    public final c wrapCallback$vungle_ads_release(@l com.vungle.ads.internal.presenter.b b0) {
        public static final class com.vungle.ads.internal.i.a extends c {
            com.vungle.ads.internal.i.a(com.vungle.ads.internal.presenter.b b0, i i0) {
                i.this = i0;
                super(b0);
            }

            @Override  // com.vungle.ads.internal.presenter.c
            public void onAdEnd(@m String s) {
                i.this.setAdState(com.vungle.ads.internal.a.a.FINISHED);
                super.onAdEnd(s);
            }

            @Override  // com.vungle.ads.internal.presenter.c
            public void onAdStart(@m String s) {
                i.this.setAdState(com.vungle.ads.internal.a.a.PLAYING);
                super.onAdStart(s);
            }

            @Override  // com.vungle.ads.internal.presenter.c
            public void onFailure(@l d1 d10) {
                L.p(d10, "error");
                i.this.setAdState(com.vungle.ads.internal.a.a.ERROR);
                super.onFailure(d10);
            }
        }

        L.p(b0, "adPlayCallback");
        return new com.vungle.ads.internal.i.a(b0, this);
    }
}

