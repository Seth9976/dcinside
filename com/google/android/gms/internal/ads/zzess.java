package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzess implements Callable {
    public final List zza;
    public final Bundle zzb;

    public zzess(List list0, Bundle bundle0) {
        this.zza = list0;
        this.zzb = bundle0;
    }

    @Override
    public final Object call() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.zza) {
            t0 t00 = (t0)object0;
            if(((JSONObject)t00.get()) != null) {
                jSONArray0.put(t00.get());
            }
        }
        return jSONArray0.length() == 0 ? null : new zzesy(jSONArray0.toString(), this.zzb);
    }
}

