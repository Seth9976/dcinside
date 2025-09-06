package com.vungle.ads.internal.load;

import com.vungle.ads.internal.downloader.a.a;

public final class f implements Runnable {
    public final d a;
    public final com.vungle.ads.internal.downloader.d b;
    public final a c;

    public f(d d0, com.vungle.ads.internal.downloader.d d1, a a$a0) {
        this.a = d0;
        this.b = d1;
        this.c = a$a0;
    }

    @Override
    public final void run() {
        b.onError$lambda-0(this.a, this.b, this.c);
    }
}

