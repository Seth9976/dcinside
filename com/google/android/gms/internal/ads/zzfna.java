package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfna extends zzfmv {
    public zzfna(zzfmo zzfmo0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(zzfmo0, hashSet0, jSONObject0, v);
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        if(zzfmg.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfmw
    protected final void onPostExecute(Object object0) {
        this.zza(((String)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfmw
    protected final void zza(String s) {
        if(!TextUtils.isEmpty(s)) {
            zzflk zzflk0 = zzflk.zza();
            if(zzflk0 != null) {
                for(Object object0: zzflk0.zzc()) {
                    zzfkt zzfkt0 = (zzfkt)object0;
                    if(this.zza.contains(zzfkt0.zzh())) {
                        zzfkt0.zzg().zzh(s, this.zzc);
                    }
                }
            }
        }
        super.zza(s);
    }
}

