package com.dcinside.app.write;

import rx.functions.b;

public final class a0 implements b {
    public final PostWriteActivity a;

    public a0(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostWriteActivity.c8(this.a, ((Throwable)object0));
    }
}

