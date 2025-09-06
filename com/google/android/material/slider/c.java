package com.google.android.material.slider;

import android.view.ViewTreeObserver.OnScrollChangedListener;

public final class c implements ViewTreeObserver.OnScrollChangedListener {
    public final BaseSlider a;

    public c(BaseSlider baseSlider0) {
        this.a = baseSlider0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.B0();
    }
}

