package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcyc extends zzdbj implements zzcwn, zzcxs {
    private final zzfbo zzb;
    private final AtomicBoolean zzc;

    public zzcyc(Set set0, zzfbo zzfbo0) {
        super(set0);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfbo0;
    }

    private final void zza() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhI)).booleanValue() && this.zzc.compareAndSet(false, true)) {
            zzu zzu0 = this.zzb.zzae;
            if(zzu0 != null && zzu0.zza == 3) {
                this.zzq(new zzcyb(zzu0));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        if(this.zzb.zzb == 1) {
            this.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if(this.zzb.zzb != 2 && this.zzb.zzb != 4 && this.zzb.zzb != 5 && this.zzb.zzb != 6 && this.zzb.zzb != 7) {
            return;
        }
        this.zza();
    }
}

