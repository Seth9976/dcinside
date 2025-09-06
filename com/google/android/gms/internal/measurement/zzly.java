package com.google.android.gms.internal.measurement;

import j..util.DesugarCollections;
import java.util.List;
import java.util.Map.Entry;

final class zzly extends zzlv {
    zzly() {
        super(null);
    }

    @Override  // com.google.android.gms.internal.measurement.zzlv
    public final void zzd() {
        if(!this.zze()) {
            for(int v = 0; v < this.zza(); ++v) {
                Map.Entry map$Entry0 = this.zza(v);
                if(((zzjo)map$Entry0.getKey()).zze()) {
                    map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: this.zzb()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((zzjo)map$Entry1.getKey()).zze()) {
                    map$Entry1.setValue(DesugarCollections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        super.zzd();
    }
}

