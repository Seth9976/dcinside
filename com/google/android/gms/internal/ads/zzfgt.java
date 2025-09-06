package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;

public final class zzfgt implements zzcwj, zzdcx, zzddb {
    private final zzfhh zza;
    private final zzfgw zzb;

    zzfgt(Context context0, zzfhh zzfhh0) {
        this.zza = zzfhh0;
        this.zzb = zzfgv.zza(context0, 13);
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzddb
    public final void zzb() {
        if(((Boolean)zzbee.zzd.zze()).booleanValue()) {
            this.zzb.zzg(true);
            this.zza.zza(this.zzb);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
        if(((Boolean)zzbee.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(zze zze0) {
        if(((Boolean)zzbee.zzd.zze()).booleanValue()) {
            String s = zze0.zza().toString();
            this.zzb.zzc(s);
            this.zzb.zzg(false);
            this.zza.zza(this.zzb);
        }
    }
}

