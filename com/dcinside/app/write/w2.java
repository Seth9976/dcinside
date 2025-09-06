package com.dcinside.app.write;

import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.View;

public final class w2 implements View.OnKeyListener {
    public final y2 a;

    public w2(y2 y20) {
        this.a = y20;
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        return y2.n(this.a, view0, v, keyEvent0);
    }
}

