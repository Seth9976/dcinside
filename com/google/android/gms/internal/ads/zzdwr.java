package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdwr implements zzher {
    private final zzhfj zza;

    public zzdwr(zzhfj zzhfj0) {
        this.zza = zzhfj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        String s1;
        zzfcj zzfcj0 = ((zzcvk)this.zza).zza();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzhb)).booleanValue()) {
            String s = zzfcj0.zzd.zzx;
            if(TextUtils.isEmpty(s)) {
            label_6:
                if(zzfcj0.zzd.zzs == null) {
                    goto label_9;
                }
                else {
                    try {
                        s1 = new JSONObject(zzfcj0.zzd.zzs.zza).getString("request_id");
                        if(TextUtils.isEmpty(s1)) {
                            goto label_9;
                        }
                    }
                    catch(JSONException unused_ex) {
                        goto label_9;
                    }
                }
            }
            else {
                try {
                    s1 = new JSONObject(s).getString("request_id");
                    if(TextUtils.isEmpty(s1)) {
                        goto label_6;
                    }
                }
                catch(JSONException unused_ex) {
                    goto label_6;
                }
            }
        }
        else {
        label_9:
            s1 = String.valueOf(zzbc.zze().nextInt() & 0x7FFFFFFF);
        }
        zzhez.zzb(s1);
        return s1;
    }
}

