package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfmz extends zzfmv {
    public zzfmz(zzfmo zzfmo0, HashSet hashSet0, JSONObject jSONObject0, long v) {
        super(zzfmo0, hashSet0, jSONObject0, v);
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        return this.zzb.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfmw
    protected final void onPostExecute(Object object0) {
        this.zzc(((String)object0));
        super.zza(((String)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzfmw
    protected final void zza(String s) {
        this.zzc(s);
        super.zza(s);
    }

    private final void zzc(String s) {
        zzflk zzflk0 = zzflk.zza();
        if(zzflk0 != null) {
            for(Object object0: zzflk0.zzc()) {
                zzfkt zzfkt0 = (zzfkt)object0;
                if(this.zza.contains(zzfkt0.zzh())) {
                    zzfkt0.zzg().zzd(s, this.zzc);
                }
            }
        }
    }
}

