package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class zzeh {
    private final HashSet zza;
    private final Bundle zzb;
    private final HashMap zzc;
    private final HashSet zzd;
    private final Bundle zze;
    private final HashSet zzf;
    private String zzg;
    private final List zzh;
    private String zzi;
    private String zzj;
    private int zzk;
    private boolean zzl;
    private String zzm;
    private int zzn;

    public zzeh() {
        this.zza = new HashSet();
        this.zzb = new Bundle();
        this.zzc = new HashMap();
        this.zzd = new HashSet();
        this.zze = new Bundle();
        this.zzf = new HashSet();
        this.zzh = new ArrayList();
        this.zzk = -1;
        this.zzn = 60000;
    }

    public final void zzA(Bundle bundle0) {
        this.zzb.putAll(bundle0);
    }

    public final void zzB(String s) {
        this.zzi = s;
    }

    public final void zzC(String s) {
        this.zzj = s;
    }

    @Deprecated
    public final void zzD(boolean z) {
        this.zzk = z;
    }

    public final void zzn(String s) {
        this.zzf.add(s);
    }

    public final void zzo(Class class0, Bundle bundle0) {
        if(this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            Bundle bundle1 = new Bundle();
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", bundle1);
        }
        Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(class0.getName(), bundle0);
    }

    public final void zzp(String s, String s1) {
        this.zze.putString(s, s1);
    }

    public final void zzq(String s) {
        this.zza.add(s);
    }

    public final void zzr(Class class0, @Nullable Bundle bundle0) {
        this.zzb.putBundle(class0.getName(), bundle0);
    }

    @Deprecated
    public final void zzs(NetworkExtras networkExtras0) {
        Class class0 = networkExtras0.getClass();
        this.zzc.put(class0, networkExtras0);
    }

    public final void zzt(String s) {
        this.zzd.add(s);
    }

    public final void zzu(String s) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzv(String s) {
        this.zzm = s;
    }

    public final void zzw(String s) {
        this.zzg = s;
    }

    public final void zzx(int v) {
        this.zzn = v;
    }

    @Deprecated
    public final void zzy(boolean z) {
        this.zzl = z;
    }

    public final void zzz(List list0) {
        this.zzh.clear();
        for(Object object0: list0) {
            String s = (String)object0;
            if(TextUtils.isEmpty(s)) {
                zzo.zzj("neighboring content URL should not be null or empty");
            }
            else {
                this.zzh.add(s);
            }
        }
    }
}

