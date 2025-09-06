package com.dcinside.app.write;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class k implements View.OnTouchListener {
    public final PostWriteActivity a;

    public k(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return PostWriteActivity.U6(this.a, view0, motionEvent0);
    }
}

