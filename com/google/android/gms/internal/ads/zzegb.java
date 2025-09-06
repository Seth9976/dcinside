package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o3.h;

final class zzegb {
    @GuardedBy("this")
    private final Map zza;
    @GuardedBy("this")
    private final List zzb;
    @GuardedBy("this")
    private final zzgdb zzc;
    @GuardedBy("this")
    private final List zzd;
    @GuardedBy("this")
    private final Set zze;
    @GuardedBy("this")
    private zzegr zzf;
    @GuardedBy("this")
    private int zzg;
    private final String zzh;
    private final int zzi;
    private final zzegq zzj;
    private zzfbo zzk;
    @GuardedBy("this")
    private boolean zzl;

    zzegb(zzfca zzfca0, zzegq zzegq0, zzgdb zzgdb0) {
        this.zza = new HashMap();
        this.zzb = new ArrayList();
        this.zzd = new ArrayList();
        this.zze = new HashSet();
        this.zzg = 0x7FFFFFFF;
        this.zzl = false;
        this.zzi = zzfca0.zzb.zzb.zzr;
        this.zzj = zzegq0;
        this.zzc = zzgdb0;
        this.zzh = zzegx.zzc(zzfca0);
        List list0 = zzfca0.zzb.zza;
        for(int v = 0; v < list0.size(); ++v) {
            zzfbo zzfbo0 = (zzfbo)list0.get(v);
            this.zza.put(zzfbo0, v);
        }
        this.zzb.addAll(list0);
    }

    @h
    final zzfbo zza() {
        synchronized(this) {
            if(this.zzi()) {
                int v1 = 0;
                while(v1 < this.zzb.size()) {
                    zzfbo zzfbo0 = (zzfbo)this.zzb.get(v1);
                    String s = zzfbo0.zzat;
                    if(this.zze.contains(s)) {
                        ++v1;
                        continue;
                    }
                    if(zzfbo0.zzav) {
                        this.zzl = true;
                    }
                    if(!TextUtils.isEmpty(s)) {
                        this.zze.add(s);
                    }
                    this.zzd.add(zzfbo0);
                    return (zzfbo)this.zzb.remove(v1);
                }
            }
            return null;
        }
    }

    final void zzb(Throwable throwable0, zzfbo zzfbo0) {
        synchronized(this) {
            this.zzl = false;
            this.zzd.remove(zzfbo0);
            this.zze.remove(zzfbo0.zzat);
            if(!this.zzd() && !this.zzh()) {
                this.zze();
            }
        }
    }

    final void zzc(zzegr zzegr0, zzfbo zzfbo0) {
        synchronized(this) {
            this.zzl = false;
            this.zzd.remove(zzfbo0);
            if(this.zzd()) {
                zzegr0.zzr();
                return;
            }
            Integer integer0 = (Integer)this.zza.get(zzfbo0);
            int v1 = integer0 == null ? 0x7FFFFFFF : ((int)integer0);
            if(v1 > this.zzg) {
                this.zzj.zzm(zzfbo0);
                return;
            }
            if(this.zzf != null) {
                this.zzj.zzm(this.zzk);
            }
            this.zzg = v1;
            this.zzf = zzegr0;
            this.zzk = zzfbo0;
            if(!this.zzh()) {
                this.zze();
            }
        }
    }

    final boolean zzd() {
        synchronized(this) {
            return this.zzc.isDone();
        }
    }

    private final void zze() {
        synchronized(this) {
            this.zzj.zzi(this.zzk);
            zzegr zzegr0 = this.zzf;
            if(zzegr0 != null) {
                this.zzc.zzc(zzegr0);
                return;
            }
            zzegu zzegu0 = new zzegu(3, this.zzh);
            this.zzc.zzd(zzegu0);
        }
    }

    private final boolean zzf(boolean z) {
        synchronized(this) {
            for(Object object0: this.zzb) {
                Integer integer0 = (Integer)this.zza.get(((zzfbo)object0));
                int v1 = integer0 == null ? 0x7FFFFFFF : ((int)integer0);
                if(z || !this.zze.contains(((zzfbo)object0).zzat)) {
                    int v2 = this.zzg;
                    if(v1 < v2) {
                        return true;
                    }
                    if(v1 > v2) {
                        break;
                    }
                }
            }
            return false;
        }
    }

    private final boolean zzg() {
        synchronized(this) {
            for(Object object0: this.zzd) {
                Integer integer0 = (Integer)this.zza.get(((zzfbo)object0));
                if((integer0 == null ? 0x7FFFFFFF : ((int)integer0)) < this.zzg) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    private final boolean zzh() {
        synchronized(this) {
            return !this.zzf(true) && !this.zzg() ? false : true;
        }
    }

    private final boolean zzi() {
        synchronized(this) {
            if(this.zzl) {
                return false;
            }
            return !this.zzb.isEmpty() && ((zzfbo)this.zzb.get(0)).zzav && !this.zzd.isEmpty() ? false : !this.zzd() && this.zzd.size() < this.zzi && this.zzf(false);
        }
    }
}

