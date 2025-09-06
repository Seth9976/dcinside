package com.google.android.gms.internal.vision;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

abstract class zzdo implements zzen {
    @NullableDecl
    private transient Map zza;

    @Override
    public boolean equals(@NullableDecl Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzen ? this.zza().equals(((zzen)object0).zza()) : false;
    }

    @Override
    public int hashCode() {
        return this.zza().hashCode();
    }

    @Override
    public String toString() {
        return this.zza().toString();
    }

    @Override  // com.google.android.gms.internal.vision.zzen
    public Map zza() {
        Map map0 = this.zza;
        if(map0 == null) {
            map0 = this.zzb();
            this.zza = map0;
        }
        return map0;
    }

    public boolean zza(@NullableDecl Object object0) {
        for(Object object1: this.zza().values()) {
            if(((Collection)object1).contains(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    abstract Map zzb();
}

