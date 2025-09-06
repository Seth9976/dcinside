package com.google.android.gms.internal.ads;

import java.util.HashMap;

public final class zzats extends zzatq {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzats() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    public zzats(String s) {
        String s1 = "E";
        this.zza = "E";
        long v = -1L;
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap hashMap0 = zzatq.zza(s);
        if(hashMap0 != null) {
            this.zza = hashMap0.get(0) == null ? "E" : ((String)hashMap0.get(0));
            if(hashMap0.get(1) != null) {
                v = (long)(((Long)hashMap0.get(1)));
            }
            this.zzb = v;
            this.zzc = hashMap0.get(2) == null ? "E" : ((String)hashMap0.get(2));
            this.zzd = hashMap0.get(3) == null ? "E" : ((String)hashMap0.get(3));
            if(hashMap0.get(4) != null) {
                s1 = (String)hashMap0.get(4);
            }
            this.zze = s1;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatq
    protected final HashMap zzb() {
        HashMap hashMap0 = new HashMap();
        hashMap0.put(0, this.zza);
        hashMap0.put(4, this.zze);
        hashMap0.put(3, this.zzd);
        hashMap0.put(2, this.zzc);
        hashMap0.put(1, this.zzb);
        return hashMap0;
    }
}

