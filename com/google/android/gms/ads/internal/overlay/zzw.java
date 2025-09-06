package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zze;

public final class zzw extends zzm {
    public zzw(Activity activity0) {
        super(activity0);
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzm
    public final void zzl(@Nullable Bundle bundle0) {
        zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzn = 4;
        this.zzb.finish();
    }
}

