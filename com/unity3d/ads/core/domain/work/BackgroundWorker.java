package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.Constraints.Builder;
import androidx.work.Constraints;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nBackgroundWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundWorker.kt\ncom/unity3d/ads/core/domain/work/BackgroundWorker\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,34:1\n29#2:35\n*S KotlinDebug\n*F\n+ 1 BackgroundWorker.kt\ncom/unity3d/ads/core/domain/work/BackgroundWorker\n*L\n23#1:35\n*E\n"})
public final class BackgroundWorker {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion Companion = null;
    @l
    public static final String TAG = "UnityAdsBackgroundWorker";
    @l
    private final WorkManager workManager;

    static {
        BackgroundWorker.Companion = new Companion(null);
    }

    public BackgroundWorker(@l Context context0) {
        L.p(context0, "applicationContext");
        super();
        WorkManager workManager0 = WorkManager.q(context0);
        L.o(workManager0, "getInstance(applicationContext)");
        this.workManager = workManager0;
    }

    @l
    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final void invoke(UniversalRequestWorkerData universalRequestWorkerData0) {
        L.p(universalRequestWorkerData0, "universalRequestWorkerData");
        Constraints constraints0 = new Builder().d(NetworkType.b).b();
        L.o(constraints0, "Builder()\n            .s…TED)\n            .build()");
        L.y(4, "T");
        WorkRequest workRequest0 = ((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)((androidx.work.OneTimeWorkRequest.Builder)new androidx.work.OneTimeWorkRequest.Builder(ListenableWorker.class).o(constraints0)).w(universalRequestWorkerData0.invoke())).a("UnityAdsBackgroundWorker")).b();
        L.o(workRequest0, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        this.getWorkManager().j(((OneTimeWorkRequest)workRequest0));
    }
}

