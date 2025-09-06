package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.c.d;
import java.util.HashSet;

final class zzw {
    private final zzx zza;
    private final zzck zzb;
    private int zzc;
    private d zzd;

    zzw(zzx zzx0, zzck zzck0) {
        this.zzc = 0;
        this.zzd = d.a;
        this.zza = zzx0;
        this.zzb = zzck0;
    }

    // This method was un-flattened
    final zzz zza() throws zzg {
        String s;
        int v = this.zzb.zzf;
        this.zza.zzc.zzh(v == 8);
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 1: 
            case 2: 
            case 3: {
                this.zzc = 3;
                break;
            }
            case 4: {
                this.zzc = 2;
                break;
            }
            case 5: {
                this.zzc = 1;
                break;
            }
            case 6: {
                throw new zzg(1, "Invalid response from server: " + this.zzb.zzc);
            }
            case 7: {
                throw new zzg(3, "Publisher misconfiguration: " + this.zzb.zzc);
            }
            default: {
                throw new zzg(1, "Invalid response from server.");
            }
        }
        zzck zzck0 = this.zzb;
        int v1 = zzck0.zzg - 1;
        if(zzck0.zzg == 0) {
            throw null;
        }
        switch(v1) {
            case 1: {
                this.zzd = d.c;
                break;
            }
            case 2: {
                this.zzd = d.b;
                break;
            }
            default: {
                throw new zzg(1, "Invalid response from server.");
            }
        }
        zzbp zzbp0 = zzck0.zza == null ? null : new zzbp(zzck0.zzb, zzck0.zza);
        this.zza.zzc.zzj(new HashSet(zzck0.zzd));
        for(Object object0: this.zzb.zze) {
            zzcj zzcj0 = (zzcj)object0;
            int v2 = zzcj0.zzb - 1;
            if(zzcj0.zzb == 0) {
                throw null;
            }
            switch(v2) {
                case 1: {
                    break;
                }
                case 2: {
                    s = "clear";
                    break;
                }
                default: {
                    s = null;
                    continue;
                }
            }
            this.zza.zza.zzb(s, zzcj0.zza, new zzd[]{this.zza.zzb});
        }
        return new zzz(this.zzc, this.zzd, zzbp0, null);
    }
}

