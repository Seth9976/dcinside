package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.List;
import java.util.Map;

final class zzcfd implements zzgcd {
    final List zza;
    final String zzb;
    final Uri zzc;
    final zzcff zzd;

    zzcfd(zzcff zzcff0, List list0, String s, Uri uri0) {
        this.zza = list0;
        this.zzb = s;
        this.zzc = uri0;
        this.zzd = zzcff0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzo.zzj(("Failed to parse gmsg params for: " + this.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zzd.zzY(((Map)object0), this.zza, this.zzb);
    }
}

