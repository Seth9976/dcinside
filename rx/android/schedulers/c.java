package rx.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import rx.android.plugins.b;
import rx.exceptions.g;
import rx.j;
import rx.o;
import rx.subscriptions.f;

class c extends j {
    static class a extends rx.j.a {
        private final Handler a;
        private final b b;
        private volatile boolean c;

        a(Handler handler0) {
            this.a = handler0;
            this.b = rx.android.plugins.a.a().b();
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            return this.d(a0, 0L, TimeUnit.MILLISECONDS);
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            if(this.c) {
                return f.e();
            }
            o o0 = new rx.android.schedulers.c.b(a0, this.a);
            Message message0 = Message.obtain(this.a, ((Runnable)o0));
            message0.obj = this;
            long v1 = timeUnit0.toMillis(v);
            this.a.sendMessageDelayed(message0, v1);
            if(this.c) {
                this.a.removeCallbacks(((Runnable)o0));
                return f.e();
            }
            return o0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.c;
        }

        @Override  // rx.o
        public void l() {
            this.c = true;
            this.a.removeCallbacksAndMessages(this);
        }
    }

    static final class rx.android.schedulers.c.b implements Runnable, o {
        private final rx.functions.a a;
        private final Handler b;
        private volatile boolean c;

        rx.android.schedulers.c.b(rx.functions.a a0, Handler handler0) {
            this.a = a0;
            this.b = handler0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.c;
        }

        @Override  // rx.o
        public void l() {
            this.c = true;
            this.b.removeCallbacks(this);
        }

        @Override
        public void run() {
            try {
                this.a.call();
            }
            catch(Throwable throwable0) {
                IllegalStateException illegalStateException0 = throwable0 instanceof g ? new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", throwable0) : new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", throwable0);
                rx.plugins.f.c().b().a(illegalStateException0);
                Thread thread0 = Thread.currentThread();
                thread0.getUncaughtExceptionHandler().uncaughtException(thread0, illegalStateException0);
            }
        }
    }

    private final Handler a;

    c(Handler handler0) {
        this.a = handler0;
    }

    c(Looper looper0) {
        this.a = new Handler(looper0);
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new a(this.a);
    }
}

