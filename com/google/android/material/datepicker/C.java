package com.google.android.material.datepicker;

public final class c implements Runnable {
    public final e a;
    public final String b;

    public c(e e0, String s) {
        this.a = e0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.e(this.b);
    }
}

