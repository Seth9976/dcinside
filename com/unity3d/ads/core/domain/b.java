package com.unity3d.ads.core.domain;

public final class b implements Runnable {
    public final CommonInitAwaitingGetHeaderBiddingToken a;
    public final String b;

    public b(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0, String s) {
        this.a = commonInitAwaitingGetHeaderBiddingToken0;
        this.b = s;
    }

    @Override
    public final void run() {
        CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0(this.a, this.b);
    }
}

