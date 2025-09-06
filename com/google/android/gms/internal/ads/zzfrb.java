package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

public final class zzfrb {
    final zzfrc zza;
    private static zzfrb zzb;

    static {
    }

    private zzfrb(Context context0) {
        this.zza = zzfrc.zzb(context0);
    }

    public static final zzfrb zza(Context context0) {
        synchronized(zzfrb.class) {
            if(zzfrb.zzb == null) {
                zzfrb.zzb = new zzfrb(context0);
            }
            return zzfrb.zzb;
        }
    }

    public final void zzb(boolean z) throws IOException {
        synchronized(zzfrb.class) {
            this.zza.zzd("paidv2_user_option", Boolean.valueOf(z));
        }
    }

    public final void zzc(boolean z) throws IOException {
        synchronized(zzfrb.class) {
            this.zza.zzd("paidv2_publisher_option", Boolean.valueOf(z));
            if(!z) {
                this.zza.zze("paidv2_creation_time");
                this.zza.zze("paidv2_id");
                this.zza.zze("vendor_scoped_gpid_v2_id");
                this.zza.zze("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzd() {
        synchronized(zzfrb.class) {
        }
        return this.zza.zzf("paidv2_publisher_option", true);
    }

    public final boolean zze() {
        synchronized(zzfrb.class) {
        }
        return this.zza.zzf("paidv2_user_option", true);
    }
}

