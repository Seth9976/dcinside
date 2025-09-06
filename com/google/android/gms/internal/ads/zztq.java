package com.google.android.gms.internal.ads;

import java.util.List;

public final class zztq implements zzwa {
    private final zzfxn zza;
    private long zzb;

    public zztq(List list0, List list1) {
        zzfxk zzfxk0 = new zzfxk();
        zzcw.zzd(list0.size() == list1.size());
        for(int v = 0; v < list0.size(); ++v) {
            zzfxk0.zzf(new zztp(((zzwa)list0.get(v)), ((List)list1.get(v))));
        }
        this.zza = zzfxk0.zzi();
        this.zzb = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < this.zza.size(); ++v) {
            zztp zztp0 = (zztp)this.zza.get(v);
            long v3 = zztp0.zzb();
            if((zztp0.zza().contains(1) || zztp0.zza().contains(2) || zztp0.zza().contains(4)) && v3 != 0x8000000000000000L) {
                v1 = Math.min(v1, v3);
            }
            if(v3 != 0x8000000000000000L) {
                v2 = Math.min(v2, v3);
            }
        }
        if(v1 != 0x7FFFFFFFFFFFFFFFL) {
            this.zzb = v1;
            return v1;
        }
        if(v2 != 0x7FFFFFFFFFFFFFFFL) {
            return this.zzb == 0x8000000000000001L ? v2 : this.zzb;
        }
        return 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long v1 = 0x7FFFFFFFFFFFFFFFL;
        for(int v = 0; v < this.zza.size(); ++v) {
            long v2 = ((zztp)this.zza.get(v)).zzc();
            if(v2 != 0x8000000000000000L) {
                v1 = Math.min(v1, v2);
            }
        }
        return v1 == 0x7FFFFFFFFFFFFFFFL ? 0x8000000000000000L : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final void zzm(long v) {
        for(int v1 = 0; v1 < this.zza.size(); ++v1) {
            ((zztp)this.zza.get(v1)).zzm(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkj0) {
        boolean z = false;
        do {
            long v = this.zzc();
            if(v == 0x8000000000000000L) {
                break;
            }
            boolean z1 = false;
            for(int v1 = 0; v1 < this.zza.size(); ++v1) {
                long v2 = ((zztp)this.zza.get(v1)).zzc();
                if(v2 == v || v2 != 0x8000000000000000L && v2 <= zzkj0.zza) {
                    z1 |= ((zztp)this.zza.get(v1)).zzo(zzkj0);
                }
            }
            z |= z1;
        }
        while(z1);
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        for(int v = 0; v < this.zza.size(); ++v) {
            if(((zztp)this.zza.get(v)).zzp()) {
                return true;
            }
        }
        return false;
    }
}

