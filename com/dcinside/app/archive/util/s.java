package com.dcinside.app.archive.util;

import com.dcinside.app.view.k;

public final class s implements Runnable {
    public final k a;

    public s(k k0) {
        this.a = k0;
    }

    @Override
    public final void run() {
        u.z(this.a);
    }
}

