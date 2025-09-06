package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;

public final class zzbye implements zzayk {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbye(Context context0, String s) {
        if(context0.getApplicationContext() != null) {
            context0 = context0.getApplicationContext();
        }
        this.zza = context0;
        this.zzc = s;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z) {
        if(!zzv.zzo().zzp(this.zza)) {
            return;
        }
        synchronized(this.zzb) {
            if(this.zzd == z) {
                return;
            }
            this.zzd = z;
            if(TextUtils.isEmpty(this.zzc)) {
                return;
            }
            if(this.zzd) {
                zzv.zzo().zzf(this.zza, this.zzc);
            }
            else {
                zzv.zzo().zzg(this.zza, this.zzc);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        this.zzb(zzayj0.zzj);
    }
}

