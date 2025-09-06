package com.vungle.ads.internal.load;

import com.vungle.ads.internal.downloader.d;
import java.io.File;

public final class e implements Runnable {
    public final File a;
    public final b b;
    public final d c;
    public final com.vungle.ads.internal.load.d d;

    public e(File file0, b d$b0, d d0, com.vungle.ads.internal.load.d d1) {
        this.a = file0;
        this.b = d$b0;
        this.c = d0;
        this.d = d1;
    }

    @Override
    public final void run() {
        b.onSuccess$lambda-1(this.a, this.b, this.c, this.d);
    }
}

