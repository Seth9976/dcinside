package io.reactivex.internal.schedulers;

import d3.f;
import io.reactivex.J.c;
import io.reactivex.J;
import io.reactivex.disposables.d;
import java.util.concurrent.TimeUnit;

public final class e extends J {
    static final class a extends c {
        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return false;
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c c(@f Runnable runnable0) {
            runnable0.run();
            return e.d;
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
            throw new UnsupportedOperationException("This scheduler doesn\'t support delayed execution");
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c e(@f Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
            throw new UnsupportedOperationException("This scheduler doesn\'t support periodic execution");
        }
    }

    public static final J b;
    static final c c;
    static final io.reactivex.disposables.c d;

    static {
        e.b = new e();
        e.c = new a();
        io.reactivex.disposables.c c0 = d.b();
        e.d = c0;
        c0.dispose();
    }

    @Override  // io.reactivex.J
    @f
    public c d() {
        return e.c;
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c f(@f Runnable runnable0) {
        runnable0.run();
        return e.d;
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c g(@f Runnable runnable0, long v, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException("This scheduler doesn\'t support delayed execution");
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c h(@f Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException("This scheduler doesn\'t support periodic execution");
    }
}

