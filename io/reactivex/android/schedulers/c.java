package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.J;
import io.reactivex.disposables.d;
import java.util.concurrent.TimeUnit;

final class c extends J {
    static final class a extends io.reactivex.J.c {
        private final Handler a;
        private final boolean b;
        private volatile boolean c;

        a(Handler handler0, boolean z) {
            this.a = handler0;
            this.b = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c;
        }

        @Override  // io.reactivex.J$c
        @SuppressLint({"NewApi"})
        public io.reactivex.disposables.c d(Runnable runnable0, long v, TimeUnit timeUnit0) {
            if(runnable0 == null) {
                throw new NullPointerException("run == null");
            }
            if(timeUnit0 == null) {
                throw new NullPointerException("unit == null");
            }
            if(this.c) {
                return d.a();
            }
            Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
            io.reactivex.disposables.c c0 = new b(this.a, runnable1);
            Message message0 = Message.obtain(this.a, ((Runnable)c0));
            message0.obj = this;
            if(this.b) {
                message0.setAsynchronous(true);
            }
            long v1 = timeUnit0.toMillis(v);
            this.a.sendMessageDelayed(message0, v1);
            if(this.c) {
                this.a.removeCallbacks(((Runnable)c0));
                return d.a();
            }
            return c0;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }
    }

    static final class b implements io.reactivex.disposables.c, Runnable {
        private final Handler a;
        private final Runnable b;
        private volatile boolean c;

        b(Handler handler0, Runnable runnable0) {
            this.a = handler0;
            this.b = runnable0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.a.removeCallbacks(this);
            this.c = true;
        }

        @Override
        public void run() {
            try {
                this.b.run();
            }
            catch(Throwable throwable0) {
                io.reactivex.plugins.a.Y(throwable0);
            }
        }
    }

    private final Handler b;
    private final boolean c;

    c(Handler handler0, boolean z) {
        this.b = handler0;
        this.c = z;
    }

    @Override  // io.reactivex.J
    public io.reactivex.J.c d() {
        return new a(this.b, this.c);
    }

    @Override  // io.reactivex.J
    @SuppressLint({"NewApi"})
    public io.reactivex.disposables.c g(Runnable runnable0, long v, TimeUnit timeUnit0) {
        if(runnable0 == null) {
            throw new NullPointerException("run == null");
        }
        if(timeUnit0 == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
        io.reactivex.disposables.c c0 = new b(this.b, runnable1);
        Message message0 = Message.obtain(this.b, ((Runnable)c0));
        if(this.c) {
            message0.setAsynchronous(true);
        }
        long v1 = timeUnit0.toMillis(v);
        this.b.sendMessageDelayed(message0, v1);
        return c0;
    }
}

