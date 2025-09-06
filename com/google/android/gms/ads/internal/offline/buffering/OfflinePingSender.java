package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsx;

@KeepForSdk
public class OfflinePingSender extends Worker {
    private final zzbsx zza;

    public OfflinePingSender(@NonNull Context context0, @NonNull WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.zza = zzbc.zza().zzo(context0, new zzbpa());
    }

    @Override  // androidx.work.Worker
    @NonNull
    public final Result doWork() {
        try {
            this.zza.zzh();
            return Result.e();
        }
        catch(RemoteException unused_ex) {
            return Result.a();
        }
    }
}

