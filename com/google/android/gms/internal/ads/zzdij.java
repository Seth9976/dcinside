package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdij extends zzdik {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    @Nullable
    private final JSONObject zzh;

    public zzdij(zzfbo zzfbo0, JSONObject jSONObject0) {
        super(zzfbo0);
        this.zzb = zzbs.zzh(jSONObject0, new String[]{"tracking_urls_and_actions", "active_view"});
        boolean z = false;
        this.zzc = zzbs.zzl(false, jSONObject0, new String[]{"allow_pub_owned_ad_view"});
        this.zzd = zzbs.zzl(false, jSONObject0, new String[]{"attribution", "allow_pub_rendering"});
        this.zze = zzbs.zzl(false, jSONObject0, new String[]{"enable_omid"});
        this.zzg = zzbs.zzb("", jSONObject0, new String[]{"watermark_overlay_png_base64"});
        if(jSONObject0.optJSONObject("overlay") != null) {
            z = true;
        }
        this.zzf = z;
        this.zzh = ((Boolean)zzbe.zzc().zza(zzbcl.zzfj)).booleanValue() ? jSONObject0.optJSONObject("omid_settings") : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final zzfcm zza() {
        return this.zzh == null ? this.zza.zzV : new zzfcm(this.zzh);
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final String zzb() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    @Nullable
    public final JSONObject zzc() {
        JSONObject jSONObject0 = this.zzb;
        if(jSONObject0 != null) {
            return jSONObject0;
        }
        try {
            return new JSONObject(this.zza.zzz);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzd() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zze() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzf() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzdik
    public final boolean zzg() {
        return this.zzf;
    }
}

