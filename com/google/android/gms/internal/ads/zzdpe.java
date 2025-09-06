package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

public final class zzdpe implements zzcwo {
    @Nullable
    private final zzcex zza;

    zzdpe(@Nullable zzcex zzcex0) {
        this.zza = zzcex0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(@Nullable Context context0) {
        zzcex zzcex0 = this.zza;
        if(zzcex0 != null) {
            zzcex0.destroy();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(@Nullable Context context0) {
        zzcex zzcex0 = this.zza;
        if(zzcex0 != null) {
            zzcex0.onPause();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(@Nullable Context context0) {
        zzcex zzcex0 = this.zza;
        if(zzcex0 != null) {
            zzcex0.onResume();
        }
    }
}

