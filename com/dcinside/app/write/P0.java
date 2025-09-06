package com.dcinside.app.write;

import com.dcinside.app.voice.m;
import rx.functions.o;

public final class p0 implements o {
    public final m a;
    public final PostWriteActivity b;
    public final String c;
    public final boolean d;

    public p0(m m0, PostWriteActivity postWriteActivity0, String s, boolean z) {
        this.a = m0;
        this.b = postWriteActivity0;
        this.c = s;
        this.d = z;
    }

    @Override  // rx.functions.o
    public final Object call() {
        return PostWriteActivity.s5(this.a, this.b, this.c, this.d);
    }
}

