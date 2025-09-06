package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class zzfsv extends zzfro {
    final zzfsw zza;
    private final zzftb zzb;

    zzfsv(zzfsw zzfsw0, zzftb zzftb0) {
        this.zza = zzfsw0;
        super();
        this.zzb = zzftb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfrp
    public final void zzb(Bundle bundle0) {
        int v = bundle0.getInt("statusCode", 8150);
        String s = bundle0.getString("sessionToken");
        zzfsz zzfsz0 = zzfta.zzc();
        zzfsz0.zzb(v);
        if(s != null) {
            zzfsz0.zza(s);
        }
        zzfta zzfta0 = zzfsz0.zzc();
        this.zzb.zza(zzfta0);
        if(v == 0x1FDD) {
            this.zza.zza();
        }
    }
}

