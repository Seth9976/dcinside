package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker.Result;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsx;

@KeepForSdk
public class OfflineNotificationPoster extends Worker {
    private final zzbsx zza;

    public OfflineNotificationPoster(@NonNull Context context0, @NonNull WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
        this.zza = zzbc.zza().zzo(context0, new zzbpa());
    }

    @Override  // androidx.work.Worker
    @NonNull
    public final Result doWork() {
        String s = this.getInputData().q("uri");
        String s1 = this.getInputData().q("gws_query_id");
        String s2 = this.getInputData().q("image_url");
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.getApplicationContext());
            zza zza0 = new zza(s, s1, s2);
            this.zza.zzj(iObjectWrapper0, zza0);
            return Result.e();
        }
        catch(RemoteException unused_ex) {
            return Result.a();
        }
    }
}

