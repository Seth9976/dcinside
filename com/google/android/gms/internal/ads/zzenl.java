package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzenl implements zzetr {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsp zze;
    private final zzfdq zzf;
    private final zzfcj zzg;
    private final zzg zzh;
    private final zzdrq zzi;
    private final zzctc zzj;

    public zzenl(Context context0, String s, String s1, zzcsp zzcsp0, zzfdq zzfdq0, zzfcj zzfcj0, zzdrq zzdrq0, zzctc zzctc0, long v) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = s1;
        this.zze = zzcsp0;
        this.zzf = zzfdq0;
        this.zzg = zzfcj0;
        this.zzh = zzv.zzp().zzi();
        this.zzi = zzdrq0;
        this.zzj = zzctc0;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 12;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        Bundle bundle0 = new Bundle();
        this.zzi.zzb().put("seq_num", this.zzb);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            String s = String.valueOf(zzv.zzC().currentTimeMillis() - this.zzd);
            this.zzi.zzc("tsacc", s);
            String s1 = zzs.zzH(this.zza) ? "0" : "1";
            this.zzi.zzc("foreground", s1);
        }
        this.zze.zzk(this.zzg.zzd);
        bundle0.putAll(this.zzf.zzb());
        return zzgch.zzh(new zzenm(this.zza, bundle0, this.zzb, this.zzc, this.zzh, this.zzg.zzf, this.zzj));
    }
}

