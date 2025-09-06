package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzekv extends zzbx {
    private final zzs zza;
    private final Context zzb;
    private final zzezr zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzekn zzf;
    private final zzfar zzg;
    private final zzava zzh;
    private final zzdrw zzi;
    @Nullable
    private zzdeq zzj;
    private boolean zzk;

    public zzekv(Context context0, zzs zzs0, String s, zzezr zzezr0, zzekn zzekn0, zzfar zzfar0, VersionInfoParcel versionInfoParcel0, zzava zzava0, zzdrw zzdrw0) {
        this.zza = zzs0;
        this.zzd = s;
        this.zzb = context0;
        this.zzc = zzezr0;
        this.zzf = zzekn0;
        this.zzg = zzfar0;
        this.zze = versionInfoParcel0;
        this.zzk = ((Boolean)zzbe.zzc().zza(zzbcl.zzaO)).booleanValue();
        this.zzh = zzava0;
        this.zzi = zzdrw0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            zzdeq zzdeq0 = this.zzj;
            if(zzdeq0 != null) {
                zzdeq0.zzn().zzc(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbi0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzbl0) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzcc0) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzs0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcm0) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcm0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbag0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzy0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzct0) {
        this.zzf.zzn(zzct0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzef0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.zzk = z;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtn0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdg0) {
        synchronized(this) {
            Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
            this.zzc.zzi(zzbdg0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdr0) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if(!zzdr0.zzf()) {
                this.zzi.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzf.zzl(zzdr0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtq0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwc0) {
        this.zzg.zzm(zzbwc0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzga0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.zzj == null) {
                zzo.zzj("Interstitial can not be shown before loaded.");
                zze zze0 = zzfdk.zzd(9, null, null);
                this.zzf.zzq(zze0);
                return;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                this.zzh.zzc().zzn(arr_stackTraceElement);
            }
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zzj.zzc(this.zzk, activity0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
        synchronized(this) {
            Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
            if(this.zzj == null) {
                zzo.zzj("Interstitial can not be shown before loaded.");
                zze zze0 = zzfdk.zzd(9, null, null);
                this.zzf.zzq(zze0);
                return;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                this.zzh.zzc().zzn(arr_stackTraceElement);
            }
            this.zzj.zzc(this.zzk, null);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        synchronized(this) {
        }
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        synchronized(this) {
            return this.zzc.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        synchronized(this) {
            Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
            return this.zze();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzm0) {
        synchronized(this) {
            if(!zzm0.zzb()) {
                boolean z = ((Boolean)zzbej.zzi.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue();
                if(this.zze.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlb)))) || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            if(com.google.android.gms.ads.internal.util.zzs.zzI(this.zzb) && zzm0.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                zzekn zzekn0 = this.zzf;
                if(zzekn0 != null) {
                    zzekn0.zzdz(zzfdk.zzd(4, null, null));
                }
            }
            else if(!this.zze()) {
                zzfdg.zza(this.zzb, zzm0.zzf);
                this.zzj = null;
                zzezk zzezk0 = new zzezk(this.zza);
                zzeku zzeku0 = new zzeku(this);
                return this.zzc.zzb(zzm0, this.zzd, zzezk0, zzeku0);
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcq0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    private final boolean zze() {
        synchronized(this) {
            return this.zzj != null && !this.zzj.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.zzf.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return this.zzf.zzi();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzdy zzk() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
                zzdeq zzdeq0 = this.zzj;
                if(zzdeq0 != null) {
                    return zzdeq0.zzm();
                }
            }
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        synchronized(this) {
        }
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() {
        synchronized(this) {
            zzdeq zzdeq0 = this.zzj;
            return zzdeq0 != null && zzdeq0.zzm() != null ? zzdeq0.zzm().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() {
        synchronized(this) {
            zzdeq zzdeq0 = this.zzj;
            return zzdeq0 != null && zzdeq0.zzm() != null ? zzdeq0.zzm().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzdeq zzdeq0 = this.zzj;
            if(zzdeq0 != null) {
                zzdeq0.zzn().zza(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzm0, zzbo zzbo0) {
        this.zzf.zzk(zzbo0);
        this.zzab(zzm0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            zzdeq zzdeq0 = this.zzj;
            if(zzdeq0 != null) {
                zzdeq0.zzn().zzb(null);
            }
        }
    }
}

