package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int v, @NonNull String s, @NonNull Intent intent0) {
        super(s, intent0);
        this.zza = v;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}

