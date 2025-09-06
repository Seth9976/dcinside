package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

public final class zzg extends zza {
    final BaseGmsClient zze;

    @BinderThread
    public zzg(BaseGmsClient baseGmsClient0, @Nullable int v, Bundle bundle0) {
        this.zze = baseGmsClient0;
        super(baseGmsClient0, v, bundle0);
    }

    @Override  // com.google.android.gms.common.internal.zza
    protected final void zzb(ConnectionResult connectionResult0) {
        this.zze.zzc.onReportServiceBinding(connectionResult0);
        this.zze.onConnectionFailed(connectionResult0);
    }

    @Override  // com.google.android.gms.common.internal.zza
    protected final boolean zzd() {
        this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}

