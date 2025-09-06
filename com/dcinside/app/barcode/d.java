package com.dcinside.app.barcode;

import android.view.View.OnClickListener;
import android.view.View;

public final class d implements View.OnClickListener {
    public final BarcodeCaptureActivity a;
    public final String[] b;

    public d(BarcodeCaptureActivity barcodeCaptureActivity0, String[] arr_s) {
        this.a = barcodeCaptureActivity0;
        this.b = arr_s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        BarcodeCaptureActivity.p1(this.a, this.b, view0);
    }
}

