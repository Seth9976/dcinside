package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class zzdzs implements zzffr {
    private static final Pattern zza;
    private final String zzb;
    private final zzfgw zzc;
    private final zzfhh zzd;

    static {
        zzdzs.zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    }

    public zzdzs(String s, zzfhh zzfhh0, zzfgw zzfgw0) {
        this.zzb = s;
        this.zzd = zzfhh0;
        this.zzc = zzfgw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffr
    public final Object zza(Object object0) throws Exception {
        zzdvy zzdvy0;
        String s2;
        int v = ((zzdzr)object0).zza.optInt("http_timeout_millis", 60000);
        zzbvm zzbvm0 = ((zzdzr)object0).zzb;
        String s = "";
        if(zzbvm0.zza() == -2) {
            HashMap hashMap0 = new HashMap();
            if(((zzdzr)object0).zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzaZ)).booleanValue()) {
                    String s1 = this.zzb;
                    if(TextUtils.isEmpty(s1)) {
                        s2 = "";
                    }
                    else {
                        Matcher matcher0 = zzdzs.zza.matcher(s1);
                        s2 = "";
                        while(matcher0.find()) {
                            String s3 = matcher0.group(1);
                            if(s3 != null && (s3.toLowerCase(Locale.ROOT).startsWith("id=") || s3.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if(!TextUtils.isEmpty(s2)) {
                                    s2 = s2 + "; ";
                                }
                                s2 = s2 + s3;
                            }
                        }
                    }
                    if(!TextUtils.isEmpty(s2)) {
                        hashMap0.put("Cookie", s2);
                    }
                }
                else {
                    hashMap0.put("Cookie", this.zzb);
                }
            }
            if(((zzdzr)object0).zzb.zzk()) {
                JSONObject jSONObject0 = ((zzdzr)object0).zza;
                if(jSONObject0 != null) {
                    JSONObject jSONObject1 = jSONObject0.optJSONObject("pii");
                    if(jSONObject1 == null) {
                        zze.zza("DSID signal does not exist.");
                    }
                    else {
                        if(!TextUtils.isEmpty(jSONObject1.optString("doritos", ""))) {
                            hashMap0.put("x-afma-drt-cookie", jSONObject1.optString("doritos", ""));
                        }
                        if(!TextUtils.isEmpty(jSONObject1.optString("doritos_v2", ""))) {
                            hashMap0.put("x-afma-drt-v2-cookie", jSONObject1.optString("doritos_v2", ""));
                        }
                    }
                }
            }
            if(((zzdzr)object0).zzb != null && !TextUtils.isEmpty(((zzdzr)object0).zzb.zzf())) {
                s = ((zzdzr)object0).zzb.zzf();
            }
            this.zzc.zzg(true);
            this.zzd.zza(this.zzc);
            return new zzdzn(((zzdzr)object0).zzb.zzg(), v, hashMap0, s.getBytes(StandardCharsets.UTF_8), "", ((zzdzr)object0).zzb.zzk());
        }
        if(zzbvm0.zza() == 1) {
            if(zzbvm0.zzh() != null) {
                s = TextUtils.join(", ", zzbvm0.zzh());
                zzo.zzg(s);
            }
            zzdvy0 = new zzdvy(2, "Error building request URL: " + s);
        }
        else {
            zzdvy0 = new zzdvy(1);
        }
        this.zzc.zzh(zzdvy0);
        this.zzc.zzg(false);
        this.zzd.zza(this.zzc);
        throw zzdvy0;
    }
}

