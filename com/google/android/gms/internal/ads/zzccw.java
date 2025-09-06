package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzccw extends zzb {
    final zzcbs zza;
    final zzcde zzb;
    private final String zzc;
    private final String[] zzd;

    zzccw(zzcbs zzcbs0, zzcde zzcde0, String s, String[] arr_s) {
        this.zza = zzcbs0;
        this.zzb = zzcde0;
        this.zzc = s;
        this.zzd = arr_s;
        zzv.zzz().zzb(this);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        }
        finally {
            zzccv zzccv0 = new zzccv(this);
            zzs.zza.post(zzccv0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final t0 zzb() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzce)).booleanValue() && this.zzb instanceof zzcdn) {
            zzccu zzccu0 = () -> Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
            return zzbzw.zzf.zzb(zzccu0);
        }
        return super.zzb();
    }

    // 检测为 Lambda 实现
    final Boolean zzd() throws Exception [...]

    public final String zze() {
        return this.zzc;
    }
}

