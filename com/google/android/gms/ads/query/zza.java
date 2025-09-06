package com.google.android.gms.ads.query;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbtv;

public final class zza implements Runnable {
    public final Context zza;
    public final AdFormat zzb;
    public final AdRequest zzc;
    public final String zzd;
    public final QueryInfoGenerationCallback zze;

    public zza(Context context0, AdFormat adFormat0, AdRequest adRequest0, String s, QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        this.zza = context0;
        this.zzb = adFormat0;
        this.zzc = adRequest0;
        this.zzd = s;
        this.zze = queryInfoGenerationCallback0;
    }

    @Override
    public final void run() {
        new zzbtv(this.zza, this.zzb, (this.zzc == null ? null : this.zzc.zza()), this.zzd).zzb(this.zze);
    }
}

