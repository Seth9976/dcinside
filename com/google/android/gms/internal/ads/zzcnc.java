package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzcnc {
    private final String zza;
    private final zzbop zzb;
    private final Executor zzc;
    private zzcnh zzd;
    private final zzbjp zze;
    private final zzbjp zzf;

    public zzcnc(String s, zzbop zzbop0, Executor executor0) {
        this.zze = new zzcmz(this);
        this.zzf = new zzcnb(this);
        this.zza = s;
        this.zzb = zzbop0;
        this.zzc = executor0;
    }

    public final void zzc(zzcnh zzcnh0) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnh0;
    }

    public final void zzd(zzcex zzcex0) {
        zzcex0.zzag("/updateActiveView", this.zze);
        zzcex0.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcex zzcex0) {
        zzcex0.zzaz("/updateActiveView", this.zze);
        zzcex0.zzaz("/untrackActiveViewUnit", this.zzf);
    }

    static boolean zzg(zzcnc zzcnc0, Map map0) {
        if(map0 != null) {
            String s = (String)map0.get("hashCode");
            return !TextUtils.isEmpty(s) && s.equals(zzcnc0.zza);
        }
        return false;
    }
}

