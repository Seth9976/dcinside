package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashMap;
import java.util.Map;
import o3.h;

public final class zzdpj {
    private final Map zza;

    zzdpj() {
        this.zza = new HashMap();
    }

    @h
    public final zzdpi zza(String s) {
        synchronized(this) {
            return (zzdpi)this.zza.get(s);
        }
    }

    public final String zzb(String s) {
        zzdpi zzdpi0 = this.zza(s);
        if(zzdpi0 != null) {
            return zzdpi0.zzb == null ? "" : zzdpi0.zzb.toString();
        }
        return "";
    }

    final void zzc(String s, @h zzfdh zzfdh0) {
        zzbrs zzbrs0 = null;
        zzbrs zzbrs1 = null;
        synchronized(this) {
            if(this.zza.containsKey(s)) {
                return;
            }
            if(zzfdh0 != null) {
                try {
                    zzbrs0 = zzfdh0.zze();
                }
                catch(zzfcq unused_ex) {
                }
            }
            if(zzfdh0 != null) {
                try {
                    zzbrs1 = zzfdh0.zzf();
                }
                catch(zzfcq unused_ex) {
                }
            }
            boolean z = true;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
                if(zzfdh0 == null) {
                label_18:
                    z = false;
                }
                else {
                    try {
                        zzfdh0.zzC();
                        goto label_19;
                    }
                    catch(zzfcq unused_ex) {
                    }
                    goto label_18;
                }
            }
        label_19:
            zzdpi zzdpi0 = new zzdpi(s, zzbrs0, zzbrs1, z);
            this.zza.put(s, zzdpi0);
        }
    }

    final void zzd(String s, zzbrd zzbrd0) {
        zzbrs zzbrs1;
        zzbrs zzbrs0;
        synchronized(this) {
            if(this.zza.containsKey(s)) {
                return;
            }
            try {
                zzbrs0 = zzbrd0.zzf();
                zzbrs1 = zzbrd0.zzg();
            }
            catch(Throwable unused_ex) {
                return;
            }
            zzdpi zzdpi0 = new zzdpi(s, zzbrs0, zzbrs1, true);
            this.zza.put(s, zzdpi0);
        }
    }
}

