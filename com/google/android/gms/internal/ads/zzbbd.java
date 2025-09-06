package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;
import com.google.common.util.concurrent.t0;

final class zzbbd implements BaseConnectionCallbacks {
    final zzbav zza;
    final zzcab zzb;
    final zzbbf zzc;
    public static final int zzd;

    zzbbd(zzbbf zzbbf0, zzbav zzbav0, zzcab zzcab0) {
        this.zza = zzbav0;
        this.zzb = zzcab0;
        this.zzc = zzbbf0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle0) {
        synchronized(this.zzc.zzd) {
            zzbbf zzbbf0 = this.zzc;
            if(zzbbf0.zzb) {
                return;
            }
            zzbbf.zzd(zzbbf0, true);
            zzbau zzbau0 = this.zzc.zza;
            if(zzbau0 == null) {
                return;
            }
            zzbba zzbba0 = new zzbba(this, zzbau0, this.zza, this.zzb);
            t0 t00 = zzbzw.zza.zza(zzbba0);
            zzbbb zzbbb0 = new zzbbb(this.zzb, t00);
            this.zzb.addListener(zzbbb0, zzbzw.zzg);
        }
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks
    public final void onConnectionSuspended(int v) {
    }
}

