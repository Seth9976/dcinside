package com.tiktok.appevents;

import java.util.List;

public final class g implements Runnable {
    public final p a;
    public final List b;

    public g(p p0, List list0) {
        this.a = p0;
        this.b = list0;
    }

    @Override
    public final void run() {
        this.a.G(this.b);
    }
}

