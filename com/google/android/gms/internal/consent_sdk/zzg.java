package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.e;

public final class zzg extends Exception {
    private final int zza;

    public zzg(int v, String s) {
        super(s);
        this.zza = v;
    }

    public zzg(int v, String s, Throwable throwable0) {
        super(s, throwable0);
        this.zza = v;
    }

    @Override
    public final String getMessage() {
        return super.getMessage();
    }

    public final e zza() {
        if(this.getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
            return new e(this.zza, super.getMessage());
        }
        Log.w("UserMessagingPlatform", super.getMessage(), this.getCause());
        return new e(this.zza, super.getMessage());
    }
}

