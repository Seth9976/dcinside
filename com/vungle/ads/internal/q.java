package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.b1;
import com.vungle.ads.internal.model.e;
import com.vungle.ads.internal.presenter.o;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class q extends a implements o {
    public static final class com.vungle.ads.internal.q.a {
        private com.vungle.ads.internal.q.a() {
        }

        public com.vungle.ads.internal.q.a(w w0) {
        }
    }

    @l
    public static final com.vungle.ads.internal.q.a Companion = null;
    @l
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    @l
    public static final String TOKEN_APP_ICON = "APP_ICON";
    @l
    public static final String TOKEN_APP_NAME = "APP_NAME";
    @l
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    @l
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    @l
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    @l
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    @l
    public static final String TOKEN_OM_SDK_DATA = "OM_SDK_DATA";
    @l
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    @l
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    @l
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    static {
        q.Companion = new com.vungle.ads.internal.q.a(null);
    }

    public q(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // com.vungle.ads.internal.a
    @m
    public b1 getAdSizeForAdRequest() {
        return null;
    }

    @Override  // com.vungle.ads.internal.presenter.o
    @m
    public List getImpressionUrls() {
        e e0 = this.getBidPayload();
        return e0 == null ? null : e0.getImpression();
    }

    @Override  // com.vungle.ads.internal.presenter.o
    @m
    public String getPlacementRefId() {
        com.vungle.ads.internal.model.m m0 = this.getPlacement();
        return m0 == null ? null : m0.getReferenceId();
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdSize(@m b1 b10) {
        return true;
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(@l com.vungle.ads.internal.model.m m0) {
        L.p(m0, "placement");
        return m0.isNative();
    }
}

