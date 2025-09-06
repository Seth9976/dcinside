package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzc implements Runnable {
    public final String zza;
    public final String zzb;
    public final zzd[] zzc;

    public zzc(String s, String s1, zzd[] arr_zzd) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = arr_zzd;
    }

    @Override
    public final void run() {
        JSONObject jSONObject0;
        String s = this.zza;
        if(TextUtils.isEmpty(s)) {
            Log.d("UserMessagingPlatform", "Error on action: empty action name");
            return;
        }
        String s1 = this.zzb;
        String s2 = s.toLowerCase();
        if(TextUtils.isEmpty(s1)) {
            jSONObject0 = new JSONObject();
        }
        else {
            try {
                jSONObject0 = new JSONObject(s1);
            }
            catch(JSONException unused_ex) {
                Log.d("UserMessagingPlatform", "Action[" + s2 + "]: failed to parse args: " + s1);
                return;
            }
        }
        zzd[] arr_zzd = this.zzc;
        Log.d("UserMessagingPlatform", "Action[" + s2 + "]: " + jSONObject0.toString());
        for(int v = 0; v < arr_zzd.length; ++v) {
            zzd zzd0 = arr_zzd[v];
            FutureTask futureTask0 = new FutureTask(new zzb(zzd0, s2, jSONObject0));
            zzd0.zza().execute(futureTask0);
            try {
                if(((Boolean)futureTask0.get()).booleanValue()) {
                    break;
                }
            }
            catch(ExecutionException executionException0) {
                Log.d("UserMessagingPlatform", "Failed to run Action[" + s2 + "]: ", executionException0.getCause());
            }
            catch(InterruptedException interruptedException0) {
                Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + s2 + "]: ", interruptedException0);
            }
        }
    }
}

