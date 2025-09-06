package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzdds;

public final class zzab extends zzbtd {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzab(Activity activity0, AdOverlayInfoParcel adOverlayInfoParcel0) {
        this.zzc = false;
        this.zzd = false;
        this.zze = false;
        this.zza = adOverlayInfoParcel0;
        this.zzb = activity0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() throws RemoteException {
        return false;
    }

    private final void zzb() {
        synchronized(this) {
            if(!this.zzd) {
                zzr zzr0 = this.zza.zzc;
                if(zzr0 != null) {
                    zzr0.zzds(4);
                }
                this.zzd = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int v, int v1, Intent intent0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzi() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzk(IObjectWrapper iObjectWrapper0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzl(@Nullable Bundle bundle0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zziL)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.zza;
        if(adOverlayInfoParcel0 == null) {
            this.zzb.finish();
            return;
        }
        if(z) {
            this.zzb.finish();
            return;
        }
        if(bundle0 == null) {
            zza zza0 = adOverlayInfoParcel0.zzb;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
            zzdds zzdds0 = this.zza.zzu;
            if(zzdds0 != null) {
                zzdds0.zzdd();
            }
            if(this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)) {
                zzr zzr0 = this.zza.zzc;
                if(zzr0 != null) {
                    zzr0.zzdp();
                }
            }
        }
        if(!com.google.android.gms.ads.internal.overlay.zza.zzb(this.zzb, this.zza.zza, this.zza.zzi, this.zza.zza.zzi, null, "")) {
            this.zzb.finish();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzm() throws RemoteException {
        if(this.zzb.isFinishing()) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzo() throws RemoteException {
        zzr zzr0 = this.zza.zzc;
        if(zzr0 != null) {
            zzr0.zzdi();
        }
        if(this.zzb.isFinishing()) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int v, String[] arr_s, int[] arr_v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzq() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzr() throws RemoteException {
        if(this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzr zzr0 = this.zza.zzc;
        if(zzr0 != null) {
            zzr0.zzdE();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzs(Bundle bundle0) throws RemoteException {
        bundle0.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzt() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzu() throws RemoteException {
        if(this.zzb.isFinishing()) {
            this.zzb();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzv() throws RemoteException {
        zzr zzr0 = this.zza.zzc;
        if(zzr0 != null) {
            zzr0.zzdr();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzx() throws RemoteException {
        this.zze = true;
    }
}

