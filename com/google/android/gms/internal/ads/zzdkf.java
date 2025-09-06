package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;

final class zzdkf implements zzgcd {
    final zzdkg zza;

    zzdkf(zzdkg zzdkg0) {
        this.zza = zzdkg0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            zzv.zzp().zzw(throwable0, "omid native display exp");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zzc(((List)object0));
    }

    public final void zzc(List list0) {
        try {
            zzcex zzcex0 = (zzcex)list0.get(0);
            if(zzcex0 != null) {
                this.zza.zzb(zzcex0);
            }
        }
        catch(IndexOutOfBoundsException | ClassCastException indexOutOfBoundsException0) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
                zzv.zzp().zzw(indexOutOfBoundsException0, "omid native display exp");
            }
        }
    }
}

