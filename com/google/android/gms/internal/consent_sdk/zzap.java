package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.ump.c.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzap {
    static final zzde zza;
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    static {
        zzap.zza = zzde.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    zzap(Application application0) {
        this.zzb = application0;
        SharedPreferences sharedPreferences0 = application0.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences0;
        this.zzd = new HashSet(sharedPreferences0.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    // 去混淆评级： 低(20)
    public final d zzb() {
        return d.valueOf(this.zzc.getString("privacy_options_requirement_status", "UNKNOWN"));
    }

    public final Map zzc() {
        String s1;
        Set set0 = this.zzc.getStringSet("stored_info", zzde.zzi());
        if(set0.isEmpty()) {
            set0 = zzap.zza;
        }
        Map map0 = new HashMap();
        Iterator iterator0 = set0.iterator();
        while(iterator0.hasNext()) {
            Application application0 = this.zzb;
            Object object0 = iterator0.next();
            String s = (String)object0;
            zzcm zzcm0 = zzco.zza(application0, s);
            if(zzcm0 == null) {
                Log.d("UserMessagingPlatform", "Fetching request info: failed for key: " + s);
            }
            else {
                Object object1 = application0.getSharedPreferences(zzcm0.zza, 0).getAll().get(zzcm0.zzb);
                if(object1 == null) {
                    Log.d("UserMessagingPlatform", "Stored info not exists: " + s);
                }
                else {
                    if(object1 instanceof Boolean) {
                        s1 = ((Boolean)object1).booleanValue() ? "1" : "0";
                    }
                    else if(object1 instanceof Number) {
                        s1 = object1.toString();
                    }
                    else if(object1 instanceof String) {
                        s1 = (String)object1;
                    }
                    else {
                        goto label_30;
                    }
                    map0.put(s, s1);
                    continue;
                label_30:
                    Log.d("UserMessagingPlatform", "Failed to fetch stored info: " + s);
                }
            }
        }
        return map0;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        zzco.zzb(this.zzb, this.zzd);
        this.zzd.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").apply();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).apply();
    }

    public final void zzg(int v) {
        this.zzc.edit().putInt("consent_status", v).apply();
    }

    public final void zzh(boolean z) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z).apply();
    }

    public final void zzi(d c$d0) {
        this.zzc.edit().putString("privacy_options_requirement_status", c$d0.name()).apply();
    }

    public final void zzj(Set set0) {
        this.zzc.edit().putStringSet("stored_info", set0).apply();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }
}

