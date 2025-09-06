package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzac;

public final class zzdjh {
    private final zzdrw zza;

    zzdjh(zzdrw zzdrw0) {
        this.zza = zzdrw0;
    }

    public final void zza(@Nullable View view0, zzfbo zzfbo0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() && view0 != null) {
            String s = zzac.zza(view0) ? "1" : "0";
            zzdrv zzdrv0 = this.zza.zza();
            zzdrv0.zzb("action", "hcp");
            zzdrv0.zzb("hcp", s);
            zzdrv0.zzc(zzfbo0);
            zzdrv0.zzg();
        }
    }
}

