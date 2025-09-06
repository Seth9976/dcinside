package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.p;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class b implements Future {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 低(20)
        public final String getTAG() {
            return "b";
        }
    }

    @l
    public static final a Companion;
    private static final String TAG;
    @m
    private final Future future;

    static {
        b.Companion = new a(null);
        b.TAG = "b";
    }

    public b(@m Future future0) {
        this.future = future0;
    }

    // 去混淆评级： 低(20)
    public static final String access$getTAG$cp() [...] // 潜在的解密器

    @Override
    public boolean cancel(boolean z) {
        return this.future == null ? false : this.future.cancel(z);
    }

    @Override
    @m
    public Object get() {
        Future future0 = this.future;
        if(future0 != null) {
            try {
                return future0.get();
            }
            catch(InterruptedException unused_ex) {
                L.o("b", "TAG");
                p.Companion.w("b", "future.get() Interrupted on Thread jeb-dexdec-sb-st-11594");
                Thread.currentThread().interrupt();
                return null;
            }
            catch(ExecutionException executionException0) {
                L.o("b", "TAG");
                p.Companion.e("b", "error on execution", executionException0);
                return null;
            }
        }
        return null;
    }

    @Override
    @m
    public Object get(long v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        Future future0 = this.future;
        if(future0 != null) {
            try {
                return future0.get(v, timeUnit0);
            }
            catch(InterruptedException unused_ex) {
                L.o("b", "TAG");
                p.Companion.w("b", "future.get() Interrupted on Thread jeb-dexdec-sb-st-11591");
                Thread.currentThread().interrupt();
                return null;
            }
            catch(ExecutionException executionException0) {
                L.o("b", "TAG");
                p.Companion.e("b", "error on execution", executionException0);
                return null;
            }
            catch(TimeoutException timeoutException0) {
                L.o("b", "TAG");
                p.Companion.e("b", "error on timeout", timeoutException0);
                L.o("b", "TAG");
                p.Companion.w("b", "future.get() Timeout on Thread jeb-dexdec-sb-st-11591");
                return null;
            }
        }
        return null;
    }

    @m
    public final Future getFuture() {
        return this.future;
    }

    @Override
    public boolean isCancelled() {
        return this.future == null ? false : this.future.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.future == null ? false : this.future.isDone();
    }
}

