package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;

@VisibleForTesting
public final class zzcwf extends zzdbj implements zzcvx {
    @VisibleForTesting
    public zzcwf(Set set0) {
        super(set0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zza(zze zze0) {
        this.zzq(new zzcwe(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        this.zzq(new zzcwd());
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(zzdgb zzdgb0) {
        this.zzq(new zzcwc(zzdgb0));
    }
}

