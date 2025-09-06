package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcuw;
import com.google.android.gms.internal.ads.zzcux;
import com.google.android.gms.internal.ads.zzcvk;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzfgh;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhez;
import com.google.android.gms.internal.ads.zzhfj;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.TimeUnit;

public final class zzbg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;

    public zzbg(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
        this.zzf = zzhfj5;
        this.zzg = zzhfj6;
        this.zzh = zzhfj7;
        this.zzi = zzhfj8;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        t0 t00;
        zzau zzau0 = (zzau)this.zza.zzb();
        zzfgn zzfgn0 = (zzfgn)this.zzb.zzb();
        zzbi zzbi0 = ((zzbj)this.zzc).zza();
        zzcuw zzcuw0 = ((zzcux)this.zzd).zza();
        zzdeh zzdeh0 = (zzdeh)this.zze.zzb();
        zzb zzb0 = (zzb)this.zzf.zzb();
        zzbyy zzbyy0 = (zzbyy)this.zzg.zzb();
        int v = (int)(((Integer)this.zzh.zzb()));
        Bundle bundle0 = ((zzcvk)this.zzi).zza().zzs;
        zzbk zzbk0 = null;
        if(v == 1 && zzbyy0 != null) {
            bundle0.putLong("read-from-disk-start", zzv.zzC().currentTimeMillis());
            zzbk0 = zzb0.zza(zzbyy0, zzau0, bundle0);
            bundle0.putLong("read-from-disk-end", zzv.zzC().currentTimeMillis());
        }
        if(zzbk0 == null) {
            t0 t01 = zzcuw0.zzc();
            t00 = zzfgn0.zzb(zzfgh.zzw, t01).zzf(zzbi0).zzi(((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfy)))))), TimeUnit.SECONDS).zza();
            zzgch.zzr(t00, new zzaw(zzdeh0), zzbzw.zza);
        }
        else {
            zzdeh0.zza(zzbk0);
            t00 = zzgch.zzh(zzbk0);
        }
        zzhez.zzb(t00);
        return t00;
    }
}

