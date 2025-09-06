package com.bytedance.adsdk.Zh;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class xs {
    class PjT extends FutureTask {
        final xs PjT;

        PjT(Callable callable0) {
            super(callable0);
        }

        @Override
        protected void done() {
            if(this.isCancelled()) {
                return;
            }
            try {
                xf xf0 = (xf)this.get();
                xs.this.PjT(xf0);
            }
            catch(InterruptedException | ExecutionException interruptedException0) {
                xf xf1 = new xf(interruptedException0);
                xs.this.PjT(xf1);
            }
        }
    }

    private volatile xf JQp;
    public static Executor PjT;
    private final Set ReZ;
    private final Set Zh;
    private final Handler cr;

    static {
        xs.PjT = Executors.newCachedThreadPool();
    }

    public xs(Callable callable0) {
        this(callable0, false);
    }

    xs(Callable callable0, boolean z) {
        this.Zh = new LinkedHashSet(1);
        this.ReZ = new LinkedHashSet(1);
        this.cr = new Handler(Looper.getMainLooper());
        this.JQp = null;
        if(z) {
            try {
                this.PjT(((xf)callable0.call()));
            }
            catch(Throwable throwable0) {
                this.PjT(new xf(throwable0));
            }
            return;
        }
        xs.PjT.execute(new PjT(this, callable0));
    }

    private void PjT() {
        com.bytedance.adsdk.Zh.xs.1 xs$10 = new Runnable() {
            final xs PjT;

            @Override
            public void run() {
                xf xf0 = xs.this.JQp;
                if(xf0 == null) {
                    return;
                }
                if(xf0.PjT() != null) {
                    xs.this.PjT(xf0.PjT());
                    return;
                }
                xs.this.PjT(xf0.Zh());
            }
        };
        this.cr.post(xs$10);
    }

    private void PjT(xf xf0) {
        if(this.JQp != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.JQp = xf0;
        this.PjT();
    }

    private void PjT(Object object0) {
        synchronized(this) {
            for(Object object1: new ArrayList(this.Zh)) {
                ((qj)object1).PjT(object0);
            }
        }
    }

    private void PjT(Throwable throwable0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.ReZ);
            if(arrayList0.isEmpty()) {
                return;
            }
            for(Object object0: arrayList0) {
                ((qj)object0).PjT(throwable0);
            }
        }
    }

    public xs PjT(qj qj0) {
        synchronized(this) {
            xf xf0 = this.JQp;
            if(xf0 != null && xf0.PjT() != null) {
                qj0.PjT(xf0.PjT());
            }
            this.Zh.add(qj0);
            return this;
        }
    }

    public xs ReZ(qj qj0) {
        synchronized(this) {
            xf xf0 = this.JQp;
            if(xf0 != null && xf0.Zh() != null) {
                qj0.PjT(xf0.Zh());
            }
            this.ReZ.add(qj0);
            return this;
        }
    }

    public xs Zh(qj qj0) {
        synchronized(this) {
            this.Zh.remove(qj0);
            return this;
        }
    }

    public xs cr(qj qj0) {
        synchronized(this) {
            this.ReZ.remove(qj0);
            return this;
        }
    }
}

