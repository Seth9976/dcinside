package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzdxo extends zzdxs {
    private final Context zzg;
    private final Executor zzh;

    public zzdxo(Context context0, Executor executor0) {
        this.zzg = context0;
        this.zzh = executor0;
        this.zzf = new zzbup(context0, zzv.zzu().zzb(), this, this);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        synchronized(this.zzb) {
            try {
                if(!this.zzd) {
                    try {
                        this.zzd = true;
                        zzbuy zzbuy0 = this.zzf.zzp();
                        zzbvk zzbvk0 = this.zze;
                        zzdxr zzdxr0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzmM)).booleanValue() ? new zzdxr(this.zza, this.zze) : new zzdxq(this);
                        zzbuy0.zzg(zzbvk0, zzdxr0);
                        return;
                    }
                    catch(RemoteException | IllegalArgumentException unused_ex) {
                    }
                    goto label_15;
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_18;
            }
        }
    label_15:
        zzdyh zzdyh0 = new zzdyh(1);
        this.zza.zzd(zzdyh0);
        return;
    label_18:
        zzv.zzp().zzw(throwable0, "RemoteAdRequestClientTask.onConnected");
        zzdyh zzdyh1 = new zzdyh(1);
        this.zza.zzd(zzdyh1);
    }

    @Override  // com.google.android.gms.internal.ads.zzdxs
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        zzdyh zzdyh0 = new zzdyh(1);
        this.zza.zzd(zzdyh0);
    }

    public final t0 zza(zzbvk zzbvk0) {
        synchronized(this.zzb) {
            if(this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzbvk0;
            this.zzf.checkAvailabilityAndConnect();
            zzdxn zzdxn0 = new zzdxn(this);
            this.zza.addListener(zzdxn0, zzbzw.zzg);
            zzdxs.zzc(this.zzg, this.zza, this.zzh);
            return this.zza;
        }
    }
}

