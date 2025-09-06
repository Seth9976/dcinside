package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

public final class zzfdn {
    @Nullable
    @VisibleForTesting
    static Task zza;
    @Nullable
    @VisibleForTesting
    public static AppSetIdClient zzb;
    private static final Object zzc;

    static {
        zzfdn.zzc = new Object();
    }

    @Nullable
    public static Task zza(Context context0) {
        zzfdn.zzb(context0, false);
        synchronized(zzfdn.zzc) {
        }
        return zzfdn.zza;
    }

    public static void zzb(Context context0, boolean z) {
        synchronized(zzfdn.zzc) {
            if(zzfdn.zzb == null) {
                zzfdn.zzb = AppSet.getClient(context0);
            }
            if(zzfdn.zza == null || zzfdn.zza.isComplete() && !zzfdn.zza.isSuccessful() || z && zzfdn.zza.isComplete()) {
                zzfdn.zza = ((AppSetIdClient)Preconditions.checkNotNull(zzfdn.zzb, "the appSetIdClient shouldn\'t be null")).getAppSetIdInfo();
            }
        }
    }
}

