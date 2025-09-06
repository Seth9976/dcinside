package com.vungle.ads.internal.load;

import com.vungle.ads.internal.downloader.e;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.model.b;
import com.vungle.ads.internal.util.q;

public final class j implements Runnable {
    public final a a;
    public final b b;
    public final q c;
    public final e d;
    public final i e;

    public j(a k$a0, b b0, q q0, e e0, i i0) {
        this.a = k$a0;
        this.b = b0;
        this.c = q0;
        this.d = e0;
        this.e = i0;
    }

    @Override
    public final void run() {
        k.downloadJs$lambda-1(this.a, this.b, this.c, this.d, this.e);
    }
}

