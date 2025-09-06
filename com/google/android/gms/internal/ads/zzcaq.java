package com.google.android.gms.internal.ads;

final class zzcaq implements Runnable {
    final String zza;
    final String zzb;
    final zzcaw zzc;

    zzcaq(zzcaw zzcaw0, String s, String s1) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzcaw0;
        super();
    }

    @Override
    public final void run() {
        zzcaw zzcaw0 = this.zzc;
        if(zzcaw0.zzq != null) {
            zzcaw0.zzq.zzb(this.zza, this.zzb);
        }
    }
}

