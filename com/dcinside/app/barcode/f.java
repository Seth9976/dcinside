package com.dcinside.app.barcode;

import com.google.android.gms.vision.barcode.Barcode;

public final class f implements Runnable {
    public final BarcodeCaptureActivity a;
    public final Barcode b;

    public f(BarcodeCaptureActivity barcodeCaptureActivity0, Barcode barcode0) {
        this.a = barcodeCaptureActivity0;
        this.b = barcode0;
    }

    @Override
    public final void run() {
        b.c(this.a, this.b);
    }
}

