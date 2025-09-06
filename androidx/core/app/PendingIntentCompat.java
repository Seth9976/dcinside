package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent.OnFinished;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

public final class PendingIntentCompat {
    @RequiresApi(23)
    static class Api23Impl {
        public static void a(PendingIntent pendingIntent0, Context context0, int v, Intent intent0, PendingIntent.OnFinished pendingIntent$OnFinished0, Handler handler0, String s, Bundle bundle0) throws PendingIntent.CanceledException {
            pendingIntent0.send(context0, v, intent0, pendingIntent$OnFinished0, handler0, s, bundle0);
        }
    }

    @RequiresApi(26)
    static class Api26Impl {
        public static PendingIntent a(Context context0, int v, Intent intent0, int v1) {
            return PendingIntent.getForegroundService(context0, v, intent0, v1);
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    static class GatedCallback implements Closeable {
        private final CountDownLatch a;
        private PendingIntent.OnFinished b;
        private boolean c;

        GatedCallback(PendingIntent.OnFinished pendingIntent$OnFinished0) {
            this.a = new CountDownLatch(1);
            this.b = pendingIntent$OnFinished0;
            this.c = false;
        }

        public void b() {
            this.c = true;
        }

        public PendingIntent.OnFinished c() {
            return this.b == null ? null : (PendingIntent pendingIntent0, Intent intent0, int v, String s, Bundle bundle0) -> {
                boolean z = false;
                while(true) {
                    try {
                        this.a.await();
                        break;
                    }
                    catch(InterruptedException unused_ex) {
                        z = true;
                    }
                    catch(Throwable throwable0) {
                        if(z) {
                            Thread.currentThread().interrupt();
                        }
                        throw throwable0;
                    }
                }
                if(z) {
                    Thread.currentThread().interrupt();
                }
                PendingIntent.OnFinished pendingIntent$OnFinished0 = this.b;
                if(pendingIntent$OnFinished0 != null) {
                    pendingIntent$OnFinished0.onSendFinished(pendingIntent0, intent0, v, s, bundle0);
                    this.b = null;
                }
            };
        }

        @Override
        public void close() {
            if(!this.c) {
                this.b = null;
            }
            this.a.countDown();
        }

        // 检测为 Lambda 实现
        private void e(PendingIntent pendingIntent0, Intent intent0, int v, String s, Bundle bundle0) [...]
    }

    static int a(boolean z, int v) {
        if(z) {
            return Build.VERSION.SDK_INT < 0x1F ? v : v | 0x2000000;
        }
        return Build.VERSION.SDK_INT < 23 ? v : v | 0x4000000;
    }

    public static PendingIntent b(Context context0, int v, @SuppressLint({"ArrayReturn"}) Intent[] arr_intent, int v1, Bundle bundle0, boolean z) {
        return PendingIntent.getActivities(context0, v, arr_intent, PendingIntentCompat.a(z, v1), bundle0);
    }

    public static PendingIntent c(Context context0, int v, @SuppressLint({"ArrayReturn"}) Intent[] arr_intent, int v1, boolean z) {
        return PendingIntent.getActivities(context0, v, arr_intent, PendingIntentCompat.a(z, v1));
    }

    public static PendingIntent d(Context context0, int v, Intent intent0, int v1, Bundle bundle0, boolean z) {
        return PendingIntent.getActivity(context0, v, intent0, PendingIntentCompat.a(z, v1), bundle0);
    }

    public static PendingIntent e(Context context0, int v, Intent intent0, int v1, boolean z) {
        return PendingIntent.getActivity(context0, v, intent0, PendingIntentCompat.a(z, v1));
    }

    public static PendingIntent f(Context context0, int v, Intent intent0, int v1, boolean z) {
        return PendingIntent.getBroadcast(context0, v, intent0, PendingIntentCompat.a(z, v1));
    }

    @RequiresApi(26)
    public static PendingIntent g(Context context0, int v, Intent intent0, int v1, boolean z) {
        return Api26Impl.a(context0, v, intent0, PendingIntentCompat.a(z, v1));
    }

    public static PendingIntent h(Context context0, int v, Intent intent0, int v1, boolean z) {
        return PendingIntent.getService(context0, v, intent0, PendingIntentCompat.a(z, v1));
    }

    @SuppressLint({"LambdaLast"})
    public static void i(PendingIntent pendingIntent0, int v, PendingIntent.OnFinished pendingIntent$OnFinished0, Handler handler0) throws PendingIntent.CanceledException {
        try(GatedCallback pendingIntentCompat$GatedCallback0 = new GatedCallback(pendingIntent$OnFinished0)) {
            pendingIntent0.send(v, pendingIntentCompat$GatedCallback0.c(), handler0);
            pendingIntentCompat$GatedCallback0.b();
        }
    }

    @SuppressLint({"LambdaLast"})
    public static void j(PendingIntent pendingIntent0, @SuppressLint({"ContextFirst"}) Context context0, int v, Intent intent0, PendingIntent.OnFinished pendingIntent$OnFinished0, Handler handler0) throws PendingIntent.CanceledException {
        PendingIntentCompat.k(pendingIntent0, context0, v, intent0, pendingIntent$OnFinished0, handler0, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void k(PendingIntent pendingIntent0, @SuppressLint({"ContextFirst"}) Context context0, int v, Intent intent0, PendingIntent.OnFinished pendingIntent$OnFinished0, Handler handler0, String s, Bundle bundle0) throws PendingIntent.CanceledException {
        try(GatedCallback pendingIntentCompat$GatedCallback0 = new GatedCallback(pendingIntent$OnFinished0)) {
            if(Build.VERSION.SDK_INT >= 23) {
                Api23Impl.a(pendingIntent0, context0, v, intent0, pendingIntent$OnFinished0, handler0, s, bundle0);
            }
            else {
                pendingIntent0.send(context0, v, intent0, pendingIntentCompat$GatedCallback0.c(), handler0, s);
            }
            pendingIntentCompat$GatedCallback0.b();
        }
    }
}

