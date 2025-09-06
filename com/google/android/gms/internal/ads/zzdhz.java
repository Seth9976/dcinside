package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

final class zzdhz implements zzgcd {
    final View zza;
    final zzdia zzb;

    zzdhz(zzdia zzdia0, View view0) {
        this.zza = view0;
        this.zzb = zzdia0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            zzv.zzp().zzv(throwable0, "omid native display exp");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zzb.zzad(this.zza, ((zzecr)object0));
    }
}

