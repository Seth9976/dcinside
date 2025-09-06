package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcoh extends zzbac {
    private final zzcog zza;
    private final zzby zzb;
    private final zzexm zzc;
    private boolean zzd;
    private final zzdrw zze;

    public zzcoh(zzcog zzcog0, zzby zzby0, zzexm zzexm0, zzdrw zzdrw0) {
        this.zzd = ((Boolean)zzbe.zzc().zza(zzbcl.zzaR)).booleanValue();
        this.zza = zzcog0;
        this.zzb = zzby0;
        this.zzc = zzexm0;
        this.zze = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final zzby zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    @Nullable
    public final zzdy zzf() {
        return !((Boolean)zzbe.zzc().zza(zzbcl.zzgC)).booleanValue() ? null : this.zza.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final void zzh(zzdr zzdr0) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if(this.zzc != null) {
            try {
                if(!zzdr0.zzf()) {
                    this.zze.zze();
                }
            }
            catch(RemoteException remoteException0) {
                zzo.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
            }
            this.zzc.zzn(zzdr0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final void zzi(IObjectWrapper iObjectWrapper0, zzbak zzbak0) {
        try {
            this.zzc.zzp(zzbak0);
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zza.zzd(activity0, zzbak0, this.zzd);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

