package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdpm {
    private final zzfdf zza;
    private final zzdpj zzb;

    zzdpm(zzfdf zzfdf0, zzdpj zzdpj0) {
        this.zza = zzfdf0;
        this.zzb = zzdpj0;
    }

    @VisibleForTesting
    final zzbpe zza() throws RemoteException {
        zzbpe zzbpe0 = this.zza.zzb();
        if(zzbpe0 != null) {
            return zzbpe0;
        }
        zzo.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrd zzb(String s) throws RemoteException {
        zzbrd zzbrd0 = this.zza().zzc(s);
        this.zzb.zzd(s, zzbrd0);
        return zzbrd0;
    }

    public final zzfdh zzc(String s, JSONObject jSONObject0) throws zzfcq {
        zzfdh zzfdh0;
        zzbph zzbph0;
        try {
            if("com.google.ads.mediation.admob.AdMobAdapter".equals(s)) {
                zzbph0 = new zzbqf(new AdMobAdapter());
            }
            else if("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(s)) {
                zzbph0 = new zzbqf(new zzbrw());
            }
            else {
                zzbpe zzbpe0 = this.zza();
                if(!"com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s) && !"com.google.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
                    zzbph0 = zzbpe0.zzb(s);
                }
                else {
                    try {
                        String s1 = jSONObject0.getString("class_name");
                        if(zzbpe0.zze(s1)) {
                            zzbph0 = zzbpe0.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        }
                        else if(zzbpe0.zzd(s1)) {
                            zzbph0 = zzbpe0.zzb(s1);
                        }
                        else {
                            zzbph0 = zzbpe0.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                        zzfdh0 = new zzfdh(zzbph0);
                        goto label_26;
                    }
                    catch(JSONException jSONException0) {
                    }
                    zzo.zzh("Invalid custom event.", jSONException0);
                    zzbph0 = zzbpe0.zzb(s);
                    zzfdh0 = new zzfdh(zzbph0);
                    goto label_26;
                }
            }
            zzfdh0 = new zzfdh(zzbph0);
            goto label_26;
        }
        catch(Throwable throwable0) {
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
            this.zzb.zzc(s, null);
        }
        throw new zzfcq(throwable0);
    label_26:
        this.zzb.zzc(s, zzfdh0);
        return zzfdh0;
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}

