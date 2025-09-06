package com.coupang.ads.view.banner.auto;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class c implements View.OnTouchListener {
    public final AutoScrollBannerView a;

    public c(AutoScrollBannerView autoScrollBannerView0) {
        this.a = autoScrollBannerView0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return AutoScrollBannerView.j(this.a, view0, motionEvent0);
    }
}

