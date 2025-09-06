package com.hjq.toast;

import android.app.Activity;

public class b extends c {
    private final m l;

    public b(Activity activity0) {
        this.l = new m(activity0, this);
    }

    @Override  // y2.b
    public void cancel() {
        this.l.g();
    }

    @Override  // y2.b
    public void show() {
        this.l.k();
    }
}

