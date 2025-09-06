package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

final class zzdgj implements zzcrc {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhfj zzd;
    private final zzdiq zze;

    zzdgj(Map map0, Map map1, Map map2, zzhfj zzhfj0, zzdiq zzdiq0) {
        this.zza = map0;
        this.zzb = map1;
        this.zzc = map2;
        this.zzd = zzhfj0;
        this.zze = zzdiq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcrc
    @Nullable
    public final zzecw zza(int v, String s) {
        zzecw zzecw1;
        zzecw zzecw0 = (zzecw)this.zza.get(s);
        if(zzecw0 != null) {
            return zzecw0;
        }
        switch(v) {
            case 1: {
                if(this.zze.zze() == null) {
                    return null;
                }
                zzecw1 = ((zzcrc)this.zzd.zzb()).zza(1, s);
                if(zzecw1 == null) {
                    return null;
                }
                break;
            }
            case 4: {
                zzefk zzefk0 = (zzefk)this.zzc.get(s);
                if(zzefk0 != null) {
                    return new zzecx(zzefk0, new zzcre());
                }
                zzecw1 = (zzecw)this.zzb.get(s);
                if(zzecw1 == null) {
                    return null;
                }
                break;
            }
            default: {
                return null;
            }
        }
        return new zzecx(zzecw1, new zzcrf());
    }
}

