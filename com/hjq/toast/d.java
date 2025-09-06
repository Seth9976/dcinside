package com.hjq.toast;

import android.app.Application;

public class d extends c {
    private final m l;

    public d(Application application0) {
        this.l = new m(application0, this);
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

