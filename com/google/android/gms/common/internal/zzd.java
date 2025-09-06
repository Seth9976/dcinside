package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
public final class zzd extends zzac {
    @Nullable
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@NonNull BaseGmsClient baseGmsClient0, int v) {
        this.zza = baseGmsClient0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void onPostInitComplete(int v, @NonNull IBinder iBinder0, @Nullable Bundle bundle0) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(v, iBinder0, bundle0, this.zzb);
        this.zza = null;
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzb(int v, @Nullable Bundle bundle0) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override  // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzc(int v, @NonNull IBinder iBinder0, @NonNull zzk zzk0) {
        BaseGmsClient baseGmsClient0 = this.zza;
        Preconditions.checkNotNull(baseGmsClient0, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzk0);
        BaseGmsClient.zzj(baseGmsClient0, zzk0);
        this.onPostInitComplete(v, iBinder0, zzk0.zza);
    }
}

