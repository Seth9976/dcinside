package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;

final class zzeih implements zzcxc {
    boolean zza;
    final zzecz zzb;
    final zzcab zzc;

    zzeih(zzeii zzeii0, zzecz zzecz0, zzcab zzcab0) {
        this.zzb = zzecz0;
        this.zzc = zzcab0;
        super();
        this.zza = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zza(int v) {
        synchronized(this) {
            if(this.zza) {
                return;
            }
            this.zza = true;
            this.zze(new zze(v, "Error from: " + this.zzb.zza + ", code: " + v, "undefined", null, null));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzb(zze zze0) {
        synchronized(this) {
            if(this.zza) {
                return;
            }
            this.zza = true;
            this.zze(zze0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzc(int v, @Nullable String s) {
        synchronized(this) {
            if(this.zza) {
                return;
            }
            this.zza = true;
            if(s == null) {
                s = "Error from: " + this.zzb.zza + ", code: " + v;
            }
            this.zze(new zze(v, s, "undefined", null, null));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxc
    public final void zzd() {
        synchronized(this) {
            this.zzc.zzc(null);
        }
    }

    private final void zze(zze zze0) {
        int v = 1;
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfu)).booleanValue()) {
                v = 3;
            }
            zzeda zzeda0 = new zzeda(v, zze0);
            this.zzc.zzd(zzeda0);
        }
    }
}

