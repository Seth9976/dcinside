package com.google.android.material.sidesheet;

public final class i implements Runnable {
    public final SideSheetBehavior a;
    public final int b;

    public i(SideSheetBehavior sideSheetBehavior0, int v) {
        this.a = sideSheetBehavior0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.M0(this.b);
    }
}

