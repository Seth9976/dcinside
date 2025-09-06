package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.t0;

public final class zzdwo implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzdwo(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzava zzava0 = (zzava)this.zza.zzb();
        Context context0 = ((zzche)this.zzb).zza();
        zzfcj zzfcj0 = ((zzcvk)this.zzc).zza();
        long v = (long)(((Long)this.zzd.zzb()));
        zzgcs zzgcs0 = zzffh.zzc();
        int v1 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzcO)));
        t0 t00 = v1 != -1 && !Integer.toString(v1).equals(zzaa.zzb(zzaa.zzc(zzfcj0.zzd))) || zzv.zzC().currentTimeMillis() - v >= ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzcQ)))))) ? zzgcs0.zzb(new zzdwj(zzava0, context0)) : zzgcs0.zzb(new zzdwi(zzava0, context0));
        zzhez.zzb(t00);
        return t00;
    }
}

