package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;

public final class zzdtu implements Runnable {
    public final zzcab zza;

    public zzdtu(zzdua zzdua0, zzcab zzcab0) {
        this.zza = zzcab0;
    }

    @Override
    public final void run() {
        String s = zzv.zzp().zzi().zzg().zzc();
        boolean z = TextUtils.isEmpty(s);
        zzcab zzcab0 = this.zza;
        if(!z) {
            zzcab0.zzc(s);
            return;
        }
        zzcab0.zzd(new Exception());
    }
}

