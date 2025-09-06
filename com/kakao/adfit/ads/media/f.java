package com.kakao.adfit.ads.media;

import android.view.View.OnClickListener;
import android.view.View;

public final class f implements View.OnClickListener {
    public final MediaAdView a;

    public f(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaAdView.d(this.a, view0);
    }
}

