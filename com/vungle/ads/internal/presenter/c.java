package com.vungle.ads.internal.presenter;

import com.vungle.ads.d1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public class c implements b {
    @l
    private final b adPlayCallback;

    public c(@l b b0) {
        L.p(b0, "adPlayCallback");
        super();
        this.adPlayCallback = b0;
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onAdClick(@m String s) {
        this.adPlayCallback.onAdClick(s);
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onAdEnd(@m String s) {
        this.adPlayCallback.onAdEnd(s);
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onAdImpression(@m String s) {
        this.adPlayCallback.onAdImpression(s);
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onAdLeftApplication(@m String s) {
        this.adPlayCallback.onAdLeftApplication(s);
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onAdRewarded(@m String s) {
        this.adPlayCallback.onAdRewarded(s);
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onAdStart(@m String s) {
        this.adPlayCallback.onAdStart(s);
    }

    @Override  // com.vungle.ads.internal.presenter.b
    public void onFailure(@l d1 d10) {
        L.p(d10, "error");
        this.adPlayCallback.onFailure(d10);
    }
}

