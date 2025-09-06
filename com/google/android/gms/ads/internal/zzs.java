package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdx;
import java.util.Map;
import java.util.TreeMap;

final class zzs {
    private final Context zza;
    private final String zzb;
    private final Map zzc;
    private String zzd;
    private String zze;
    private final String zzf;

    public zzs(Context context0, String s) {
        String s1;
        this.zza = context0.getApplicationContext();
        this.zzb = s;
        this.zzc = new TreeMap();
        try {
            s1 = "com.dcinside.app.android-" + Wrappers.packageManager(context0).getPackageInfo("com.dcinside.app.android", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzo.zzh("Unable to get package version name for reporting", packageManager$NameNotFoundException0);
            s1 = "com.dcinside.app.android-missing";
        }
        this.zzf = s1;
    }

    public final String zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(zzm zzm0, VersionInfoParcel versionInfoParcel0) {
        this.zzd = zzm0.zzj.zza;
        Bundle bundle0 = zzm0.zzm == null ? null : zzm0.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                String s = (String)object0;
                if("csa_customDomain".equals(s)) {
                    this.zze = bundle0.getString(s);
                }
                else if(s.startsWith("csa_")) {
                    String s1 = bundle0.getString(s);
                    this.zzc.put(s.substring(4), s1);
                }
            }
            this.zzc.put("SDKVersion", versionInfoParcel0.afmaVersion);
            if(((Boolean)zzbdx.zza.zze()).booleanValue()) {
                Bundle bundle1 = zzad.zzb(this.zza, "[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
                for(Object object1: bundle1.keySet()) {
                    String s2 = bundle1.get(((String)object1)).toString();
                    this.zzc.put(((String)object1), s2);
                }
            }
        }
    }
}

