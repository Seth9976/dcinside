package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.common.util.concurrent.t0;
import org.json.JSONObject;

public final class zzdze implements zzgbo {
    public final zzetu zza;
    public final zzbvk zzb;

    public zzdze(zzetu zzetu0, zzbvk zzbvk0) {
        this.zza = zzetu0;
        this.zzb = zzbvk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        JSONObject jSONObject0 = zzbc.zzb().zzi(((Bundle)object0));
        return this.zza.zza(jSONObject0, this.zzb.zzm, false);
    }
}

