package com.vungle.ads.internal.util;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class v {
    @l
    public static final v INSTANCE;
    @l
    private static final Handler UI_HANDLER;
    @m
    private static Executor uiExecutor;

    static {
        v.INSTANCE = new v();
        v.UI_HANDLER = new Handler(Looper.getMainLooper());
    }

    @m
    public final Executor getUiExecutor$vungle_ads_release() {
        return v.uiExecutor;
    }

    @VisibleForTesting
    public static void getUiExecutor$vungle_ads_release$annotations() {
    }

    public final boolean isMainThread() {
        Looper looper0 = Looper.getMainLooper();
        if(looper0 == null) {
            return false;
        }
        if(Build.VERSION.SDK_INT >= 23) {
            return looper0.isCurrentThread();
        }
        Looper looper1 = Looper.myLooper();
        return looper1 != null && L.g(looper0.getThread(), looper1.getThread());
    }

    public final void runOnUiThread(@l Runnable runnable0) {
        L.p(runnable0, "runnable");
        if(this.isMainThread()) {
            runnable0.run();
            return;
        }
        Executor executor0 = v.uiExecutor;
        if(executor0 != null) {
            executor0.execute(runnable0);
            return;
        }
        v.UI_HANDLER.post(runnable0);
    }

    public final void setUiExecutor$vungle_ads_release(@m Executor executor0) {
        v.uiExecutor = executor0;
    }
}

