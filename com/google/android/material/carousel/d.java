package com.google.android.material.carousel;

import android.view.View.OnLayoutChangeListener;
import android.view.View;

public final class d implements View.OnLayoutChangeListener {
    public final CarouselLayoutManager a;

    public d(CarouselLayoutManager carouselLayoutManager0) {
        this.a = carouselLayoutManager0;
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public final void onLayoutChange(View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.a.w3(view0, v, v1, v2, v3, v4, v5, v6, v7);
    }
}

