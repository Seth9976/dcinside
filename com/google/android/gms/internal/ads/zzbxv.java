package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import j..util.Objects;

public final class zzbxv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final zzg zzc;
    private String zzd;
    private int zze;

    zzbxv(Context context0, zzg zzg0) {
        this.zzd = "-1";
        this.zze = -1;
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context0);
        this.zzc = zzg0;
        this.zza = context0;
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        try {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzaL)).booleanValue()) {
                if(Objects.equals(s, "gad_has_consent_for_cookies")) {
                    int v = sharedPreferences0.getInt("gad_has_consent_for_cookies", -1);
                    if(v != this.zzc.zzb()) {
                        this.zzb();
                    }
                    this.zzc.zzA(v);
                    return;
                }
                if(Objects.equals(s, "IABTCF_TCString")) {
                    String s1 = sharedPreferences0.getString(s, "-1");
                    if(!Objects.equals(s1, this.zzc.zzm())) {
                        this.zzb();
                    }
                    this.zzc.zzJ(s1);
                    return;
                }
            }
            else {
                String s2 = sharedPreferences0.getString("IABTCF_PurposeConsents", "-1");
                int v1 = sharedPreferences0.getInt("gad_has_consent_for_cookies", -1);
                switch(String.valueOf(s)) {
                    case "IABTCF_PurposeConsents": {
                        if(!s2.equals("-1") && !this.zzd.equals(s2)) {
                            this.zzd = s2;
                            this.zzc(s2, v1);
                            return;
                        }
                        break;
                    }
                    case "gad_has_consent_for_cookies": {
                        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaJ)).booleanValue() && v1 != -1 && this.zze != v1) {
                            this.zze = v1;
                            this.zzc(s2, v1);
                            return;
                        }
                        break;
                    }
                    default: {
                        return;
                    }
                }
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        zzv.zzp().zzw(throwable0, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
        zze.zzb("onSharedPreferenceChanged, errorMessage = ", throwable0);
    }

    final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        this.onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzaL)).booleanValue()) {
            this.onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
            return;
        }
        this.onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }

    private final void zzb() {
        this.zzc.zzD(true);
        zzad.zzc(this.zza);
    }

    private final void zzc(String s, int v) {
        boolean z = true;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzaJ)).booleanValue()) {
            if(!s.isEmpty() && s.charAt(0) == 49) {
                z = false;
            }
        }
        else if(v != 0 && !s.isEmpty() && (s.charAt(0) == 49 || s.equals("-1"))) {
            z = false;
        }
        this.zzc.zzD(z);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && z) {
            Context context0 = this.zza;
            if(context0 != null) {
                context0.deleteDatabase("OfflineUpload.db");
            }
        }
    }
}

