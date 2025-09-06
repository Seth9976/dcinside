package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeq;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

final class zzbu extends QueryInfoGenerationCallback {
    final String zza;
    final TaggingLibraryJsInterface zzb;

    zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface0, String s) {
        this.zza = s;
        this.zzb = taggingLibraryJsInterface0;
        super();
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String s) {
        zzo.zzj(("Failed to generate query info for the tagging library, error: " + s));
        String s1 = ((Boolean)zzbeq.zza.zze()).booleanValue() ? ",\"as\":" + this.zzb.zzk.zza().toString() : "";
        Locale locale0 = Locale.getDefault();
        long v = ((Boolean)zzbeq.zzc.zze()).booleanValue() ? ((long)(((Long)zzbeq.zzf.zze()))) : 0L;
        String s2 = String.format(locale0, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, \'*\');", this.zza, s, v, s1);
        if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new zzbs(this, s2));
            }
            catch(RuntimeException runtimeException0) {
                zzv.zzp().zzv(runtimeException0, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        }
        else {
            this.zzb.zzb.evaluateJavascript(s2, null);
        }
        if(((Boolean)zzbeq.zza.zze()).booleanValue() && ((Boolean)zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo0) {
        String s1;
        String s = queryInfo0.getQuery();
        long v = 0L;
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("paw_id", this.zza);
            jSONObject0.put("signal", s);
            jSONObject0.put("sdk_ttl_ms", (((Boolean)zzbeq.zzc.zze()).booleanValue() ? ((long)(((Long)zzbeq.zzf.zze()))) : 0L));
            if(((Boolean)zzbeq.zza.zze()).booleanValue()) {
                jSONObject0.put("as", this.zzb.zzk.zza());
            }
            s1 = String.format(Locale.getDefault(), "window.postMessage(%1$s, \'*\');", jSONObject0);
        }
        catch(JSONException unused_ex) {
            String s2 = ((Boolean)zzbeq.zza.zze()).booleanValue() ? ",\"as\":" + this.zzb.zzk.zza().toString() : "";
            String s3 = this.zza;
            Locale locale0 = Locale.getDefault();
            String s4 = queryInfo0.getQuery();
            if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
                v = (long)(((Long)zzbeq.zzf.zze()));
            }
            s1 = String.format(locale0, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, \'*\');", s3, s4, v, s2);
        }
        if(((Boolean)zzbeq.zzc.zze()).booleanValue()) {
            try {
                zzbt zzbt0 = new zzbt(this, s1);
                this.zzb.zzh.execute(zzbt0);
            }
            catch(RuntimeException runtimeException0) {
                zzv.zzp().zzv(runtimeException0, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        }
        else {
            this.zzb.zzb.evaluateJavascript(s1, null);
        }
        if(((Boolean)zzbeq.zza.zze()).booleanValue() && ((Boolean)zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }
}

