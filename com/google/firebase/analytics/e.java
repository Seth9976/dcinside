package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzdg;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class e extends ThreadPoolExecutor {
    e(FirebaseAnalytics firebaseAnalytics0, int v, int v1, long v2, TimeUnit timeUnit0, BlockingQueue blockingQueue0) {
        super(0, 1, 30L, timeUnit0, blockingQueue0);
    }

    @Override
    public final void execute(Runnable runnable0) {
        super.execute(zzdg.zza().zza(runnable0));
    }
}

