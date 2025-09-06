package com.dcinside.app.image;

import java.io.File;
import rx.g.a;
import rx.n;

public final class g implements a {
    public final File a;
    public final String b;
    public final File c;

    public g(File file0, String s, File file1) {
        this.a = file0;
        this.b = s;
        this.c = file1;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        j.f(this.a, this.b, this.c, ((n)object0));
    }
}

