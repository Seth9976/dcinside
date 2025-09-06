package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzawf extends zzatq {
    public Long zza;
    public Long zzb;
    public Long zzc;
    public Long zzd;
    public Long zze;
    public Long zzf;
    public Long zzg;
    public Long zzh;
    public Long zzi;
    public Long zzj;
    public Long zzk;

    public zzawf() {
    }

    public zzawf(String s) {
        HashMap hashMap0 = zzatq.zza(s);
        if(hashMap0 != null) {
            this.zza = (Long)hashMap0.get(0);
            this.zzb = (Long)hashMap0.get(1);
            this.zzc = (Long)hashMap0.get(2);
            this.zzd = (Long)hashMap0.get(3);
            this.zze = (Long)hashMap0.get(4);
            this.zzf = (Long)hashMap0.get(5);
            this.zzg = (Long)hashMap0.get(6);
            this.zzh = (Long)hashMap0.get(7);
            this.zzi = (Long)hashMap0.get(8);
            this.zzj = (Long)hashMap0.get(9);
            this.zzk = (Long)hashMap0.get(10);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatq
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(1, this.zzb);
        hashMap0.put(2, this.zzc);
        hashMap0.put(3, this.zzd);
        hashMap0.put(4, this.zze);
        hashMap0.put(5, this.zzf);
        hashMap0.put(6, this.zzg);
        hashMap0.put(7, this.zzh);
        hashMap0.put(8, this.zzi);
        hashMap0.put(9, this.zzj);
        hashMap0.put(10, this.zzk);
        return hashMap0;
    }
}

