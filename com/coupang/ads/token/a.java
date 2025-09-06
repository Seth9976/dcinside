package com.coupang.ads.token;

import java.util.concurrent.Callable;

public final class a implements Callable {
    public final AdTokenRequester a;

    public a(AdTokenRequester adTokenRequester0) {
        this.a = adTokenRequester0;
    }

    @Override
    public final Object call() {
        return AdTokenRequester.queryTokenCallable$lambda-9(this.a);
    }
}

