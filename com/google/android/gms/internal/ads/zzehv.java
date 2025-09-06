package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzehv implements zzdgc {
    public final zzecz zza;

    public zzehv(zzecz zzecz0) {
        this.zza = zzecz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context0, zzcwg zzcwg0) {
        try {
            ((zzfdh)this.zza.zzb).zzv(z);
            ((zzfdh)this.zza.zzb).zzA();
        }
        catch(zzfcq zzfcq0) {
            zzo.zzk("Cannot show rewarded video.", zzfcq0);
            throw new zzdgb(zzfcq0.getCause());
        }
    }
}

