package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zzdsh {
    private final zzg zza;
    @GuardedBy("this")
    private final List zzb;
    @GuardedBy("this")
    private boolean zzc;
    @GuardedBy("this")
    private boolean zzd;
    private final String zze;
    private final zzdsb zzf;

    public zzdsh(String s, zzdsb zzdsb0) {
        this.zzb = new ArrayList();
        this.zzc = false;
        this.zzd = false;
        this.zze = s;
        this.zzf = zzdsb0;
        this.zza = zzv.zzp().zzi();
    }

    public final void zza(String s) {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
                return;
            }
            Map map0 = this.zzg();
            map0.put("action", "aaia");
            map0.put("aair", "MalformedJson");
            this.zzb.add(map0);
        }
    }

    public final void zzb(String s, String s1) {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
                return;
            }
            Map map0 = this.zzg();
            map0.put("action", "adapter_init_finished");
            map0.put("ancn", s);
            map0.put("rqe", s1);
            this.zzb.add(map0);
        }
    }

    public final void zzc(String s) {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
                return;
            }
            Map map0 = this.zzg();
            map0.put("action", "adapter_init_started");
            map0.put("ancn", s);
            this.zzb.add(map0);
        }
    }

    public final void zzd(String s) {
        synchronized(this) {
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
                return;
            }
            Map map0 = this.zzg();
            map0.put("action", "adapter_init_finished");
            map0.put("ancn", s);
            this.zzb.add(map0);
        }
    }

    public final void zze() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzch)).booleanValue() && !this.zzd) {
                Map map0 = this.zzg();
                map0.put("action", "init_finished");
                this.zzb.add(map0);
                for(Object object0: this.zzb) {
                    this.zzf.zzg(((Map)object0));
                }
                this.zzd = true;
            }
        }
    }

    public final void zzf() {
        synchronized(this) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzch)).booleanValue() && !this.zzc) {
                Map map0 = this.zzg();
                map0.put("action", "init_started");
                this.zzb.add(map0);
                this.zzc = true;
            }
        }
    }

    private final Map zzg() {
        Map map0 = this.zzf.zza();
        map0.put("tms", Long.toString(zzv.zzC().elapsedRealtime(), 10));
        map0.put("tid", (this.zza.zzN() ? "" : this.zze));
        return map0;
    }
}

