package com.tbuonomo.viewpagerdotsindicator;

public final class c implements Runnable {
    public final BaseDotsIndicator a;

    public c(BaseDotsIndicator baseDotsIndicator0) {
        this.a = baseDotsIndicator0;
    }

    @Override
    public final void run() {
        BaseDotsIndicator.l(this.a);
    }
}

