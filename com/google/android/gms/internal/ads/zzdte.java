package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import j..util.Objects;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zzdte extends zzbkq {
    private final zzdth zza;
    private final zzdtc zzb;
    private final Map zzc;

    zzdte(zzdth zzdth0, zzdtc zzdtc0) {
        this.zzc = new HashMap();
        this.zza = zzdth0;
        this.zzb = zzdtc0;
    }

    // This method was un-flattened
    private static zzm zzc(Map map0) {
        zzn zzn0 = new zzn();
        String s = (String)map0.get("ad_request");
        if(s == null) {
            return zzn0.zza();
        }
        JsonReader jsonReader0 = new JsonReader(new StringReader(Uri.decode(s)));
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                switch(jsonReader0.nextName()) {
                    case "extras": {
                        goto label_10;
                    }
                    case "httpTimeoutMillis": {
                        zzn0.zzc(jsonReader0.nextInt());
                        continue;
                    }
                    case "isTestDevice": {
                        zzn0.zzd(jsonReader0.nextBoolean());
                        continue;
                    }
                    case "keywords": {
                        goto label_27;
                    }
                    case "maxAdContentRating": {
                        goto label_35;
                    }
                    case "tagForChildDirectedTreatment": {
                        goto label_39;
                    }
                    case "tagForUnderAgeOfConsent": {
                        goto label_20;
                    }
                }
                jsonReader0.skipValue();
                continue;
            label_10:
                jsonReader0.beginObject();
                Bundle bundle0 = new Bundle();
                while(jsonReader0.hasNext()) {
                    bundle0.putString(jsonReader0.nextName(), jsonReader0.nextString());
                }
                jsonReader0.endObject();
                zzn0.zzb(bundle0);
                continue;
            label_20:
                if(jsonReader0.nextBoolean()) {
                    zzn0.zzi(1);
                }
                else {
                    zzn0.zzi(0);
                }
                continue;
            label_27:
                jsonReader0.beginArray();
                ArrayList arrayList0 = new ArrayList();
                while(jsonReader0.hasNext()) {
                    arrayList0.add(jsonReader0.nextString());
                }
                jsonReader0.endArray();
                zzn0.zze(arrayList0);
                continue;
            label_35:
                String s1 = jsonReader0.nextString();
                if(RequestConfiguration.zza.contains(s1)) {
                    zzn0.zzf(s1);
                    continue;
                label_39:
                    if(jsonReader0.nextBoolean()) {
                        zzn0.zzh(1);
                    }
                    else {
                        zzn0.zzh(0);
                    }
                }
            }
            jsonReader0.endObject();
        }
        catch(IOException unused_ex) {
            zzo.zze("Ad Request json was malformed, parsing ended early.");
        }
        zzm zzm0 = zzn0.zza();
        Bundle bundle1 = zzm0.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle1 == null) {
            bundle1 = zzm0.zzc;
            zzm0.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle1);
        }
        return new zzm(zzm0.zza, zzm0.zzb, bundle1, zzm0.zzd, zzm0.zze, zzm0.zzf, zzm0.zzg, zzm0.zzh, zzm0.zzi, zzm0.zzj, zzm0.zzk, zzm0.zzl, zzm0.zzm, zzm0.zzn, zzm0.zzo, zzm0.zzp, zzm0.zzq, zzm0.zzr, zzm0.zzs, zzm0.zzt, zzm0.zzu, zzm0.zzv, zzm0.zzw, zzm0.zzx, zzm0.zzy, zzm0.zzz);
    }

    @Override  // com.google.android.gms.internal.ads.zzbkr
    public final void zze() {
        this.zzc.clear();
    }

    @Override  // com.google.android.gms.internal.ads.zzbkr
    public final void zzf(String s) throws RemoteException {
        long v;
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzjN)).booleanValue()) {
            return;
        }
        zze.zza(("Received H5 gmsg: " + s));
        Map map0 = zzs.zzP(Uri.parse(s));
        String s1 = (String)map0.get("action");
        if(TextUtils.isEmpty(s1)) {
            zzo.zze("H5 gmsg did not contain an action");
            return;
        }
        switch(s1) {
            case "dispose_all": {
                for(Object object0: this.zzc.values()) {
                    ((zzdsx)object0).zza();
                }
                this.zzc.clear();
                return;
            }
            case "initialize": {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            default: {
                String s2 = (String)map0.get("obj_id");
                try {
                    Objects.requireNonNull(s2);
                    v = Long.parseLong(s2);
                    switch(s1) {
                        case "create_interstitial_ad": {
                            goto label_39;
                        }
                        case "create_rewarded_ad": {
                            goto label_78;
                        }
                        case "dispose": {
                            goto label_69;
                        }
                        case "load_interstitial_ad": {
                            goto label_62;
                        }
                        case "load_rewarded_ad": {
                            goto label_32;
                        }
                        case "show_interstitial_ad": {
                            goto label_18;
                        }
                        case "show_rewarded_ad": {
                            goto label_25;
                        }
                    }
                }
                catch(NumberFormatException | NullPointerException unused_ex) {
                    zzo.zze(("H5 gmsg did not contain a valid object id: " + s2));
                    return;
                }
                zzo.zze(("H5 gmsg contained invalid action: " + s1));
                return;
            label_18:
                zzdsx zzdsx0 = (zzdsx)this.zzc.get(v);
                if(zzdsx0 == null) {
                    zzo.zze("Could not show H5 ad, object ID does not exist");
                    this.zzb.zzf(v);
                    return;
                }
                zzdsx0.zzc();
                return;
            label_25:
                zzdsx zzdsx1 = (zzdsx)this.zzc.get(v);
                if(zzdsx1 == null) {
                    zzo.zze("Could not show H5 ad, object ID does not exist");
                    this.zzb.zzq(v);
                    return;
                }
                zzdsx1.zzc();
                return;
            label_32:
                zzdsx zzdsx2 = (zzdsx)this.zzc.get(v);
                if(zzdsx2 == null) {
                    zzo.zze("Could not load H5 ad, object ID does not exist");
                    this.zzb.zzq(v);
                    return;
                }
                zzdsx2.zzb(zzdte.zzc(map0));
                return;
            label_39:
                int v1 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzjO)));
                if(this.zzc.size() >= v1) {
                    zzo.zzj("Could not create H5 ad, too many existing objects");
                    this.zzb.zzi(v);
                    return;
                }
                Long long0 = v;
                if(this.zzc.containsKey(long0)) {
                    zzo.zze("Could not create H5 ad, object ID already exists");
                    this.zzb.zzi(v);
                    return;
                }
                String s3 = (String)map0.get("ad_unit");
                if(TextUtils.isEmpty(s3)) {
                    zzo.zzj("Could not create H5 ad, missing ad unit id");
                    this.zzb.zzi(v);
                    return;
                }
                zzdsy zzdsy0 = this.zza.zzb();
                zzdsy0.zzb(v);
                zzdsy0.zza(s3);
                zzdtj zzdtj0 = zzdsy0.zzc().zza();
                this.zzc.put(long0, zzdtj0);
                this.zzb.zzh(v);
                zze.zza(("Created H5 interstitial #" + v + " with ad unit " + s3));
                return;
            label_62:
                zzdsx zzdsx3 = (zzdsx)this.zzc.get(v);
                if(zzdsx3 == null) {
                    zzo.zze("Could not load H5 ad, object ID does not exist");
                    this.zzb.zzf(v);
                    return;
                }
                zzdsx3.zzb(zzdte.zzc(map0));
                return;
            label_69:
                Long long1 = v;
                zzdsx zzdsx4 = (zzdsx)this.zzc.get(long1);
                if(zzdsx4 == null) {
                    zzo.zze("Could not dispose H5 ad, object ID does not exist");
                    return;
                }
                zzdsx4.zza();
                this.zzc.remove(long1);
                zze.zza(("Disposed H5 ad #" + v));
                return;
            label_78:
                int v2 = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzjO)));
                if(this.zzc.size() >= v2) {
                    zzo.zzj("Could not create H5 ad, too many existing objects");
                    this.zzb.zzi(v);
                    return;
                }
                Long long2 = v;
                if(this.zzc.containsKey(long2)) {
                    zzo.zze("Could not create H5 ad, object ID already exists");
                    this.zzb.zzi(v);
                    return;
                }
                String s4 = (String)map0.get("ad_unit");
                if(TextUtils.isEmpty(s4)) {
                    zzo.zzj("Could not create H5 ad, missing ad unit id");
                    this.zzb.zzi(v);
                    return;
                }
                zzdsy zzdsy1 = this.zza.zzb();
                zzdsy1.zzb(v);
                zzdsy1.zza(s4);
                zzdtn zzdtn0 = zzdsy1.zzc().zzb();
                this.zzc.put(long2, zzdtn0);
                this.zzb.zzh(v);
                zze.zza(("Created H5 rewarded #" + v + " with ad unit " + s4));
            }
        }
    }
}

