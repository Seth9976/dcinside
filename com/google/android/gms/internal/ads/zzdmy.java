package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzr;

public class zzdmy implements zza, zzac, zzr, zzbif, zzbih {
    private zza zza;
    private zzbif zzb;
    private zzr zzc;
    private zzbih zzd;
    private zzac zze;

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            zza zza0 = this.zza;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbif
    public final void zza(String s, Bundle bundle0) {
        synchronized(this) {
            zzbif zzbif0 = this.zzb;
            if(zzbif0 != null) {
                zzbif0.zza(s, bundle0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbih
    public final void zzb(String s, @Nullable String s1) {
        synchronized(this) {
            zzbih zzbih0 = this.zzd;
            if(zzbih0 != null) {
                zzbih0.zzb(s, s1);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        synchronized(this) {
            zzr zzr0 = this.zzc;
            if(zzr0 != null) {
                zzr0.zzdE();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        synchronized(this) {
            zzr zzr0 = this.zzc;
            if(zzr0 != null) {
                zzr0.zzdi();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        synchronized(this) {
            zzr zzr0 = this.zzc;
            if(zzr0 != null) {
                zzr0.zzdo();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        synchronized(this) {
            zzr zzr0 = this.zzc;
            if(zzr0 != null) {
                zzr0.zzdp();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        synchronized(this) {
            zzr zzr0 = this.zzc;
            if(zzr0 != null) {
                zzr0.zzdr();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        synchronized(this) {
            zzr zzr0 = this.zzc;
            if(zzr0 != null) {
                zzr0.zzds(v);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzac
    public final void zzg() {
        synchronized(this) {
            zzac zzac0 = this.zze;
            if(zzac0 != null) {
                zzac0.zzg();
            }
        }
    }

    protected final void zzh(zza zza0, zzbif zzbif0, zzr zzr0, zzbih zzbih0, zzac zzac0) {
        synchronized(this) {
            this.zza = zza0;
            this.zzb = zzbif0;
            this.zzc = zzr0;
            this.zzd = zzbih0;
            this.zze = zzac0;
        }
    }
}

