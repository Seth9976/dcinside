package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

final class zzdzh implements zzgcd {
    final zzbvk zza;
    final zzbvc zzb;

    zzdzh(zzdzl zzdzl0, zzbvk zzbvk0, zzbvc zzbvc0) {
        this.zza = zzbvk0;
        this.zzb = zzbvc0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        try {
            zzbb zzbb0 = zzbb.zzb(throwable0);
            this.zzb.zze(zzbb0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Service can\'t call client", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)object0;
        try {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzcl)).booleanValue()) {
                    Bundle bundle0 = this.zza.zzm;
                    if(bundle0 != null) {
                        bundle0.putLong("binder-call-start", zzv.zzC().currentTimeMillis());
                    }
                }
                this.zzb.zzg(parcelFileDescriptor0, this.zza);
                return;
            }
            this.zzb.zzf(parcelFileDescriptor0);
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zze.zzb("Service can\'t call client", remoteException0);
    }
}

