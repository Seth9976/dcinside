package com.google.android.material.datepicker;

import android.view.View;

public final class g implements Runnable {
    public final View a;

    public g(View view0) {
        this.a = view0;
    }

    @Override
    public final void run() {
        h.b(this.a);
    }
}

