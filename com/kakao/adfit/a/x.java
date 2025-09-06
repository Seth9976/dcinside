package com.kakao.adfit.a;

import android.content.Context;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.Response;

public final class x implements Interceptor {
    public final Context a;

    public x(Context context0) {
        this.a = context0;
    }

    @Override  // okhttp3.Interceptor
    public final Response intercept(Chain interceptor$Chain0) {
        return h.a(this.a, interceptor$Chain0);
    }
}

