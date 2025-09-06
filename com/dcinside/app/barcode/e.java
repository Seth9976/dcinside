package com.dcinside.app.barcode;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

public final class e implements DialogInterface.OnClickListener {
    public final BarcodeCaptureActivity a;

    public e(BarcodeCaptureActivity barcodeCaptureActivity0) {
        this.a = barcodeCaptureActivity0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        BarcodeCaptureActivity.n1(this.a, dialogInterface0, v);
    }
}

