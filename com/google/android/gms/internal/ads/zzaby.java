package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

public class zzaby {
    protected final zzabs zza;
    protected final zzabx zzb;
    @Nullable
    protected zzabu zzc;
    private final int zzd;

    protected zzaby(zzabv zzabv0, zzabx zzabx0, long v, long v1, long v2, long v3, long v4, long v5, int v6) {
        this.zzb = zzabx0;
        this.zzd = v6;
        this.zza = new zzabs(zzabv0, v, 0L, v2, v3, v4, v5);
    }

    public final int zza(zzaco zzaco0, zzadj zzadj0) throws IOException {
        while(true) {
            zzabu zzabu0 = this.zzc;
            zzcw.zzb(zzabu0);
            long v = zzabu0.zzf;
            long v1 = zzabu0.zzh;
            if(zzabu0.zzg - v <= ((long)this.zzd)) {
                this.zzc(false, v);
                return zzaby.zzf(zzaco0, v, zzadj0);
            }
            if(!zzaby.zzg(zzaco0, v1)) {
                return zzaby.zzf(zzaco0, v1, zzadj0);
            }
            zzaco0.zzj();
            zzabw zzabw0 = this.zzb.zza(zzaco0, zzabu0.zzb);
            switch(zzabw0.zzb) {
                case -3: {
                    this.zzc(false, v1);
                    return zzaby.zzf(zzaco0, v1, zzadj0);
                }
                case -2: {
                    zzabu.zzh(zzabu0, zzabw0.zzc, zzabw0.zzd);
                    break;
                }
                case -1: {
                    zzabu.zzg(zzabu0, zzabw0.zzc, zzabw0.zzd);
                    break;
                }
                default: {
                    zzaby.zzg(zzaco0, zzabw0.zzd);
                    this.zzc(true, zzabw0.zzd);
                    return zzaby.zzf(zzaco0, zzabw0.zzd, zzadj0);
                }
            }
        }
    }

    public final zzadm zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long v) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long v) {
        if(this.zzc != null && this.zzc.zza == v) {
            return;
        }
        this.zzc = new zzabu(v, this.zza.zzf(v), 0L, this.zza.zzc, this.zza.zzd, this.zza.zze, this.zza.zzf);
    }

    public final boolean zze() {
        return this.zzc != null;
    }

    protected static final int zzf(zzaco zzaco0, long v, zzadj zzadj0) {
        if(v == zzaco0.zzf()) {
            return 0;
        }
        zzadj0.zza = v;
        return 1;
    }

    protected static final boolean zzg(zzaco zzaco0, long v) throws IOException {
        long v1 = v - zzaco0.zzf();
        if(v1 >= 0L && v1 <= 0x40000L) {
            zzaco0.zzk(((int)v1));
            return true;
        }
        return false;
    }
}

