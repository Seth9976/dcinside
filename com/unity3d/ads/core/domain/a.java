package com.unity3d.ads.core.domain;

public final class a implements Runnable {
    public final CommonInitAwaitingGetHeaderBiddingToken a;

    public a(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken0) {
        this.a = commonInitAwaitingGetHeaderBiddingToken0;
    }

    @Override
    public final void run() {
        CommonInitAwaitingGetHeaderBiddingToken.tokenFailure$lambda$4(this.a);
    }
}

