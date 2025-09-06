package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

final class zzdhx implements zzayk {
    final String zza;
    final zzdia zzb;

    zzdhx(zzdia zzdia0, String s) {
        this.zza = s;
        this.zzb = zzdia0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbR)).booleanValue()) {
            synchronized(this) {
                if(zzayj0.zzj) {
                    zzdia zzdia0 = this.zzb;
                    if(zzdia0.zzo != null) {
                        zzdia0.zzy.put(this.zza, Boolean.TRUE);
                        zzdia zzdia1 = this.zzb;
                        if(zzdia1.zzo == null) {
                            return;
                        }
                        zzdia1.zzB(zzdia1.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                    }
                }
            }
            return;
        }
        if(zzayj0.zzj) {
            zzdia zzdia2 = this.zzb;
            if(zzdia2.zzo != null) {
                zzdia2.zzy.put(this.zza, Boolean.TRUE);
                zzdia zzdia3 = this.zzb;
                if(zzdia3.zzo != null) {
                    zzdia3.zzB(zzdia3.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                }
            }
        }
    }
}

