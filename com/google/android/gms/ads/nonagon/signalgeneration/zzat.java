package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzgcd;

final class zzat implements zzgcd {
    final zzau zza;

    zzat(zzau zzau0) {
        this.zza = zzau0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzv.zzp().zzw(throwable0, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa.zzd(this.zza.zzp, null, "sgf", new Pair[]{new Pair("sgf_reason", throwable0.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", "6"), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.zza.zzH.get()))});
        zzo.zzh("Failed to initialize webview for loading SDKCore. ", throwable0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjB)).booleanValue() && !this.zza.zzG.get() && this.zza.zzH.getAndIncrement() < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzjC))))) {
            this.zza.zzT();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@Nullable Object object0) {
        zzbk zzbk0 = (zzbk)object0;
        zzo.zze("Initialized webview successfully for SDKCore.");
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjB)).booleanValue()) {
            Pair[] arr_pair = {new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", "6"), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.zza.zzH.get()))};
            zzaa.zzd(this.zza.zzp, null, "sgs", arr_pair);
            this.zza.zzG.set(true);
        }
    }
}

