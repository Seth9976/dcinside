package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

public final class zzzw {
    private final Context zza;
    private final zzaal zzb;
    private zzca zzc;
    private zzbl zzd;
    private final List zze;
    private zzcx zzf;
    private boolean zzg;

    public zzzw(Context context0, zzaal zzaal0) {
        this.zza = context0.getApplicationContext();
        this.zzb = zzaal0;
        this.zze = zzfxn.zzn();
        this.zzf = zzcx.zza;
    }

    public final zzzw zzd(zzcx zzcx0) {
        this.zzf = zzcx0;
        return this;
    }

    public final zzaah zze() {
        zzcw.zzf(!this.zzg);
        if(this.zzd == null) {
            if(this.zzc == null) {
                this.zzc = new zzaae(null);
            }
            this.zzd = new zzaaf(this.zzc);
        }
        zzaah zzaah0 = new zzaah(this, null);
        this.zzg = true;
        return zzaah0;
    }
}

