package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzfbf extends zzbwo {
    private final zzfbb zza;
    private final zzfar zzb;
    private final String zzc;
    private final zzfcb zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzava zzg;
    private final zzdrw zzh;
    @Nullable
    private zzdoa zzi;
    private boolean zzj;

    public zzfbf(@Nullable String s, zzfbb zzfbb0, Context context0, zzfar zzfar0, zzfcb zzfcb0, VersionInfoParcel versionInfoParcel0, zzava zzava0, zzdrw zzdrw0) {
        this.zzc = s;
        this.zza = zzfbb0;
        this.zzb = zzfar0;
        this.zzd = zzfcb0;
        this.zze = context0;
        this.zzf = versionInfoParcel0;
        this.zzj = ((Boolean)zzbe.zzc().zza(zzbcl.zzaO)).booleanValue();
        this.zzg = zzava0;
        this.zzh = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoa0 = this.zzi;
        return zzdoa0 == null ? new Bundle() : zzdoa0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final zzdy zzc() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
            zzdoa zzdoa0 = this.zzi;
            if(zzdoa0 != null) {
                return zzdoa0.zzm();
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final zzbwm zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        return this.zzi == null ? null : this.zzi.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final String zze() throws RemoteException {
        synchronized(this) {
            zzdoa zzdoa0 = this.zzi;
            return zzdoa0 != null && zzdoa0.zzm() != null ? zzdoa0.zzm().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(zzm zzm0, zzbww zzbww0) throws RemoteException {
        synchronized(this) {
            this.zzu(zzm0, zzbww0, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(zzm zzm0, zzbww zzbww0) throws RemoteException {
        synchronized(this) {
            this.zzu(zzm0, zzbww0, 3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.zzj = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(zzdo zzdo0) {
        if(zzdo0 == null) {
            this.zzb.zzg(null);
            return;
        }
        zzfbd zzfbd0 = new zzfbd(this, zzdo0);
        this.zzb.zzg(zzfbd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(zzdr zzdr0) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if(!zzdr0.zzf()) {
                this.zzh.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
        }
        this.zzb.zzi(zzdr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbws0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbws0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxd0) {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            this.zzd.zza = zzbxd0.zza;
            this.zzd.zzb = zzbxd0.zzb;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            this.zzn(iObjectWrapper0, this.zzj);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            if(this.zzi == null) {
                zzo.zzj("Rewarded can not be shown before loaded");
                zze zze0 = zzfdk.zzd(9, null, null);
                this.zzb.zzq(zze0);
                return;
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
                StackTraceElement[] arr_stackTraceElement = new Throwable().getStackTrace();
                this.zzg.zzc().zzn(arr_stackTraceElement);
            }
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zzi.zzh(z, activity0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        return this.zzi != null && !this.zzi.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwx0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwx0);
    }

    private final void zzu(zzm zzm0, zzbww zzbww0, int v) throws RemoteException {
        boolean z = false;
        synchronized(this) {
            if(!zzm0.zzb()) {
                if(((Boolean)zzbej.zzk.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                    z = true;
                }
                if(this.zzf.clientJarVersion < ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlb)))) || !z) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            this.zzb.zzk(zzbww0);
            if(zzs.zzI(this.zze) && zzm0.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdk.zzd(4, null, null);
                this.zzb.zzdz(zze0);
                return;
            }
            if(this.zzi != null) {
                return;
            }
            zzfat zzfat0 = new zzfat(null);
            this.zza.zzj(v);
            zzfbe zzfbe0 = new zzfbe(this);
            this.zza.zzb(zzm0, this.zzc, zzfat0, zzfbe0);
        }
    }
}

