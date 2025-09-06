package com.kakao.adfit.ads.media;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final MediaAdView a;

    public d(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaAdView.a(this.a, view0);
    }
}

