package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzfo.zzb;
import com.google.android.gms.internal.measurement.zzfo.zzc;
import com.google.android.gms.internal.measurement.zzfy.zzf;
import com.google.android.gms.internal.measurement.zzfy.zzh;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.HashSet;
import java.util.Iterator;

final class zzx extends zzaa {
    private zzb zzg;
    private final zzt zzh;

    zzx(zzt zzt0, String s, int v, zzb zzfo$zzb0) {
        this.zzh = zzt0;
        super(s, v);
        this.zzg = zzfo$zzb0;
    }

    @Override  // com.google.android.gms.measurement.internal.zzaa
    final int zza() {
        return this.zzg.zzb();
    }

    final boolean zza(Long long0, Long long1, zzf zzfy$zzf0, long v, zzbb zzbb0, boolean z) {
        boolean z1 = zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbp);
        long v1 = this.zzg.zzj() ? zzbb0.zze : v;
        Integer integer0 = null;
        if(this.zzh.zzj().zza(2)) {
            this.zzh.zzj().zzp().zza("Evaluating filter. audience, filter, event", this.zzb, (this.zzg.zzl() ? this.zzg.zzb() : null), this.zzh.zzi().zza(""));
            this.zzh.zzj().zzp().zza("Filter definition", this.zzh.g_().zza(this.zzg));
        }
        if(this.zzg.zzl() && this.zzg.zzb() <= 0x100) {
            boolean z2 = this.zzg.zzh() || this.zzg.zzi() || this.zzg.zzj();
            if(z && !z2) {
                zzgq zzgq0 = this.zzh.zzj().zzp();
                Integer integer1 = this.zzb;
                if(this.zzg.zzl()) {
                    integer0 = this.zzg.zzb();
                }
                zzgq0.zza("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", integer1, integer0);
                return true;
            }
            zzb zzfo$zzb0 = this.zzg;
            if(zzfo$zzb0.zzk()) {
                Boolean boolean0 = zzaa.zza(v1, zzfo$zzb0.zze());
                if(boolean0 != null) {
                    if(!boolean0.booleanValue()) {
                        integer0 = Boolean.FALSE;
                        goto label_52;
                    }
                    goto label_22;
                }
            }
            else {
            label_22:
                HashSet hashSet0 = new HashSet();
                Iterator iterator0 = zzfo$zzb0.zzg().iterator();
                if(iterator0.hasNext()) {
                    iterator0.next();
                    this.zzh.zzj().zzu().zza("null or empty param name in filter. event", this.zzh.zzi().zza(""));
                }
                else {
                    ArrayMap arrayMap0 = new ArrayMap();
                    for(Object object0: zzfy$zzf0.zzh()) {
                        zzh zzfy$zzh0 = (zzh)object0;
                        if(!hashSet0.contains("")) {
                            continue;
                        }
                        if(zzfy$zzh0.zzl()) {
                            arrayMap0.put("", (zzfy$zzh0.zzl() ? zzfy$zzh0.zzd() : null));
                            continue;
                        }
                        if(zzfy$zzh0.zzj()) {
                            arrayMap0.put("", (zzfy$zzh0.zzj() ? zzfy$zzh0.zza() : null));
                            continue;
                        }
                        if(zzfy$zzh0.zzn()) {
                            arrayMap0.put("", "");
                            continue;
                        }
                        this.zzh.zzj().zzu().zza("Unknown value for param. event, param", this.zzh.zzi().zza(""), this.zzh.zzi().zzb(""));
                        goto label_52;
                    }
                    Iterator iterator2 = zzfo$zzb0.zzg().iterator();
                    if(iterator2.hasNext()) {
                        Object object1 = iterator2.next();
                        boolean z3 = !((zzc)object1).zzg() || !((zzc)object1).zzf();
                        this.zzh.zzj().zzu().zza("Event has empty param name. event", this.zzh.zzi().zza(""));
                    }
                    else {
                        integer0 = Boolean.TRUE;
                    }
                }
            }
        label_52:
            zzgq zzgq1 = this.zzh.zzj().zzp();
            String s = integer0 == null ? "null" : integer0;
            zzgq1.zza("Event filter result", s);
            if(integer0 == null) {
                return false;
            }
            this.zzc = Boolean.TRUE;
            if(!((Boolean)integer0).booleanValue()) {
                return true;
            }
            this.zzd = Boolean.TRUE;
            if(z2 && zzfy$zzf0.zzk()) {
                Long long2 = zzfy$zzf0.zzd();
                if(this.zzg.zzi()) {
                    if(z1 && this.zzg.zzk()) {
                        long2 = long0;
                    }
                    this.zzf = long2;
                    return true;
                }
                if(z1 && this.zzg.zzk()) {
                    long2 = long1;
                }
                this.zze = long2;
            }
            return true;
        }
        zzgq zzgq2 = this.zzh.zzj().zzu();
        Object object2 = zzgo.zza(this.zza);
        if(this.zzg.zzl()) {
            integer0 = this.zzg.zzb();
        }
        zzgq2.zza("Invalid event filter ID. appId, id", object2, String.valueOf(integer0));
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzaa
    final boolean zzb() {
        return this.zzg.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzaa
    final boolean zzc() {
        return false;
    }
}

