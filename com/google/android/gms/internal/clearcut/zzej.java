package com.google.android.gms.internal.clearcut;

import j..util.DesugarCollections;
import java.util.List;
import java.util.Map.Entry;

final class zzej extends zzei {
    zzej(int v) {
        super(v, null);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzei
    public final void zzv() {
        if(!this.isImmutable()) {
            for(int v = 0; v < this.zzdr(); ++v) {
                Map.Entry map$Entry0 = this.zzak(v);
                if(((zzca)map$Entry0.getKey()).zzaw()) {
                    map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
                }
            }
            for(Object object0: this.zzds()) {
                Map.Entry map$Entry1 = (Map.Entry)object0;
                if(((zzca)map$Entry1.getKey()).zzaw()) {
                    map$Entry1.setValue(DesugarCollections.unmodifiableList(((List)map$Entry1.getValue())));
                }
            }
        }
        super.zzv();
    }
}

