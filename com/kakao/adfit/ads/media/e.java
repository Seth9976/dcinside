package com.kakao.adfit.ads.media;

import android.view.View.OnClickListener;
import android.view.View;

public final class e implements View.OnClickListener {
    public final MediaAdView a;

    public e(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        MediaAdView.b(this.a, view0);
    }
}

