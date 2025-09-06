package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class zzbcd {
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzbcd() {
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    public final List zza() {
        List list0 = new ArrayList();
        for(Object object0: this.zzb) {
            String s = (String)zzbe.zzc().zza(((zzbcc)object0));
            if(!TextUtils.isEmpty(s)) {
                list0.add(s);
            }
        }
        list0.addAll(zzbcm.zza());
        return list0;
    }

    public final List zzb() {
        List list0 = this.zza();
        for(Object object0: this.zzc) {
            String s = (String)zzbe.zzc().zza(((zzbcc)object0));
            if(!TextUtils.isEmpty(s)) {
                list0.add(s);
            }
        }
        list0.addAll(zzbcm.zzb());
        return list0;
    }

    public final void zzc(zzbcc zzbcc0) {
        this.zzb.add(zzbcc0);
    }

    public final void zzd(zzbcc zzbcc0) {
        this.zza.add(zzbcc0);
    }

    public final void zze(SharedPreferences.Editor sharedPreferences$Editor0, int v, JSONObject jSONObject0) {
        for(Object object0: this.zza) {
            zzbcc zzbcc0 = (zzbcc)object0;
            if(zzbcc0.zze() == 1) {
                zzbcc0.zzd(sharedPreferences$Editor0, zzbcc0.zza(jSONObject0));
            }
        }
        if(jSONObject0 != null) {
            sharedPreferences$Editor0.putString("flag_configuration", jSONObject0.toString());
            return;
        }
        zzo.zzg("Flag Json is null.");
    }
}

