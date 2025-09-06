package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzcnl implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcnl(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        VersionInfoParcel versionInfoParcel0 = ((zzchs)this.zza).zza();
        Object object0 = this.zzb.zzb();
        Object object1 = this.zzc.zzb();
        return new zzayg("3e3a7c22-f76e-4ff6-8d3c-6397e3ebbe40", versionInfoParcel0, ((String)object1), ((JSONObject)object0), false, "native".equals(((String)object1)));
    }
}

