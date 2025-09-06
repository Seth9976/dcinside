package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzgcd;
import java.util.ArrayList;
import o3.g;

final class zzar implements zzgcd {
    final zzbtt zza;
    final boolean zzb;
    final zzau zzc;

    zzar(zzau zzau0, zzbtt zzbtt0, boolean z) {
        this.zza = zzbtt0;
        this.zzb = z;
        this.zzc = zzau0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        try {
            this.zza.zze("Internal error: " + throwable0.getMessage());
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@g Object object0) {
        ArrayList arrayList0 = (ArrayList)object0;
        try {
            this.zza.zzf(arrayList0);
            if(this.zzc.zzr || this.zzb) {
                for(Object object1: arrayList0) {
                    Uri uri0 = (Uri)object1;
                    if(this.zzc.zzP(uri0)) {
                        Uri uri1 = zzau.zzd(this.zzc, uri0, this.zzc.zzA, "1");
                        this.zzc.zzq.zzd(uri1.toString(), null, null);
                    }
                    else if(((Boolean)zzbe.zzc().zza(zzbcl.zzhm)).booleanValue()) {
                        this.zzc.zzq.zzd(uri0.toString(), null, null);
                    }
                }
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzh("", remoteException0);
    }
}

