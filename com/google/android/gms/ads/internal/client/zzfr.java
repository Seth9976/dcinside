package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

public final class zzfr extends zzdn {
    @Nullable
    private final OnAdMetadataChangedListener zza;

    public zzfr(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        this.zza = onAdMetadataChangedListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdo
    public final void zze() throws RemoteException {
        OnAdMetadataChangedListener onAdMetadataChangedListener0 = this.zza;
        if(onAdMetadataChangedListener0 != null) {
            onAdMetadataChangedListener0.onAdMetadataChanged();
        }
    }
}

