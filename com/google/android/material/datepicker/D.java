package com.google.android.material.datepicker;

public final class d implements Runnable {
    public final e a;
    public final long b;

    public d(e e0, long v) {
        this.a = e0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.d(this.b);
    }
}

