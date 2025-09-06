package com.dcinside.app.view;

public final class b implements Runnable {
    public final DcListToolbar a;

    public b(DcListToolbar dcListToolbar0) {
        this.a = dcListToolbar0;
    }

    @Override
    public final void run() {
        DcListToolbar.Z(this.a);
    }
}

