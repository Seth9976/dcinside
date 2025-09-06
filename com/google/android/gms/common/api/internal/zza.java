package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class zza extends Fragment implements LifecycleFragment {
    private static final WeakHashMap zza;
    private final zzc zzb;

    static {
        zza.zza = new WeakHashMap();
    }

    public zza() {
        this.zzb = new zzc();
    }

    @Override  // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String s, @NonNull LifecycleCallback lifecycleCallback0) {
        this.zzb.zzd(s, lifecycleCallback0);
    }

    @Override  // android.app.Fragment
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

    @Override  // android.app.Fragment
    public final void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.zzb.zzf(v, v1, intent0);
    }

    @Override  // android.app.Fragment
    public final void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.zzb.zzg(bundle0);
    }

    @Override  // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.zzb.zzh();
    }

    @Override  // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.zzb.zzi();
    }

    @Override  // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.zzb.zzj(bundle0);
    }

    @Override  // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.zzb.zzk();
    }

    @Override  // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.zzb.zzl();
    }

    public static zza zza(Activity activity0) {
        zza zza1;
        WeakHashMap weakHashMap0 = zza.zza;
        WeakReference weakReference0 = (WeakReference)weakHashMap0.get(activity0);
        if(weakReference0 != null) {
            zza zza0 = (zza)weakReference0.get();
            if(zza0 != null) {
                return zza0;
            }
        }
        try {
            zza1 = (zza)activity0.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
        }
        catch(ClassCastException classCastException0) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", classCastException0);
        }
        if(zza1 == null || zza1.isRemoving()) {
            zza1 = new zza();
            activity0.getFragmentManager().beginTransaction().add(zza1, "LifecycleFragmentImpl").commitAllowingStateLoss();
        }
        weakHashMap0.put(activity0, new WeakReference(zza1));
        return zza1;
    }
}

