package com.google.android.gms.internal.ads;

import android.net.Uri.Builder;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzcmg implements zzgbo {
    public final Uri.Builder zza;

    public zzcmg(Uri.Builder uri$Builder0) {
        this.zza = uri$Builder0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        String s = (String)zzbe.zzc().zza(zzbcl.zzkc);
        this.zza.appendQueryParameter(s, "12");
        return zzgch.zzh(this.zza.toString());
    }
}

