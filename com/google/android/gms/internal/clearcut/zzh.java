package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger.zzb;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

final class zzh extends ApiMethodImpl {
    private final zze zzao;

    zzh(zze zze0, GoogleApiClient googleApiClient0) {
        super(ClearcutLogger.API, googleApiClient0);
        this.zzao = zze0;
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    protected final Result createFailedResult(Status status0) {
        return status0;
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl
    protected final void doExecute(AnyClient api$AnyClient0) throws RemoteException {
        zzi zzi0 = new zzi(this);
        try {
            zze zze0 = this.zzao;
            zzb clearcutLogger$zzb0 = zze0.zzt;
            if(clearcutLogger$zzb0 != null) {
                zzha zzha0 = zze0.zzaa;
                if(zzha0.zzbjp.length == 0) {
                    zzha0.zzbjp = clearcutLogger$zzb0.zza();
                }
            }
            zzb clearcutLogger$zzb1 = zze0.zzan;
            if(clearcutLogger$zzb1 != null) {
                zzha zzha1 = zze0.zzaa;
                if(zzha1.zzbjw.length == 0) {
                    zzha1.zzbjw = clearcutLogger$zzb1.zza();
                }
            }
            int v = zze0.zzaa.zzas();
            byte[] arr_b = new byte[v];
            zzfz.zza(zze0.zzaa, arr_b, 0, v);
            zze0.zzah = arr_b;
        }
        catch(RuntimeException runtimeException0) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", runtimeException0);
            this.setFailedResult(new Status(10, "MessageProducer"));
            return;
        }
        ((zzn)((zzj)api$AnyClient0).getService()).zza(zzi0, this.zzao);
    }
}

