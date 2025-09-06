package io.reactivex.disposables;

import d3.f;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Future;

public final class d {
    private d() {
        throw new IllegalStateException("No instances!");
    }

    @f
    public static c a() {
        return e.a;
    }

    @f
    public static c b() {
        return d.f(a.b);
    }

    @f
    public static c c(@f e3.a a0) {
        b.g(a0, "run is null");
        return new io.reactivex.disposables.a(a0);
    }

    @f
    public static c d(@f Future future0) {
        b.g(future0, "future is null");
        return d.e(future0, true);
    }

    @f
    public static c e(@f Future future0, boolean z) {
        b.g(future0, "future is null");
        return new io.reactivex.disposables.e(future0, z);
    }

    @f
    public static c f(@f Runnable runnable0) {
        b.g(runnable0, "run is null");
        return new g(runnable0);
    }

    @f
    public static c g(@f org.reactivestreams.e e0) {
        b.g(e0, "subscription is null");
        return new i(e0);
    }
}

