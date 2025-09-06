package com.dcinside.app.view.dccon;

import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;

public final class s implements View.OnTouchListener {
    public final DcconBuyView a;

    public s(DcconBuyView dcconBuyView0) {
        this.a = dcconBuyView0;
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        return DcconBuyView.e(this.a, view0, motionEvent0);
    }
}

