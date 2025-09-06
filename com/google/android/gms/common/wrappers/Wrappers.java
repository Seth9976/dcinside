package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class Wrappers {
    private static final Wrappers zza;
    @Nullable
    private PackageManagerWrapper zzb;

    static {
        Wrappers.zza = new Wrappers();
    }

    public Wrappers() {
        this.zzb = null;
    }

    @NonNull
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@NonNull Context context0) {
        return Wrappers.zza.zza(context0);
    }

    @NonNull
    @VisibleForTesting
    public final PackageManagerWrapper zza(@NonNull Context context0) {
        synchronized(this) {
            if(this.zzb == null) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                this.zzb = new PackageManagerWrapper(context0);
            }
            return this.zzb;
        }
    }
}

