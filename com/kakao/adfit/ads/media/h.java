package com.kakao.adfit.ads.media;

import android.view.View.OnClickListener;
import android.view.View;

public final class h implements View.OnClickListener {
    public final MediaAdView a;

    public h(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaAdView.g(this.a, view0);
    }
}

