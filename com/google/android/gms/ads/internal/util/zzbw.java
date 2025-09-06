package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfir;

public final class zzbw extends zzb {
    private final zzu zza;
    private final String zzb;
    @Nullable
    private final zzv zzc;

    public zzbw(Context context0, String s, String s1, @Nullable zzfir zzfir0, @Nullable zzv zzv0) {
        String s2 = com.google.android.gms.ads.internal.zzv.zzq().zzc(context0, s);
        super();
        this.zza = new zzu(s2);
        this.zzb = s1;
        this.zzc = zzv0;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzv zzv0 = this.zzc;
        if(zzv0 != null) {
            new zzfiq(zzv0.zzb(), this.zza, zzbzw.zze, null).zzd(this.zzb);
            return;
        }
        this.zza.zza(this.zzb);
    }
}

