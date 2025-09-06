package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

public final class zzfdq implements zzcvw {
    private final HashSet zza;
    private final Context zzb;
    private final zzbzq zzc;

    public zzfdq(Context context0, zzbzq zzbzq0) {
        this.zza = new HashSet();
        this.zzb = context0;
        this.zzc = zzbzq0;
    }

    public final Bundle zzb() {
        return this.zzc.zzn(this.zzb, this);
    }

    public final void zzc(HashSet hashSet0) {
        synchronized(this) {
            this.zza.clear();
            this.zza.addAll(hashSet0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(zze zze0) {
        synchronized(this) {
            if(zze0.zza != 3) {
                this.zzc.zzl(this.zza);
            }
        }
    }
}

