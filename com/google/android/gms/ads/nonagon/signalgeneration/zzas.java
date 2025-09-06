package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzgcd;
import java.util.List;
import o3.g;

final class zzas implements zzgcd {
    final zzbtt zza;
    final boolean zzb;
    final zzau zzc;

    zzas(zzau zzau0, zzbtt zzbtt0, boolean z) {
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
        List list0 = (List)object0;
        try {
            zzau.zzH(this.zzc, list0);
            this.zza.zzf(list0);
            if(this.zzc.zzs || this.zzb) {
                for(Object object1: list0) {
                    Uri uri0 = (Uri)object1;
                    if(this.zzc.zzO(uri0)) {
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

