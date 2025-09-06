package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONException;

public final class zzcvm extends zzdx {
    private final String zza;
    @Nullable
    private final String zzb;
    private final String zzc;
    @Nullable
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    @Nullable
    private final zzedb zzh;
    private final Bundle zzi;

    public zzcvm(@Nullable zzfbo zzfbo0, String s, zzedb zzedb0, @Nullable zzfbr zzfbr0, String s1) {
        String s2 = null;
        this.zzb = zzfbo0 == null ? null : zzfbo0.zzab;
        this.zzc = s1;
        this.zzd = zzfbr0 == null ? null : zzfbr0.zzb;
        if(("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(s)) && zzfbo0 != null) {
            try {
                s2 = zzfbo0.zzv.getString("class_name");
            }
            catch(JSONException unused_ex) {
            }
        }
        if(s2 != null) {
            s = s2;
        }
        this.zza = s;
        this.zze = zzedb0.zzc();
        this.zzh = zzedb0;
        this.zzf = zzv.zzC().currentTimeMillis() / 1000L;
        this.zzi = !((Boolean)zzbe.zzc().zza(zzbcl.zzgE)).booleanValue() || zzfbr0 == null ? new Bundle() : zzfbr0.zzk;
        this.zzg = !((Boolean)zzbe.zzc().zza(zzbcl.zzje)).booleanValue() || zzfbr0 == null || TextUtils.isEmpty(zzfbr0.zzi) ? "" : zzfbr0.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final zzw zzf() {
        return this.zzh == null ? null : this.zzh.zza();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final String zzi() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() {
        return this.zze;
    }

    @Nullable
    public final String zzk() {
        return this.zzd;
    }
}

