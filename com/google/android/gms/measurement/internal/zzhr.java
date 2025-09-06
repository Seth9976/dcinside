package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

final class zzhr implements zzv {
    private final zzhl zza;

    zzhr(zzhl zzhl0) {
        this.zza = zzhl0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzv
    public final void zza(zzs zzs0, String s, List list0, boolean z, boolean z1) {
        zzgq zzgq0;
        int v = zzht.zza[zzs0.ordinal()];
        switch(v) {
            case 1: {
                zzgq0 = this.zza.zzj().zzc();
                break;
            }
            case 2: {
                if(z) {
                    zzgq0 = this.zza.zzj().zzn();
                }
                else if(z1) {
                    zzgq0 = this.zza.zzj().zzg();
                }
                else {
                    zzgq0 = this.zza.zzj().zzm();
                }
                break;
            }
            case 3: {
                if(z) {
                    zzgq0 = this.zza.zzj().zzw();
                }
                else {
                    zzgq0 = z1 ? this.zza.zzj().zzu() : this.zza.zzj().zzv();
                }
                break;
            }
            default: {
                zzgq0 = v == 4 ? this.zza.zzj().zzp() : this.zza.zzj().zzo();
            }
        }
        switch(list0.size()) {
            case 1: {
                zzgq0.zza(s, list0.get(0));
                return;
            }
            case 2: {
                zzgq0.zza(s, list0.get(0), list0.get(1));
                return;
            }
            case 3: {
                zzgq0.zza(s, list0.get(0), list0.get(1), list0.get(2));
                return;
            }
            default: {
                zzgq0.zza(s);
            }
        }
    }
}

