package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbnr extends zzcai {
    private final Object zza;
    private final zzbd zzb;
    private boolean zzc;
    private int zzd;

    public zzbnr(zzbd zzbd0) {
        this.zza = new Object();
        this.zzb = zzbd0;
        this.zzc = false;
        this.zzd = 0;
    }

    public final zzbnm zza() {
        zzbnm zzbnm0 = new zzbnm(this);
        zze.zza("createNewReference: Trying to acquire lock");
        synchronized(this.zza) {
            zze.zza("createNewReference: Lock acquired");
            this.zzj(new zzbnn(this, zzbnm0), new zzbno(this, zzbnm0));
            Preconditions.checkState(this.zzd >= 0);
            ++this.zzd;
        }
        zze.zza("createNewReference: Lock released");
        return zzbnm0;
    }

    public final void zzb() {
        zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized(this.zza) {
            zze.zza("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.zzd >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            this.zzc();
        }
        zze.zza("markAsDestroyable: Lock released");
    }

    protected final void zzc() {
        zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized(this.zza) {
            zze.zza("maybeDestroy: Lock acquired");
            Preconditions.checkState(this.zzd >= 0);
            if(!this.zzc || this.zzd != 0) {
                zze.zza("There are still references to the engine. Not destroying.");
            }
            else {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                this.zzj(new zzbnq(this), new zzcae());
            }
        }
        zze.zza("maybeDestroy: Lock released");
    }

    protected final void zzd() {
        zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized(this.zza) {
            zze.zza("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.zzd > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            --this.zzd;
            this.zzc();
        }
        zze.zza("releaseOneReference: Lock released");
    }
}

