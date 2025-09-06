package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfki {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd;
    private zzbpe zze;
    private final Clock zzf;

    zzfki(Context context0, VersionInfoParcel versionInfoParcel0, ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        this.zza = context0;
        this.zzb = versionInfoParcel0;
        this.zzc = scheduledExecutorService0;
        this.zzd = new ClientApi();
        this.zzf = clock0;
    }

    @Nullable
    public final zzfkh zza(zzft zzft0, zzcf zzcf0) {
        AdFormat adFormat0 = AdFormat.getAdFormat(zzft0.zzb);
        if(adFormat0 != null) {
            switch(adFormat0.ordinal()) {
                case 1: {
                    int v = this.zzb.clientJarVersion;
                    zzbpe zzbpe0 = this.zze;
                    zzfjg zzfjg0 = zzfki.zzc();
                    return new zzfji(this.zzd, this.zza, v, zzbpe0, zzft0, zzcf0, this.zzc, zzfjg0, this.zzf);
                }
                case 2: {
                    int v1 = this.zzb.clientJarVersion;
                    zzbpe zzbpe1 = this.zze;
                    zzfjg zzfjg1 = zzfki.zzc();
                    return new zzfkl(this.zzd, this.zza, v1, zzbpe1, zzft0, zzcf0, this.zzc, zzfjg1, this.zzf);
                }
                case 5: {
                    int v2 = this.zzb.clientJarVersion;
                    zzbpe zzbpe2 = this.zze;
                    zzfjg zzfjg2 = zzfki.zzc();
                    return new zzfjf(this.zzd, this.zza, v2, zzbpe2, zzft0, zzcf0, this.zzc, zzfjg2, this.zzf);
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    public final void zzb(zzbpe zzbpe0) {
        this.zze = zzbpe0;
    }

    private static zzfjg zzc() {
        return new zzfjg(((long)(((Long)zzbe.zzc().zza(zzbcl.zzw)))), 2.0, ((long)(((Long)zzbe.zzc().zza(zzbcl.zzx)))), 0.2);
    }
}

