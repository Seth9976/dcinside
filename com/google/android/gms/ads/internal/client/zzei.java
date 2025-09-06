package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import d4.c;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzei {
    private final String zza;
    private final List zzb;
    private final Set zzc;
    private final Bundle zzd;
    private final Map zze;
    private final String zzf;
    private final String zzg;
    @Nullable
    @c
    private final SearchAdRequest zzh;
    private final int zzi;
    private final Set zzj;
    private final Bundle zzk;
    private final Set zzl;
    private final boolean zzm;
    private final String zzn;
    private final int zzo;
    private long zzp;

    public zzei(zzeh zzeh0, @Nullable SearchAdRequest searchAdRequest0) {
        this.zzp = 0L;
        this.zza = zzeh0.zzg;
        this.zzb = zzeh0.zzh;
        this.zzc = DesugarCollections.unmodifiableSet(zzeh0.zza);
        this.zzd = zzeh0.zzb;
        this.zze = DesugarCollections.unmodifiableMap(zzeh0.zzc);
        this.zzf = zzeh0.zzi;
        this.zzg = zzeh0.zzj;
        this.zzh = searchAdRequest0;
        this.zzi = zzeh0.zzk;
        this.zzj = DesugarCollections.unmodifiableSet(zzeh0.zzd);
        this.zzk = zzeh0.zze;
        this.zzl = DesugarCollections.unmodifiableSet(zzeh0.zzf);
        this.zzm = zzeh0.zzl;
        this.zzn = zzeh0.zzm;
        this.zzo = zzeh0.zzn;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzp;
    }

    @Nullable
    public final Bundle zzd(Class class0) {
        Bundle bundle0 = this.zzd.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        return bundle0 == null ? null : bundle0.getBundle(class0.getName());
    }

    public final Bundle zze() {
        return this.zzk;
    }

    @Nullable
    public final Bundle zzf(Class class0) {
        return this.zzd.getBundle(class0.getName());
    }

    public final Bundle zzg() {
        return this.zzd;
    }

    @Nullable
    @Deprecated
    public final NetworkExtras zzh(Class class0) {
        return (NetworkExtras)this.zze.get(class0);
    }

    @Nullable
    public final SearchAdRequest zzi() {
        return this.zzh;
    }

    @Nullable
    public final String zzj() {
        return this.zzn;
    }

    public final String zzk() {
        return this.zza;
    }

    public final String zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final List zzn() {
        return new ArrayList(this.zzb);
    }

    public final Set zzo() {
        return this.zzl;
    }

    public final Set zzp() {
        return this.zzc;
    }

    public final void zzq(long v) {
        this.zzp = v;
    }

    @Deprecated
    public final boolean zzr() {
        return this.zzm;
    }

    public final boolean zzs(Context context0) {
        RequestConfiguration requestConfiguration0 = zzex.zzf().zzc();
        String s = zzf.zzy(context0);
        return this.zzj.contains(s) || requestConfiguration0.getTestDeviceIds().contains(s);
    }
}

