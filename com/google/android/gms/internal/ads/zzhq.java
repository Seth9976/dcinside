package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;

final class zzhq {
    private final zzfvf zza;
    private final zzho zzb;
    @Nullable
    private zzhp zzc;
    private int zzd;
    private float zze;

    public zzhq(Context context0, Handler handler0, zzhp zzhp0) {
        this.zze = 1.0f;
        this.zza = zzfvj.zza(new zzhm(context0));
        this.zzc = zzhp0;
        this.zzb = new zzho(this, handler0);
        this.zzd = 0;
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int v) {
        this.zze();
        this.zzg(0);
        return 1;
    }

    static void zzc(zzhq zzhq0, int v) {
        if(v != -3 && v != -2) {
            switch(v) {
                case -1: {
                    zzhq0.zzf(-1);
                    zzhq0.zze();
                    zzhq0.zzg(1);
                    return;
                }
                case 1: {
                    zzhq0.zzg(2);
                    zzhq0.zzf(1);
                    return;
                }
                default: {
                    zzdo.zzf("AudioFocusManager", "Unknown focus change type: " + v);
                    return;
                }
            }
        }
        if(v != -2) {
            zzhq0.zzg(4);
            return;
        }
        zzhq0.zzf(0);
        zzhq0.zzg(3);
    }

    public final void zzd() {
        this.zzc = null;
        this.zze();
        this.zzg(0);
    }

    private final void zze() {
        if(this.zzd != 0 && this.zzd != 1 && zzei.zza < 26) {
            ((AudioManager)this.zza.zza()).abandonAudioFocus(this.zzb);
        }
    }

    private final void zzf(int v) {
        zzhp zzhp0 = this.zzc;
        if(zzhp0 != null) {
            boolean z = ((zzjl)zzhp0).zza.zzu();
            ((zzjl)zzhp0).zza.zzae(z, v, zzjp.zzS(v));
        }
    }

    private final void zzg(int v) {
        if(this.zzd != v) {
            this.zzd = v;
            float f = v == 4 ? 0.2f : 1.0f;
            if(this.zze != f) {
                this.zze = f;
                zzhp zzhp0 = this.zzc;
                if(zzhp0 != null) {
                    ((zzjl)zzhp0).zza.zzab();
                }
            }
        }
    }
}

