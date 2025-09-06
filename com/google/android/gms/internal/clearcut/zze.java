package com.google.android.gms.internal.clearcut;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zzb;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zze extends GoogleApi implements zzb {
    @VisibleForTesting
    private zze(@NonNull Context context0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(context0, ClearcutLogger.API, null, apiExceptionMapper0);
    }

    public static zzb zzb(@NonNull Context context0) {
        return new zze(context0);
    }

    @Override  // com.google.android.gms.clearcut.zzb
    public final PendingResult zzb(com.google.android.gms.clearcut.zze zze0) {
        return this.doBestEffortWrite(new zzh(zze0, this.asGoogleApiClient()));
    }
}

