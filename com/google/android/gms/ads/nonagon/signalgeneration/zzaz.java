package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbq.zza.zza;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class zzaz {
    private final String zza;
    @Nullable
    private final String zzb;
    @Nullable
    private final zzbyy zzc;

    zzaz(zzax zzax0, zzay zzay0) {
        this.zza = zzax0.zza;
        this.zzb = zzax0.zzb;
        this.zzc = zzax0.zzc;
    }

    public final zzbbq.zza.zza zza() {
        switch(this.zza) {
            case "BANNER": {
                return zzbbq.zza.zza.zzb;
            }
            case "INTERSTITIAL": {
                return zzbbq.zza.zza.zzd;
            }
            case "NATIVE": {
                return zzbbq.zza.zza.zzg;
            }
            case "REWARDED": {
                return zzbbq.zza.zza.zzh;
            }
            default: {
                return zzbbq.zza.zza.zza;
            }
        }
    }

    @Nullable
    final zzbyy zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    @Nullable
    final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        Set set0 = new HashSet();
        set0.add(this.zza.toLowerCase(Locale.ROOT));
        return set0;
    }
}

