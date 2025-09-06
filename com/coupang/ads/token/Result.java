package com.coupang.ads.token;

import kotlin.e0;
import kotlin.f0;
import y4.l;
import y4.m;

public final class Result {
    @l
    private final Object r;

    public Result(@l Object object0) {
        this.r = object0;
    }

    @m
    public final Throwable exceptionOrNull() {
        return e0.e(this.r);
    }

    // 去混淆评级： 低(20)
    @m
    public final Object getOrNull() {
        return e0.i(this.r) ? null : this.r;
    }

    public final Object getOrThrow() {
        f0.n(this.r);
        return this.r;
    }

    public final boolean isFailure() {
        return e0.i(this.r);
    }

    public final boolean isSuccess() {
        return e0.j(this.r);
    }

    @Override
    @l
    public String toString() {
        return e0.k(this.r);
    }
}

