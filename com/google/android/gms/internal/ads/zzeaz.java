package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.zzm;

final class zzeaz extends zzebw {
    private Activity zza;
    private zzm zzb;
    private String zzc;
    private String zzd;

    @Override  // com.google.android.gms.internal.ads.zzebw
    public final zzebw zza(Activity activity0) {
        if(activity0 == null) {
            throw new NullPointerException("Null activity");
        }
        this.zza = activity0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzebw
    public final zzebw zzb(@Nullable zzm zzm0) {
        this.zzb = zzm0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzebw
    public final zzebw zzc(@Nullable String s) {
        this.zzc = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzebw
    public final zzebw zzd(@Nullable String s) {
        this.zzd = s;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzebw
    public final zzebx zze() {
        Activity activity0 = this.zza;
        if(activity0 == null) {
            throw new IllegalStateException("Missing required properties: activity");
        }
        return new zzebb(activity0, this.zzb, this.zzc, this.zzd, null);
    }
}

