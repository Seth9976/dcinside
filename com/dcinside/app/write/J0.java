package com.dcinside.app.write;

import rx.functions.b;

public final class j0 implements b {
    public final PostWriteActivity a;

    public j0(PostWriteActivity postWriteActivity0) {
        this.a = postWriteActivity0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        PostWriteActivity.W7(this.a, ((Throwable)object0));
    }
}

