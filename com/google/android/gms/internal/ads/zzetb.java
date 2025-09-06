package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzetb implements zzetr {
    private final zzbyi zza;
    private final zzgcs zzb;
    private final Context zzc;

    public zzetb(zzbyi zzbyi0, zzgcs zzgcs0, Context context0) {
        this.zza = zzbyi0;
        this.zzb = zzgcs0;
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 34;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeta zzeta0 = () -> {
            if(!this.zza.zzp(this.zzc)) {
                return new zzetc(null, null, null, null, null);
            }
            String s = this.zza.zzd(this.zzc);
            String s1 = s == null ? "" : s;
            String s2 = this.zza.zzb(this.zzc);
            String s3 = s2 == null ? "" : s2;
            String s4 = this.zza.zza(this.zzc);
            String s5 = s4 == null ? "" : s4;
            Long long0 = null;
            String s6 = this.zza.zzp(this.zzc) ? "fa" : null;
            if("TIME_OUT".equals(s3)) {
                long0 = (Long)zzbe.zzc().zza(zzbcl.zzat);
            }
            return s6 == null ? new zzetc(s1, s3, s5, "", long0) : new zzetc(s1, s3, s5, s6, long0);
        };
        return this.zzb.zzb(zzeta0);
    }

    // 检测为 Lambda 实现
    final zzetc zzc() throws Exception [...]
}

