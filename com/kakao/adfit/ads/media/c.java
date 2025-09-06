package com.kakao.adfit.ads.media;

public final class c implements Runnable {
    public final MediaAdView a;

    public c(MediaAdView mediaAdView0) {
        this.a = mediaAdView0;
    }

    @Override
    public final void run() {
        MediaAdView.a(this.a);
    }
}

