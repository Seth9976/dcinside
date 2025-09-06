package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzehc implements zzdgc {
    public final zzecz zza;

    public zzehc(zzecz zzecz0) {
        this.zza = zzecz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context0, zzcwg zzcwg0) {
        try {
            ((zzfdh)this.zza.zzb).zzv(z);
            ((zzfdh)this.zza.zzb).zzz(context0);
        }
        catch(zzfcq zzfcq0) {
            throw new zzdgb(zzfcq0.getCause());
        }
    }
}

