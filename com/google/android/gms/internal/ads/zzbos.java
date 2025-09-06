package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import org.json.JSONObject;

public final class zzbos implements zzgbo {
    private final String zza;
    private final t0 zzb;

    zzbos(t0 t00, String s, zzbnz zzbnz0, zzbny zzbny0) {
        this.zzb = t00;
        this.zza = "google.afma.activeView.handleUpdate";
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) throws Exception {
        return this.zzb(object0);
    }

    public final t0 zzb(Object object0) {
        zzboq zzboq0 = (zzbnt zzbnt0) -> {
            t0 t00 = new zzcab();
            zzbor zzbor0 = new zzbor(this, ((zzcab)t00));
            zzbjo.zzo.zzc("05169481-02d1-494b-984c-b65ee96f6e69", zzbor0);
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", "05169481-02d1-494b-984c-b65ee96f6e69");
            jSONObject0.put("args", ((JSONObject)object0));
            zzbnt0.zzl(this.zza, jSONObject0);
            return t00;
        };
        return zzgch.zzn(this.zzb, zzboq0, zzbzw.zzg);
    }

    // 检测为 Lambda 实现
    final t0 zzc(Object object0, zzbnt zzbnt0) throws Exception [...]
}

