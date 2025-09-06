package com.google.android.gms.internal.vision;

import j..util.DesugarCollections;
import java.util.List;
import java.util.Map.Entry;

final class zzlg extends zzlh {
    zzlg(int v) {
        super(v, null);
    }

    @Override  // com.google.android.gms.internal.vision.zzlh
    public final void zza() {
        if(!this.zzb()) {
            for(int v = 0; v < this.zzc(); ++v) {
                Map.Entry map$Entry0 = this.zzb(v);
                if(((zziw)map$Entry0.getKey()).zzd()) {
                    map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: this.zzd()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((zziw)map$Entry1.getKey()).zzd()) {
                    map$Entry1.setValue(DesugarCollections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        super.zza();
    }
}

