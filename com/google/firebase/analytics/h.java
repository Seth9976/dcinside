package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.android.gms.measurement.internal.zzlb;
import java.util.List;
import java.util.Map;

final class h implements zzlb {
    private final zzdy a;

    h(zzdy zzdy0) {
        this.a = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final int zza(String s) {
        return this.a.zza(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    @Nullable
    public final Object zza(int v) {
        return this.a.zza(v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final List zza(@Nullable String s, @Nullable String s1) {
        return this.a.zza(s, s1);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final Map zza(@Nullable String s, @Nullable String s1, boolean z) {
        return this.a.zza(s, s1, z);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(Bundle bundle0) {
        this.a.zza(bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(zzjl zzjl0) {
        this.a.zza(zzjl0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(zzjm zzjm0) {
        this.a.zza(zzjm0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(String s, @Nullable String s1, @Nullable Bundle bundle0) {
        this.a.zza(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zza(String s, String s1, Bundle bundle0, long v) {
        this.a.zza(s, s1, bundle0, v);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzb(zzjl zzjl0) {
        this.a.zzb(zzjl0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzb(String s) {
        this.a.zzb(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzb(String s, String s1, Bundle bundle0) {
        this.a.zzb(s, s1, bundle0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final void zzc(String s) {
        this.a.zzc(s);
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    public final long zzf() {
        return this.a.zza();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    @Nullable
    public final String zzg() {
        return this.a.zzf();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    @Nullable
    public final String zzh() {
        return this.a.zzg();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    @Nullable
    public final String zzi() {
        return this.a.zzh();
    }

    @Override  // com.google.android.gms.measurement.internal.zzlb
    @Nullable
    public final String zzj() {
        return this.a.zzi();
    }
}

