package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

@KeepForSdk
public class p implements StatusExceptionMapper {
    @Override  // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @NonNull
    public final Exception getException(@NonNull Status status0) {
        return status0.getStatusCode() == 8 ? new o(status0.zza()) : new e(status0.zza());
    }
}

