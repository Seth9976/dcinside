package com.google.android.gms.internal.ads;

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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class zzejt extends zzbx implements zzcyf {
    private final Context zza;
    private final zzeya zzb;
    private final String zzc;
    private final zzekn zzd;
    private zzs zze;
    private final zzfch zzf;
    private final VersionInfoParcel zzg;
    private final zzdrw zzh;
    @Nullable
    private zzcom zzi;

    public zzejt(Context context0, zzs zzs0, String s, zzeya zzeya0, zzekn zzekn0, VersionInfoParcel versionInfoParcel0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = zzeya0;
        this.zze = zzs0;
        this.zzc = s;
        this.zzd = zzekn0;
        this.zzf = zzeya0.zzf();
        this.zzg = versionInfoParcel0;
        this.zzh = zzdrw0;
        zzeya0.zzo(this);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() {
        synchronized(this) {
            Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
            zzcom zzcom0 = this.zzi;
            if(zzcom0 != null) {
                zzcom0.zzh();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() {
        synchronized(this) {
            if(!((Boolean)zzbej.zzh.zze()).booleanValue() || !((Boolean)zzbe.zzc().zza(zzbcl.zzkW)).booleanValue() || this.zzg.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlc))))) {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
            zzcom zzcom0 = this.zzi;
            if(zzcom0 != null) {
                zzcom0.zzn().zzc(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbi0) {
        if(this.zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(zzbi0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzbl0) {
        if(this.zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzbl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzcc0) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzs0) {
        synchronized(this) {
            Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
            this.zzf.zzs(zzs0);
            this.zze = zzs0;
            zzcom zzcom0 = this.zzi;
            if(zzcom0 != null) {
                zzcom0.zzi(this.zzb.zzc(), zzs0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcm0) {
        if(this.zzm()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcm0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbag0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzy0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzct0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzef0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtn0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) {
        synchronized(this) {
            if(this.zzm()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzB(z);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdg0) {
        synchronized(this) {
            Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
            this.zzb.zzp(zzbdg0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdr0) {
        if(this.zzm()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if(!zzdr0.zzf()) {
                this.zzh.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzd.zzl(zzdr0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtq0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwc0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzga0) {
        synchronized(this) {
            if(this.zzm()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzI(zzga0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() {
        synchronized(this) {
            return this.zzi != null && this.zzi.zzs();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() {
        synchronized(this) {
            return this.zzb.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyf
    public final void zza() {
        synchronized(this) {
            if(this.zzb.zzs()) {
                zzs zzs0 = this.zzf.zzh();
                if(this.zzi != null && this.zzi.zzg() != null && this.zzf.zzT()) {
                    List list0 = Collections.singletonList(this.zzi.zzg());
                    zzs0 = zzfcp.zza(this.zza, list0);
                }
                this.zzf(zzs0);
                this.zzf.zzx(true);
                try {
                    this.zzh(this.zzf.zzf());
                }
                catch(RemoteException unused_ex) {
                    zzo.zzj("Failed to refresh the banner ad.");
                }
                this.zzf.zzx(false);
                return;
            }
            this.zzb.zzl();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzm0) throws RemoteException {
        synchronized(this) {
            this.zzf(this.zze);
            return this.zzh(zzm0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcq0) {
        synchronized(this) {
            Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
            this.zzf.zzV(zzcq0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcyf
    public final void zzb() throws ExecutionException, InterruptedException {
        synchronized(this) {
            if(this.zzb.zzs()) {
                this.zzb.zzq();
                return;
            }
            this.zzb.zzm();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    private final void zzf(zzs zzs0) {
        synchronized(this) {
            this.zzf.zzs(zzs0);
            this.zzf.zzy(this.zze.zzn);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        synchronized(this) {
            Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
            zzcom zzcom0 = this.zzi;
            if(zzcom0 != null) {
                List list0 = Collections.singletonList(zzcom0.zzf());
                return zzfcp.zza(this.zza, list0);
            }
        }
        return this.zzf.zzh();
    }

    private final boolean zzh(zzm zzm0) throws RemoteException {
        synchronized(this) {
            if(this.zzm()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) && zzm0.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                zzekn zzekn0 = this.zzd;
                if(zzekn0 != null) {
                    zzekn0.zzdz(zzfdk.zzd(4, null, null));
                }
                return false;
            }
            zzfdg.zza(this.zza, zzm0.zzf);
            zzejs zzejs0 = new zzejs(this);
            return this.zzb.zzb(zzm0, this.zzc, null, zzejs0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        return this.zzd.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        return this.zzd.zzi();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzdy zzk() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
                zzcom zzcom0 = this.zzi;
                if(zzcom0 != null) {
                    return zzcom0.zzm();
                }
            }
            return null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzeb zzl() {
        synchronized(this) {
            Preconditions.checkMainThread("getVideoController must be called from the main thread.");
            zzcom zzcom0 = this.zzi;
            return zzcom0 != null ? zzcom0.zze() : null;
        }
    }

    private final boolean zzm() {
        boolean z = ((Boolean)zzbej.zzf.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue();
        return this.zzg.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlb)))) || !z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        if(this.zzm()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzc());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        synchronized(this) {
        }
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() {
        synchronized(this) {
            zzcom zzcom0 = this.zzi;
            return zzcom0 != null && zzcom0.zzm() != null ? zzcom0.zzm().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() {
        synchronized(this) {
            zzcom zzcom0 = this.zzi;
            return zzcom0 != null && zzcom0.zzm() != null ? zzcom0.zzm().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() {
        synchronized(this) {
            if(!((Boolean)zzbej.zze.zze()).booleanValue() || !((Boolean)zzbe.zzc().zza(zzbcl.zzkX)).booleanValue() || this.zzg.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlc))))) {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
            zzcom zzcom0 = this.zzi;
            if(zzcom0 != null) {
                zzcom0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzm0, zzbo zzbo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() {
        synchronized(this) {
            if(!((Boolean)zzbej.zzg.zze()).booleanValue() || !((Boolean)zzbe.zzc().zza(zzbcl.zzkY)).booleanValue() || this.zzg.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlc))))) {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
            zzcom zzcom0 = this.zzi;
            if(zzcom0 != null) {
                zzcom0.zzn().zzb(null);
            }
        }
    }
}

