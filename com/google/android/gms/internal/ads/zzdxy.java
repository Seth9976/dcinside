package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.t0;

public final class zzdxy extends zzdxs {
    private String zzg;
    private int zzh;

    zzdxy(Context context0) {
        this.zzh = 1;
        this.zzf = new zzbup(context0, zzv.zzu().zzb(), this, this);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        synchronized(this.zzb) {
            try {
                if(!this.zzd) {
                    try {
                        this.zzd = true;
                        int v1 = this.zzh;
                        if(v1 == 2) {
                            zzbuy zzbuy0 = this.zzf.zzp();
                            zzbvk zzbvk0 = this.zze;
                            zzdxr zzdxr0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzmM)).booleanValue() ? new zzdxr(this.zza, this.zze) : new zzdxq(this);
                            zzbuy0.zze(zzbvk0, zzdxr0);
                        }
                        else if(v1 == 3) {
                            zzbuy zzbuy1 = this.zzf.zzp();
                            String s = this.zzg;
                            zzdxr zzdxr1 = ((Boolean)zzbe.zzc().zza(zzbcl.zzmM)).booleanValue() ? new zzdxr(this.zza, this.zze) : new zzdxq(this);
                            zzbuy1.zzh(s, zzdxr1);
                        }
                        else {
                            zzdyh zzdyh0 = new zzdyh(1);
                            this.zza.zzd(zzdyh0);
                            return;
                        }
                    }
                    catch(RemoteException | IllegalArgumentException unused_ex) {
                        goto label_29;
                    }
                }
                return;
            }
            catch(Throwable throwable0) {
                goto label_32;
            }
        }
    label_29:
        zzdyh zzdyh1 = new zzdyh(1);
        this.zza.zzd(zzdyh1);
        return;
    label_32:
        zzv.zzp().zzw(throwable0, "RemoteUrlAndCacheKeyClientTask.onConnected");
        zzdyh zzdyh2 = new zzdyh(1);
        this.zza.zzd(zzdyh2);
    }

    @Override  // com.google.android.gms.internal.ads.zzdxs
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        zzdyh zzdyh0 = new zzdyh(1);
        this.zza.zzd(zzdyh0);
    }

    public final t0 zza(zzbvk zzbvk0) {
        synchronized(this.zzb) {
            if(this.zzh != 1 && this.zzh != 2) {
                return zzgch.zzg(new zzdyh(2));
            }
            if(this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzbvk0;
            this.zzf.checkAvailabilityAndConnect();
            zzdxw zzdxw0 = new zzdxw(this);
            this.zza.addListener(zzdxw0, zzbzw.zzg);
            return this.zza;
        }
    }

    public final t0 zzd(String s) {
        synchronized(this.zzb) {
            if(this.zzh != 1 && this.zzh != 3) {
                return zzgch.zzg(new zzdyh(2));
            }
            if(this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = s;
            this.zzf.checkAvailabilityAndConnect();
            zzdxx zzdxx0 = new zzdxx(this);
            this.zza.addListener(zzdxx0, zzbzw.zzg);
            return this.zza;
        }
    }
}

