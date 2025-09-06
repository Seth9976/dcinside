package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzavu extends zzatq {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzavu() {
    }

    public zzavu(String s) {
        HashMap hashMap0 = zzatq.zza(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Boolean)hashMap0.get(1);
            this.zzc = (Boolean)hashMap0.get(2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatq
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        hashMap0.put(2, this.zzc);
        return hashMap0;
    }
}

