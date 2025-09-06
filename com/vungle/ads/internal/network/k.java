package com.vungle.ads.internal.network;

import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class k implements Interceptor {
    public final l a;

    public k(l l0) {
        this.a = l0;
    }

    @Override  // okhttp3.Interceptor
    public final Response intercept(Chain interceptor$Chain0) {
        return l.responseInterceptor$lambda-0(this.a, interceptor$Chain0);
    }
}

