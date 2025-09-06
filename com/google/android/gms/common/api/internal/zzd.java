package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zzd extends Fragment implements LifecycleFragment {
    private static final WeakHashMap zza;
    private final zzc zzb;

    static {
        zzd.zza = new WeakHashMap();
    }

    public zzd() {
        this.zzb = new zzc();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String s, @NonNull LifecycleCallback lifecycleCallback0) {
        this.zzb.zzd(s, lifecycleCallback0);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void dump(String s, @Nullable FileDescriptor fileDescriptor0, PrintWriter printWriter0, @Nullable String[] arr_s) {
        super.dump(s, fileDescriptor0, printWriter0, arr_s);
        this.zzb.zze(s, fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    @Nullable
    public final LifecycleCallback getCallbackOrNull(String s, Class class0) {
        return this.zzb.zzc(s, class0);
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    @Nullable
    public final Activity getLifecycleActivity() {
        return this.getActivity();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        return this.zzb.zzm();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        return this.zzb.zzn();
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.zzb.zzf(v, v1, intent0);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.zzb.zzg(bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzb.zzh();
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzb.zzi();
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.zzb.zzj(bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzb.zzk();
    }

    @Override  // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzb.zzl();
    }

    public static zzd zza(FragmentActivity fragmentActivity0) {
        zzd zzd1;
        WeakHashMap weakHashMap0 = zzd.zza;
        WeakReference weakReference0 = (WeakReference)weakHashMap0.get(fragmentActivity0);
        if(weakReference0 != null) {
            zzd zzd0 = (zzd)weakReference0.get();
            if(zzd0 != null) {
                return zzd0;
            }
        }
        try {
            zzd1 = (zzd)fragmentActivity0.getSupportFragmentManager().s0("SLifecycleFragmentImpl");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", classCastException0);
        }
        if(zzd1 == null || zzd1.isRemoving()) {
            zzd1 = new zzd();
            fragmentActivity0.getSupportFragmentManager().u().k(zzd1, "SLifecycleFragmentImpl").r();
        }
        weakHashMap0.put(fragmentActivity0, new WeakReference(zzd1));
        return zzd1;
    }
}

