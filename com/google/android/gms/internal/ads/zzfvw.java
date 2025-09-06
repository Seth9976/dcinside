package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o3.a;

class zzfvw extends zzfyh {
    final zzfwg zza;

    zzfvw(zzfwg zzfwg0, Map map0) {
        this.zza = zzfwg0;
        super(map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfyh
    public final void clear() {
        zzfxx.zzb(this.iterator());
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        return this.zzd.keySet().containsAll(collection0);
    }

    @Override
    public final boolean equals(@a Object object0) {
        return this == object0 || this.zzd.keySet().equals(object0);
    }

    @Override
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override  // com.google.android.gms.internal.ads.zzfyh
    public final Iterator iterator() {
        return new zzfvv(this, this.zzd.entrySet().iterator());
    }

    @Override  // com.google.android.gms.internal.ads.zzfyh
    public final boolean remove(@a Object object0) {
        Collection collection0 = (Collection)this.zzd.remove(object0);
        if(collection0 != null) {
            int v = collection0.size();
            collection0.clear();
            this.zza.zzb -= v;
            return v > 0;
        }
        return false;
    }
}

