package com.unity3d.services.banners.view;

public final class a implements Runnable {
    public final ScarBannerContainer a;

    public a(ScarBannerContainer scarBannerContainer0) {
        this.a = scarBannerContainer0;
    }

    @Override
    public final void run() {
        ScarBannerContainer.lambda$destroy$0(this.a);
    }
}

