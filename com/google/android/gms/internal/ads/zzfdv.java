package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedList;

final class zzfdv {
    private final LinkedList zza;
    private final int zzb;
    private final int zzc;
    private final zzfeu zzd;

    public zzfdv(int v, int v1) {
        this.zza = new LinkedList();
        this.zzb = v;
        this.zzc = v1;
        this.zzd = new zzfeu();
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        this.zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    @Nullable
    public final zzfef zze() {
        this.zzd.zzf();
        this.zzi();
        if(this.zza.isEmpty()) {
            return null;
        }
        zzfef zzfef0 = (zzfef)this.zza.remove();
        if(zzfef0 != null) {
            this.zzd.zzh();
        }
        return zzfef0;
    }

    public final zzfet zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfef zzfef0) {
        this.zzd.zzf();
        this.zzi();
        if(this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfef0);
        return true;
    }

    private final void zzi() {
        while(!this.zza.isEmpty()) {
            zzfef zzfef0 = (zzfef)this.zza.getFirst();
            if(zzv.zzC().currentTimeMillis() - zzfef0.zzd < ((long)this.zzc)) {
                break;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }
}

