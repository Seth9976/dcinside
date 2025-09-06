package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza;
    private boolean zzb;

    static {
        DowngradeableSafeParcel.zza = new Object();
    }

    public DowngradeableSafeParcel() {
        this.zzb = false;
    }

    @KeepForSdk
    protected static boolean canUnparcelSafely(@NonNull String s) {
        synchronized(DowngradeableSafeParcel.zza) {
        }
        return true;
    }

    @Nullable
    @KeepForSdk
    protected static Integer getUnparcelClientVersion() {
        synchronized(DowngradeableSafeParcel.zza) {
        }
        return null;
    }

    @KeepForSdk
    protected abstract boolean prepareForClientVersion(int arg1);

    @KeepForSdk
    public void setShouldDowngrade(boolean z) {
        this.zzb = z;
    }

    @KeepForSdk
    protected boolean shouldDowngrade() {
        return this.zzb;
    }
}

