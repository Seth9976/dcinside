package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.Set;

public final class zzerz implements zzetr {
    @Nullable
    private static String zza;
    private final zzgcs zzb;
    private final Context zzc;
    private final Set zzd;

    static {
    }

    public zzerz(zzgcs zzgcs0, Context context0, Set set0) {
        this.zzb = zzgcs0;
        this.zzc = context0;
        this.zzd = set0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 27;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzery zzery0 = () -> {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && (((Boolean)zzbe.zzc().zza(zzbcl.zzfn)).booleanValue() || (this.zzd.contains("rewarded") || this.zzd.contains("interstitial") || this.zzd.contains("native") || this.zzd.contains("banner")))) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzfo)).booleanValue()) {
                    if(zzerz.zza == null) {
                        zzerz.zza = zzv.zzB().zzf(this.zzc);
                    }
                    return new zzesa(zzerz.zza);
                }
                return new zzesa(zzv.zzB().zzf(this.zzc));
            }
            return new zzesa(null);
        };
        return this.zzb.zzb(zzery0);
    }

    // 检测为 Lambda 实现
    final zzesa zzc() throws Exception [...]
}

