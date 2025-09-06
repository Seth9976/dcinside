package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.List;
import java.util.Map.Entry;

final class zzgzy extends zzhad {
    zzgzy() {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzhad
    public final void zza() {
        if(!this.zzj()) {
            for(int v = 0; v < this.zzc(); ++v) {
                Map.Entry map$Entry0 = this.zzg(v);
                if(((zzgxf)((zzgzz)map$Entry0).zza()).zze()) {
                    map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: this.zzd()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((zzgxf)map$Entry1.getKey()).zze()) {
                    map$Entry1.setValue(DesugarCollections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        super.zza();
    }
}

