package com.vungle.ads.internal.load;

import com.vungle.ads.internal.model.b;
import java.io.File;

public final class l implements Runnable {
    public final File a;
    public final File b;
    public final b c;
    public final File d;

    public l(File file0, File file1, b b0, File file2) {
        this.a = file0;
        this.b = file1;
        this.c = b0;
        this.d = file2;
    }

    @Override
    public final void run() {
        com.vungle.ads.internal.load.k.b.onSuccess$lambda-1(this.a, this.b, this.c, this.d);
    }
}

