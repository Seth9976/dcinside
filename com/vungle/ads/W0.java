package com.vungle.ads;

import android.view.View.OnClickListener;
import android.view.View;

public final class w0 implements View.OnClickListener {
    public final y0 a;

    public w0(y0 y00) {
        this.a = y00;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        y0.registerViewForInteraction$lambda-2(this.a, view0);
    }
}

