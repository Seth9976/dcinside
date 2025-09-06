package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

public final class zzfbl extends zzbvy {
    private final zzfbb zza;
    private final zzfar zzb;
    private final zzfcb zzc;
    @Nullable
    private zzdoa zzd;
    private boolean zze;

    public zzfbl(zzfbb zzfbb0, zzfar zzfar0, zzfcb zzfcb0) {
        this.zze = false;
        this.zza = zzfbb0;
        this.zzb = zzfar0;
        this.zzc = zzfcb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdoa zzdoa0 = this.zzd;
        return zzdoa0 == null ? new Bundle() : zzdoa0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    @Nullable
    public final zzdy zzc() throws RemoteException {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
                zzdoa zzdoa0 = this.zzd;
                if(zzdoa0 != null) {
                    return zzdoa0.zzm();
                }
            }
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    @Nullable
    public final String zzd() throws RemoteException {
        synchronized(this) {
            zzdoa zzdoa0 = this.zzd;
            return zzdoa0 != null && zzdoa0.zzm() != null ? zzdoa0.zzm().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zze() throws RemoteException {
        this.zzf(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            Context context0 = null;
            this.zzb.zzg(null);
            if(this.zzd != null) {
                if(iObjectWrapper0 != null) {
                    context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                }
                this.zzd.zzn().zza(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzg(zzbwd zzbwd0) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            String s = zzbwd0.zzb;
            String s1 = (String)zzbe.zzc().zza(zzbcl.zzfr);
            if(s1 != null && s != null) {
                try {
                    if(Pattern.matches(s1, s)) {
                        return;
                    }
                }
                catch(RuntimeException runtimeException0) {
                    zzv.zzp().zzw(runtimeException0, "NonagonUtil.isPatternMatched");
                }
            }
            if(this.zzy() && !((Boolean)zzbe.zzc().zza(zzbcl.zzft)).booleanValue()) {
                return;
            }
            zzfat zzfat0 = new zzfat(null);
            this.zzd = null;
            this.zza.zzj(1);
            zzfbj zzfbj0 = new zzfbj(this);
            this.zza.zzb(zzbwd0.zza, zzbwd0.zzb, zzfat0, zzfbj0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzh() {
        this.zzi(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            if(this.zzd != null) {
                Context context0 = iObjectWrapper0 == null ? null : ((Context)ObjectWrapper.unwrap(iObjectWrapper0));
                this.zzd.zzn().zzb(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzj() {
        this.zzk(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            if(this.zzd != null) {
                Context context0 = iObjectWrapper0 == null ? null : ((Context)ObjectWrapper.unwrap(iObjectWrapper0));
                this.zzd.zzn().zzc(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzl(zzcc zzcc0) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if(zzcc0 == null) {
            this.zzb.zzg(null);
            return;
        }
        zzfbk zzfbk0 = new zzfbk(this, zzcc0);
        this.zzb.zzg(zzfbk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzm(String s) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.zzc.zzb = s;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzn(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.zze = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzo(zzbwc zzbwc0) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzp(String s) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
            this.zzc.zza = s;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzq() throws RemoteException {
        synchronized(this) {
            this.zzr(null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzr(@Nullable IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            Activity activity0 = null;
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if(this.zzd != null) {
                if(iObjectWrapper0 != null) {
                    Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                    if(object0 instanceof Activity) {
                        activity0 = (Activity)object0;
                    }
                }
                this.zzd.zzh(this.zze, activity0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return this.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzt() {
        return this.zzd != null && this.zzd.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbvz
    public final void zzu(zzbvx zzbvx0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbvx0);
    }

    private final boolean zzy() {
        synchronized(this) {
            return this.zzd != null && !this.zzd.zze();
        }
    }
}

