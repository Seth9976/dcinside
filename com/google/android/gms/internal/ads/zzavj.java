package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzavj extends zzatq {
    public long zza;
    public long zzb;

    public zzavj() {
        this.zza = -1L;
        this.zzb = -1L;
    }

    public zzavj(String s) {
        this.zza = -1L;
        this.zzb = -1L;
        HashMap hashMap0 = zzatq.zza(s);
        if(hashMap0 != null) {
            this.zza = (long)(((Long)hashMap0.get(0)));
            this.zzb = (long)(((Long)hashMap0.get(1)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatq
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        return hashMap0;
    }
}

