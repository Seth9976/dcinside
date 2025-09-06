package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.t0;
import java.util.HashMap;
import java.util.Map;
import o3.j;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzbkf implements zzbjp {
    private final Object zza;
    private final Map zzb;

    public zzbkf() {
        this.zza = new Object();
        this.zzb = new HashMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("id");
        String s1 = (String)map0.get("fail");
        String s2 = (String)map0.get("fail_reason");
        String s3 = (String)map0.get("fail_stack");
        String s4 = (String)map0.get("result");
        if(TextUtils.isEmpty(s3)) {
            s2 = "Unknown Fail Reason.";
        }
        String s5 = TextUtils.isEmpty(s3) ? "" : "\n" + s3;
        synchronized(this.zza) {
            zzbke zzbke0 = (zzbke)this.zzb.remove(s);
            if(zzbke0 == null) {
                zzo.zzj(("Received result for unexpected method invocation: " + s));
                return;
            }
            if(!TextUtils.isEmpty(s1)) {
                zzbke0.zza(s2 + s5);
                return;
            }
            if(s4 == null) {
                zzbke0.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject0 = new JSONObject(s4);
                if(zze.zzc()) {
                    zze.zza(("Result GMSG: " + jSONObject0.toString(2)));
                }
                zzbke0.zzb(jSONObject0);
            }
            catch(JSONException jSONException0) {
                zzbke0.zza(jSONException0.getMessage());
            }
        }
    }

    public final t0 zzb(zzbmw zzbmw0, String s, JSONObject jSONObject0) {
        t0 t00 = new zzcab();
        this.zzc("86df994a-0989-4f5f-8e71-fadcc59a1d79", new zzbkd(this, ((zzcab)t00)));
        try {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("id", "86df994a-0989-4f5f-8e71-fadcc59a1d79");
            jSONObject1.put("args", jSONObject0);
            zzbmw0.zzl(s, jSONObject1);
        }
        catch(Exception exception0) {
            ((zzcab)t00).zzd(exception0);
        }
        return t00;
    }

    public final void zzc(String s, zzbke zzbke0) {
        synchronized(this.zza) {
            this.zzb.put(s, zzbke0);
        }
    }
}

