package com.vungle.ads.internal.load;

import com.vungle.ads.internal.downloader.a.a;
import com.vungle.ads.internal.downloader.d;
import com.vungle.ads.internal.model.b;
import java.io.File;

public final class m implements Runnable {
    public final a a;
    public final d b;
    public final b c;
    public final File d;

    public m(a a$a0, d d0, b b0, File file0) {
        this.a = a$a0;
        this.b = d0;
        this.c = b0;
        this.d = file0;
    }

    @Override
    public final void run() {
        com.vungle.ads.internal.load.k.b.onError$lambda-0(this.a, this.b, this.c, this.d);
    }
}

