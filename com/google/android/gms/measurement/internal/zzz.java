package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzfo.zzc;
import com.google.android.gms.internal.measurement.zzfo.zze;
import com.google.android.gms.internal.measurement.zzfy.zzo;
import com.google.android.gms.internal.measurement.zzoe;

final class zzz extends zzaa {
    private zze zzg;
    private final zzt zzh;

    zzz(zzt zzt0, String s, int v, zze zzfo$zze0) {
        this.zzh = zzt0;
        super(s, v);
        this.zzg = zzfo$zze0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzaa
    final int zza() {
        return this.zzg.zza();
    }

    final boolean zza(Long long0, Long long1, zzo zzfy$zzo0, boolean z) {
        boolean z1 = zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbn);
        boolean z2 = this.zzg.zzf();
        boolean z3 = this.zzg.zzg();
        boolean z4 = this.zzg.zzh();
        boolean z5 = z2 || z3 || z4;
        Integer integer0 = null;
        if(z && !z5) {
            zzgq zzgq0 = this.zzh.zzj().zzp();
            Integer integer1 = this.zzb;
            if(this.zzg.zzi()) {
                integer0 = this.zzg.zza();
            }
            zzgq0.zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", integer1, integer0);
            return true;
        }
        zzc zzfo$zzc0 = this.zzg.zzb();
        boolean z6 = zzfo$zzc0.zzf();
        if(!zzfy$zzo0.zzk()) {
            if(!zzfy$zzo0.zzi()) {
                if(!zzfy$zzo0.zzm()) {
                    this.zzh.zzj().zzu().zza("User property has no value, property", this.zzh.zzi().zzc(""));
                }
                else if(zzfo$zzc0.zzj()) {
                    integer0 = zzaa.zza(zzaa.zza("", zzfo$zzc0.zzd(), this.zzh.zzj()), z6);
                }
                else if(!zzfo$zzc0.zzh()) {
                    this.zzh.zzj().zzu().zza("No string or number filter defined. property", this.zzh.zzi().zzc(""));
                }
                else {
                    this.zzh.zzj().zzu().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzi().zzc(""), "");
                }
            }
            else if(!zzfo$zzc0.zzh()) {
                this.zzh.zzj().zzu().zza("No number filter for double property. property", this.zzh.zzi().zzc(""));
            }
            else {
                integer0 = zzaa.zza(zzaa.zza(zzfy$zzo0.zza(), zzfo$zzc0.zzc()), z6);
            }
        }
        else if(!zzfo$zzc0.zzh()) {
            this.zzh.zzj().zzu().zza("No number filter for long property. property", this.zzh.zzi().zzc(""));
        }
        else {
            integer0 = zzaa.zza(zzaa.zza(zzfy$zzo0.zzc(), zzfo$zzc0.zzc()), z6);
        }
        zzgq zzgq1 = this.zzh.zzj().zzp();
        String s = integer0 == null ? "null" : integer0;
        zzgq1.zza("Property filter result", s);
        if(integer0 == null) {
            return false;
        }
        this.zzc = Boolean.TRUE;
        if(z4 && !((Boolean)integer0).booleanValue()) {
            return true;
        }
        if(!z || this.zzg.zzf()) {
            this.zzd = integer0;
        }
        if(((Boolean)integer0).booleanValue() && z5 && zzfy$zzo0.zzl()) {
            long v = long0 == null ? zzfy$zzo0.zzd() : ((long)long0);
            if(z1 && this.zzg.zzf() && !this.zzg.zzg() && long1 != null) {
                v = (long)long1;
            }
            if(this.zzg.zzg()) {
                this.zzf = v;
                return true;
            }
            this.zze = v;
        }
        return true;
    }

    @Override  // com.google.android.gms.measurement.internal.zzaa
    final boolean zzb() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzaa
    final boolean zzc() {
        return true;
    }
}

