package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzduq {
    private final zzdua zza;
    private final zzdpj zzb;
    private final Object zzc;
    @GuardedBy("lock")
    private final List zzd;
    @GuardedBy("lock")
    private boolean zze;

    zzduq(zzdua zzdua0, zzdpj zzdpj0) {
        this.zzc = new Object();
        this.zza = zzdua0;
        this.zzb = zzdpj0;
        this.zzd = new ArrayList();
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        synchronized(this.zzc) {
            if(!this.zze) {
                if(this.zza.zzt()) {
                    this.zzd(this.zza.zzg());
                    goto label_11;
                }
                this.zzc();
                return jSONArray0;
            }
        label_11:
            for(Object object1: this.zzd) {
                jSONArray0.put(((zzdup)object1).zza());
            }
            return jSONArray0;
        }
    }

    public final void zzc() {
        zzduo zzduo0 = new zzduo(this);
        this.zza.zzs(zzduo0);
    }

    private final void zzd(List list0) {
        boolean z;
        String s;
        synchronized(this.zzc) {
            if(this.zze) {
                return;
            }
            for(Object object1: list0) {
                zzbln zzbln0 = (zzbln)object1;
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjj)).booleanValue()) {
                    zzdpi zzdpi0 = this.zzb.zza(zzbln0.zza);
                    if(zzdpi0 != null) {
                        zzbrs zzbrs0 = zzdpi0.zzc;
                        if(zzbrs0 != null) {
                            s = zzbrs0.toString();
                        }
                    }
                }
                else {
                    s = "";
                }
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
                    zzdpi zzdpi1 = this.zzb.zza(zzbln0.zza);
                    if(zzdpi1 != null && zzdpi1.zzd) {
                        z = true;
                    }
                }
                else {
                    z = false;
                }
                String s1 = this.zzb.zzb(zzbln0.zza);
                zzdup zzdup0 = new zzdup(zzbln0.zza, s, s1, ((int)zzbln0.zzb), zzbln0.zzd, zzbln0.zzc, z);
                this.zzd.add(zzdup0);
            }
            this.zze = true;
        }
    }
}

