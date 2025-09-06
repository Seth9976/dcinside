package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class zzbnu implements zzbmm, zzbnt {
    private final zzbnt zza;
    private final HashSet zzb;

    public zzbnu(zzbnt zzbnt0) {
        this.zza = zzbnt0;
        this.zzb = new HashSet();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final void zza(String s) {
        this.zza.zza(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final void zzb(String s, String s1) {
        zzbml.zzc(this, s, s1);
    }

    public final void zzc() {
        for(Object object0: this.zzb) {
            zze.zza(("Unregistering eventhandler: " + ((zzbjp)((AbstractMap.SimpleEntry)object0).getValue()).toString()));
            String s = (String)((AbstractMap.SimpleEntry)object0).getKey();
            zzbjp zzbjp0 = (zzbjp)((AbstractMap.SimpleEntry)object0).getValue();
            this.zza.zzr(s, zzbjp0);
        }
        this.zzb.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(String s, Map map0) {
        zzbml.zza(this, s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmk
    public final void zze(String s, JSONObject jSONObject0) {
        zzbml.zzb(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(String s, JSONObject jSONObject0) {
        zzbml.zzd(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbnt
    public final void zzq(String s, zzbjp zzbjp0) {
        this.zza.zzq(s, zzbjp0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzbjp0);
        this.zzb.add(abstractMap$SimpleEntry0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbnt
    public final void zzr(String s, zzbjp zzbjp0) {
        this.zza.zzr(s, zzbjp0);
        AbstractMap.SimpleEntry abstractMap$SimpleEntry0 = new AbstractMap.SimpleEntry(s, zzbjp0);
        this.zzb.remove(abstractMap$SimpleEntry0);
    }
}

