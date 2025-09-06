package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Date;

public final class zzfli implements zzfll {
    private static final zzfli zza;
    private Date zzb;
    private boolean zzc;
    private final zzflm zzd;
    private boolean zze;

    static {
        zzfli.zza = new zzfli(new zzflm());
    }

    private zzfli(zzflm zzflm0) {
        this.zzd = zzflm0;
    }

    public static zzfli zza() {
        return zzfli.zza;
    }

    public final Date zzb() {
        return this.zzb == null ? null : ((Date)this.zzb.clone());
    }

    @Override  // com.google.android.gms.internal.ads.zzfll
    public final void zzc(boolean z) {
        if(!this.zze && z) {
            Date date0 = new Date();
            if(this.zzb == null || date0.after(this.zzb)) {
                this.zzb = date0;
                if(this.zzc) {
                    for(Object object0: zzflk.zza().zzb()) {
                        ((zzfkt)object0).zzg().zzg(this.zzb());
                    }
                }
            }
        }
        this.zze = z;
    }

    public final void zzd(@NonNull Context context0) {
        if(!this.zzc) {
            this.zzd.zzd(context0);
            this.zzd.zze(this);
            this.zzd.zzf();
            this.zze = this.zzd.zza;
            this.zzc = true;
        }
    }
}

