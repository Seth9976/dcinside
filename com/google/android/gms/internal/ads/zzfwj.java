package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o3.a;

abstract class zzfwj implements zzfyl {
    @a
    private transient Set zza;
    @a
    private transient Collection zzb;
    @a
    private transient Map zzc;

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof zzfyl ? this.zzs().equals(((zzfyl)object0).zzs()) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzs().hashCode();
    }

    @Override
    public final String toString() {
        return this.zzs().toString();
    }

    abstract Collection zzf();

    Iterator zzg() {
        throw null;
    }

    abstract Map zzj();

    abstract Set zzl();

    @Override  // com.google.android.gms.internal.ads.zzfyl
    public boolean zzq(Object object0, Object object1) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyl
    public final Collection zzr() {
        Collection collection0 = this.zzb;
        if(collection0 == null) {
            collection0 = this.zzf();
            this.zzb = collection0;
        }
        return collection0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfyl
    public final Map zzs() {
        Map map0 = this.zzc;
        if(map0 == null) {
            map0 = this.zzj();
            this.zzc = map0;
        }
        return map0;
    }

    public final Set zzt() {
        Set set0 = this.zza;
        if(set0 == null) {
            set0 = this.zzl();
            this.zza = set0;
        }
        return set0;
    }
}

