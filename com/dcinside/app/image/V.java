package com.dcinside.app.image;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class v implements CompoundButton.OnCheckedChangeListener {
    public final ImageViewerActivity a;

    public v(ImageViewerActivity imageViewerActivity0) {
        this.a = imageViewerActivity0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        ImageViewerActivity.g3(this.a, compoundButton0, z);
    }
}

