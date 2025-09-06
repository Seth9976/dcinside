package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzh;
import j..util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Map;

final class zzc {
    private final Map zza;
    private int zzb;
    @Nullable
    private Bundle zzc;

    zzc() {
        this.zza = DesugarCollections.synchronizedMap(new ArrayMap());
        this.zzb = 0;
    }

    @Nullable
    final LifecycleCallback zzc(String s, Class class0) {
        return (LifecycleCallback)class0.cast(this.zza.get(s));
    }

    final void zzd(String s, LifecycleCallback lifecycleCallback0) {
        if(this.zza.containsKey(s)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + s + " already added to this fragment.");
        }
        this.zza.put(s, lifecycleCallback0);
        if(this.zzb > 0) {
            new zzh(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback0, s));
        }
    }

    final void zze(String s, @Nullable FileDescriptor fileDescriptor0, PrintWriter printWriter0, @Nullable String[] arr_s) {
        for(Object object0: this.zza.values()) {
            ((LifecycleCallback)object0).dump(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    final void zzf(int v, int v1, @Nullable Intent intent0) {
        for(Object object0: this.zza.values()) {
            ((LifecycleCallback)object0).onActivityResult(v, v1, intent0);
        }
    }

    final void zzg(@Nullable Bundle bundle0) {
        this.zzb = 1;
        this.zzc = bundle0;
        for(Object object0: this.zza.entrySet()) {
            ((LifecycleCallback)((Map.Entry)object0).getValue()).onCreate((bundle0 == null ? null : bundle0.getBundle(((String)((Map.Entry)object0).getKey()))));
        }
    }

    final void zzh() {
        this.zzb = 5;
        for(Object object0: this.zza.values()) {
            ((LifecycleCallback)object0).onDestroy();
        }
    }

    final void zzi() {
        this.zzb = 3;
        for(Object object0: this.zza.values()) {
            ((LifecycleCallback)object0).onResume();
        }
    }

    final void zzj(Bundle bundle0) {
        if(bundle0 != null) {
            for(Object object0: this.zza.entrySet()) {
                Bundle bundle1 = new Bundle();
                ((LifecycleCallback)((Map.Entry)object0).getValue()).onSaveInstanceState(bundle1);
                bundle0.putBundle(((String)((Map.Entry)object0).getKey()), bundle1);
            }
        }
    }

    final void zzk() {
        this.zzb = 2;
        for(Object object0: this.zza.values()) {
            ((LifecycleCallback)object0).onStart();
        }
    }

    final void zzl() {
        this.zzb = 4;
        for(Object object0: this.zza.values()) {
            ((LifecycleCallback)object0).onStop();
        }
    }

    final boolean zzm() {
        return this.zzb > 0;
    }

    final boolean zzn() {
        return this.zzb >= 2;
    }
}

