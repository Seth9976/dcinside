package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblt;
import java.util.ArrayList;
import java.util.List;

final class zzev extends zzblt {
    final zzex zza;

    zzev(zzex zzex0, zzew zzew0) {
        this.zza = zzex0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzblu
    public final void zzb(List list0) throws RemoteException {
        ArrayList arrayList0;
        synchronized(this.zza.zzc) {
            zzex.zzm(this.zza, false);
            zzex.zzl(this.zza, true);
            arrayList0 = new ArrayList(this.zza.zze);
            this.zza.zze.clear();
        }
        InitializationStatus initializationStatus0 = zzex.zzA(list0);
        int v2 = arrayList0.size();
        for(int v1 = 0; v1 < v2; ++v1) {
            ((OnInitializationCompleteListener)arrayList0.get(v1)).onInitializationComplete(initializationStatus0);
        }
    }
}

