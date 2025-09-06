package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(@NonNull Activity activity0) {
        Preconditions.checkNotNull(activity0, "Activity must not be null");
        this.zza = activity0;
    }

    @KeepForSdk
    @Deprecated
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Activity zza() {
        return (Activity)this.zza;
    }

    @NonNull
    public final FragmentActivity zzb() {
        return (FragmentActivity)this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof FragmentActivity;
    }
}

