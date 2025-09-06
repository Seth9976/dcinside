package com.dcinside.app.image;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class w implements View.OnTouchListener {
    public final ImageViewerActivity a;

    public w(ImageViewerActivity imageViewerActivity0) {
        this.a = imageViewerActivity0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return ImageViewerActivity.h3(this.a, view0, motionEvent0);
    }
}

