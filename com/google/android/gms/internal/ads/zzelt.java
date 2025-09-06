package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

public final class zzelt implements zzetq {
    final zzfcj zza;
    private final long zzb;

    public zzelt(zzfcj zzfcj0, long v) {
        this.zza = zzfcj0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zzb;
        bundle0.putString("slotname", this.zza.zzf);
        zzm zzm0 = this.zza.zzd;
        boolean z = true;
        if(zzm0.zzf) {
            bundle0.putBoolean("test_request", true);
        }
        zzfcx.zze(bundle0, "tag_for_child_directed_treatment", zzm0.zzg, zzm0.zzg != -1);
        if(zzm0.zza >= 8) {
            int v = zzm0.zzt;
            if(v == -1) {
                z = false;
            }
            zzfcx.zze(bundle0, "tag_for_under_age_of_consent", v, z);
        }
        zzfcx.zzc(bundle0, "url", zzm0.zzl);
        zzfcx.zzd(bundle0, "neighboring_content_urls", zzm0.zzv);
        Bundle bundle1 = (Bundle)zzm0.zzc.clone();
        HashSet hashSet0 = new HashSet(Arrays.asList(((String)zzbe.zzc().zza(zzbcl.zzhs)).split(",", -1)));
        for(Object object1: zzm0.zzc.keySet()) {
            String s = (String)object1;
            if(!hashSet0.contains(s)) {
                bundle1.remove(s);
            }
        }
        zzfcx.zzb(bundle0, "extras", bundle1);
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        zzm zzm0 = this.zza.zzd;
        bundle0.putInt("http_timeout_millis", zzm0.zzw);
        bundle0.putString("slotname", this.zza.zzf);
        int v = this.zza.zzo.zza;
        if(v == 0) {
            throw null;
        }
        boolean z = true;
        switch(v - 1) {
            case 1: {
                bundle0.putBoolean("is_new_rewarded", true);
                break;
            }
            case 2: {
                bundle0.putBoolean("is_rewarded_interstitial", true);
            }
        }
        bundle0.putLong("start_signals_timestamp", this.zzb);
        zzfcx.zzg(bundle0, "is_sdk_preload", true, zzm0.zzb());
        zzfcx.zzf(bundle0, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzm0.zzb)), zzm0.zzb != -1L);
        zzfcx.zzb(bundle0, "extras", zzm0.zzc);
        zzfcx.zze(bundle0, "cust_gender", zzm0.zzd, zzm0.zzd != -1);
        zzfcx.zzd(bundle0, "kw", zzm0.zze);
        zzfcx.zze(bundle0, "tag_for_child_directed_treatment", zzm0.zzg, zzm0.zzg != -1);
        if(zzm0.zzf) {
            bundle0.putBoolean("test_request", true);
        }
        bundle0.putInt("ppt_p13n", zzm0.zzy);
        zzfcx.zze(bundle0, "d_imp_hdr", 1, zzm0.zza >= 2 && zzm0.zzh);
        boolean z1 = zzm0.zza >= 2 && !TextUtils.isEmpty(zzm0.zzi);
        zzfcx.zzf(bundle0, "ppid", zzm0.zzi, z1);
        Location location0 = zzm0.zzk;
        if(location0 != null) {
            float f = location0.getAccuracy();
            long v1 = location0.getTime();
            double f1 = location0.getLatitude();
            double f2 = location0.getLongitude();
            Bundle bundle1 = new Bundle();
            bundle1.putFloat("radius", f * 1000.0f);
            bundle1.putLong("lat", ((long)(f1 * 10000000.0)));
            bundle1.putLong("long", ((long)(f2 * 10000000.0)));
            bundle1.putLong("time", v1 * 1000L);
            bundle0.putBundle("uule", bundle1);
        }
        zzfcx.zzc(bundle0, "url", zzm0.zzl);
        zzfcx.zzd(bundle0, "neighboring_content_urls", zzm0.zzv);
        zzfcx.zzb(bundle0, "custom_targeting", zzm0.zzn);
        zzfcx.zzd(bundle0, "category_exclusions", zzm0.zzo);
        zzfcx.zzc(bundle0, "request_agent", zzm0.zzp);
        zzfcx.zzc(bundle0, "request_pkg", zzm0.zzq);
        zzfcx.zzg(bundle0, "is_designed_for_families", zzm0.zzr, zzm0.zza >= 7);
        if(zzm0.zza >= 8) {
            int v2 = zzm0.zzt;
            if(v2 == -1) {
                z = false;
            }
            zzfcx.zze(bundle0, "tag_for_under_age_of_consent", v2, z);
            zzfcx.zzc(bundle0, "max_ad_content_rating", zzm0.zzu);
        }
    }
}

