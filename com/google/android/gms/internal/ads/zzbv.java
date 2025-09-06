package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class zzbv {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzfxn zzh;
    private final zzfxn zzi;
    private final zzfxn zzj;
    private final int zzk;
    private final int zzl;
    private final zzfxn zzm;
    private final zzbu zzn;
    private zzfxn zzo;
    private int zzp;
    private final HashMap zzq;
    private final HashSet zzr;

    @Deprecated
    public zzbv() {
        this.zza = 0x7FFFFFFF;
        this.zzb = 0x7FFFFFFF;
        this.zzc = 0x7FFFFFFF;
        this.zzd = 0x7FFFFFFF;
        this.zze = 0x7FFFFFFF;
        this.zzf = 0x7FFFFFFF;
        this.zzg = true;
        this.zzh = zzfxn.zzn();
        this.zzi = zzfxn.zzn();
        this.zzj = zzfxn.zzn();
        this.zzk = 0x7FFFFFFF;
        this.zzl = 0x7FFFFFFF;
        this.zzm = zzfxn.zzn();
        this.zzn = zzbu.zza;
        this.zzo = zzfxn.zzn();
        this.zzp = 0;
        this.zzq = new HashMap();
        this.zzr = new HashSet();
    }

    protected zzbv(zzbw zzbw0) {
        this.zza = 0x7FFFFFFF;
        this.zzb = 0x7FFFFFFF;
        this.zzc = 0x7FFFFFFF;
        this.zzd = 0x7FFFFFFF;
        this.zze = zzbw0.zzi;
        this.zzf = zzbw0.zzj;
        this.zzg = zzbw0.zzk;
        this.zzh = zzbw0.zzl;
        this.zzi = zzbw0.zzm;
        this.zzj = zzbw0.zzo;
        this.zzk = 0x7FFFFFFF;
        this.zzl = 0x7FFFFFFF;
        this.zzm = zzbw0.zzs;
        this.zzn = zzbw0.zzt;
        this.zzo = zzbw0.zzu;
        this.zzp = zzbw0.zzv;
        this.zzr = new HashSet(zzbw0.zzC);
        this.zzq = new HashMap(zzbw0.zzB);
    }

    public final zzbv zze(Context context0) {
        if(zzei.zza >= 23 || Looper.myLooper() != null) {
            CaptioningManager captioningManager0 = (CaptioningManager)context0.getSystemService("captioning");
            if(captioningManager0 != null && captioningManager0.isEnabled()) {
                this.zzp = 0x440;
                Locale locale0 = captioningManager0.getLocale();
                if(locale0 != null) {
                    this.zzo = zzfxn.zzo(locale0.toLanguageTag());
                }
            }
        }
        return this;
    }

    public final zzbv zzf(int v, int v1, boolean z) {
        this.zze = v;
        this.zzf = v1;
        this.zzg = true;
        return this;
    }
}

