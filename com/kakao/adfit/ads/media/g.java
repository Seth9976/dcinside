package com.kakao.adfit.ads.media;

import android.view.View.OnClickListener;
import android.view.View;

public final class g implements View.OnClickListener {
    public final MediaAdView a;

    public g(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaAdView.c(this.a, view0);
    }
}

