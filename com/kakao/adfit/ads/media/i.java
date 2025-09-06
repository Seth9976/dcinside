package com.kakao.adfit.ads.media;

import android.view.View.OnClickListener;
import android.view.View;

public final class i implements View.OnClickListener {
    public final MediaAdView a;

    public i(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaAdView.f(this.a, view0);
    }
}

