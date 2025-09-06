package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

final class zzbll implements BaseOnConnectionFailedListener {
    final zzcab zza;

    zzbll(zzblm zzblm0, zzcab zzcab0) {
        this.zza = zzcab0;
        super();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult0) {
        RuntimeException runtimeException0 = new RuntimeException("Connection failed.");
        this.zza.zzd(runtimeException0);
    }
}

