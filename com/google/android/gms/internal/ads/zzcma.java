package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzcma implements zzcwo {
    private final zzfdh zza;

    public zzcma(zzfdh zzfdh0) {
        this.zza = zzfdh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context0) {
        try {
            this.zza.zzg();
        }
        catch(zzfcq zzfcq0) {
            zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", zzfcq0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context0) {
        try {
            this.zza.zzt();
        }
        catch(zzfcq zzfcq0) {
            zzo.zzk("Cannot invoke onPause for the mediation adapter.", zzfcq0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context0) {
        try {
            this.zza.zzu();
            if(context0 != null) {
                this.zza.zzs(context0);
            }
        }
        catch(zzfcq zzfcq0) {
            zzo.zzk("Cannot invoke onResume for the mediation adapter.", zzfcq0);
        }
    }
}

