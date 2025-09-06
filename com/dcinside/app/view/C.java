package com.dcinside.app.view;

public final class c implements Runnable {
    public final DcToolbar a;

    public c(DcToolbar dcToolbar0) {
        this.a = dcToolbar0;
    }

    @Override
    public final void run() {
        DcToolbar.Z(this.a);
    }
}

