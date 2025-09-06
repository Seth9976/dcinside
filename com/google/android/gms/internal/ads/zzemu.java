package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzemu implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzemu(zzgcs zzgcs0, Context context0) {
        this.zzb = zzgcs0;
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 61;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzmJ)).booleanValue()) {
            return zzgch.zzh(new zzemv(null, false));
        }
        ContentResolver contentResolver0 = this.zza.getContentResolver();
        if(contentResolver0 == null) {
            return zzgch.zzh(new zzemv(null, false));
        }
        zzemt zzemt0 = new zzemt(contentResolver0);
        return this.zzb.zzb(zzemt0);
    }
}

