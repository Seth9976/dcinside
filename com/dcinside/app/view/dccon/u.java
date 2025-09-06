package com.dcinside.app.view.dccon;

import rx.functions.b;

public final class u implements b {
    public final DcconBuyView a;

    public u(DcconBuyView dcconBuyView0) {
        this.a = dcconBuyView0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        DcconBuyView.m(this.a, ((Throwable)object0));
    }
}

