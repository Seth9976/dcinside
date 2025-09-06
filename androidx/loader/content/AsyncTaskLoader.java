package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.TimeUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class AsyncTaskLoader extends Loader {
    final class LoadTask extends ModernAsyncTask implements Runnable {
        private final CountDownLatch q;
        boolean r;
        final AsyncTaskLoader s;

        LoadTask() {
            this.q = new CountDownLatch(1);
        }

        @Override  // androidx.loader.content.ModernAsyncTask
        protected Object b(Object[] arr_object) {
            return this.u(((Void[])arr_object));
        }

        @Override  // androidx.loader.content.ModernAsyncTask
        protected void m(Object object0) {
            try {
                AsyncTaskLoader.this.E(this, object0);
            }
            finally {
                this.q.countDown();
            }
        }

        @Override  // androidx.loader.content.ModernAsyncTask
        protected void n(Object object0) {
            try {
                AsyncTaskLoader.this.F(this, object0);
            }
            finally {
                this.q.countDown();
            }
        }

        @Override
        public void run() {
            this.r = false;
            AsyncTaskLoader.this.G();
        }

        protected Object u(Void[] arr_void) {
            try {
                return AsyncTaskLoader.this.K();
            }
            catch(OperationCanceledException operationCanceledException0) {
                if(!this.k()) {
                    throw operationCanceledException0;
                }
                return null;
            }
        }

        public void v() {
            try {
                this.q.await();
            }
            catch(InterruptedException unused_ex) {
            }
        }
    }

    private final Executor j;
    volatile LoadTask k;
    volatile LoadTask l;
    long m;
    long n;
    Handler o;
    static final String p = "AsyncTaskLoader";
    static final boolean q = false;

    public AsyncTaskLoader(@NonNull Context context0) {
        this(context0, ModernAsyncTask.l);
    }

    private AsyncTaskLoader(@NonNull Context context0, @NonNull Executor executor0) {
        super(context0);
        this.n = -10000L;
        this.j = executor0;
    }

    public void D() {
    }

    void E(LoadTask asyncTaskLoader$LoadTask0, Object object0) {
        this.J(object0);
        if(this.l == asyncTaskLoader$LoadTask0) {
            this.x();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            this.e();
            this.G();
        }
    }

    void F(LoadTask asyncTaskLoader$LoadTask0, Object object0) {
        if(this.k != asyncTaskLoader$LoadTask0) {
            this.E(asyncTaskLoader$LoadTask0, object0);
            return;
        }
        if(this.k()) {
            this.J(object0);
            return;
        }
        this.c();
        this.n = SystemClock.uptimeMillis();
        this.k = null;
        this.f(object0);
    }

    void G() {
        if(this.l == null && this.k != null) {
            if(this.k.r) {
                this.k.r = false;
                this.o.removeCallbacks(this.k);
            }
            if(this.m > 0L && SystemClock.uptimeMillis() < this.n + this.m) {
                this.k.r = true;
                this.o.postAtTime(this.k, this.n + this.m);
                return;
            }
            this.k.e(this.j, null);
        }
    }

    public boolean H() {
        return this.l != null;
    }

    @Nullable
    public abstract Object I();

    public void J(@Nullable Object object0) {
    }

    @Nullable
    protected Object K() {
        return this.I();
    }

    public void L(long v) {
        this.m = v;
        if(v != 0L) {
            this.o = new Handler();
        }
    }

    @RestrictTo({Scope.b})
    public void M() {
        LoadTask asyncTaskLoader$LoadTask0 = this.k;
        if(asyncTaskLoader$LoadTask0 != null) {
            asyncTaskLoader$LoadTask0.v();
        }
    }

    @Override  // androidx.loader.content.Loader
    @Deprecated
    public void g(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        super.g(s, fileDescriptor0, printWriter0, arr_s);
        if(this.k != null) {
            printWriter0.print(s);
            printWriter0.print("mTask=");
            printWriter0.print(this.k);
            printWriter0.print(" waiting=");
            printWriter0.println(this.k.r);
        }
        if(this.l != null) {
            printWriter0.print(s);
            printWriter0.print("mCancellingTask=");
            printWriter0.print(this.l);
            printWriter0.print(" waiting=");
            printWriter0.println(this.l.r);
        }
        if(this.m != 0L) {
            printWriter0.print(s);
            printWriter0.print("mUpdateThrottle=");
            TimeUtils.c(this.m, printWriter0);
            printWriter0.print(" mLastLoadCompleteTime=");
            TimeUtils.b(this.n, SystemClock.uptimeMillis(), printWriter0);
            printWriter0.println();
        }
    }

    @Override  // androidx.loader.content.Loader
    protected boolean o() {
        if(this.k != null) {
            if(!this.e) {
                this.h = true;
            }
            if(this.l != null) {
                if(this.k.r) {
                    this.k.r = false;
                    this.o.removeCallbacks(this.k);
                }
                this.k = null;
                return false;
            }
            if(this.k.r) {
                this.k.r = false;
                this.o.removeCallbacks(this.k);
                this.k = null;
                return false;
            }
            boolean z = this.k.a(false);
            if(z) {
                this.l = this.k;
                this.D();
            }
            this.k = null;
            return z;
        }
        return false;
    }

    @Override  // androidx.loader.content.Loader
    protected void q() {
        super.q();
        this.b();
        this.k = new LoadTask(this);
        this.G();
    }
}

