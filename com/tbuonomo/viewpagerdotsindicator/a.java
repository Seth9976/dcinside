package com.tbuonomo.viewpagerdotsindicator;

public final class a implements Runnable {
    public final BaseDotsIndicator a;

    public a(BaseDotsIndicator baseDotsIndicator0) {
        this.a = baseDotsIndicator0;
    }

    @Override
    public final void run() {
        BaseDotsIndicator.k(this.a);
    }
}

