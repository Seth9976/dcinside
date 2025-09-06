package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @KeepForSdk
    public UnsupportedApiCallException(@NonNull Feature feature0) {
        this.zza = feature0;
    }

    @Override
    @NonNull
    public String getMessage() {
        return "Missing " + this.zza;
    }
}

