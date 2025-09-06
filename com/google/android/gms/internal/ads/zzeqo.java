package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzeqo implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzeqo(Context context0, zzgcs zzgcs0) {
        this.zza = context0;
        this.zzb = zzgcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 18;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeql zzeql0 = () -> {
            String s = "";
            String s1 = ((Boolean)zzbe.zzc().zza(zzbcl.zzfU)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "") : "";
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfW)).booleanValue()) {
                s = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
            }
            Context context0 = this.zza;
            if(!((Boolean)zzbe.zzc().zza(zzbcl.zzfV)).booleanValue()) {
                return new zzeqm(s1, s, null, null);
            }
            SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(context0);
            Bundle bundle0 = new Bundle();
            if(sharedPreferences0.contains("IABConsent_CMPPresent")) {
                bundle0.putBoolean("IABConsent_CMPPresent", sharedPreferences0.getBoolean("IABConsent_CMPPresent", false));
            }
            for(int v = 0; v < 4; ++v) {
                String s2 = new String[]{"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"}[v];
                if(sharedPreferences0.contains(s2)) {
                    bundle0.putString(s2, sharedPreferences0.getString(s2, null));
                }
            }
            return new zzeqm(s1, s, bundle0, null);
        };
        return this.zzb.zzb(zzeql0);
    }

    // 检测为 Lambda 实现
    final zzeqm zzc() throws Exception [...]
}

