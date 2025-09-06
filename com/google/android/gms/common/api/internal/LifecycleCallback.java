package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk
public class LifecycleCallback {
    @NonNull
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    protected LifecycleCallback(@NonNull LifecycleFragment lifecycleFragment0) {
        this.mLifecycleFragment = lifecycleFragment0;
    }

    @MainThread
    @KeepForSdk
    public void dump(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
    }

    @NonNull
    @KeepForSdk
    public Activity getActivity() {
        Activity activity0 = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(activity0);
        return activity0;
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull Activity activity0) {
        return LifecycleCallback.getFragment(new LifecycleActivity(activity0));
    }

    @NonNull
    @KeepForSdk
    public static LifecycleFragment getFragment(@NonNull ContextWrapper contextWrapper0) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    protected static LifecycleFragment getFragment(@NonNull LifecycleActivity lifecycleActivity0) {
        if(lifecycleActivity0.zzd()) {
            return zzd.zza(lifecycleActivity0.zzb());
        }
        if(!lifecycleActivity0.zzc()) {
            throw new IllegalArgumentException("Can\'t get fragment for unexpected activity.");
        }
        return zza.zza(lifecycleActivity0.zza());
    }

    @MainThread
    @KeepForSdk
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
    }

    @MainThread
    @KeepForSdk
    public void onCreate(@Nullable Bundle bundle0) {
    }

    @MainThread
    @KeepForSdk
    public void onDestroy() {
    }

    @MainThread
    @KeepForSdk
    public void onResume() {
    }

    @MainThread
    @KeepForSdk
    public void onSaveInstanceState(@NonNull Bundle bundle0) {
    }

    @MainThread
    @KeepForSdk
    public void onStart() {
    }

    @MainThread
    @KeepForSdk
    public void onStop() {
    }
}

