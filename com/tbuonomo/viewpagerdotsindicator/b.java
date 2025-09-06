package com.tbuonomo.viewpagerdotsindicator;

public final class b implements Runnable {
    public final BaseDotsIndicator a;

    public b(BaseDotsIndicator baseDotsIndicator0) {
        this.a = baseDotsIndicator0;
    }

    @Override
    public final void run() {
        BaseDotsIndicator.o(this.a);
    }
}

